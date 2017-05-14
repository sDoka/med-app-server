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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the UserAccount service. Represents a row in the &quot;med_UserAccount&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UserAccountModel
 * @see ru.dokstrudio.med.srv.model.impl.UserAccountImpl
 * @see ru.dokstrudio.med.srv.model.impl.UserAccountModelImpl
 * @generated
 */
@ImplementationClassName("ru.dokstrudio.med.srv.model.impl.UserAccountImpl")
@ProviderType
public interface UserAccount extends UserAccountModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ru.dokstrudio.med.srv.model.impl.UserAccountImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<UserAccount, Long> USER_ID_ACCESSOR = new Accessor<UserAccount, Long>() {
			@Override
			public Long get(UserAccount userAccount) {
				return userAccount.getUserId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UserAccount> getTypeClass() {
				return UserAccount.class;
			}
		};

	public static final Accessor<UserAccount, Long> ACCOUNT_TYPE_ID_ACCESSOR = new Accessor<UserAccount, Long>() {
			@Override
			public Long get(UserAccount userAccount) {
				return userAccount.getAccountTypeId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UserAccount> getTypeClass() {
				return UserAccount.class;
			}
		};
}