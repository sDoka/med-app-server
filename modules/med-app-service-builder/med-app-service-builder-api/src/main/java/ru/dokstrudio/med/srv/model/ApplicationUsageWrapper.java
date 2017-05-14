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
 * This class is a wrapper for {@link ApplicationUsage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationUsage
 * @generated
 */
@ProviderType
public class ApplicationUsageWrapper implements ApplicationUsage,
	ModelWrapper<ApplicationUsage> {
	public ApplicationUsageWrapper(ApplicationUsage applicationUsage) {
		_applicationUsage = applicationUsage;
	}

	@Override
	public Class<?> getModelClass() {
		return ApplicationUsage.class;
	}

	@Override
	public String getModelClassName() {
		return ApplicationUsage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("applicationUserId", getApplicationUserId());
		attributes.put("userId", getUserId());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("deviceId", getDeviceId());
		attributes.put("actionType", getActionType());
		attributes.put("actionTime", getActionTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long applicationUserId = (Long)attributes.get("applicationUserId");

		if (applicationUserId != null) {
			setApplicationUserId(applicationUserId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}

		Integer actionType = (Integer)attributes.get("actionType");

		if (actionType != null) {
			setActionType(actionType);
		}

		Date actionTime = (Date)attributes.get("actionTime");

		if (actionTime != null) {
			setActionTime(actionTime);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _applicationUsage.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _applicationUsage.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _applicationUsage.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _applicationUsage.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.ApplicationUsage> toCacheModel() {
		return _applicationUsage.toCacheModel();
	}

	@Override
	public int compareTo(
		ru.dokstrudio.med.srv.model.ApplicationUsage applicationUsage) {
		return _applicationUsage.compareTo(applicationUsage);
	}

	/**
	* Returns the action type of this application usage.
	*
	* @return the action type of this application usage
	*/
	@Override
	public int getActionType() {
		return _applicationUsage.getActionType();
	}

	@Override
	public int hashCode() {
		return _applicationUsage.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _applicationUsage.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ApplicationUsageWrapper((ApplicationUsage)_applicationUsage.clone());
	}

	/**
	* Returns the application user uuid of this application usage.
	*
	* @return the application user uuid of this application usage
	*/
	@Override
	public java.lang.String getApplicationUserUuid() {
		return _applicationUsage.getApplicationUserUuid();
	}

	/**
	* Returns the ip address of this application usage.
	*
	* @return the ip address of this application usage
	*/
	@Override
	public java.lang.String getIpAddress() {
		return _applicationUsage.getIpAddress();
	}

	/**
	* Returns the user uuid of this application usage.
	*
	* @return the user uuid of this application usage
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _applicationUsage.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _applicationUsage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _applicationUsage.toXmlString();
	}

	/**
	* Returns the action time of this application usage.
	*
	* @return the action time of this application usage
	*/
	@Override
	public Date getActionTime() {
		return _applicationUsage.getActionTime();
	}

	/**
	* Returns the application user ID of this application usage.
	*
	* @return the application user ID of this application usage
	*/
	@Override
	public long getApplicationUserId() {
		return _applicationUsage.getApplicationUserId();
	}

	/**
	* Returns the device ID of this application usage.
	*
	* @return the device ID of this application usage
	*/
	@Override
	public long getDeviceId() {
		return _applicationUsage.getDeviceId();
	}

	/**
	* Returns the primary key of this application usage.
	*
	* @return the primary key of this application usage
	*/
	@Override
	public long getPrimaryKey() {
		return _applicationUsage.getPrimaryKey();
	}

	/**
	* Returns the user ID of this application usage.
	*
	* @return the user ID of this application usage
	*/
	@Override
	public long getUserId() {
		return _applicationUsage.getUserId();
	}

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage toEscapedModel() {
		return new ApplicationUsageWrapper(_applicationUsage.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage toUnescapedModel() {
		return new ApplicationUsageWrapper(_applicationUsage.toUnescapedModel());
	}

	@Override
	public void persist() {
		_applicationUsage.persist();
	}

	/**
	* Sets the action time of this application usage.
	*
	* @param actionTime the action time of this application usage
	*/
	@Override
	public void setActionTime(Date actionTime) {
		_applicationUsage.setActionTime(actionTime);
	}

	/**
	* Sets the action type of this application usage.
	*
	* @param actionType the action type of this application usage
	*/
	@Override
	public void setActionType(int actionType) {
		_applicationUsage.setActionType(actionType);
	}

	/**
	* Sets the application user ID of this application usage.
	*
	* @param applicationUserId the application user ID of this application usage
	*/
	@Override
	public void setApplicationUserId(long applicationUserId) {
		_applicationUsage.setApplicationUserId(applicationUserId);
	}

	/**
	* Sets the application user uuid of this application usage.
	*
	* @param applicationUserUuid the application user uuid of this application usage
	*/
	@Override
	public void setApplicationUserUuid(java.lang.String applicationUserUuid) {
		_applicationUsage.setApplicationUserUuid(applicationUserUuid);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_applicationUsage.setCachedModel(cachedModel);
	}

	/**
	* Sets the device ID of this application usage.
	*
	* @param deviceId the device ID of this application usage
	*/
	@Override
	public void setDeviceId(long deviceId) {
		_applicationUsage.setDeviceId(deviceId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_applicationUsage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_applicationUsage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_applicationUsage.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ip address of this application usage.
	*
	* @param ipAddress the ip address of this application usage
	*/
	@Override
	public void setIpAddress(java.lang.String ipAddress) {
		_applicationUsage.setIpAddress(ipAddress);
	}

	@Override
	public void setNew(boolean n) {
		_applicationUsage.setNew(n);
	}

	/**
	* Sets the primary key of this application usage.
	*
	* @param primaryKey the primary key of this application usage
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_applicationUsage.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_applicationUsage.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this application usage.
	*
	* @param userId the user ID of this application usage
	*/
	@Override
	public void setUserId(long userId) {
		_applicationUsage.setUserId(userId);
	}

	/**
	* Sets the user uuid of this application usage.
	*
	* @param userUuid the user uuid of this application usage
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_applicationUsage.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplicationUsageWrapper)) {
			return false;
		}

		ApplicationUsageWrapper applicationUsageWrapper = (ApplicationUsageWrapper)obj;

		if (Objects.equals(_applicationUsage,
					applicationUsageWrapper._applicationUsage)) {
			return true;
		}

		return false;
	}

	@Override
	public ApplicationUsage getWrappedModel() {
		return _applicationUsage;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _applicationUsage.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _applicationUsage.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_applicationUsage.resetOriginalValues();
	}

	private final ApplicationUsage _applicationUsage;
}