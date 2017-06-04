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
 * This class is a wrapper for {@link TestUnitSpecialization}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitSpecialization
 * @generated
 */
@ProviderType
public class TestUnitSpecializationWrapper implements TestUnitSpecialization,
	ModelWrapper<TestUnitSpecialization> {
	public TestUnitSpecializationWrapper(
		TestUnitSpecialization testUnitSpecialization) {
		_testUnitSpecialization = testUnitSpecialization;
	}

	@Override
	public Class<?> getModelClass() {
		return TestUnitSpecialization.class;
	}

	@Override
	public String getModelClassName() {
		return TestUnitSpecialization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("specializationId", getSpecializationId());
		attributes.put("nameLocalizationKey", getNameLocalizationKey());
		attributes.put("specialiationIcon", getSpecialiationIcon());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long specializationId = (Long)attributes.get("specializationId");

		if (specializationId != null) {
			setSpecializationId(specializationId);
		}

		String nameLocalizationKey = (String)attributes.get(
				"nameLocalizationKey");

		if (nameLocalizationKey != null) {
			setNameLocalizationKey(nameLocalizationKey);
		}

		String specialiationIcon = (String)attributes.get("specialiationIcon");

		if (specialiationIcon != null) {
			setSpecialiationIcon(specialiationIcon);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _testUnitSpecialization.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testUnitSpecialization.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _testUnitSpecialization.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testUnitSpecialization.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.TestUnitSpecialization> toCacheModel() {
		return _testUnitSpecialization.toCacheModel();
	}

	@Override
	public int compareTo(
		ru.dokstrudio.med.srv.model.TestUnitSpecialization testUnitSpecialization) {
		return _testUnitSpecialization.compareTo(testUnitSpecialization);
	}

	@Override
	public int hashCode() {
		return _testUnitSpecialization.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testUnitSpecialization.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestUnitSpecializationWrapper((TestUnitSpecialization)_testUnitSpecialization.clone());
	}

	/**
	* Returns the name localization key of this test unit specialization.
	*
	* @return the name localization key of this test unit specialization
	*/
	@Override
	public java.lang.String getNameLocalizationKey() {
		return _testUnitSpecialization.getNameLocalizationKey();
	}

	/**
	* Returns the specialiation icon of this test unit specialization.
	*
	* @return the specialiation icon of this test unit specialization
	*/
	@Override
	public java.lang.String getSpecialiationIcon() {
		return _testUnitSpecialization.getSpecialiationIcon();
	}

	@Override
	public java.lang.String toString() {
		return _testUnitSpecialization.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _testUnitSpecialization.toXmlString();
	}

	/**
	* Returns the primary key of this test unit specialization.
	*
	* @return the primary key of this test unit specialization
	*/
	@Override
	public long getPrimaryKey() {
		return _testUnitSpecialization.getPrimaryKey();
	}

	/**
	* Returns the specialization ID of this test unit specialization.
	*
	* @return the specialization ID of this test unit specialization
	*/
	@Override
	public long getSpecializationId() {
		return _testUnitSpecialization.getSpecializationId();
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitSpecialization toEscapedModel() {
		return new TestUnitSpecializationWrapper(_testUnitSpecialization.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitSpecialization toUnescapedModel() {
		return new TestUnitSpecializationWrapper(_testUnitSpecialization.toUnescapedModel());
	}

	@Override
	public void persist() {
		_testUnitSpecialization.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testUnitSpecialization.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testUnitSpecialization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testUnitSpecialization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testUnitSpecialization.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name localization key of this test unit specialization.
	*
	* @param nameLocalizationKey the name localization key of this test unit specialization
	*/
	@Override
	public void setNameLocalizationKey(java.lang.String nameLocalizationKey) {
		_testUnitSpecialization.setNameLocalizationKey(nameLocalizationKey);
	}

	@Override
	public void setNew(boolean n) {
		_testUnitSpecialization.setNew(n);
	}

	/**
	* Sets the primary key of this test unit specialization.
	*
	* @param primaryKey the primary key of this test unit specialization
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testUnitSpecialization.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testUnitSpecialization.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the specialiation icon of this test unit specialization.
	*
	* @param specialiationIcon the specialiation icon of this test unit specialization
	*/
	@Override
	public void setSpecialiationIcon(java.lang.String specialiationIcon) {
		_testUnitSpecialization.setSpecialiationIcon(specialiationIcon);
	}

	/**
	* Sets the specialization ID of this test unit specialization.
	*
	* @param specializationId the specialization ID of this test unit specialization
	*/
	@Override
	public void setSpecializationId(long specializationId) {
		_testUnitSpecialization.setSpecializationId(specializationId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitSpecializationWrapper)) {
			return false;
		}

		TestUnitSpecializationWrapper testUnitSpecializationWrapper = (TestUnitSpecializationWrapper)obj;

		if (Objects.equals(_testUnitSpecialization,
					testUnitSpecializationWrapper._testUnitSpecialization)) {
			return true;
		}

		return false;
	}

	@Override
	public TestUnitSpecialization getWrappedModel() {
		return _testUnitSpecialization;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testUnitSpecialization.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testUnitSpecialization.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testUnitSpecialization.resetOriginalValues();
	}

	private final TestUnitSpecialization _testUnitSpecialization;
}