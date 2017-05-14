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
import com.liferay.portal.kernel.util.StringPool;

import ru.dokstrudio.med.srv.model.ApplicationAccount;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ApplicationAccount in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationAccount
 * @generated
 */
@ProviderType
public class ApplicationAccountCacheModel implements CacheModel<ApplicationAccount>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplicationAccountCacheModel)) {
			return false;
		}

		ApplicationAccountCacheModel applicationAccountCacheModel = (ApplicationAccountCacheModel)obj;

		if (accountTypeId == applicationAccountCacheModel.accountTypeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accountTypeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{accountTypeId=");
		sb.append(accountTypeId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", durationDays=");
		sb.append(durationDays);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ApplicationAccount toEntityModel() {
		ApplicationAccountImpl applicationAccountImpl = new ApplicationAccountImpl();

		applicationAccountImpl.setAccountTypeId(accountTypeId);

		if (name == null) {
			applicationAccountImpl.setName(StringPool.BLANK);
		}
		else {
			applicationAccountImpl.setName(name);
		}

		if (description == null) {
			applicationAccountImpl.setDescription(StringPool.BLANK);
		}
		else {
			applicationAccountImpl.setDescription(description);
		}

		applicationAccountImpl.setDurationDays(durationDays);

		applicationAccountImpl.resetOriginalValues();

		return applicationAccountImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		accountTypeId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		durationDays = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(accountTypeId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(durationDays);
	}

	public long accountTypeId;
	public String name;
	public String description;
	public long durationDays;
}