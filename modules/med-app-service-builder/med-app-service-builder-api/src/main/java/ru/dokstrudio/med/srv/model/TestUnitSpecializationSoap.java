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

package ru.dokstrudio.med.srv.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class TestUnitSpecializationSoap implements Serializable {
	public static TestUnitSpecializationSoap toSoapModel(
		TestUnitSpecialization model) {
		TestUnitSpecializationSoap soapModel = new TestUnitSpecializationSoap();

		soapModel.setSpecializationId(model.getSpecializationId());
		soapModel.setNameLocalizationKey(model.getNameLocalizationKey());
		soapModel.setSpecializationIcon(model.getSpecializationIcon());

		return soapModel;
	}

	public static TestUnitSpecializationSoap[] toSoapModels(
		TestUnitSpecialization[] models) {
		TestUnitSpecializationSoap[] soapModels = new TestUnitSpecializationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestUnitSpecializationSoap[][] toSoapModels(
		TestUnitSpecialization[][] models) {
		TestUnitSpecializationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestUnitSpecializationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestUnitSpecializationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestUnitSpecializationSoap[] toSoapModels(
		List<TestUnitSpecialization> models) {
		List<TestUnitSpecializationSoap> soapModels = new ArrayList<TestUnitSpecializationSoap>(models.size());

		for (TestUnitSpecialization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestUnitSpecializationSoap[soapModels.size()]);
	}

	public TestUnitSpecializationSoap() {
	}

	public long getPrimaryKey() {
		return _specializationId;
	}

	public void setPrimaryKey(long pk) {
		setSpecializationId(pk);
	}

	public long getSpecializationId() {
		return _specializationId;
	}

	public void setSpecializationId(long specializationId) {
		_specializationId = specializationId;
	}

	public String getNameLocalizationKey() {
		return _nameLocalizationKey;
	}

	public void setNameLocalizationKey(String nameLocalizationKey) {
		_nameLocalizationKey = nameLocalizationKey;
	}

	public String getSpecializationIcon() {
		return _specializationIcon;
	}

	public void setSpecializationIcon(String specializationIcon) {
		_specializationIcon = specializationIcon;
	}

	private long _specializationId;
	private String _nameLocalizationKey;
	private String _specializationIcon;
}