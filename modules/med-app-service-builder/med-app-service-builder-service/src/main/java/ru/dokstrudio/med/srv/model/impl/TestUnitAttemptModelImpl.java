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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import ru.dokstrudio.med.srv.model.TestUnitAttempt;
import ru.dokstrudio.med.srv.model.TestUnitAttemptModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TestUnitAttempt service. Represents a row in the &quot;med_TestUnitAttempt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TestUnitAttemptModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TestUnitAttemptImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAttemptImpl
 * @see TestUnitAttempt
 * @see TestUnitAttemptModel
 * @generated
 */
@ProviderType
public class TestUnitAttemptModelImpl extends BaseModelImpl<TestUnitAttempt>
	implements TestUnitAttemptModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a test unit attempt model instance should use the {@link TestUnitAttempt} interface instead.
	 */
	public static final String TABLE_NAME = "med_TestUnitAttempt";
	public static final Object[][] TABLE_COLUMNS = {
			{ "testUnitAttemptId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "testUnitId", Types.BIGINT },
			{ "testUnitAnswerId", Types.BIGINT },
			{ "submitTime", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("testUnitAttemptId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("testUnitId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("testUnitAnswerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("submitTime", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table med_TestUnitAttempt (testUnitAttemptId LONG not null primary key,userId LONG,testUnitId LONG,testUnitAnswerId LONG,submitTime DATE null)";
	public static final String TABLE_SQL_DROP = "drop table med_TestUnitAttempt";
	public static final String ORDER_BY_JPQL = " ORDER BY testUnitAttempt.testUnitAttemptId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY med_TestUnitAttempt.testUnitAttemptId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.ru.dokstrudio.med.srv.model.TestUnitAttempt"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.ru.dokstrudio.med.srv.model.TestUnitAttempt"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.ru.dokstrudio.med.srv.model.TestUnitAttempt"),
			true);
	public static final long SUBMITTIME_COLUMN_BITMASK = 1L;
	public static final long TESTUNITANSWERID_COLUMN_BITMASK = 2L;
	public static final long USERID_COLUMN_BITMASK = 4L;
	public static final long TESTUNITATTEMPTID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"lock.expiration.time.ru.dokstrudio.med.srv.model.TestUnitAttempt"));

	public TestUnitAttemptModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _testUnitAttemptId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTestUnitAttemptId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testUnitAttemptId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TestUnitAttempt.class;
	}

	@Override
	public String getModelClassName() {
		return TestUnitAttempt.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("testUnitAttemptId", getTestUnitAttemptId());
		attributes.put("userId", getUserId());
		attributes.put("testUnitId", getTestUnitId());
		attributes.put("testUnitAnswerId", getTestUnitAnswerId());
		attributes.put("submitTime", getSubmitTime());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long testUnitAttemptId = (Long)attributes.get("testUnitAttemptId");

		if (testUnitAttemptId != null) {
			setTestUnitAttemptId(testUnitAttemptId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long testUnitId = (Long)attributes.get("testUnitId");

		if (testUnitId != null) {
			setTestUnitId(testUnitId);
		}

		Long testUnitAnswerId = (Long)attributes.get("testUnitAnswerId");

		if (testUnitAnswerId != null) {
			setTestUnitAnswerId(testUnitAnswerId);
		}

		Date submitTime = (Date)attributes.get("submitTime");

		if (submitTime != null) {
			setSubmitTime(submitTime);
		}
	}

	@Override
	public long getTestUnitAttemptId() {
		return _testUnitAttemptId;
	}

	@Override
	public void setTestUnitAttemptId(long testUnitAttemptId) {
		_testUnitAttemptId = testUnitAttemptId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

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

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getTestUnitId() {
		return _testUnitId;
	}

	@Override
	public void setTestUnitId(long testUnitId) {
		_testUnitId = testUnitId;
	}

	@Override
	public long getTestUnitAnswerId() {
		return _testUnitAnswerId;
	}

	@Override
	public void setTestUnitAnswerId(long testUnitAnswerId) {
		_columnBitmask |= TESTUNITANSWERID_COLUMN_BITMASK;

		if (!_setOriginalTestUnitAnswerId) {
			_setOriginalTestUnitAnswerId = true;

			_originalTestUnitAnswerId = _testUnitAnswerId;
		}

		_testUnitAnswerId = testUnitAnswerId;
	}

	public long getOriginalTestUnitAnswerId() {
		return _originalTestUnitAnswerId;
	}

	@Override
	public Date getSubmitTime() {
		return _submitTime;
	}

	@Override
	public void setSubmitTime(Date submitTime) {
		_columnBitmask |= SUBMITTIME_COLUMN_BITMASK;

		if (_originalSubmitTime == null) {
			_originalSubmitTime = _submitTime;
		}

		_submitTime = submitTime;
	}

	public Date getOriginalSubmitTime() {
		return _originalSubmitTime;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TestUnitAttempt.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TestUnitAttempt toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TestUnitAttempt)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TestUnitAttemptImpl testUnitAttemptImpl = new TestUnitAttemptImpl();

		testUnitAttemptImpl.setTestUnitAttemptId(getTestUnitAttemptId());
		testUnitAttemptImpl.setUserId(getUserId());
		testUnitAttemptImpl.setTestUnitId(getTestUnitId());
		testUnitAttemptImpl.setTestUnitAnswerId(getTestUnitAnswerId());
		testUnitAttemptImpl.setSubmitTime(getSubmitTime());

		testUnitAttemptImpl.resetOriginalValues();

		return testUnitAttemptImpl;
	}

	@Override
	public int compareTo(TestUnitAttempt testUnitAttempt) {
		long primaryKey = testUnitAttempt.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUnitAttempt)) {
			return false;
		}

		TestUnitAttempt testUnitAttempt = (TestUnitAttempt)obj;

		long primaryKey = testUnitAttempt.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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
		TestUnitAttemptModelImpl testUnitAttemptModelImpl = this;

		testUnitAttemptModelImpl._originalUserId = testUnitAttemptModelImpl._userId;

		testUnitAttemptModelImpl._setOriginalUserId = false;

		testUnitAttemptModelImpl._originalTestUnitAnswerId = testUnitAttemptModelImpl._testUnitAnswerId;

		testUnitAttemptModelImpl._setOriginalTestUnitAnswerId = false;

		testUnitAttemptModelImpl._originalSubmitTime = testUnitAttemptModelImpl._submitTime;

		testUnitAttemptModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TestUnitAttempt> toCacheModel() {
		TestUnitAttemptCacheModel testUnitAttemptCacheModel = new TestUnitAttemptCacheModel();

		testUnitAttemptCacheModel.testUnitAttemptId = getTestUnitAttemptId();

		testUnitAttemptCacheModel.userId = getUserId();

		testUnitAttemptCacheModel.testUnitId = getTestUnitId();

		testUnitAttemptCacheModel.testUnitAnswerId = getTestUnitAnswerId();

		Date submitTime = getSubmitTime();

		if (submitTime != null) {
			testUnitAttemptCacheModel.submitTime = submitTime.getTime();
		}
		else {
			testUnitAttemptCacheModel.submitTime = Long.MIN_VALUE;
		}

		return testUnitAttemptCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{testUnitAttemptId=");
		sb.append(getTestUnitAttemptId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", testUnitId=");
		sb.append(getTestUnitId());
		sb.append(", testUnitAnswerId=");
		sb.append(getTestUnitAnswerId());
		sb.append(", submitTime=");
		sb.append(getSubmitTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("ru.dokstrudio.med.srv.model.TestUnitAttempt");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>testUnitAttemptId</column-name><column-value><![CDATA[");
		sb.append(getTestUnitAttemptId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testUnitId</column-name><column-value><![CDATA[");
		sb.append(getTestUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testUnitAnswerId</column-name><column-value><![CDATA[");
		sb.append(getTestUnitAnswerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>submitTime</column-name><column-value><![CDATA[");
		sb.append(getSubmitTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = TestUnitAttempt.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			TestUnitAttempt.class
		};
	private long _testUnitAttemptId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _testUnitId;
	private long _testUnitAnswerId;
	private long _originalTestUnitAnswerId;
	private boolean _setOriginalTestUnitAnswerId;
	private Date _submitTime;
	private Date _originalSubmitTime;
	private long _columnBitmask;
	private TestUnitAttempt _escapedModel;
}