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

import aQute.bnd.annotation.ProviderType;
import ru.dokstrudio.med.srv.model.UserDevice;
import ru.dokstrudio.med.srv.service.base.UserDeviceLocalServiceBaseImpl;

/**
 * The implementation of the user device local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link ru.dokstrudio.med.srv.service.UserDeviceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserDeviceLocalServiceBaseImpl
 * @see ru.dokstrudio.med.srv.service.UserDeviceLocalServiceUtil
 */
@ProviderType
public class UserDeviceLocalServiceImpl extends UserDeviceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * ru.dokstrudio.med.srv.service.UserDeviceLocalServiceUtil} to access the
	 * user device local service.
	 */
	public UserDevice createUserDevice(long userId, String deviceKey, int deviceType, String operatingSystem) {
		long deviceId = counterLocalService.increment(UserDevice.class.getName());
		UserDevice userDevice = userDeviceLocalService.createUserDevice(deviceId);
		userDevice.setUserId(userId);
		userDevice.setDeviceKey(deviceKey);
		userDevice.setDeviceTypeId(deviceType);
		userDevice.setOperatingSystem(operatingSystem);
		userDeviceLocalService.updateUserDevice(userDevice);
		return userDevice;
	}
}