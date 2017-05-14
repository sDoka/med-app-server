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

import ru.dokstrudio.med.srv.model.TestUnitAttempt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TestUnitAttempt in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAttempt
 * @generated
 */
@ProviderType
public class TestUnitAttemptCacheModel implements CacheModel<TestUnitAttempt>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitAttemptCacheModel)) {
			return false;
		}

		TestUnitAttemptCacheModel testUnitAttemptCacheModel = (TestUnitAttemptCacheModel)obj;

		if (testUnitAttemptId == testUnitAttemptCacheModel.testUnitAttemptId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, testUnitAttemptId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{testUnitAttemptId=");
		sb.append(testUnitAttemptId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", testUnitId=");
		sb.append(testUnitId);
		sb.append(", testUnitAnswerId=");
		sb.append(testUnitAnswerId);
		sb.append(", submitTime=");
		sb.append(submitTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestUnitAttempt toEntityModel() {
		TestUnitAttemptImpl testUnitAttemptImpl = new TestUnitAttemptImpl();

		testUnitAttemptImpl.setTestUnitAttemptId(testUnitAttemptId);
		testUnitAttemptImpl.setUserId(userId);
		testUnitAttemptImpl.setTestUnitId(testUnitId);
		testUnitAttemptImpl.setTestUnitAnswerId(testUnitAnswerId);

		if (submitTime == Long.MIN_VALUE) {
			testUnitAttemptImpl.setSubmitTime(null);
		}
		else {
			testUnitAttemptImpl.setSubmitTime(new Date(submitTime));
		}

		testUnitAttemptImpl.resetOriginalValues();

		return testUnitAttemptImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		testUnitAttemptId = objectInput.readLong();

		userId = objectInput.readLong();

		testUnitId = objectInput.readLong();

		testUnitAnswerId = objectInput.readLong();
		submitTime = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(testUnitAttemptId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(testUnitId);

		objectOutput.writeLong(testUnitAnswerId);
		objectOutput.writeLong(submitTime);
	}

	public long testUnitAttemptId;
	public long userId;
	public long testUnitId;
	public long testUnitAnswerId;
	public long submitTime;
}