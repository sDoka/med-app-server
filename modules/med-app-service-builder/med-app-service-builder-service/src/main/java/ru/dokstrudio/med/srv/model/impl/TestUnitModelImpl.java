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

import ru.dokstrudio.med.srv.model.TestUnit;
import ru.dokstrudio.med.srv.model.TestUnitModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TestUnit service. Represents a row in the &quot;med_TestUnit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TestUnitModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TestUnitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitImpl
 * @see TestUnit
 * @see TestUnitModel
 * @generated
 */
@ProviderType
public class TestUnitModelImpl extends BaseModelImpl<TestUnit>
	implements TestUnitModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a test unit model instance should use the {@link TestUnit} interface instead.
	 */
	public static final String TABLE_NAME = "med_TestUnit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "testUnitId", Types.BIGINT },
			{ "number_", Types.BIGINT },
			{ "specializationId", Types.INTEGER },
			{ "questionText", Types.VARCHAR },
			{ "questionType", Types.INTEGER },
			{ "questionDlFileEntryId", Types.BIGINT },
			{ "isActual", Types.BOOLEAN },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("testUnitId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("number_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("specializationId", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("questionText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("questionType", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("questionDlFileEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("isActual", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table med_TestUnit (testUnitId LONG not null primary key,number_ LONG,specializationId INTEGER,questionText VARCHAR(2000) null,questionType INTEGER,questionDlFileEntryId LONG,isActual BOOLEAN,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table med_TestUnit";
	public static final String ORDER_BY_JPQL = " ORDER BY testUnit.testUnitId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY med_TestUnit.testUnitId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.ru.dokstrudio.med.srv.model.TestUnit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.ru.dokstrudio.med.srv.model.TestUnit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.ru.dokstrudio.med.srv.model.TestUnit"),
			true);
	public static final long NUMBER_COLUMN_BITMASK = 1L;
	public static final long SPECIALIZATIONID_COLUMN_BITMASK = 2L;
	public static final long TESTUNITID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(ru.dokstrudio.med.srv.service.util.ServiceProps.get(
				"lock.expiration.time.ru.dokstrudio.med.srv.model.TestUnit"));

	public TestUnitModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _testUnitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTestUnitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testUnitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TestUnit.class;
	}

	@Override
	public String getModelClassName() {
		return TestUnit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("testUnitId", getTestUnitId());
		attributes.put("number", getNumber());
		attributes.put("specializationId", getSpecializationId());
		attributes.put("questionText", getQuestionText());
		attributes.put("questionType", getQuestionType());
		attributes.put("questionDlFileEntryId", getQuestionDlFileEntryId());
		attributes.put("isActual", getIsActual());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long testUnitId = (Long)attributes.get("testUnitId");

		if (testUnitId != null) {
			setTestUnitId(testUnitId);
		}

		Long number = (Long)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		Integer specializationId = (Integer)attributes.get("specializationId");

		if (specializationId != null) {
			setSpecializationId(specializationId);
		}

		String questionText = (String)attributes.get("questionText");

		if (questionText != null) {
			setQuestionText(questionText);
		}

		Integer questionType = (Integer)attributes.get("questionType");

		if (questionType != null) {
			setQuestionType(questionType);
		}

		Long questionDlFileEntryId = (Long)attributes.get(
				"questionDlFileEntryId");

		if (questionDlFileEntryId != null) {
			setQuestionDlFileEntryId(questionDlFileEntryId);
		}

		Boolean isActual = (Boolean)attributes.get("isActual");

		if (isActual != null) {
			setIsActual(isActual);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
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
	public long getNumber() {
		return _number;
	}

	@Override
	public void setNumber(long number) {
		_columnBitmask |= NUMBER_COLUMN_BITMASK;

		if (!_setOriginalNumber) {
			_setOriginalNumber = true;

			_originalNumber = _number;
		}

		_number = number;
	}

	public long getOriginalNumber() {
		return _originalNumber;
	}

	@Override
	public int getSpecializationId() {
		return _specializationId;
	}

	@Override
	public void setSpecializationId(int specializationId) {
		_columnBitmask |= SPECIALIZATIONID_COLUMN_BITMASK;

		if (!_setOriginalSpecializationId) {
			_setOriginalSpecializationId = true;

			_originalSpecializationId = _specializationId;
		}

		_specializationId = specializationId;
	}

	public int getOriginalSpecializationId() {
		return _originalSpecializationId;
	}

	@Override
	public String getQuestionText() {
		if (_questionText == null) {
			return StringPool.BLANK;
		}
		else {
			return _questionText;
		}
	}

	@Override
	public void setQuestionText(String questionText) {
		_questionText = questionText;
	}

	@Override
	public int getQuestionType() {
		return _questionType;
	}

	@Override
	public void setQuestionType(int questionType) {
		_questionType = questionType;
	}

	@Override
	public long getQuestionDlFileEntryId() {
		return _questionDlFileEntryId;
	}

	@Override
	public void setQuestionDlFileEntryId(long questionDlFileEntryId) {
		_questionDlFileEntryId = questionDlFileEntryId;
	}

	@Override
	public boolean getIsActual() {
		return _isActual;
	}

	@Override
	public boolean isIsActual() {
		return _isActual;
	}

	@Override
	public void setIsActual(boolean isActual) {
		_isActual = isActual;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TestUnit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TestUnit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TestUnit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TestUnitImpl testUnitImpl = new TestUnitImpl();

		testUnitImpl.setTestUnitId(getTestUnitId());
		testUnitImpl.setNumber(getNumber());
		testUnitImpl.setSpecializationId(getSpecializationId());
		testUnitImpl.setQuestionText(getQuestionText());
		testUnitImpl.setQuestionType(getQuestionType());
		testUnitImpl.setQuestionDlFileEntryId(getQuestionDlFileEntryId());
		testUnitImpl.setIsActual(getIsActual());
		testUnitImpl.setCreateDate(getCreateDate());
		testUnitImpl.setModifiedDate(getModifiedDate());

		testUnitImpl.resetOriginalValues();

		return testUnitImpl;
	}

	@Override
	public int compareTo(TestUnit testUnit) {
		long primaryKey = testUnit.getPrimaryKey();

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

		if (!(obj instanceof TestUnit)) {
			return false;
		}

		TestUnit testUnit = (TestUnit)obj;

		long primaryKey = testUnit.getPrimaryKey();

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
		TestUnitModelImpl testUnitModelImpl = this;

		testUnitModelImpl._originalNumber = testUnitModelImpl._number;

		testUnitModelImpl._setOriginalNumber = false;

		testUnitModelImpl._originalSpecializationId = testUnitModelImpl._specializationId;

		testUnitModelImpl._setOriginalSpecializationId = false;

		testUnitModelImpl._setModifiedDate = false;

		testUnitModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TestUnit> toCacheModel() {
		TestUnitCacheModel testUnitCacheModel = new TestUnitCacheModel();

		testUnitCacheModel.testUnitId = getTestUnitId();

		testUnitCacheModel.number = getNumber();

		testUnitCacheModel.specializationId = getSpecializationId();

		testUnitCacheModel.questionText = getQuestionText();

		String questionText = testUnitCacheModel.questionText;

		if ((questionText != null) && (questionText.length() == 0)) {
			testUnitCacheModel.questionText = null;
		}

		testUnitCacheModel.questionType = getQuestionType();

		testUnitCacheModel.questionDlFileEntryId = getQuestionDlFileEntryId();

		testUnitCacheModel.isActual = getIsActual();

		Date createDate = getCreateDate();

		if (createDate != null) {
			testUnitCacheModel.createDate = createDate.getTime();
		}
		else {
			testUnitCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			testUnitCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			testUnitCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return testUnitCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{testUnitId=");
		sb.append(getTestUnitId());
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", specializationId=");
		sb.append(getSpecializationId());
		sb.append(", questionText=");
		sb.append(getQuestionText());
		sb.append(", questionType=");
		sb.append(getQuestionType());
		sb.append(", questionDlFileEntryId=");
		sb.append(getQuestionDlFileEntryId());
		sb.append(", isActual=");
		sb.append(getIsActual());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("ru.dokstrudio.med.srv.model.TestUnit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>testUnitId</column-name><column-value><![CDATA[");
		sb.append(getTestUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specializationId</column-name><column-value><![CDATA[");
		sb.append(getSpecializationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionText</column-name><column-value><![CDATA[");
		sb.append(getQuestionText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionType</column-name><column-value><![CDATA[");
		sb.append(getQuestionType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionDlFileEntryId</column-name><column-value><![CDATA[");
		sb.append(getQuestionDlFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActual</column-name><column-value><![CDATA[");
		sb.append(getIsActual());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = TestUnit.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			TestUnit.class
		};
	private long _testUnitId;
	private long _number;
	private long _originalNumber;
	private boolean _setOriginalNumber;
	private int _specializationId;
	private int _originalSpecializationId;
	private boolean _setOriginalSpecializationId;
	private String _questionText;
	private int _questionType;
	private long _questionDlFileEntryId;
	private boolean _isActual;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private TestUnit _escapedModel;
}