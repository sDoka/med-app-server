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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ru.dokstudio.service.http.TestItemAnswerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstudio.service.http.TestItemAnswerServiceSoap
 * @generated
 */
@ProviderType
public class TestItemAnswerSoap implements Serializable {
	public static TestItemAnswerSoap toSoapModel(TestItemAnswer model) {
		TestItemAnswerSoap soapModel = new TestItemAnswerSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAnswerId(model.getAnswerId());
		soapModel.setQuestionId(model.getQuestionId());
		soapModel.setAnswer(model.getAnswer());
		soapModel.setIsCorrect(model.getIsCorrect());

		return soapModel;
	}

	public static TestItemAnswerSoap[] toSoapModels(TestItemAnswer[] models) {
		TestItemAnswerSoap[] soapModels = new TestItemAnswerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestItemAnswerSoap[][] toSoapModels(TestItemAnswer[][] models) {
		TestItemAnswerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestItemAnswerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestItemAnswerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestItemAnswerSoap[] toSoapModels(List<TestItemAnswer> models) {
		List<TestItemAnswerSoap> soapModels = new ArrayList<TestItemAnswerSoap>(models.size());

		for (TestItemAnswer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestItemAnswerSoap[soapModels.size()]);
	}

	public TestItemAnswerSoap() {
	}

	public long getPrimaryKey() {
		return _answerId;
	}

	public void setPrimaryKey(long pk) {
		setAnswerId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAnswerId() {
		return _answerId;
	}

	public void setAnswerId(long answerId) {
		_answerId = answerId;
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public boolean getIsCorrect() {
		return _isCorrect;
	}

	public boolean isIsCorrect() {
		return _isCorrect;
	}

	public void setIsCorrect(boolean isCorrect) {
		_isCorrect = isCorrect;
	}

	private String _uuid;
	private long _answerId;
	private long _questionId;
	private String _answer;
	private boolean _isCorrect;
}