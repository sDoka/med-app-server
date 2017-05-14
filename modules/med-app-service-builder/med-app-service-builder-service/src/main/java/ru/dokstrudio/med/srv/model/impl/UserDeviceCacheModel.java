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

package ru.dokstrudio.med.srv.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import ru.dokstrudio.med.srv.model.UserDevice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserDevice in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserDevice
 * @generated
 */
@ProviderType
public class UserDeviceCacheModel implements CacheModel<UserDevice>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserDeviceCacheModel)) {
			return false;
		}

		UserDeviceCacheModel userDeviceCacheModel = (UserDeviceCacheModel)obj;

		if (deviceId == userDeviceCacheModel.deviceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, deviceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{deviceId=");
		sb.append(deviceId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", deviceTypeId=");
		sb.append(deviceTypeId);
		sb.append(", deviceKey=");
		sb.append(deviceKey);
		sb.append(", operatingSystem=");
		sb.append(operatingSystem);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserDevice toEntityModel() {
		UserDeviceImpl userDeviceImpl = new UserDeviceImpl();

		userDeviceImpl.setDeviceId(deviceId);
		userDeviceImpl.setUserId(userId);
		userDeviceImpl.setDeviceTypeId(deviceTypeId);

		if (deviceKey == null) {
			userDeviceImpl.setDeviceKey(StringPool.BLANK);
		}
		else {
			userDeviceImpl.setDeviceKey(deviceKey);
		}

		if (operatingSystem == null) {
			userDeviceImpl.setOperatingSystem(StringPool.BLANK);
		}
		else {
			userDeviceImpl.setOperatingSystem(operatingSystem);
		}

		userDeviceImpl.resetOriginalValues();

		return userDeviceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		deviceId = objectInput.readLong();

		userId = objectInput.readLong();

		deviceTypeId = objectInput.readInt();
		deviceKey = objectInput.readUTF();
		operatingSystem = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(deviceId);

		objectOutput.writeLong(userId);

		objectOutput.writeInt(deviceTypeId);

		if (deviceKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deviceKey);
		}

		if (operatingSystem == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(operatingSystem);
		}
	}

	public long deviceId;
	public long userId;
	public int deviceTypeId;
	public String deviceKey;
	public String operatingSystem;
}