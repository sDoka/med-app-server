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
 * This class is a wrapper for {@link UserAccount}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAccount
 * @generated
 */
@ProviderType
public class UserAccountWrapper implements UserAccount,
	ModelWrapper<UserAccount> {
	public UserAccountWrapper(UserAccount userAccount) {
		_userAccount = userAccount;
	}

	@Override
	public Class<?> getModelClass() {
		return UserAccount.class;
	}

	@Override
	public String getModelClassName() {
		return UserAccount.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("accountTypeId", getAccountTypeId());
		attributes.put("activationDate", getActivationDate());
		attributes.put("expirationDate", getExpirationDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long accountTypeId = (Long)attributes.get("accountTypeId");

		if (accountTypeId != null) {
			setAccountTypeId(accountTypeId);
		}

		Date activationDate = (Date)attributes.get("activationDate");

		if (activationDate != null) {
			setActivationDate(activationDate);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _userAccount.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _userAccount.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _userAccount.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _userAccount.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.UserAccount> toCacheModel() {
		return _userAccount.toCacheModel();
	}

	@Override
	public int compareTo(ru.dokstrudio.med.srv.model.UserAccount userAccount) {
		return _userAccount.compareTo(userAccount);
	}

	@Override
	public int hashCode() {
		return _userAccount.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userAccount.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new UserAccountWrapper((UserAccount)_userAccount.clone());
	}

	/**
	* Returns the user uuid of this user account.
	*
	* @return the user uuid of this user account
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _userAccount.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _userAccount.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userAccount.toXmlString();
	}

	/**
	* Returns the activation date of this user account.
	*
	* @return the activation date of this user account
	*/
	@Override
	public Date getActivationDate() {
		return _userAccount.getActivationDate();
	}

	/**
	* Returns the expiration date of this user account.
	*
	* @return the expiration date of this user account
	*/
	@Override
	public Date getExpirationDate() {
		return _userAccount.getExpirationDate();
	}

	/**
	* Returns the account type ID of this user account.
	*
	* @return the account type ID of this user account
	*/
	@Override
	public long getAccountTypeId() {
		return _userAccount.getAccountTypeId();
	}

	/**
	* Returns the user ID of this user account.
	*
	* @return the user ID of this user account
	*/
	@Override
	public long getUserId() {
		return _userAccount.getUserId();
	}

	@Override
	public ru.dokstrudio.med.srv.model.UserAccount toEscapedModel() {
		return new UserAccountWrapper(_userAccount.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.UserAccount toUnescapedModel() {
		return new UserAccountWrapper(_userAccount.toUnescapedModel());
	}

	/**
	* Returns the primary key of this user account.
	*
	* @return the primary key of this user account
	*/
	@Override
	public ru.dokstrudio.med.srv.service.persistence.UserAccountPK getPrimaryKey() {
		return _userAccount.getPrimaryKey();
	}

	@Override
	public void persist() {
		_userAccount.persist();
	}

	/**
	* Sets the account type ID of this user account.
	*
	* @param accountTypeId the account type ID of this user account
	*/
	@Override
	public void setAccountTypeId(long accountTypeId) {
		_userAccount.setAccountTypeId(accountTypeId);
	}

	/**
	* Sets the activation date of this user account.
	*
	* @param activationDate the activation date of this user account
	*/
	@Override
	public void setActivationDate(Date activationDate) {
		_userAccount.setActivationDate(activationDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userAccount.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_userAccount.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_userAccount.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_userAccount.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expiration date of this user account.
	*
	* @param expirationDate the expiration date of this user account
	*/
	@Override
	public void setExpirationDate(Date expirationDate) {
		_userAccount.setExpirationDate(expirationDate);
	}

	@Override
	public void setNew(boolean n) {
		_userAccount.setNew(n);
	}

	/**
	* Sets the primary key of this user account.
	*
	* @param primaryKey the primary key of this user account
	*/
	@Override
	public void setPrimaryKey(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK primaryKey) {
		_userAccount.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_userAccount.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this user account.
	*
	* @param userId the user ID of this user account
	*/
	@Override
	public void setUserId(long userId) {
		_userAccount.setUserId(userId);
	}

	/**
	* Sets the user uuid of this user account.
	*
	* @param userUuid the user uuid of this user account
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userAccount.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserAccountWrapper)) {
			return false;
		}

		UserAccountWrapper userAccountWrapper = (UserAccountWrapper)obj;

		if (Objects.equals(_userAccount, userAccountWrapper._userAccount)) {
			return true;
		}

		return false;
	}

	@Override
	public UserAccount getWrappedModel() {
		return _userAccount;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _userAccount.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _userAccount.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_userAccount.resetOriginalValues();
	}

	private final UserAccount _userAccount;
}