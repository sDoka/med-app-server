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

import ru.dokstudio.model.TestItemQuestion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TestItemQuestion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TestItemQuestion
 * @generated
 */
@ProviderType
public class TestItemQuestionCacheModel implements CacheModel<TestItemQuestion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestItemQuestionCacheModel)) {
			return false;
		}

		TestItemQuestionCacheModel testItemQuestionCacheModel = (TestItemQuestionCacheModel)obj;

		if (questionId == testItemQuestionCacheModel.questionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, questionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", questionId=");
		sb.append(questionId);
		sb.append(", questionNumber=");
		sb.append(questionNumber);
		sb.append(", question=");
		sb.append(question);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestItemQuestion toEntityModel() {
		TestItemQuestionImpl testItemQuestionImpl = new TestItemQuestionImpl();

		if (uuid == null) {
			testItemQuestionImpl.setUuid(StringPool.BLANK);
		}
		else {
			testItemQuestionImpl.setUuid(uuid);
		}

		testItemQuestionImpl.setQuestionId(questionId);
		testItemQuestionImpl.setQuestionNumber(questionNumber);

		if (question == null) {
			testItemQuestionImpl.setQuestion(StringPool.BLANK);
		}
		else {
			testItemQuestionImpl.setQuestion(question);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			testItemQuestionImpl.setModifiedDate(null);
		}
		else {
			testItemQuestionImpl.setModifiedDate(new Date(modifiedDate));
		}

		testItemQuestionImpl.resetOriginalValues();

		return testItemQuestionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		questionId = objectInput.readLong();

		questionNumber = objectInput.readLong();
		question = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
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

		objectOutput.writeLong(questionId);

		objectOutput.writeLong(questionNumber);

		if (question == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(question);
		}

		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long questionId;
	public long questionNumber;
	public String question;
	public long modifiedDate;
}