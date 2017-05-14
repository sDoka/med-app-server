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

package ru.dokstudio.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.dokstudio.service.http.TestItemAttemptServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstudio.service.http.TestItemAttemptServiceSoap
 * @generated
 */
@ProviderType
public class TestItemAttemptSoap implements Serializable {
	public static TestItemAttemptSoap toSoapModel(TestItemAttempt model) {
		TestItemAttemptSoap soapModel = new TestItemAttemptSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAttemptId(model.getAttemptId());
		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setAnswerId(model.getAnswerId());
		soapModel.setIsSuccessAttempt(model.getIsSuccessAttempt());
		soapModel.setAttemptDate(model.getAttemptDate());

		return soapModel;
	}

	public static TestItemAttemptSoap[] toSoapModels(TestItemAttempt[] models) {
		TestItemAttemptSoap[] soapModels = new TestItemAttemptSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestItemAttemptSoap[][] toSoapModels(
		TestItemAttempt[][] models) {
		TestItemAttemptSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestItemAttemptSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestItemAttemptSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestItemAttemptSoap[] toSoapModels(
		List<TestItemAttempt> models) {
		List<TestItemAttemptSoap> soapModels = new ArrayList<TestItemAttemptSoap>(models.size());

		for (TestItemAttempt model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestItemAttemptSoap[soapModels.size()]);
	}

	public TestItemAttemptSoap() {
	}

	public long getPrimaryKey() {
		return _attemptId;
	}

	public void setPrimaryKey(long pk) {
		setAttemptId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAttemptId() {
		return _attemptId;
	}

	public void setAttemptId(long attemptId) {
		_attemptId = attemptId;
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public long getAnswerId() {
		return _answerId;
	}

	public void setAnswerId(long answerId) {
		_answerId = answerId;
	}

	public boolean getIsSuccessAttempt() {
		return _isSuccessAttempt;
	}

	public boolean isIsSuccessAttempt() {
		return _isSuccessAttempt;
	}

	public void setIsSuccessAttempt(boolean isSuccessAttempt) {
		_isSuccessAttempt = isSuccessAttempt;
	}

	public Date getAttemptDate() {
		return _attemptDate;
	}

	public void setAttemptDate(Date attemptDate) {
		_attemptDate = attemptDate;
	}

	private String _uuid;
	private long _attemptId;
	private long _questionId;
	private long _answerId;
	private boolean _isSuccessAttempt;
	private Date _attemptDate;
}