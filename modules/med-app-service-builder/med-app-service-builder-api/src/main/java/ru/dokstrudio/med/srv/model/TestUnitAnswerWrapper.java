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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TestUnitAnswer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAnswer
 * @generated
 */
@ProviderType
public class TestUnitAnswerWrapper implements TestUnitAnswer,
	ModelWrapper<TestUnitAnswer> {
	public TestUnitAnswerWrapper(TestUnitAnswer testUnitAnswer) {
		_testUnitAnswer = testUnitAnswer;
	}

	@Override
	public Class<?> getModelClass() {
		return TestUnitAnswer.class;
	}

	@Override
	public String getModelClassName() {
		return TestUnitAnswer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("testUnitAnswerId", getTestUnitAnswerId());
		attributes.put("testUnitId", getTestUnitId());
		attributes.put("answerText", getAnswerText());
		attributes.put("answerType", getAnswerType());
		attributes.put("answerDlFileEntryId", getAnswerDlFileEntryId());
		attributes.put("isCorrent", getIsCorrent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long testUnitAnswerId = (Long)attributes.get("testUnitAnswerId");

		if (testUnitAnswerId != null) {
			setTestUnitAnswerId(testUnitAnswerId);
		}

		Long testUnitId = (Long)attributes.get("testUnitId");

		if (testUnitId != null) {
			setTestUnitId(testUnitId);
		}

		String answerText = (String)attributes.get("answerText");

		if (answerText != null) {
			setAnswerText(answerText);
		}

		Integer answerType = (Integer)attributes.get("answerType");

		if (answerType != null) {
			setAnswerType(answerType);
		}

		Long answerDlFileEntryId = (Long)attributes.get("answerDlFileEntryId");

		if (answerDlFileEntryId != null) {
			setAnswerDlFileEntryId(answerDlFileEntryId);
		}

		Boolean isCorrent = (Boolean)attributes.get("isCorrent");

		if (isCorrent != null) {
			setIsCorrent(isCorrent);
		}
	}

	/**
	* Returns the is corrent of this test unit answer.
	*
	* @return the is corrent of this test unit answer
	*/
	@Override
	public boolean getIsCorrent() {
		return _testUnitAnswer.getIsCorrent();
	}

	@Override
	public boolean isCachedModel() {
		return _testUnitAnswer.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testUnitAnswer.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this test unit answer is is corrent.
	*
	* @return <code>true</code> if this test unit answer is is corrent; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsCorrent() {
		return _testUnitAnswer.isIsCorrent();
	}

	@Override
	public boolean isNew() {
		return _testUnitAnswer.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testUnitAnswer.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.TestUnitAnswer> toCacheModel() {
		return _testUnitAnswer.toCacheModel();
	}

	@Override
	public int compareTo(
		ru.dokstrudio.med.srv.model.TestUnitAnswer testUnitAnswer) {
		return _testUnitAnswer.compareTo(testUnitAnswer);
	}

	/**
	* Returns the answer type of this test unit answer.
	*
	* @return the answer type of this test unit answer
	*/
	@Override
	public int getAnswerType() {
		return _testUnitAnswer.getAnswerType();
	}

	@Override
	public int hashCode() {
		return _testUnitAnswer.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testUnitAnswer.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestUnitAnswerWrapper((TestUnitAnswer)_testUnitAnswer.clone());
	}

	/**
	* Returns the answer text of this test unit answer.
	*
	* @return the answer text of this test unit answer
	*/
	@Override
	public java.lang.String getAnswerText() {
		return _testUnitAnswer.getAnswerText();
	}

	@Override
	public java.lang.String toString() {
		return _testUnitAnswer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _testUnitAnswer.toXmlString();
	}

	/**
	* Returns the answer dl file entry ID of this test unit answer.
	*
	* @return the answer dl file entry ID of this test unit answer
	*/
	@Override
	public long getAnswerDlFileEntryId() {
		return _testUnitAnswer.getAnswerDlFileEntryId();
	}

	/**
	* Returns the primary key of this test unit answer.
	*
	* @return the primary key of this test unit answer
	*/
	@Override
	public long getPrimaryKey() {
		return _testUnitAnswer.getPrimaryKey();
	}

	/**
	* Returns the test unit answer ID of this test unit answer.
	*
	* @return the test unit answer ID of this test unit answer
	*/
	@Override
	public long getTestUnitAnswerId() {
		return _testUnitAnswer.getTestUnitAnswerId();
	}

	/**
	* Returns the test unit ID of this test unit answer.
	*
	* @return the test unit ID of this test unit answer
	*/
	@Override
	public long getTestUnitId() {
		return _testUnitAnswer.getTestUnitId();
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer toEscapedModel() {
		return new TestUnitAnswerWrapper(_testUnitAnswer.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer toUnescapedModel() {
		return new TestUnitAnswerWrapper(_testUnitAnswer.toUnescapedModel());
	}

	@Override
	public void persist() {
		_testUnitAnswer.persist();
	}

	/**
	* Sets the answer dl file entry ID of this test unit answer.
	*
	* @param answerDlFileEntryId the answer dl file entry ID of this test unit answer
	*/
	@Override
	public void setAnswerDlFileEntryId(long answerDlFileEntryId) {
		_testUnitAnswer.setAnswerDlFileEntryId(answerDlFileEntryId);
	}

	/**
	* Sets the answer text of this test unit answer.
	*
	* @param answerText the answer text of this test unit answer
	*/
	@Override
	public void setAnswerText(java.lang.String answerText) {
		_testUnitAnswer.setAnswerText(answerText);
	}

	/**
	* Sets the answer type of this test unit answer.
	*
	* @param answerType the answer type of this test unit answer
	*/
	@Override
	public void setAnswerType(int answerType) {
		_testUnitAnswer.setAnswerType(answerType);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testUnitAnswer.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testUnitAnswer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testUnitAnswer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testUnitAnswer.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this test unit answer is is corrent.
	*
	* @param isCorrent the is corrent of this test unit answer
	*/
	@Override
	public void setIsCorrent(boolean isCorrent) {
		_testUnitAnswer.setIsCorrent(isCorrent);
	}

	@Override
	public void setNew(boolean n) {
		_testUnitAnswer.setNew(n);
	}

	/**
	* Sets the primary key of this test unit answer.
	*
	* @param primaryKey the primary key of this test unit answer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testUnitAnswer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testUnitAnswer.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the test unit answer ID of this test unit answer.
	*
	* @param testUnitAnswerId the test unit answer ID of this test unit answer
	*/
	@Override
	public void setTestUnitAnswerId(long testUnitAnswerId) {
		_testUnitAnswer.setTestUnitAnswerId(testUnitAnswerId);
	}

	/**
	* Sets the test unit ID of this test unit answer.
	*
	* @param testUnitId the test unit ID of this test unit answer
	*/
	@Override
	public void setTestUnitId(long testUnitId) {
		_testUnitAnswer.setTestUnitId(testUnitId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitAnswerWrapper)) {
			return false;
		}

		TestUnitAnswerWrapper testUnitAnswerWrapper = (TestUnitAnswerWrapper)obj;

		if (Objects.equals(_testUnitAnswer,
					testUnitAnswerWrapper._testUnitAnswer)) {
			return true;
		}

		return false;
	}

	@Override
	public TestUnitAnswer getWrappedModel() {
		return _testUnitAnswer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testUnitAnswer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testUnitAnswer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testUnitAnswer.resetOriginalValues();
	}

	private final TestUnitAnswer _testUnitAnswer;
}