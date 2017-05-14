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

import ru.dokstrudio.med.srv.model.ApplicationUsage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ApplicationUsage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationUsage
 * @generated
 */
@ProviderType
public class ApplicationUsageCacheModel implements CacheModel<ApplicationUsage>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplicationUsageCacheModel)) {
			return false;
		}

		ApplicationUsageCacheModel applicationUsageCacheModel = (ApplicationUsageCacheModel)obj;

		if (applicationUserId == applicationUsageCacheModel.applicationUserId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, applicationUserId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{applicationUserId=");
		sb.append(applicationUserId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", ipAddress=");
		sb.append(ipAddress);
		sb.append(", deviceId=");
		sb.append(deviceId);
		sb.append(", actionType=");
		sb.append(actionType);
		sb.append(", actionTime=");
		sb.append(actionTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ApplicationUsage toEntityModel() {
		ApplicationUsageImpl applicationUsageImpl = new ApplicationUsageImpl();

		applicationUsageImpl.setApplicationUserId(applicationUserId);
		applicationUsageImpl.setUserId(userId);

		if (ipAddress == null) {
			applicationUsageImpl.setIpAddress(StringPool.BLANK);
		}
		else {
			applicationUsageImpl.setIpAddress(ipAddress);
		}

		applicationUsageImpl.setDeviceId(deviceId);
		applicationUsageImpl.setActionType(actionType);

		if (actionTime == Long.MIN_VALUE) {
			applicationUsageImpl.setActionTime(null);
		}
		else {
			applicationUsageImpl.setActionTime(new Date(actionTime));
		}

		applicationUsageImpl.resetOriginalValues();

		return applicationUsageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		applicationUserId = objectInput.readLong();

		userId = objectInput.readLong();
		ipAddress = objectInput.readUTF();

		deviceId = objectInput.readLong();

		actionType = objectInput.readInt();
		actionTime = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(applicationUserId);

		objectOutput.writeLong(userId);

		if (ipAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ipAddress);
		}

		objectOutput.writeLong(deviceId);

		objectOutput.writeInt(actionType);
		objectOutput.writeLong(actionTime);
	}

	public long applicationUserId;
	public long userId;
	public String ipAddress;
	public long deviceId;
	public int actionType;
	public long actionTime;
}