package ru.dokstuduio.med.rest.usermanagment;

import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.RoleConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import ru.dokstrudio.med.srv.model.UserAccount;
import ru.dokstrudio.med.srv.service.UserAccountLocalService;
import ru.dokstuduio.med.rest.common.constants.ResponseCodes;
import ru.dokstuduio.med.rest.common.util.RestResponseUtil;
import ru.dokstuduio.med.rest.usermanagment.model.ApplicationUser;

@ApplicationPath("/user-managment")
@Component(immediate = true, service = Application.class)
public class UserManagmentRest extends Application {
	private static final Log log = LogFactoryUtil.getLog(UserManagmentRest.class);

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	private UserLocalService _userLocalService;

	@Reference(unbind = "-")
	protected void setUserLocalService(UserLocalService userLocalService) {
		_userLocalService = userLocalService;
	}

	private RoleLocalService _roleService;

	@Reference(unbind = "-")
	protected void setUserService(RoleLocalService roleService) {
		_roleService = roleService;
	}

	private UserAccountLocalService _userAccountService;

	@Reference(unbind = "-")
	protected void setUserAccountService(UserAccountLocalService userAccountService) {
		_userAccountService = userAccountService;
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}

	@POST
	@Path("/add-user")
	@Produces("application/json")
	public String addUser(@FormParam("name") String name, @FormParam("email") String email,
			@FormParam("password") String password, @FormParam("male") boolean male,
			@FormParam("deviceKey") String deviceKey) {

		log.info("### Adding med application user...");
		String response = StringPool.BLANK;
		// TODO define params, validate 'em, define response models
		Date date = new Date();
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setUuid(UUID.randomUUID().toString());
		serviceContext.setCreateDate(date);
		serviceContext.setModifiedDate(date);
		long companyId = PortalUtil.getDefaultCompanyId();
		long creatorUserId = 0;
		boolean autoPassword = false;
		boolean autoScreenName = false;
		boolean sendEmail = false;
		int prefixId = 1;
		int suffixId = 1;
		int birthdayMonth = 1;
		int birthdayDay = 1;
		int birthdayYear = 1970;
		String screenName = name;
		String firstName = name;
		String middleName = StringPool.BLANK;
		String lastName = "appUser";
		String jobTitle = "";
		long[] groupIds = null;
		long[] organizationIds = null;
		long[] userGroupIds = null;
		log.info("### Setting med application user password...");
		String password1 = password;
		String password2 = password;
		String emailAddress = email;
		long facebookId = 0;
		String openId = "";
		Locale locale = LocaleUtil.getDefault();
		
		try {
			log.info("### Setting med application user roles...");
			Role rolePu = _roleService.getRole(companyId, RoleConstants.POWER_USER);

			long[] roleIds = { rolePu.getRoleId() };
			User user = _userLocalService.addUserWithWorkflow(creatorUserId, companyId, autoPassword, password1,
					password2, autoScreenName, screenName, emailAddress, facebookId, openId, locale, firstName,
					middleName, lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle,
					groupIds, organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);

			_userLocalService.updateUser(user);
			UserAccount userAccount = _userAccountService.createUserAccount(user.getUserId(), AccountType.FREE_ACCOUNT.getAccountTypeId());
			
			ApplicationUser applicationUser = new ApplicationUser(user);
			response = RestResponseUtil.createSuccessResponse(applicationUser.toString());
		} catch (Exception e) {
			response = e.getMessage();
			log.error("Error occured : " + e.getMessage());
		}

		log.info("Returning string : " + response);
		return response;
	}

	@GET
	@Path("/get-user")
	@Produces("text/plain")
	public String morning(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("deviceKey") String deviceKey) {
		log.info("### Invoking user authorization... ");
		User user;
		String response;
		try {
			user = _userLocalService.getUserByEmailAddress(PortalUtil.getDefaultCompanyId(), email);
			log.info("### User found..");
			if (!user.getPassword().equals(password)) {
				// TODO return error response
				log.error("### User's password is incorrect. Aborting...");
				return "Error. Incorrect password!";
			}
			if (deviceKey != null) {
				// TODO get device and check, if bound
				// if not - ?
			} else {
				log.error("Device key was not set. Aborting...");
				return "Error. Device key was not set!";
			}
			ApplicationUser applicationUser = new ApplicationUser(user);
			response = RestResponseUtil.createSuccessResponse(applicationUser.toString());
			return response;
		} catch (PortalException e) {
			log.error(e.getMessage());
			// TODO return error response
			return RestResponseUtil.createErrorResponse(ResponseCodes.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}

	@GET
	@Path("/get-user")
	@Produces("text/plain")
	public String morning(@QueryParam("deviceKey") String deviceKey) {
		log.info("### Invoking user auto authorization... ");

		log.info("### User found..");

		if (deviceKey != null) {
			// TODO get device and check, if bound
			// if not - ?
			return "This method is not implemented yet.";
		} else {
			log.error("Device key was not set. Aborting...");
			return "Error. Device key was not set!";
		}
	}

	private enum AccountType {
		FREE_ACCOUNT(0, "free-account"), PREMIUM_ACCOUNT(1, "premium-account");

		int accountTypeId;
		String localizationKey;

		private AccountType(int accountTypeId, String localizationKey) {
			this.accountTypeId = accountTypeId;
			this.localizationKey = localizationKey;
		}

		public int getAccountTypeId() {
			return accountTypeId;
		}

		public String getLocalizationKey() {
			return localizationKey;
		}

		public AccountType getAccountTypeById(int accountTypeId) {

			for (AccountType accountType : AccountType.values()) {
				if (accountType.getAccountTypeId() == accountTypeId) {
					return accountType;
				}
			}
			return FREE_ACCOUNT;
		}
	}

}
