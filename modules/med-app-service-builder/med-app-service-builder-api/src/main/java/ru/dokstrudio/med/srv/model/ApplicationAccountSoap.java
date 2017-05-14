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
public class ApplicationAccountSoap implements Serializable {
	public static ApplicationAccountSoap toSoapModel(ApplicationAccount model) {
		ApplicationAccountSoap soapModel = new ApplicationAccountSoap();

		soapModel.setAccountTypeId(model.getAccountTypeId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setDurationDays(model.getDurationDays());

		return soapModel;
	}

	public static ApplicationAccountSoap[] toSoapModels(
		ApplicationAccount[] models) {
		ApplicationAccountSoap[] soapModels = new ApplicationAccountSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApplicationAccountSoap[][] toSoapModels(
		ApplicationAccount[][] models) {
		ApplicationAccountSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApplicationAccountSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApplicationAccountSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApplicationAccountSoap[] toSoapModels(
		List<ApplicationAccount> models) {
		List<ApplicationAccountSoap> soapModels = new ArrayList<ApplicationAccountSoap>(models.size());

		for (ApplicationAccount model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApplicationAccountSoap[soapModels.size()]);
	}

	public ApplicationAccountSoap() {
	}

	public long getPrimaryKey() {
		return _accountTypeId;
	}

	public void setPrimaryKey(long pk) {
		setAccountTypeId(pk);
	}

	public long getAccountTypeId() {
		return _accountTypeId;
	}

	public void setAccountTypeId(long accountTypeId) {
		_accountTypeId = accountTypeId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getDurationDays() {
		return _durationDays;
	}

	public void setDurationDays(long durationDays) {
		_durationDays = durationDays;
	}

	private long _accountTypeId;
	private String _name;
	private String _description;
	private long _durationDays;
}