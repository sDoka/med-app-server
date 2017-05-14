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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class UserDeviceSoap implements Serializable {
	public static UserDeviceSoap toSoapModel(UserDevice model) {
		UserDeviceSoap soapModel = new UserDeviceSoap();

		soapModel.setDeviceId(model.getDeviceId());
		soapModel.setUserId(model.getUserId());
		soapModel.setDeviceTypeId(model.getDeviceTypeId());
		soapModel.setDeviceKey(model.getDeviceKey());
		soapModel.setOperatingSystem(model.getOperatingSystem());

		return soapModel;
	}

	public static UserDeviceSoap[] toSoapModels(UserDevice[] models) {
		UserDeviceSoap[] soapModels = new UserDeviceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserDeviceSoap[][] toSoapModels(UserDevice[][] models) {
		UserDeviceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserDeviceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserDeviceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserDeviceSoap[] toSoapModels(List<UserDevice> models) {
		List<UserDeviceSoap> soapModels = new ArrayList<UserDeviceSoap>(models.size());

		for (UserDevice model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserDeviceSoap[soapModels.size()]);
	}

	public UserDeviceSoap() {
	}

	public long getPrimaryKey() {
		return _deviceId;
	}

	public void setPrimaryKey(long pk) {
		setDeviceId(pk);
	}

	public long getDeviceId() {
		return _deviceId;
	}

	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public int getDeviceTypeId() {
		return _deviceTypeId;
	}

	public void setDeviceTypeId(int deviceTypeId) {
		_deviceTypeId = deviceTypeId;
	}

	public String getDeviceKey() {
		return _deviceKey;
	}

	public void setDeviceKey(String deviceKey) {
		_deviceKey = deviceKey;
	}

	public String getOperatingSystem() {
		return _operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		_operatingSystem = operatingSystem;
	}

	private long _deviceId;
	private long _userId;
	private int _deviceTypeId;
	private String _deviceKey;
	private String _operatingSystem;
}