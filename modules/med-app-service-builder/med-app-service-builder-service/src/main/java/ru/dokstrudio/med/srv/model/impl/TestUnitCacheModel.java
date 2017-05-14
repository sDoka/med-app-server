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

import ru.dokstrudio.med.srv.model.TestUnit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TestUnit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnit
 * @generated
 */
@ProviderType
public class TestUnitCacheModel implements CacheModel<TestUnit>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitCacheModel)) {
			return false;
		}

		TestUnitCacheModel testUnitCacheModel = (TestUnitCacheModel)obj;

		if (testUnitId == testUnitCacheModel.testUnitId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, testUnitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{testUnitId=");
		sb.append(testUnitId);
		sb.append(", number=");
		sb.append(number);
		sb.append(", specializationId=");
		sb.append(specializationId);
		sb.append(", questionText=");
		sb.append(questionText);
		sb.append(", questionType=");
		sb.append(questionType);
		sb.append(", questionDlFileEntryId=");
		sb.append(questionDlFileEntryId);
		sb.append(", isActual=");
		sb.append(isActual);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestUnit toEntityModel() {
		TestUnitImpl testUnitImpl = new TestUnitImpl();

		testUnitImpl.setTestUnitId(testUnitId);
		testUnitImpl.setNumber(number);
		testUnitImpl.setSpecializationId(specializationId);

		if (questionText == null) {
			testUnitImpl.setQuestionText(StringPool.BLANK);
		}
		else {
			testUnitImpl.setQuestionText(questionText);
		}

		testUnitImpl.setQuestionType(questionType);
		testUnitImpl.setQuestionDlFileEntryId(questionDlFileEntryId);
		testUnitImpl.setIsActual(isActual);

		if (createDate == Long.MIN_VALUE) {
			testUnitImpl.setCreateDate(null);
		}
		else {
			testUnitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			testUnitImpl.setModifiedDate(null);
		}
		else {
			testUnitImpl.setModifiedDate(new Date(modifiedDate));
		}

		testUnitImpl.resetOriginalValues();

		return testUnitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		testUnitId = objectInput.readLong();

		number = objectInput.readLong();

		specializationId = objectInput.readInt();
		questionText = objectInput.readUTF();

		questionType = objectInput.readInt();

		questionDlFileEntryId = objectInput.readLong();

		isActual = objectInput.readBoolean();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(testUnitId);

		objectOutput.writeLong(number);

		objectOutput.writeInt(specializationId);

		if (questionText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(questionText);
		}

		objectOutput.writeInt(questionType);

		objectOutput.writeLong(questionDlFileEntryId);

		objectOutput.writeBoolean(isActual);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long testUnitId;
	public long number;
	public int specializationId;
	public String questionText;
	public int questionType;
	public long questionDlFileEntryId;
	public boolean isActual;
	public long createDate;
	public long modifiedDate;
}