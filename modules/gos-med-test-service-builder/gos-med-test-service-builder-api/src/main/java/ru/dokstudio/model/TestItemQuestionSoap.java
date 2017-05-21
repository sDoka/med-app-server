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
 * This class is used by SOAP remote services, specifically {@link ru.dokstudio.service.http.TestItemQuestionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstudio.service.http.TestItemQuestionServiceSoap
 * @generated
 */
@ProviderType
public class TestItemQuestionSoap implements Serializable {
	public static TestItemQuestionSoap toSoapModel(TestItemQuestion model) {
		TestItemQuestionSoap soapModel = new TestItemQuestionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setQuestionNumber(model.getQuestionNumber());
		soapModel.setQuestion(model.getQuestion());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static TestItemQuestionSoap[] toSoapModels(TestItemQuestion[] models) {
		TestItemQuestionSoap[] soapModels = new TestItemQuestionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestItemQuestionSoap[][] toSoapModels(
		TestItemQuestion[][] models) {
		TestItemQuestionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestItemQuestionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestItemQuestionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestItemQuestionSoap[] toSoapModels(
		List<TestItemQuestion> models) {
		List<TestItemQuestionSoap> soapModels = new ArrayList<TestItemQuestionSoap>(models.size());

		for (TestItemQuestion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestItemQuestionSoap[soapModels.size()]);
	}

	public TestItemQuestionSoap() {
	}

	public long getPrimaryKey() {
		return _questionId;
	}

	public void setPrimaryKey(long pk) {
		setQuestionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public long getQuestionNumber() {
		return _questionNumber;
	}

	public void setQuestionNumber(long questionNumber) {
		_questionNumber = questionNumber;
	}

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _questionId;
	private long _questionNumber;
	private String _question;
	private Date _modifiedDate;
}