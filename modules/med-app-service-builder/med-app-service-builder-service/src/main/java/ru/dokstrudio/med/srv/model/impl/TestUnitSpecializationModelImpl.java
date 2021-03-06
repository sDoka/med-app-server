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
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import ru.dokstrudio.med.srv.model.TestUnitSpecialization;
import ru.dokstrudio.med.srv.model.TestUnitSpecializationModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TestUnitSpecialization service. Represents a row in the &quot;med_TestUnitSpecialization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TestUnitSpecializationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TestUnitSpecializationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitSpecializationImpl
 * @see TestUnitSpecialization
 * @see TestUnitSpecializationModel
 * @generated
 */
@ProviderType
public class TestUnitSpecializationModelImpl extends BaseModelImpl<TestUnitSpecialization>
	implements TestUnitSpecializationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a test unit specialization model instance should use the {@link TestUnitSpecialization} interface instead.
	 */
	public static final String TABLE_NAME = "med_TestUnitSpecialization";
	public static final Object[][] TABLE_COLUMNS = {
			{ "specializationId", Types.BIGINT },
			{ "nameLocalizationKey", Types.VARCHAR },
			{ "specializationIcon", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("specializationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("nameLocalizationKey", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specializationIcon", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table med_TestUnitSpecialization (specializationId LONG not null primary key,nameLocalizationKey VARCHAR(75) null,specializationIcon VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table med_TestUnitSpecialization";
	public static final String ORDER_BY_JPQL = " ORDER BY testUnitSpecialization.specializationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY med_TestUnitSpecialization.specializationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.ru.dokstrudio.med.srv.model.TestUnitSpecialization"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.ru.dokstrudio.med.srv.model.TestUnitSpecialization"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"lock.expiration.time.ru.dokstrudio.med.srv.model.TestUnitSpecialization"));

	public TestUnitSpecializationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _specializationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSpecializationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _specializationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TestUnitSpecialization.class;
	}

	@Override
	public String getModelClassName() {
		return TestUnitSpecialization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("specializationId", getSpecializationId());
		attributes.put("nameLocalizationKey", getNameLocalizationKey());
		attributes.put("specializationIcon", getSpecializationIcon());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long specializationId = (Long)attributes.get("specializationId");

		if (specializationId != null) {
			setSpecializationId(specializationId);
		}

		String nameLocalizationKey = (String)attributes.get(
				"nameLocalizationKey");

		if (nameLocalizationKey != null) {
			setNameLocalizationKey(nameLocalizationKey);
		}

		String specializationIcon = (String)attributes.get("specializationIcon");

		if (specializationIcon != null) {
			setSpecializationIcon(specializationIcon);
		}
	}

	@Override
	public long getSpecializationId() {
		return _specializationId;
	}

	@Override
	public void setSpecializationId(long specializationId) {
		_specializationId = specializationId;
	}

	@Override
	public String getNameLocalizationKey() {
		if (_nameLocalizationKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameLocalizationKey;
		}
	}

	@Override
	public void setNameLocalizationKey(String nameLocalizationKey) {
		_nameLocalizationKey = nameLocalizationKey;
	}

	@Override
	public String getSpecializationIcon() {
		if (_specializationIcon == null) {
			return StringPool.BLANK;
		}
		else {
			return _specializationIcon;
		}
	}

	@Override
	public void setSpecializationIcon(String specializationIcon) {
		_specializationIcon = specializationIcon;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TestUnitSpecialization.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TestUnitSpecialization toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TestUnitSpecialization)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TestUnitSpecializationImpl testUnitSpecializationImpl = new TestUnitSpecializationImpl();

		testUnitSpecializationImpl.setSpecializationId(getSpecializationId());
		testUnitSpecializationImpl.setNameLocalizationKey(getNameLocalizationKey());
		testUnitSpecializationImpl.setSpecializationIcon(getSpecializationIcon());

		testUnitSpecializationImpl.resetOriginalValues();

		return testUnitSpecializationImpl;
	}

	@Override
	public int compareTo(TestUnitSpecialization testUnitSpecialization) {
		long primaryKey = testUnitSpecialization.getPrimaryKey();

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

		if (!(obj instanceof TestUnitSpecialization)) {
			return false;
		}

		TestUnitSpecialization testUnitSpecialization = (TestUnitSpecialization)obj;

		long primaryKey = testUnitSpecialization.getPrimaryKey();

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
	}

	@Override
	public CacheModel<TestUnitSpecialization> toCacheModel() {
		TestUnitSpecializationCacheModel testUnitSpecializationCacheModel = new TestUnitSpecializationCacheModel();

		testUnitSpecializationCacheModel.specializationId = getSpecializationId();

		testUnitSpecializationCacheModel.nameLocalizationKey = getNameLocalizationKey();

		String nameLocalizationKey = testUnitSpecializationCacheModel.nameLocalizationKey;

		if ((nameLocalizationKey != null) &&
				(nameLocalizationKey.length() == 0)) {
			testUnitSpecializationCacheModel.nameLocalizationKey = null;
		}

		testUnitSpecializationCacheModel.specializationIcon = getSpecializationIcon();

		String specializationIcon = testUnitSpecializationCacheModel.specializationIcon;

		if ((specializationIcon != null) && (specializationIcon.length() == 0)) {
			testUnitSpecializationCacheModel.specializationIcon = null;
		}

		return testUnitSpecializationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{specializationId=");
		sb.append(getSpecializationId());
		sb.append(", nameLocalizationKey=");
		sb.append(getNameLocalizationKey());
		sb.append(", specializationIcon=");
		sb.append(getSpecializationIcon());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("ru.dokstrudio.med.srv.model.TestUnitSpecialization");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>specializationId</column-name><column-value><![CDATA[");
		sb.append(getSpecializationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameLocalizationKey</column-name><column-value><![CDATA[");
		sb.append(getNameLocalizationKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specializationIcon</column-name><column-value><![CDATA[");
		sb.append(getSpecializationIcon());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = TestUnitSpecialization.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			TestUnitSpecialization.class
		};
	private long _specializationId;
	private String _nameLocalizationKey;
	private String _specializationIcon;
	private TestUnitSpecialization _escapedModel;
}