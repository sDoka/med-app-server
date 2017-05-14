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

package ru.dokstrudio.med.srv.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ru.dokstrudio.med.srv.model.UserAccount;
import ru.dokstrudio.med.srv.service.persistence.UserAccountPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserAccount in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserAccount
 * @generated
 */
@ProviderType
public class UserAccountCacheModel implements CacheModel<UserAccount>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserAccountCacheModel)) {
			return false;
		}

		UserAccountCacheModel userAccountCacheModel = (UserAccountCacheModel)obj;

		if (userAccountPK.equals(userAccountCacheModel.userAccountPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userAccountPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", accountTypeId=");
		sb.append(accountTypeId);
		sb.append(", activationDate=");
		sb.append(activationDate);
		sb.append(", expirationDate=");
		sb.append(expirationDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserAccount toEntityModel() {
		UserAccountImpl userAccountImpl = new UserAccountImpl();

		userAccountImpl.setUserId(userId);
		userAccountImpl.setAccountTypeId(accountTypeId);

		if (activationDate == Long.MIN_VALUE) {
			userAccountImpl.setActivationDate(null);
		}
		else {
			userAccountImpl.setActivationDate(new Date(activationDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			userAccountImpl.setExpirationDate(null);
		}
		else {
			userAccountImpl.setExpirationDate(new Date(expirationDate));
		}

		userAccountImpl.resetOriginalValues();

		return userAccountImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();

		accountTypeId = objectInput.readLong();
		activationDate = objectInput.readLong();
		expirationDate = objectInput.readLong();

		userAccountPK = new UserAccountPK(userId, accountTypeId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);

		objectOutput.writeLong(accountTypeId);
		objectOutput.writeLong(activationDate);
		objectOutput.writeLong(expirationDate);
	}

	public long userId;
	public long accountTypeId;
	public long activationDate;
	public long expirationDate;
	public transient UserAccountPK userAccountPK;
}