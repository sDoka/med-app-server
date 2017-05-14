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
public class TestUnitAttemptSoap implements Serializable {
	public static TestUnitAttemptSoap toSoapModel(TestUnitAttempt model) {
		TestUnitAttemptSoap soapModel = new TestUnitAttemptSoap();

		soapModel.setTestUnitAttemptId(model.getTestUnitAttemptId());
		soapModel.setUserId(model.getUserId());
		soapModel.setTestUnitId(model.getTestUnitId());
		soapModel.setTestUnitAnswerId(model.getTestUnitAnswerId());
		soapModel.setSubmitTime(model.getSubmitTime());

		return soapModel;
	}

	public static TestUnitAttemptSoap[] toSoapModels(TestUnitAttempt[] models) {
		TestUnitAttemptSoap[] soapModels = new TestUnitAttemptSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestUnitAttemptSoap[][] toSoapModels(
		TestUnitAttempt[][] models) {
		TestUnitAttemptSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestUnitAttemptSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestUnitAttemptSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestUnitAttemptSoap[] toSoapModels(
		List<TestUnitAttempt> models) {
		List<TestUnitAttemptSoap> soapModels = new ArrayList<TestUnitAttemptSoap>(models.size());

		for (TestUnitAttempt model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestUnitAttemptSoap[soapModels.size()]);
	}

	public TestUnitAttemptSoap() {
	}

	public long getPrimaryKey() {
		return _testUnitAttemptId;
	}

	public void setPrimaryKey(long pk) {
		setTestUnitAttemptId(pk);
	}

	public long getTestUnitAttemptId() {
		return _testUnitAttemptId;
	}

	public void setTestUnitAttemptId(long testUnitAttemptId) {
		_testUnitAttemptId = testUnitAttemptId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getTestUnitId() {
		return _testUnitId;
	}

	public void setTestUnitId(long testUnitId) {
		_testUnitId = testUnitId;
	}

	public long getTestUnitAnswerId() {
		return _testUnitAnswerId;
	}

	public void setTestUnitAnswerId(long testUnitAnswerId) {
		_testUnitAnswerId = testUnitAnswerId;
	}

	public Date getSubmitTime() {
		return _submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		_submitTime = submitTime;
	}

	private long _testUnitAttemptId;
	private long _userId;
	private long _testUnitId;
	private long _testUnitAnswerId;
	private Date _submitTime;
}