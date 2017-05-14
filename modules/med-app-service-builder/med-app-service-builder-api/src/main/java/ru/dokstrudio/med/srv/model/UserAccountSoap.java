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

import ru.dokstrudio.med.srv.service.persistence.UserAccountPK;

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
public class UserAccountSoap implements Serializable {
	public static UserAccountSoap toSoapModel(UserAccount model) {
		UserAccountSoap soapModel = new UserAccountSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setAccountTypeId(model.getAccountTypeId());
		soapModel.setActivationDate(model.getActivationDate());
		soapModel.setExpirationDate(model.getExpirationDate());

		return soapModel;
	}

	public static UserAccountSoap[] toSoapModels(UserAccount[] models) {
		UserAccountSoap[] soapModels = new UserAccountSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserAccountSoap[][] toSoapModels(UserAccount[][] models) {
		UserAccountSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserAccountSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserAccountSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserAccountSoap[] toSoapModels(List<UserAccount> models) {
		List<UserAccountSoap> soapModels = new ArrayList<UserAccountSoap>(models.size());

		for (UserAccount model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserAccountSoap[soapModels.size()]);
	}

	public UserAccountSoap() {
	}

	public UserAccountPK getPrimaryKey() {
		return new UserAccountPK(_userId, _accountTypeId);
	}

	public void setPrimaryKey(UserAccountPK pk) {
		setUserId(pk.userId);
		setAccountTypeId(pk.accountTypeId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getAccountTypeId() {
		return _accountTypeId;
	}

	public void setAccountTypeId(long accountTypeId) {
		_accountTypeId = accountTypeId;
	}

	public Date getActivationDate() {
		return _activationDate;
	}

	public void setActivationDate(Date activationDate) {
		_activationDate = activationDate;
	}

	public Date getExpirationDate() {
		return _expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		_expirationDate = expirationDate;
	}

	private long _userId;
	private long _accountTypeId;
	private Date _activationDate;
	private Date _expirationDate;
}