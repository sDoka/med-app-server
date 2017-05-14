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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ApplicationUsageSoap implements Serializable {
	public static ApplicationUsageSoap toSoapModel(ApplicationUsage model) {
		ApplicationUsageSoap soapModel = new ApplicationUsageSoap();

		soapModel.setApplicationUserId(model.getApplicationUserId());
		soapModel.setUserId(model.getUserId());
		soapModel.setIpAddress(model.getIpAddress());
		soapModel.setDeviceId(model.getDeviceId());
		soapModel.setActionType(model.getActionType());
		soapModel.setActionTime(model.getActionTime());

		return soapModel;
	}

	public static ApplicationUsageSoap[] toSoapModels(ApplicationUsage[] models) {
		ApplicationUsageSoap[] soapModels = new ApplicationUsageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApplicationUsageSoap[][] toSoapModels(
		ApplicationUsage[][] models) {
		ApplicationUsageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApplicationUsageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApplicationUsageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApplicationUsageSoap[] toSoapModels(
		List<ApplicationUsage> models) {
		List<ApplicationUsageSoap> soapModels = new ArrayList<ApplicationUsageSoap>(models.size());

		for (ApplicationUsage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApplicationUsageSoap[soapModels.size()]);
	}

	public ApplicationUsageSoap() {
	}

	public long getPrimaryKey() {
		return _applicationUserId;
	}

	public void setPrimaryKey(long pk) {
		setApplicationUserId(pk);
	}

	public long getApplicationUserId() {
		return _applicationUserId;
	}

	public void setApplicationUserId(long applicationUserId) {
		_applicationUserId = applicationUserId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getIpAddress() {
		return _ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;
	}

	public long getDeviceId() {
		return _deviceId;
	}

	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;
	}

	public int getActionType() {
		return _actionType;
	}

	public void setActionType(int actionType) {
		_actionType = actionType;
	}

	public Date getActionTime() {
		return _actionTime;
	}

	public void setActionTime(Date actionTime) {
		_actionTime = actionTime;
	}

	private long _applicationUserId;
	private long _userId;
	private String _ipAddress;
	private long _deviceId;
	private int _actionType;
	private Date _actionTime;
}