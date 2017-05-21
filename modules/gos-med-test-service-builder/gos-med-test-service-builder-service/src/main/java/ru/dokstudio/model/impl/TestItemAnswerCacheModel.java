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

import ru.dokstudio.model.TestItemAnswer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TestItemAnswer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAnswer
 * @generated
 */
@ProviderType
public class TestItemAnswerCacheModel implements CacheModel<TestItemAnswer>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestItemAnswerCacheModel)) {
			return false;
		}

		TestItemAnswerCacheModel testItemAnswerCacheModel = (TestItemAnswerCacheModel)obj;

		if (answerId == testItemAnswerCacheModel.answerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, answerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", answerId=");
		sb.append(answerId);
		sb.append(", questionId=");
		sb.append(questionId);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", isCorrect=");
		sb.append(isCorrect);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestItemAnswer toEntityModel() {
		TestItemAnswerImpl testItemAnswerImpl = new TestItemAnswerImpl();

		if (uuid == null) {
			testItemAnswerImpl.setUuid(StringPool.BLANK);
		}
		else {
			testItemAnswerImpl.setUuid(uuid);
		}

		testItemAnswerImpl.setAnswerId(answerId);
		testItemAnswerImpl.setQuestionId(questionId);

		if (answer == null) {
			testItemAnswerImpl.setAnswer(StringPool.BLANK);
		}
		else {
			testItemAnswerImpl.setAnswer(answer);
		}

		testItemAnswerImpl.setIsCorrect(isCorrect);

		testItemAnswerImpl.resetOriginalValues();

		return testItemAnswerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		answerId = objectInput.readLong();

		questionId = objectInput.readLong();
		answer = objectInput.readUTF();

		isCorrect = objectInput.readBoolean();
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

		objectOutput.writeLong(answerId);

		objectOutput.writeLong(questionId);

		if (answer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(answer);
		}

		objectOutput.writeBoolean(isCorrect);
	}

	public String uuid;
	public long answerId;
	public long questionId;
	public String answer;
	public boolean isCorrect;
}