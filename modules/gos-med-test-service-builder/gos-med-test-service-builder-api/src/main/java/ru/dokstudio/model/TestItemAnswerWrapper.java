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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TestItemAnswer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAnswer
 * @generated
 */
@ProviderType
public class TestItemAnswerWrapper implements TestItemAnswer,
	ModelWrapper<TestItemAnswer> {
	public TestItemAnswerWrapper(TestItemAnswer testItemAnswer) {
		_testItemAnswer = testItemAnswer;
	}

	@Override
	public Class<?> getModelClass() {
		return TestItemAnswer.class;
	}

	@Override
	public String getModelClassName() {
		return TestItemAnswer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("answerId", getAnswerId());
		attributes.put("questionId", getQuestionId());
		attributes.put("answer", getAnswer());
		attributes.put("isCorrect", getIsCorrect());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long answerId = (Long)attributes.get("answerId");

		if (answerId != null) {
			setAnswerId(answerId);
		}

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Boolean isCorrect = (Boolean)attributes.get("isCorrect");

		if (isCorrect != null) {
			setIsCorrect(isCorrect);
		}
	}

	/**
	* Returns the is correct of this test item answer.
	*
	* @return the is correct of this test item answer
	*/
	@Override
	public boolean getIsCorrect() {
		return _testItemAnswer.getIsCorrect();
	}

	@Override
	public boolean isCachedModel() {
		return _testItemAnswer.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testItemAnswer.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this test item answer is is correct.
	*
	* @return <code>true</code> if this test item answer is is correct; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsCorrect() {
		return _testItemAnswer.isIsCorrect();
	}

	@Override
	public boolean isNew() {
		return _testItemAnswer.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testItemAnswer.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstudio.model.TestItemAnswer> toCacheModel() {
		return _testItemAnswer.toCacheModel();
	}

	@Override
	public int compareTo(ru.dokstudio.model.TestItemAnswer testItemAnswer) {
		return _testItemAnswer.compareTo(testItemAnswer);
	}

	@Override
	public int hashCode() {
		return _testItemAnswer.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testItemAnswer.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestItemAnswerWrapper((TestItemAnswer)_testItemAnswer.clone());
	}

	/**
	* Returns the answer of this test item answer.
	*
	* @return the answer of this test item answer
	*/
	@Override
	public java.lang.String getAnswer() {
		return _testItemAnswer.getAnswer();
	}

	/**
	* Returns the uuid of this test item answer.
	*
	* @return the uuid of this test item answer
	*/
	@Override
	public java.lang.String getUuid() {
		return _testItemAnswer.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _testItemAnswer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _testItemAnswer.toXmlString();
	}

	/**
	* Returns the answer ID of this test item answer.
	*
	* @return the answer ID of this test item answer
	*/
	@Override
	public long getAnswerId() {
		return _testItemAnswer.getAnswerId();
	}

	/**
	* Returns the primary key of this test item answer.
	*
	* @return the primary key of this test item answer
	*/
	@Override
	public long getPrimaryKey() {
		return _testItemAnswer.getPrimaryKey();
	}

	/**
	* Returns the question ID of this test item answer.
	*
	* @return the question ID of this test item answer
	*/
	@Override
	public long getQuestionId() {
		return _testItemAnswer.getQuestionId();
	}

	@Override
	public ru.dokstudio.model.TestItemAnswer toEscapedModel() {
		return new TestItemAnswerWrapper(_testItemAnswer.toEscapedModel());
	}

	@Override
	public ru.dokstudio.model.TestItemAnswer toUnescapedModel() {
		return new TestItemAnswerWrapper(_testItemAnswer.toUnescapedModel());
	}

	@Override
	public void persist() {
		_testItemAnswer.persist();
	}

	/**
	* Sets the answer of this test item answer.
	*
	* @param answer the answer of this test item answer
	*/
	@Override
	public void setAnswer(java.lang.String answer) {
		_testItemAnswer.setAnswer(answer);
	}

	/**
	* Sets the answer ID of this test item answer.
	*
	* @param answerId the answer ID of this test item answer
	*/
	@Override
	public void setAnswerId(long answerId) {
		_testItemAnswer.setAnswerId(answerId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testItemAnswer.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testItemAnswer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testItemAnswer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testItemAnswer.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this test item answer is is correct.
	*
	* @param isCorrect the is correct of this test item answer
	*/
	@Override
	public void setIsCorrect(boolean isCorrect) {
		_testItemAnswer.setIsCorrect(isCorrect);
	}

	@Override
	public void setNew(boolean n) {
		_testItemAnswer.setNew(n);
	}

	/**
	* Sets the primary key of this test item answer.
	*
	* @param primaryKey the primary key of this test item answer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testItemAnswer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testItemAnswer.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the question ID of this test item answer.
	*
	* @param questionId the question ID of this test item answer
	*/
	@Override
	public void setQuestionId(long questionId) {
		_testItemAnswer.setQuestionId(questionId);
	}

	/**
	* Sets the uuid of this test item answer.
	*
	* @param uuid the uuid of this test item answer
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_testItemAnswer.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestItemAnswerWrapper)) {
			return false;
		}

		TestItemAnswerWrapper testItemAnswerWrapper = (TestItemAnswerWrapper)obj;

		if (Objects.equals(_testItemAnswer,
					testItemAnswerWrapper._testItemAnswer)) {
			return true;
		}

		return false;
	}

	@Override
	public TestItemAnswer getWrappedModel() {
		return _testItemAnswer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testItemAnswer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testItemAnswer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testItemAnswer.resetOriginalValues();
	}

	private final TestItemAnswer _testItemAnswer;
}