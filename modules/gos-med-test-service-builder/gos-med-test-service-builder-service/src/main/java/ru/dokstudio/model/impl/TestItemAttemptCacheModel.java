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

package ru.dokstudio.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import ru.dokstudio.model.TestItemAttempt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TestItemAttempt in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAttempt
 * @generated
 */
@ProviderType
public class TestItemAttemptCacheModel implements CacheModel<TestItemAttempt>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestItemAttemptCacheModel)) {
			return false;
		}

		TestItemAttemptCacheModel testItemAttemptCacheModel = (TestItemAttemptCacheModel)obj;

		if (attemptId == testItemAttemptCacheModel.attemptId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attemptId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", attemptId=");
		sb.append(attemptId);
		sb.append(", questionId=");
		sb.append(questionId);
		sb.append(", answerId=");
		sb.append(answerId);
		sb.append(", isSuccessAttempt=");
		sb.append(isSuccessAttempt);
		sb.append(", attemptDate=");
		sb.append(attemptDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestItemAttempt toEntityModel() {
		TestItemAttemptImpl testItemAttemptImpl = new TestItemAttemptImpl();

		if (uuid == null) {
			testItemAttemptImpl.setUuid(StringPool.BLANK);
		}
		else {
			testItemAttemptImpl.setUuid(uuid);
		}

		testItemAttemptImpl.setAttemptId(attemptId);
		testItemAttemptImpl.setQuestionId(questionId);
		testItemAttemptImpl.setAnswerId(answerId);
		testItemAttemptImpl.setIsSuccessAttempt(isSuccessAttempt);

		if (attemptDate == Long.MIN_VALUE) {
			testItemAttemptImpl.setAttemptDate(null);
		}
		else {
			testItemAttemptImpl.setAttemptDate(new Date(attemptDate));
		}

		testItemAttemptImpl.resetOriginalValues();

		return testItemAttemptImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		attemptId = objectInput.readLong();

		questionId = objectInput.readLong();

		answerId = objectInput.readLong();

		isSuccessAttempt = objectInput.readBoolean();
		attemptDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(attemptId);

		objectOutput.writeLong(questionId);

		objectOutput.writeLong(answerId);

		objectOutput.writeBoolean(isSuccessAttempt);
		objectOutput.writeLong(attemptDate);
	}

	public String uuid;
	public long attemptId;
	public long questionId;
	public long answerId;
	public boolean isSuccessAttempt;
	public long attemptDate;
}