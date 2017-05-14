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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TestUnitAttempt}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAttempt
 * @generated
 */
@ProviderType
public class TestUnitAttemptWrapper implements TestUnitAttempt,
	ModelWrapper<TestUnitAttempt> {
	public TestUnitAttemptWrapper(TestUnitAttempt testUnitAttempt) {
		_testUnitAttempt = testUnitAttempt;
	}

	@Override
	public Class<?> getModelClass() {
		return TestUnitAttempt.class;
	}

	@Override
	public String getModelClassName() {
		return TestUnitAttempt.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("testUnitAttemptId", getTestUnitAttemptId());
		attributes.put("userId", getUserId());
		attributes.put("testUnitId", getTestUnitId());
		attributes.put("testUnitAnswerId", getTestUnitAnswerId());
		attributes.put("submitTime", getSubmitTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long testUnitAttemptId = (Long)attributes.get("testUnitAttemptId");

		if (testUnitAttemptId != null) {
			setTestUnitAttemptId(testUnitAttemptId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long testUnitId = (Long)attributes.get("testUnitId");

		if (testUnitId != null) {
			setTestUnitId(testUnitId);
		}

		Long testUnitAnswerId = (Long)attributes.get("testUnitAnswerId");

		if (testUnitAnswerId != null) {
			setTestUnitAnswerId(testUnitAnswerId);
		}

		Date submitTime = (Date)attributes.get("submitTime");

		if (submitTime != null) {
			setSubmitTime(submitTime);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _testUnitAttempt.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testUnitAttempt.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _testUnitAttempt.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testUnitAttempt.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.TestUnitAttempt> toCacheModel() {
		return _testUnitAttempt.toCacheModel();
	}

	@Override
	public int compareTo(
		ru.dokstrudio.med.srv.model.TestUnitAttempt testUnitAttempt) {
		return _testUnitAttempt.compareTo(testUnitAttempt);
	}

	@Override
	public int hashCode() {
		return _testUnitAttempt.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testUnitAttempt.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestUnitAttemptWrapper((TestUnitAttempt)_testUnitAttempt.clone());
	}

	/**
	* Returns the user uuid of this test unit attempt.
	*
	* @return the user uuid of this test unit attempt
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _testUnitAttempt.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _testUnitAttempt.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _testUnitAttempt.toXmlString();
	}

	/**
	* Returns the submit time of this test unit attempt.
	*
	* @return the submit time of this test unit attempt
	*/
	@Override
	public Date getSubmitTime() {
		return _testUnitAttempt.getSubmitTime();
	}

	/**
	* Returns the primary key of this test unit attempt.
	*
	* @return the primary key of this test unit attempt
	*/
	@Override
	public long getPrimaryKey() {
		return _testUnitAttempt.getPrimaryKey();
	}

	/**
	* Returns the test unit answer ID of this test unit attempt.
	*
	* @return the test unit answer ID of this test unit attempt
	*/
	@Override
	public long getTestUnitAnswerId() {
		return _testUnitAttempt.getTestUnitAnswerId();
	}

	/**
	* Returns the test unit attempt ID of this test unit attempt.
	*
	* @return the test unit attempt ID of this test unit attempt
	*/
	@Override
	public long getTestUnitAttemptId() {
		return _testUnitAttempt.getTestUnitAttemptId();
	}

	/**
	* Returns the test unit ID of this test unit attempt.
	*
	* @return the test unit ID of this test unit attempt
	*/
	@Override
	public long getTestUnitId() {
		return _testUnitAttempt.getTestUnitId();
	}

	/**
	* Returns the user ID of this test unit attempt.
	*
	* @return the user ID of this test unit attempt
	*/
	@Override
	public long getUserId() {
		return _testUnitAttempt.getUserId();
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt toEscapedModel() {
		return new TestUnitAttemptWrapper(_testUnitAttempt.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt toUnescapedModel() {
		return new TestUnitAttemptWrapper(_testUnitAttempt.toUnescapedModel());
	}

	@Override
	public void persist() {
		_testUnitAttempt.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testUnitAttempt.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testUnitAttempt.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testUnitAttempt.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testUnitAttempt.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_testUnitAttempt.setNew(n);
	}

	/**
	* Sets the primary key of this test unit attempt.
	*
	* @param primaryKey the primary key of this test unit attempt
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testUnitAttempt.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testUnitAttempt.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the submit time of this test unit attempt.
	*
	* @param submitTime the submit time of this test unit attempt
	*/
	@Override
	public void setSubmitTime(Date submitTime) {
		_testUnitAttempt.setSubmitTime(submitTime);
	}

	/**
	* Sets the test unit answer ID of this test unit attempt.
	*
	* @param testUnitAnswerId the test unit answer ID of this test unit attempt
	*/
	@Override
	public void setTestUnitAnswerId(long testUnitAnswerId) {
		_testUnitAttempt.setTestUnitAnswerId(testUnitAnswerId);
	}

	/**
	* Sets the test unit attempt ID of this test unit attempt.
	*
	* @param testUnitAttemptId the test unit attempt ID of this test unit attempt
	*/
	@Override
	public void setTestUnitAttemptId(long testUnitAttemptId) {
		_testUnitAttempt.setTestUnitAttemptId(testUnitAttemptId);
	}

	/**
	* Sets the test unit ID of this test unit attempt.
	*
	* @param testUnitId the test unit ID of this test unit attempt
	*/
	@Override
	public void setTestUnitId(long testUnitId) {
		_testUnitAttempt.setTestUnitId(testUnitId);
	}

	/**
	* Sets the user ID of this test unit attempt.
	*
	* @param userId the user ID of this test unit attempt
	*/
	@Override
	public void setUserId(long userId) {
		_testUnitAttempt.setUserId(userId);
	}

	/**
	* Sets the user uuid of this test unit attempt.
	*
	* @param userUuid the user uuid of this test unit attempt
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_testUnitAttempt.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitAttemptWrapper)) {
			return false;
		}

		TestUnitAttemptWrapper testUnitAttemptWrapper = (TestUnitAttemptWrapper)obj;

		if (Objects.equals(_testUnitAttempt,
					testUnitAttemptWrapper._testUnitAttempt)) {
			return true;
		}

		return false;
	}

	@Override
	public TestUnitAttempt getWrappedModel() {
		return _testUnitAttempt;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testUnitAttempt.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testUnitAttempt.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testUnitAttempt.resetOriginalValues();
	}

	private final TestUnitAttempt _testUnitAttempt;
}