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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class TestUnitSoap implements Serializable {
	public static TestUnitSoap toSoapModel(TestUnit model) {
		TestUnitSoap soapModel = new TestUnitSoap();

		soapModel.setTestUnitId(model.getTestUnitId());
		soapModel.setNumber(model.getNumber());
		soapModel.setSpecializationId(model.getSpecializationId());
		soapModel.setQuestionText(model.getQuestionText());
		soapModel.setQuestionType(model.getQuestionType());
		soapModel.setQuestionDlFileEntryId(model.getQuestionDlFileEntryId());
		soapModel.setIsActual(model.getIsActual());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static TestUnitSoap[] toSoapModels(TestUnit[] models) {
		TestUnitSoap[] soapModels = new TestUnitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestUnitSoap[][] toSoapModels(TestUnit[][] models) {
		TestUnitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestUnitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestUnitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestUnitSoap[] toSoapModels(List<TestUnit> models) {
		List<TestUnitSoap> soapModels = new ArrayList<TestUnitSoap>(models.size());

		for (TestUnit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestUnitSoap[soapModels.size()]);
	}

	public TestUnitSoap() {
	}

	public long getPrimaryKey() {
		return _testUnitId;
	}

	public void setPrimaryKey(long pk) {
		setTestUnitId(pk);
	}

	public long getTestUnitId() {
		return _testUnitId;
	}

	public void setTestUnitId(long testUnitId) {
		_testUnitId = testUnitId;
	}

	public long getNumber() {
		return _number;
	}

	public void setNumber(long number) {
		_number = number;
	}

	public int getSpecializationId() {
		return _specializationId;
	}

	public void setSpecializationId(int specializationId) {
		_specializationId = specializationId;
	}

	public String getQuestionText() {
		return _questionText;
	}

	public void setQuestionText(String questionText) {
		_questionText = questionText;
	}

	public int getQuestionType() {
		return _questionType;
	}

	public void setQuestionType(int questionType) {
		_questionType = questionType;
	}

	public long getQuestionDlFileEntryId() {
		return _questionDlFileEntryId;
	}

	public void setQuestionDlFileEntryId(long questionDlFileEntryId) {
		_questionDlFileEntryId = questionDlFileEntryId;
	}

	public boolean getIsActual() {
		return _isActual;
	}

	public boolean isIsActual() {
		return _isActual;
	}

	public void setIsActual(boolean isActual) {
		_isActual = isActual;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _testUnitId;
	private long _number;
	private int _specializationId;
	private String _questionText;
	private int _questionType;
	private long _questionDlFileEntryId;
	private boolean _isActual;
	private Date _createDate;
	private Date _modifiedDate;
}