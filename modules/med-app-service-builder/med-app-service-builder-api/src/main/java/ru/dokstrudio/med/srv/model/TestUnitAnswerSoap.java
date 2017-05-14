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
public class TestUnitAnswerSoap implements Serializable {
	public static TestUnitAnswerSoap toSoapModel(TestUnitAnswer model) {
		TestUnitAnswerSoap soapModel = new TestUnitAnswerSoap();

		soapModel.setTestUnitAnswerId(model.getTestUnitAnswerId());
		soapModel.setTestUnitId(model.getTestUnitId());
		soapModel.setAnswerText(model.getAnswerText());
		soapModel.setAnswerType(model.getAnswerType());
		soapModel.setAnswerDlFileEntryId(model.getAnswerDlFileEntryId());
		soapModel.setIsCorrent(model.getIsCorrent());

		return soapModel;
	}

	public static TestUnitAnswerSoap[] toSoapModels(TestUnitAnswer[] models) {
		TestUnitAnswerSoap[] soapModels = new TestUnitAnswerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestUnitAnswerSoap[][] toSoapModels(TestUnitAnswer[][] models) {
		TestUnitAnswerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestUnitAnswerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestUnitAnswerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestUnitAnswerSoap[] toSoapModels(List<TestUnitAnswer> models) {
		List<TestUnitAnswerSoap> soapModels = new ArrayList<TestUnitAnswerSoap>(models.size());

		for (TestUnitAnswer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestUnitAnswerSoap[soapModels.size()]);
	}

	public TestUnitAnswerSoap() {
	}

	public long getPrimaryKey() {
		return _testUnitAnswerId;
	}

	public void setPrimaryKey(long pk) {
		setTestUnitAnswerId(pk);
	}

	public long getTestUnitAnswerId() {
		return _testUnitAnswerId;
	}

	public void setTestUnitAnswerId(long testUnitAnswerId) {
		_testUnitAnswerId = testUnitAnswerId;
	}

	public long getTestUnitId() {
		return _testUnitId;
	}

	public void setTestUnitId(long testUnitId) {
		_testUnitId = testUnitId;
	}

	public String getAnswerText() {
		return _answerText;
	}

	public void setAnswerText(String answerText) {
		_answerText = answerText;
	}

	public int getAnswerType() {
		return _answerType;
	}

	public void setAnswerType(int answerType) {
		_answerType = answerType;
	}

	public long getAnswerDlFileEntryId() {
		return _answerDlFileEntryId;
	}

	public void setAnswerDlFileEntryId(long answerDlFileEntryId) {
		_answerDlFileEntryId = answerDlFileEntryId;
	}

	public boolean getIsCorrent() {
		return _isCorrent;
	}

	public boolean isIsCorrent() {
		return _isCorrent;
	}

	public void setIsCorrent(boolean isCorrent) {
		_isCorrent = isCorrent;
	}

	private long _testUnitAnswerId;
	private long _testUnitId;
	private String _answerText;
	private int _answerType;
	private long _answerDlFileEntryId;
	private boolean _isCorrent;
}