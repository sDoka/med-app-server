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
 * This class is a wrapper for {@link TestUnit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnit
 * @generated
 */
@ProviderType
public class TestUnitWrapper implements TestUnit, ModelWrapper<TestUnit> {
	public TestUnitWrapper(TestUnit testUnit) {
		_testUnit = testUnit;
	}

	@Override
	public Class<?> getModelClass() {
		return TestUnit.class;
	}

	@Override
	public String getModelClassName() {
		return TestUnit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("testUnitId", getTestUnitId());
		attributes.put("number", getNumber());
		attributes.put("code", getCode());
		attributes.put("specializationId", getSpecializationId());
		attributes.put("questionText", getQuestionText());
		attributes.put("questionType", getQuestionType());
		attributes.put("questionDlFileEntryId", getQuestionDlFileEntryId());
		attributes.put("isActual", getIsActual());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long testUnitId = (Long)attributes.get("testUnitId");

		if (testUnitId != null) {
			setTestUnitId(testUnitId);
		}

		Long number = (Long)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Long specializationId = (Long)attributes.get("specializationId");

		if (specializationId != null) {
			setSpecializationId(specializationId);
		}

		String questionText = (String)attributes.get("questionText");

		if (questionText != null) {
			setQuestionText(questionText);
		}

		Integer questionType = (Integer)attributes.get("questionType");

		if (questionType != null) {
			setQuestionType(questionType);
		}

		Long questionDlFileEntryId = (Long)attributes.get(
				"questionDlFileEntryId");

		if (questionDlFileEntryId != null) {
			setQuestionDlFileEntryId(questionDlFileEntryId);
		}

		Boolean isActual = (Boolean)attributes.get("isActual");

		if (isActual != null) {
			setIsActual(isActual);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the is actual of this test unit.
	*
	* @return the is actual of this test unit
	*/
	@Override
	public boolean getIsActual() {
		return _testUnit.getIsActual();
	}

	@Override
	public boolean isCachedModel() {
		return _testUnit.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testUnit.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this test unit is is actual.
	*
	* @return <code>true</code> if this test unit is is actual; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsActual() {
		return _testUnit.isIsActual();
	}

	@Override
	public boolean isNew() {
		return _testUnit.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testUnit.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.TestUnit> toCacheModel() {
		return _testUnit.toCacheModel();
	}

	@Override
	public int compareTo(ru.dokstrudio.med.srv.model.TestUnit testUnit) {
		return _testUnit.compareTo(testUnit);
	}

	/**
	* Returns the question type of this test unit.
	*
	* @return the question type of this test unit
	*/
	@Override
	public int getQuestionType() {
		return _testUnit.getQuestionType();
	}

	@Override
	public int hashCode() {
		return _testUnit.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testUnit.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestUnitWrapper((TestUnit)_testUnit.clone());
	}

	/**
	* Returns the code of this test unit.
	*
	* @return the code of this test unit
	*/
	@Override
	public java.lang.String getCode() {
		return _testUnit.getCode();
	}

	/**
	* Returns the question text of this test unit.
	*
	* @return the question text of this test unit
	*/
	@Override
	public java.lang.String getQuestionText() {
		return _testUnit.getQuestionText();
	}

	@Override
	public java.lang.String toString() {
		return _testUnit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _testUnit.toXmlString();
	}

	/**
	* Returns the create date of this test unit.
	*
	* @return the create date of this test unit
	*/
	@Override
	public Date getCreateDate() {
		return _testUnit.getCreateDate();
	}

	/**
	* Returns the modified date of this test unit.
	*
	* @return the modified date of this test unit
	*/
	@Override
	public Date getModifiedDate() {
		return _testUnit.getModifiedDate();
	}

	/**
	* Returns the number of this test unit.
	*
	* @return the number of this test unit
	*/
	@Override
	public long getNumber() {
		return _testUnit.getNumber();
	}

	/**
	* Returns the primary key of this test unit.
	*
	* @return the primary key of this test unit
	*/
	@Override
	public long getPrimaryKey() {
		return _testUnit.getPrimaryKey();
	}

	/**
	* Returns the question dl file entry ID of this test unit.
	*
	* @return the question dl file entry ID of this test unit
	*/
	@Override
	public long getQuestionDlFileEntryId() {
		return _testUnit.getQuestionDlFileEntryId();
	}

	/**
	* Returns the specialization ID of this test unit.
	*
	* @return the specialization ID of this test unit
	*/
	@Override
	public long getSpecializationId() {
		return _testUnit.getSpecializationId();
	}

	/**
	* Returns the test unit ID of this test unit.
	*
	* @return the test unit ID of this test unit
	*/
	@Override
	public long getTestUnitId() {
		return _testUnit.getTestUnitId();
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnit toEscapedModel() {
		return new TestUnitWrapper(_testUnit.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnit toUnescapedModel() {
		return new TestUnitWrapper(_testUnit.toUnescapedModel());
	}

	@Override
	public void persist() {
		_testUnit.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testUnit.setCachedModel(cachedModel);
	}

	/**
	* Sets the code of this test unit.
	*
	* @param code the code of this test unit
	*/
	@Override
	public void setCode(java.lang.String code) {
		_testUnit.setCode(code);
	}

	/**
	* Sets the create date of this test unit.
	*
	* @param createDate the create date of this test unit
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_testUnit.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testUnit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testUnit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testUnit.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this test unit is is actual.
	*
	* @param isActual the is actual of this test unit
	*/
	@Override
	public void setIsActual(boolean isActual) {
		_testUnit.setIsActual(isActual);
	}

	/**
	* Sets the modified date of this test unit.
	*
	* @param modifiedDate the modified date of this test unit
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_testUnit.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_testUnit.setNew(n);
	}

	/**
	* Sets the number of this test unit.
	*
	* @param number the number of this test unit
	*/
	@Override
	public void setNumber(long number) {
		_testUnit.setNumber(number);
	}

	/**
	* Sets the primary key of this test unit.
	*
	* @param primaryKey the primary key of this test unit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testUnit.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testUnit.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the question dl file entry ID of this test unit.
	*
	* @param questionDlFileEntryId the question dl file entry ID of this test unit
	*/
	@Override
	public void setQuestionDlFileEntryId(long questionDlFileEntryId) {
		_testUnit.setQuestionDlFileEntryId(questionDlFileEntryId);
	}

	/**
	* Sets the question text of this test unit.
	*
	* @param questionText the question text of this test unit
	*/
	@Override
	public void setQuestionText(java.lang.String questionText) {
		_testUnit.setQuestionText(questionText);
	}

	/**
	* Sets the question type of this test unit.
	*
	* @param questionType the question type of this test unit
	*/
	@Override
	public void setQuestionType(int questionType) {
		_testUnit.setQuestionType(questionType);
	}

	/**
	* Sets the specialization ID of this test unit.
	*
	* @param specializationId the specialization ID of this test unit
	*/
	@Override
	public void setSpecializationId(long specializationId) {
		_testUnit.setSpecializationId(specializationId);
	}

	/**
	* Sets the test unit ID of this test unit.
	*
	* @param testUnitId the test unit ID of this test unit
	*/
	@Override
	public void setTestUnitId(long testUnitId) {
		_testUnit.setTestUnitId(testUnitId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitWrapper)) {
			return false;
		}

		TestUnitWrapper testUnitWrapper = (TestUnitWrapper)obj;

		if (Objects.equals(_testUnit, testUnitWrapper._testUnit)) {
			return true;
		}

		return false;
	}

	@Override
	public TestUnit getWrappedModel() {
		return _testUnit;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testUnit.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testUnit.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testUnit.resetOriginalValues();
	}

	private final TestUnit _testUnit;
}