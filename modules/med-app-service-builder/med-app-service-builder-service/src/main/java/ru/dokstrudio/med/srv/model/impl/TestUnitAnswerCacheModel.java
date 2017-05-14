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

import ru.dokstrudio.med.srv.model.TestUnitAnswer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TestUnitAnswer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAnswer
 * @generated
 */
@ProviderType
public class TestUnitAnswerCacheModel implements CacheModel<TestUnitAnswer>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitAnswerCacheModel)) {
			return false;
		}

		TestUnitAnswerCacheModel testUnitAnswerCacheModel = (TestUnitAnswerCacheModel)obj;

		if (testUnitAnswerId == testUnitAnswerCacheModel.testUnitAnswerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, testUnitAnswerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{testUnitAnswerId=");
		sb.append(testUnitAnswerId);
		sb.append(", testUnitId=");
		sb.append(testUnitId);
		sb.append(", answerText=");
		sb.append(answerText);
		sb.append(", answerType=");
		sb.append(answerType);
		sb.append(", answerDlFileEntryId=");
		sb.append(answerDlFileEntryId);
		sb.append(", isCorrent=");
		sb.append(isCorrent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestUnitAnswer toEntityModel() {
		TestUnitAnswerImpl testUnitAnswerImpl = new TestUnitAnswerImpl();

		testUnitAnswerImpl.setTestUnitAnswerId(testUnitAnswerId);
		testUnitAnswerImpl.setTestUnitId(testUnitId);

		if (answerText == null) {
			testUnitAnswerImpl.setAnswerText(StringPool.BLANK);
		}
		else {
			testUnitAnswerImpl.setAnswerText(answerText);
		}

		testUnitAnswerImpl.setAnswerType(answerType);
		testUnitAnswerImpl.setAnswerDlFileEntryId(answerDlFileEntryId);
		testUnitAnswerImpl.setIsCorrent(isCorrent);

		testUnitAnswerImpl.resetOriginalValues();

		return testUnitAnswerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		testUnitAnswerId = objectInput.readLong();

		testUnitId = objectInput.readLong();
		answerText = objectInput.readUTF();

		answerType = objectInput.readInt();

		answerDlFileEntryId = objectInput.readLong();

		isCorrent = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(testUnitAnswerId);

		objectOutput.writeLong(testUnitId);

		if (answerText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(answerText);
		}

		objectOutput.writeInt(answerType);

		objectOutput.writeLong(answerDlFileEntryId);

		objectOutput.writeBoolean(isCorrent);
	}

	public long testUnitAnswerId;
	public long testUnitId;
	public String answerText;
	public int answerType;
	public long answerDlFileEntryId;
	public boolean isCorrent;
}