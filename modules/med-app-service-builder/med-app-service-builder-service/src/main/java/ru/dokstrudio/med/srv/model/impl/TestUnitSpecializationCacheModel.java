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

import ru.dokstrudio.med.srv.model.TestUnitSpecialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TestUnitSpecialization in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitSpecialization
 * @generated
 */
@ProviderType
public class TestUnitSpecializationCacheModel implements CacheModel<TestUnitSpecialization>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitSpecializationCacheModel)) {
			return false;
		}

		TestUnitSpecializationCacheModel testUnitSpecializationCacheModel = (TestUnitSpecializationCacheModel)obj;

		if (specializationId == testUnitSpecializationCacheModel.specializationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, specializationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{specializationId=");
		sb.append(specializationId);
		sb.append(", nameLocalizationKey=");
		sb.append(nameLocalizationKey);
		sb.append(", specialiationIcon=");
		sb.append(specialiationIcon);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestUnitSpecialization toEntityModel() {
		TestUnitSpecializationImpl testUnitSpecializationImpl = new TestUnitSpecializationImpl();

		testUnitSpecializationImpl.setSpecializationId(specializationId);

		if (nameLocalizationKey == null) {
			testUnitSpecializationImpl.setNameLocalizationKey(StringPool.BLANK);
		}
		else {
			testUnitSpecializationImpl.setNameLocalizationKey(nameLocalizationKey);
		}

		if (specialiationIcon == null) {
			testUnitSpecializationImpl.setSpecialiationIcon(StringPool.BLANK);
		}
		else {
			testUnitSpecializationImpl.setSpecialiationIcon(specialiationIcon);
		}

		testUnitSpecializationImpl.resetOriginalValues();

		return testUnitSpecializationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		specializationId = objectInput.readLong();
		nameLocalizationKey = objectInput.readUTF();
		specialiationIcon = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(specializationId);

		if (nameLocalizationKey == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameLocalizationKey);
		}

		if (specialiationIcon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specialiationIcon);
		}
	}

	public long specializationId;
	public String nameLocalizationKey;
	public String specialiationIcon;
}