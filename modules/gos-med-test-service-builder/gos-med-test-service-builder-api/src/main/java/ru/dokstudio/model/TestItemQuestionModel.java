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

package ru.dokstudio.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TestItemQuestion service. Represents a row in the &quot;gmt_TestItemQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ru.dokstudio.model.impl.TestItemQuestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ru.dokstudio.model.impl.TestItemQuestionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemQuestion
 * @see ru.dokstudio.model.impl.TestItemQuestionImpl
 * @see ru.dokstudio.model.impl.TestItemQuestionModelImpl
 * @generated
 */
@ProviderType
public interface TestItemQuestionModel extends BaseModel<TestItemQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a test item question model instance should use the {@link TestItemQuestion} interface instead.
	 */

	/**
	 * Returns the primary key of this test item question.
	 *
	 * @return the primary key of this test item question
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this test item question.
	 *
	 * @param primaryKey the primary key of this test item question
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this test item question.
	 *
	 * @return the uuid of this test item question
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this test item question.
	 *
	 * @param uuid the uuid of this test item question
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the question ID of this test item question.
	 *
	 * @return the question ID of this test item question
	 */
	public long getQuestionId();

	/**
	 * Sets the question ID of this test item question.
	 *
	 * @param questionId the question ID of this test item question
	 */
	public void setQuestionId(long questionId);

	/**
	 * Returns the question number of this test item question.
	 *
	 * @return the question number of this test item question
	 */
	public long getQuestionNumber();

	/**
	 * Sets the question number of this test item question.
	 *
	 * @param questionNumber the question number of this test item question
	 */
	public void setQuestionNumber(long questionNumber);

	/**
	 * Returns the question of this test item question.
	 *
	 * @return the question of this test item question
	 */
	@AutoEscape
	public String getQuestion();

	/**
	 * Sets the question of this test item question.
	 *
	 * @param question the question of this test item question
	 */
	public void setQuestion(String question);

	/**
	 * Returns the modified date of this test item question.
	 *
	 * @return the modified date of this test item question
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this test item question.
	 *
	 * @param modifiedDate the modified date of this test item question
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ru.dokstudio.model.TestItemQuestion testItemQuestion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ru.dokstudio.model.TestItemQuestion> toCacheModel();

	@Override
	public ru.dokstudio.model.TestItemQuestion toEscapedModel();

	@Override
	public ru.dokstudio.model.TestItemQuestion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}