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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TestItemQuestion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemQuestion
 * @generated
 */
@ProviderType
public class TestItemQuestionWrapper implements TestItemQuestion,
	ModelWrapper<TestItemQuestion> {
	public TestItemQuestionWrapper(TestItemQuestion testItemQuestion) {
		_testItemQuestion = testItemQuestion;
	}

	@Override
	public Class<?> getModelClass() {
		return TestItemQuestion.class;
	}

	@Override
	public String getModelClassName() {
		return TestItemQuestion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("questionId", getQuestionId());
		attributes.put("questionNumber", getQuestionNumber());
		attributes.put("question", getQuestion());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Long questionNumber = (Long)attributes.get("questionNumber");

		if (questionNumber != null) {
			setQuestionNumber(questionNumber);
		}

		String question = (String)attributes.get("question");

		if (question != null) {
			setQuestion(question);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _testItemQuestion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testItemQuestion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _testItemQuestion.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testItemQuestion.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstudio.model.TestItemQuestion> toCacheModel() {
		return _testItemQuestion.toCacheModel();
	}

	@Override
	public int compareTo(ru.dokstudio.model.TestItemQuestion testItemQuestion) {
		return _testItemQuestion.compareTo(testItemQuestion);
	}

	@Override
	public int hashCode() {
		return _testItemQuestion.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testItemQuestion.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestItemQuestionWrapper((TestItemQuestion)_testItemQuestion.clone());
	}

	/**
	* Returns the question of this test item question.
	*
	* @return the question of this test item question
	*/
	@Override
	public java.lang.String getQuestion() {
		return _testItemQuestion.getQuestion();
	}

	/**
	* Returns the uuid of this test item question.
	*
	* @return the uuid of this test item question
	*/
	@Override
	public java.lang.String getUuid() {
		return _testItemQuestion.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _testItemQuestion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _testItemQuestion.toXmlString();
	}

	/**
	* Returns the modified date of this test item question.
	*
	* @return the modified date of this test item question
	*/
	@Override
	public Date getModifiedDate() {
		return _testItemQuestion.getModifiedDate();
	}

	/**
	* Returns the primary key of this test item question.
	*
	* @return the primary key of this test item question
	*/
	@Override
	public long getPrimaryKey() {
		return _testItemQuestion.getPrimaryKey();
	}

	/**
	* Returns the question ID of this test item question.
	*
	* @return the question ID of this test item question
	*/
	@Override
	public long getQuestionId() {
		return _testItemQuestion.getQuestionId();
	}

	/**
	* Returns the question number of this test item question.
	*
	* @return the question number of this test item question
	*/
	@Override
	public long getQuestionNumber() {
		return _testItemQuestion.getQuestionNumber();
	}

	@Override
	public ru.dokstudio.model.TestItemQuestion toEscapedModel() {
		return new TestItemQuestionWrapper(_testItemQuestion.toEscapedModel());
	}

	@Override
	public ru.dokstudio.model.TestItemQuestion toUnescapedModel() {
		return new TestItemQuestionWrapper(_testItemQuestion.toUnescapedModel());
	}

	@Override
	public void persist() {
		_testItemQuestion.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testItemQuestion.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testItemQuestion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testItemQuestion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testItemQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this test item question.
	*
	* @param modifiedDate the modified date of this test item question
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_testItemQuestion.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_testItemQuestion.setNew(n);
	}

	/**
	* Sets the primary key of this test item question.
	*
	* @param primaryKey the primary key of this test item question
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testItemQuestion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testItemQuestion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the question of this test item question.
	*
	* @param question the question of this test item question
	*/
	@Override
	public void setQuestion(java.lang.String question) {
		_testItemQuestion.setQuestion(question);
	}

	/**
	* Sets the question ID of this test item question.
	*
	* @param questionId the question ID of this test item question
	*/
	@Override
	public void setQuestionId(long questionId) {
		_testItemQuestion.setQuestionId(questionId);
	}

	/**
	* Sets the question number of this test item question.
	*
	* @param questionNumber the question number of this test item question
	*/
	@Override
	public void setQuestionNumber(long questionNumber) {
		_testItemQuestion.setQuestionNumber(questionNumber);
	}

	/**
	* Sets the uuid of this test item question.
	*
	* @param uuid the uuid of this test item question
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_testItemQuestion.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestItemQuestionWrapper)) {
			return false;
		}

		TestItemQuestionWrapper testItemQuestionWrapper = (TestItemQuestionWrapper)obj;

		if (Objects.equals(_testItemQuestion,
					testItemQuestionWrapper._testItemQuestion)) {
			return true;
		}

		return false;
	}

	@Override
	public TestItemQuestion getWrappedModel() {
		return _testItemQuestion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testItemQuestion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testItemQuestion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testItemQuestion.resetOriginalValues();
	}

	private final TestItemQuestion _testItemQuestion;
}