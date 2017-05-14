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
 * This class is a wrapper for {@link UserDevice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserDevice
 * @generated
 */
@ProviderType
public class UserDeviceWrapper implements UserDevice, ModelWrapper<UserDevice> {
	public UserDeviceWrapper(UserDevice userDevice) {
		_userDevice = userDevice;
	}

	@Override
	public Class<?> getModelClass() {
		return UserDevice.class;
	}

	@Override
	public String getModelClassName() {
		return UserDevice.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("deviceId", getDeviceId());
		attributes.put("userId", getUserId());
		attributes.put("deviceTypeId", getDeviceTypeId());
		attributes.put("deviceKey", getDeviceKey());
		attributes.put("operatingSystem", getOperatingSystem());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer deviceTypeId = (Integer)attributes.get("deviceTypeId");

		if (deviceTypeId != null) {
			setDeviceTypeId(deviceTypeId);
		}

		String deviceKey = (String)attributes.get("deviceKey");

		if (deviceKey != null) {
			setDeviceKey(deviceKey);
		}

		String operatingSystem = (String)attributes.get("operatingSystem");

		if (operatingSystem != null) {
			setOperatingSystem(operatingSystem);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _userDevice.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _userDevice.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _userDevice.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _userDevice.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ru.dokstrudio.med.srv.model.UserDevice> toCacheModel() {
		return _userDevice.toCacheModel();
	}

	@Override
	public int compareTo(ru.dokstrudio.med.srv.model.UserDevice userDevice) {
		return _userDevice.compareTo(userDevice);
	}

	/**
	* Returns the device type ID of this user device.
	*
	* @return the device type ID of this user device
	*/
	@Override
	public int getDeviceTypeId() {
		return _userDevice.getDeviceTypeId();
	}

	@Override
	public int hashCode() {
		return _userDevice.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userDevice.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new UserDeviceWrapper((UserDevice)_userDevice.clone());
	}

	/**
	* Returns the device key of this user device.
	*
	* @return the device key of this user device
	*/
	@Override
	public java.lang.String getDeviceKey() {
		return _userDevice.getDeviceKey();
	}

	/**
	* Returns the operating system of this user device.
	*
	* @return the operating system of this user device
	*/
	@Override
	public java.lang.String getOperatingSystem() {
		return _userDevice.getOperatingSystem();
	}

	/**
	* Returns the user uuid of this user device.
	*
	* @return the user uuid of this user device
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _userDevice.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _userDevice.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userDevice.toXmlString();
	}

	/**
	* Returns the device ID of this user device.
	*
	* @return the device ID of this user device
	*/
	@Override
	public long getDeviceId() {
		return _userDevice.getDeviceId();
	}

	/**
	* Returns the primary key of this user device.
	*
	* @return the primary key of this user device
	*/
	@Override
	public long getPrimaryKey() {
		return _userDevice.getPrimaryKey();
	}

	/**
	* Returns the user ID of this user device.
	*
	* @return the user ID of this user device
	*/
	@Override
	public long getUserId() {
		return _userDevice.getUserId();
	}

	@Override
	public ru.dokstrudio.med.srv.model.UserDevice toEscapedModel() {
		return new UserDeviceWrapper(_userDevice.toEscapedModel());
	}

	@Override
	public ru.dokstrudio.med.srv.model.UserDevice toUnescapedModel() {
		return new UserDeviceWrapper(_userDevice.toUnescapedModel());
	}

	@Override
	public void persist() {
		_userDevice.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userDevice.setCachedModel(cachedModel);
	}

	/**
	* Sets the device ID of this user device.
	*
	* @param deviceId the device ID of this user device
	*/
	@Override
	public void setDeviceId(long deviceId) {
		_userDevice.setDeviceId(deviceId);
	}

	/**
	* Sets the device key of this user device.
	*
	* @param deviceKey the device key of this user device
	*/
	@Override
	public void setDeviceKey(java.lang.String deviceKey) {
		_userDevice.setDeviceKey(deviceKey);
	}

	/**
	* Sets the device type ID of this user device.
	*
	* @param deviceTypeId the device type ID of this user device
	*/
	@Override
	public void setDeviceTypeId(int deviceTypeId) {
		_userDevice.setDeviceTypeId(deviceTypeId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_userDevice.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_userDevice.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_userDevice.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_userDevice.setNew(n);
	}

	/**
	* Sets the operating system of this user device.
	*
	* @param operatingSystem the operating system of this user device
	*/
	@Override
	public void setOperatingSystem(java.lang.String operatingSystem) {
		_userDevice.setOperatingSystem(operatingSystem);
	}

	/**
	* Sets the primary key of this user device.
	*
	* @param primaryKey the primary key of this user device
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userDevice.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_userDevice.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this user device.
	*
	* @param userId the user ID of this user device
	*/
	@Override
	public void setUserId(long userId) {
		_userDevice.setUserId(userId);
	}

	/**
	* Sets the user uuid of this user device.
	*
	* @param userUuid the user uuid of this user device
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userDevice.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserDeviceWrapper)) {
			return false;
		}

		UserDeviceWrapper userDeviceWrapper = (UserDeviceWrapper)obj;

		if (Objects.equals(_userDevice, userDeviceWrapper._userDevice)) {
			return true;
		}

		return false;
	}

	@Override
	public UserDevice getWrappedModel() {
		return _userDevice;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _userDevice.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _userDevice.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_userDevice.resetOriginalValues();
	}

	private final UserDevice _userDevice;
}