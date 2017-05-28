/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ru.dokstrudio.med.srv.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;

import aQute.bnd.annotation.ProviderType;
import ru.dokstrudio.med.srv.model.UserAccount;
import ru.dokstrudio.med.srv.service.base.UserAccountLocalServiceBaseImpl;
import ru.dokstrudio.med.srv.service.persistence.UserAccountPK;
import ru.dokstrudio.med.srv.service.persistence.UserAccountUtil;

/**
 * The implementation of the user account local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link ru.dokstrudio.med.srv.service.UserAccountLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAccountLocalServiceBaseImpl
 * @see ru.dokstrudio.med.srv.service.UserAccountLocalServiceUtil
 */
@ProviderType
public class UserAccountLocalServiceImpl extends UserAccountLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * ru.dokstrudio.med.srv.service.UserAccountLocalServiceUtil} to access the
	 * user account local service.
	 */
	public UserAccount createUserAccount(long userId, long accountTypeId) throws PortalException {
		UserAccount existingUserAccount = null;
		UserAccountPK userAccountPK = new UserAccountPK(userId, accountTypeId);
		try {
			existingUserAccount = userAccountLocalService.getUserAccount(userAccountPK);
		} catch (PortalException e) {/*it's ok. There shouldn't be such account */}
		
		if (existingUserAccount != null) {
			throw new PortalException("User wih id = " + userId + " and account type = " + accountTypeId);
		}
		UserAccount userAccount = userAccountLocalService.createUserAccount(userAccountPK);
		userAccount.setAccountTypeId(accountTypeId);
		userAccount.setUserId(userId);
		userAccount.setActivationDate(new Date());
		//TODO set expiration date according to ApplicationAccount duration property
		//Free account is permanent
		
		return userAccountLocalService.updateUserAccount(userAccount);
	}
	
	public List<UserAccount> findByUserId(long userId) {
		return UserAccountUtil.findByUserId(userId);
	}
}