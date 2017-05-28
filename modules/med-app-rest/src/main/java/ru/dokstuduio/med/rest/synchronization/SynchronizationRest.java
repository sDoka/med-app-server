package ru.dokstuduio.med.rest.synchronization;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

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

import com.liferay.portal.kernel.dao.orm.QueryUtil;

import ru.dokstrudio.med.srv.model.TestUnit;
import ru.dokstrudio.med.srv.model.TestUnitAnswer;
import ru.dokstrudio.med.srv.model.TestUnitAttempt;
import ru.dokstrudio.med.srv.model.UserAccount;
import ru.dokstrudio.med.srv.service.TestUnitAnswerLocalService;
import ru.dokstrudio.med.srv.service.TestUnitAttemptLocalService;
import ru.dokstrudio.med.srv.service.TestUnitLocalService;
import ru.dokstrudio.med.srv.service.TestUnitSpecializationLocalService;
import ru.dokstrudio.med.srv.service.UserAccountLocalService;
import ru.dokstuduio.med.rest.common.util.RestResponseUtil;
import ru.dokstuduio.med.rest.synchronization.model.SpecializationList;
import ru.dokstuduio.med.rest.synchronization.model.TestUnitAttemptList;
import ru.dokstuduio.med.rest.synchronization.model.TestUnitList;
import ru.dokstuduio.med.rest.synchronization.model.UserAccountList;

@ApplicationPath("/synchronization")
@Component(immediate = true, service = Application.class)
public class SynchronizationRest extends Application {
	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	
	@Reference
	TestUnitSpecializationLocalService specializationLocalService;
	
	@Reference
	TestUnitLocalService testUnitLocalService;
	
	@Reference
	TestUnitAnswerLocalService testUnitAnswerLocalService;
	
	@Reference
	TestUnitAttemptLocalService testUnitAttemptLocalService;
	
	@Reference
	UserAccountLocalService userAccountLocalService;
	
	@GET
	@Produces("text/plain")
	public String working() {
		return "Synchronization works!";
	}
	
	@GET
	@Path("/get-specializations")
	@Produces("text/plain")
	public String getAllSpecializations() {
		SpecializationList specializations = new SpecializationList(
				specializationLocalService.getTestUnitSpecializations(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		String response = RestResponseUtil.createSuccessResponse(specializations.toString());
		return response;
	}
	
	@GET
	@Path("/get-all-test-units")
	@Produces("text/plain")
	public String getAllTestUnits(@QueryParam("specializationId") long specializationId) {
		List<TestUnit> allTestUnits = testUnitLocalService.findTestUnitBySpecializationId(specializationId);
		TestUnitList testUnitList = new TestUnitList(allTestUnits);
		String response = RestResponseUtil.createSuccessResponse(testUnitList.toString());
		return response;
	}
	
	
	@GET
	@Path("/get-removed-test-units")
	@Produces("text/plain")
	public String getRemovedTestUnits(@QueryParam("specializationId") long specializationId, 
			@QueryParam("lastSynchronizationDate") Date lastSynchronizationDate) {
		List<TestUnit> removedTestUnits = testUnitLocalService.
				findTestUnitByIsActualAndModifiedDateAndSpecializationId(false, lastSynchronizationDate, specializationId);
		TestUnitList testUnitList = new TestUnitList(removedTestUnits);
		String response = RestResponseUtil.createSuccessResponse(testUnitList.getIdsAsString());
		return response;
	}
	
	@GET
	@Path("/get-modified-test-units")
	@Produces("text/plain")
	public String getModifiedTestUnits(@QueryParam("specializationId") long specializationId, 
			@QueryParam("lastSynchronizationDate") Date lastSynchronizationDate) {
		List<TestUnit> modifiedTestUnits = testUnitLocalService.
				findTestUnitByIsActualAndModifiedDateAndSpecializationId(true, lastSynchronizationDate, specializationId);
		TestUnitList testUnitList = new TestUnitList(modifiedTestUnits);
		for (TestUnit testUnit : modifiedTestUnits) {
			List<TestUnitAnswer> testUnitAnswers = testUnitAnswerLocalService.findByTestUnitId(testUnit.getTestUnitId());
			testUnitList.addTestUnitAnswerList(testUnit.getTestUnitId(), testUnitAnswers);
		}
		String response = RestResponseUtil.createSuccessResponse(testUnitList.toString());
		return response;
	}
	
	@POST
	@Path("/save-user-attempts")
	@Produces("application/json")
	public String saveTestUnitAttempts(@FormParam("name") String name) {
		//TODO: get attempts and store to database
		return "";
	}
	
	@GET
	@Path("/get-user-attempts")
	@Produces("text/plain")
	public String getTestUnitAttempts(@QueryParam("userId") long userId, 
			@QueryParam("lastSynchronizationDate") Date lastSynchronizationDate) {
		List<TestUnitAttempt> testUnitAttempts = testUnitAttemptLocalService.findByUserIdAndSubmitTime(userId, lastSynchronizationDate);
		TestUnitAttemptList testUnitAttemptList = new TestUnitAttemptList(testUnitAttempts);
		String response = RestResponseUtil.createSuccessResponse(testUnitAttemptList.toString());
		return response;
	}
	
	@GET
	@Path("/get-user-account-types")
	@Produces("text/plain")
	public String getTestUnitAttempts(@QueryParam("userId") long userId) {
		List<UserAccount> userAccounts = userAccountLocalService.findByUserId(userId);
		UserAccountList userAccountList = new UserAccountList(userAccounts);
		String response = RestResponseUtil.createSuccessResponse(userAccountList.toString());
		return response;
	}
	
	
}
