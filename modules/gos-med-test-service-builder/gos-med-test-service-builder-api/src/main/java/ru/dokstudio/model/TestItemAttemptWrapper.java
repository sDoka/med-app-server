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
 * This class is a wrapper for {@link TestItemAttempt}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAttempt
 * @generated
 */
@ProviderType
public class TestItemAttemptWrapper implements TestItemAttempt,
	ModelWrapper<TestItemAttempt> {
	public TestItemAttemptWrapper(TestItemAttempt testItemAttempt) {
		_testItemAttempt = testItemAttempt;
	}

	@Override
	public Class<?> getModelClass() {
		return TestItemAttempt.class;
	}

	@Override
	public String getModelClassName() {
		return TestItemAttempt.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("attemptId", getAttemptId());
		attributes.put("questionId", getQuestionId());
		attributes.put("answerId", getAnswerId());
		attributes.put("isSuccessAttempt", getIsSuccessAttempt());
		attributes.put("attemptDate", getAttemptDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long attemptId = (Long)attributes.get("attemptId");

		if (attemptId != null) {
			setAttemptId(attemptId);
		}

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Long answerId = (Long)attributes.get("answerId");

		if (answerId != null) {
			setAnswerId(answerId);
		}

		Boolean isSuccessAttempt = (Boolean)attributes.get("isSuccessAttempt");

		if (isSuccessAttempt != null) {
			setIsSuccessAttempt(isSuccessAttempt);
		}

		Date attemptDate = (Date)attributes.get("attemptDate");

		if (attemptDate != null) {
			setAttemptDate(attemptDate);
		}
	}

	/**
	* Returns the is success attempt of this test item attempt.
	*
	* @return the is success attempt of this test item attempt
	*/
	@Override
	public boolean getIsSuccessAttempt() {
		return _testItemAttempt.getIsSuccessAttempt();
	}

	@Override
	public boolean isCachedModel() {
		return _testItemAttempt.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testItemAttempt.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this test item attempt is is success attempt.
	*
	* @return <code>true</code> if this test item attempt is is success attempt; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsSuccessAttempt() {
		return _testItemAttempt.isIsSuccessAttempt();
	}

	@Override
	public boolean isNew() {
		return _testItemAttempt.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testItemAttempt.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstudio.model.TestItemAttempt> toCacheModel() {
		return _testItemAttempt.toCacheModel();
	}

	@Override
	public int compareTo(ru.dokstudio.model.TestItemAttempt testItemAttempt) {
		return _testItemAttempt.compareTo(testItemAttempt);
	}

	@Override
	public int hashCode() {
		return _testItemAttempt.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testItemAttempt.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestItemAttemptWrapper((TestItemAttempt)_testItemAttempt.clone());
	}

	/**
	* Returns the uuid of this test item attempt.
	*
	* @return the uuid of this test item attempt
	*/
	@Override
	public java.lang.String getUuid() {
		return _testItemAttempt.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _testItemAttempt.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _testItemAttempt.toXmlString();
	}

	/**
	* Returns the attempt date of this test item attempt.
	*
	* @return the attempt date of this test item attempt
	*/
	@Override
	public Date getAttemptDate() {
		return _testItemAttempt.getAttemptDate();
	}

	/**
	* Returns the answer ID of this test item attempt.
	*
	* @return the answer ID of this test item attempt
	*/
	@Override
	public long getAnswerId() {
		return _testItemAttempt.getAnswerId();
	}

	/**
	* Returns the attempt ID of this test item attempt.
	*
	* @return the attempt ID of this test item attempt
	*/
	@Override
	public long getAttemptId() {
		return _testItemAttempt.getAttemptId();
	}

	/**
	* Returns the primary key of this test item attempt.
	*
	* @return the primary key of this test item attempt
	*/
	@Override
	public long getPrimaryKey() {
		return _testItemAttempt.getPrimaryKey();
	}

	/**
	* Returns the question ID of this test item attempt.
	*
	* @return the question ID of this test item attempt
	*/
	@Override
	public long getQuestionId() {
		return _testItemAttempt.getQuestionId();
	}

	@Override
	public ru.dokstudio.model.TestItemAttempt toEscapedModel() {
		return new TestItemAttemptWrapper(_testItemAttempt.toEscapedModel());
	}

	@Override
	public ru.dokstudio.model.TestItemAttempt toUnescapedModel() {
		return new TestItemAttemptWrapper(_testItemAttempt.toUnescapedModel());
	}

	@Override
	public void persist() {
		_testItemAttempt.persist();
	}

	/**
	* Sets the answer ID of this test item attempt.
	*
	* @param answerId the answer ID of this test item attempt
	*/
	@Override
	public void setAnswerId(long answerId) {
		_testItemAttempt.setAnswerId(answerId);
	}

	/**
	* Sets the attempt date of this test item attempt.
	*
	* @param attemptDate the attempt date of this test item attempt
	*/
	@Override
	public void setAttemptDate(Date attemptDate) {
		_testItemAttempt.setAttemptDate(attemptDate);
	}

	/**
	* Sets the attempt ID of this test item attempt.
	*
	* @param attemptId the attempt ID of this test item attempt
	*/
	@Override
	public void setAttemptId(long attemptId) {
		_testItemAttempt.setAttemptId(attemptId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testItemAttempt.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testItemAttempt.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testItemAttempt.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testItemAttempt.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this test item attempt is is success attempt.
	*
	* @param isSuccessAttempt the is success attempt of this test item attempt
	*/
	@Override
	public void setIsSuccessAttempt(boolean isSuccessAttempt) {
		_testItemAttempt.setIsSuccessAttempt(isSuccessAttempt);
	}

	@Override
	public void setNew(boolean n) {
		_testItemAttempt.setNew(n);
	}

	/**
	* Sets the primary key of this test item attempt.
	*
	* @param primaryKey the primary key of this test item attempt
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testItemAttempt.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testItemAttempt.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the question ID of this test item attempt.
	*
	* @param questionId the question ID of this test item attempt
	*/
	@Override
	public void setQuestionId(long questionId) {
		_testItemAttempt.setQuestionId(questionId);
	}

	/**
	* Sets the uuid of this test item attempt.
	*
	* @param uuid the uuid of this test item attempt
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_testItemAttempt.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestItemAttemptWrapper)) {
			return false;
		}

		TestItemAttemptWrapper testItemAttemptWrapper = (TestItemAttemptWrapper)obj;

		if (Objects.equals(_testItemAttempt,
					testItemAttemptWrapper._testItemAttempt)) {
			return true;
		}

		return false;
	}

	@Override
	public TestItemAttempt getWrappedModel() {
		return _testItemAttempt;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testItemAttempt.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testItemAttempt.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testItemAttempt.resetOriginalValues();
	}

	private final TestItemAttempt _testItemAttempt;
}