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
 * This class is a wrapper for {@link ApplicationAccount}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationAccount
 * @generated
 */
@ProviderType
public class ApplicationAccountWrapper implements ApplicationAccount,
	ModelWrapper<ApplicationAccount> {
	public ApplicationAccountWrapper(ApplicationAccount applicationAccount) {
		_applicationAccount = applicationAccount;
	}

	@Override
	public Class<?> getModelClass() {
		return ApplicationAccount.class;
	}

	@Override
	public String getModelClassName() {
		return ApplicationAccount.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("accountTypeId", getAccountTypeId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("durationDays", getDurationDays());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long accountTypeId = (Long)attributes.get("accountTypeId");

		if (accountTypeId != null) {
			setAccountTypeId(accountTypeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long durationDays = (Long)attributes.get("durationDays");

		if (durationDays != null) {
			setDurationDays(durationDays);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _applicationAccount.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _applicationAccount.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _applicationAccount.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _applicationAccount.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.ApplicationAccount> toCacheModel() {
		return _applicationAccount.toCacheModel();
	}

	@Override
	public int compareTo(
		ru.dokstrudio.med.srv.model.ApplicationAccount applicationAccount) {
		return _applicationAccount.compareTo(applicationAccount);
	}

	@Override
	public int hashCode() {
		return _applicationAccount.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _applicationAccount.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ApplicationAccountWrapper((ApplicationAccount)_applicationAccount.clone());
	}

	/**
	* Returns the description of this application account.
	*
	* @return the description of this application account
	*/
	@Override
	public java.lang.String getDescription() {
		return _applicationAccount.getDescription();
	}

	/**
	* Returns the name of this application account.
	*
	* @return the name of this application account
	*/
	@Override
	public java.lang.String getName() {
		return _applicationAccount.getName();
	}

	@Override
	public java.lang.String toString() {
		return _applicationAccount.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _applicationAccount.toXmlString();
	}

	/**
	* Returns the account type ID of this application account.
	*
	* @return the account type ID of this application account
	*/
	@Override
	public long getAccountTypeId() {
		return _applicationAccount.getAccountTypeId();
	}

	/**
	* Returns the duration days of this application account.
	*
	* @return the duration days of this application account
	*/
	@Override
	public long getDurationDays() {
		return _applicationAccount.getDurationDays();
	}

	/**
	* Returns the primary key of this application account.
	*
	* @return the primary key of this application account
	*/
	@Override
	public long getPrimaryKey() {
		return _applicationAccount.getPrimaryKey();
	}

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount toEscapedModel() {
		return new ApplicationAccountWrapper(_applicationAccount.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount toUnescapedModel() {
		return new ApplicationAccountWrapper(_applicationAccount.toUnescapedModel());
	}

	@Override
	public void persist() {
		_applicationAccount.persist();
	}

	/**
	* Sets the account type ID of this application account.
	*
	* @param accountTypeId the account type ID of this application account
	*/
	@Override
	public void setAccountTypeId(long accountTypeId) {
		_applicationAccount.setAccountTypeId(accountTypeId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_applicationAccount.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this application account.
	*
	* @param description the description of this application account
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_applicationAccount.setDescription(description);
	}

	/**
	* Sets the duration days of this application account.
	*
	* @param durationDays the duration days of this application account
	*/
	@Override
	public void setDurationDays(long durationDays) {
		_applicationAccount.setDurationDays(durationDays);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_applicationAccount.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_applicationAccount.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_applicationAccount.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name of this application account.
	*
	* @param name the name of this application account
	*/
	@Override
	public void setName(java.lang.String name) {
		_applicationAccount.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_applicationAccount.setNew(n);
	}

	/**
	* Sets the primary key of this application account.
	*
	* @param primaryKey the primary key of this application account
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_applicationAccount.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_applicationAccount.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplicationAccountWrapper)) {
			return false;
		}

		ApplicationAccountWrapper applicationAccountWrapper = (ApplicationAccountWrapper)obj;

		if (Objects.equals(_applicationAccount,
					applicationAccountWrapper._applicationAccount)) {
			return true;
		}

		return false;
	}

	@Override
	public ApplicationAccount getWrappedModel() {
		return _applicationAccount;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _applicationAccount.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _applicationAccount.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_applicationAccount.resetOriginalValues();
	}

	private final ApplicationAccount _applicationAccount;
}