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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import ru.dokstrudio.med.srv.model.UserAccount;
import ru.dokstrudio.med.srv.model.UserAccountModel;
import ru.dokstrudio.med.srv.service.persistence.UserAccountPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the UserAccount service. Represents a row in the &quot;med_UserAccount&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link UserAccountModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAccountImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAccountImpl
 * @see UserAccount
 * @see UserAccountModel
 * @generated
 */
@ProviderType
public class UserAccountModelImpl extends BaseModelImpl<UserAccount>
	implements UserAccountModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user account model instance should use the {@link UserAccount} interface instead.
	 */
	public static final String TABLE_NAME = "med_UserAccount";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userId", Types.BIGINT },
			{ "accountTypeId", Types.BIGINT },
			{ "activationDate", Types.TIMESTAMP },
			{ "expirationDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("accountTypeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("activationDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("expirationDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table med_UserAccount (userId LONG not null,accountTypeId LONG not null,activationDate DATE null,expirationDate DATE null,primary key (userId, accountTypeId))";
	public static final String TABLE_SQL_DROP = "drop table med_UserAccount";
	public static final String ORDER_BY_JPQL = " ORDER BY userAccount.id.userId ASC, userAccount.id.accountTypeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY med_UserAccount.userId ASC, med_UserAccount.accountTypeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.ru.dokstrudio.med.srv.model.UserAccount"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.ru.dokstrudio.med.srv.model.UserAccount"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"lock.expiration.time.ru.dokstrudio.med.srv.model.UserAccount"));

	public UserAccountModelImpl() {
	}

	@Override
	public UserAccountPK getPrimaryKey() {
		return new UserAccountPK(_userId, _accountTypeId);
	}

	@Override
	public void setPrimaryKey(UserAccountPK primaryKey) {
		setUserId(primaryKey.userId);
		setAccountTypeId(primaryKey.accountTypeId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new UserAccountPK(_userId, _accountTypeId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((UserAccountPK)primaryKeyObj);
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public long getAccountTypeId() {
		return _accountTypeId;
	}

	@Override
	public void setAccountTypeId(long accountTypeId) {
		_accountTypeId = accountTypeId;
	}

	@Override
	public Date getActivationDate() {
		return _activationDate;
	}

	@Override
	public void setActivationDate(Date activationDate) {
		_activationDate = activationDate;
	}

	@Override
	public Date getExpirationDate() {
		return _expirationDate;
	}

	@Override
	public void setExpirationDate(Date expirationDate) {
		_expirationDate = expirationDate;
	}

	@Override
	public UserAccount toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (UserAccount)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserAccountImpl userAccountImpl = new UserAccountImpl();

		userAccountImpl.setUserId(getUserId());
		userAccountImpl.setAccountTypeId(getAccountTypeId());
		userAccountImpl.setActivationDate(getActivationDate());
		userAccountImpl.setExpirationDate(getExpirationDate());

		userAccountImpl.resetOriginalValues();

		return userAccountImpl;
	}

	@Override
	public int compareTo(UserAccount userAccount) {
		UserAccountPK primaryKey = userAccount.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserAccount)) {
			return false;
		}

		UserAccount userAccount = (UserAccount)obj;

		UserAccountPK primaryKey = userAccount.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<UserAccount> toCacheModel() {
		UserAccountCacheModel userAccountCacheModel = new UserAccountCacheModel();

		userAccountCacheModel.userAccountPK = getPrimaryKey();

		userAccountCacheModel.userId = getUserId();

		userAccountCacheModel.accountTypeId = getAccountTypeId();

		Date activationDate = getActivationDate();

		if (activationDate != null) {
			userAccountCacheModel.activationDate = activationDate.getTime();
		}
		else {
			userAccountCacheModel.activationDate = Long.MIN_VALUE;
		}

		Date expirationDate = getExpirationDate();

		if (expirationDate != null) {
			userAccountCacheModel.expirationDate = expirationDate.getTime();
		}
		else {
			userAccountCacheModel.expirationDate = Long.MIN_VALUE;
		}

		return userAccountCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", accountTypeId=");
		sb.append(getAccountTypeId());
		sb.append(", activationDate=");
		sb.append(getActivationDate());
		sb.append(", expirationDate=");
		sb.append(getExpirationDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("ru.dokstrudio.med.srv.model.UserAccount");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accountTypeId</column-name><column-value><![CDATA[");
		sb.append(getAccountTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activationDate</column-name><column-value><![CDATA[");
		sb.append(getActivationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expirationDate</column-name><column-value><![CDATA[");
		sb.append(getExpirationDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = UserAccount.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			UserAccount.class
		};
	private long _userId;
	private long _accountTypeId;
	private Date _activationDate;
	private Date _expirationDate;
	private UserAccount _escapedModel;
}