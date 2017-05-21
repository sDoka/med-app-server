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

/**
 * The base model interface for the TestItemAnswer service. Represents a row in the &quot;gmt_TestItemAnswer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ru.dokstudio.model.impl.TestItemAnswerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ru.dokstudio.model.impl.TestItemAnswerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAnswer
 * @see ru.dokstudio.model.impl.TestItemAnswerImpl
 * @see ru.dokstudio.model.impl.TestItemAnswerModelImpl
 * @generated
 */
@ProviderType
public interface TestItemAnswerModel extends BaseModel<TestItemAnswer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a test item answer model instance should use the {@link TestItemAnswer} interface instead.
	 */

	/**
	 * Returns the primary key of this test item answer.
	 *
	 * @return the primary key of this test item answer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this test item answer.
	 *
	 * @param primaryKey the primary key of this test item answer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this test item answer.
	 *
	 * @return the uuid of this test item answer
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this test item answer.
	 *
	 * @param uuid the uuid of this test item answer
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the answer ID of this test item answer.
	 *
	 * @return the answer ID of this test item answer
	 */
	public long getAnswerId();

	/**
	 * Sets the answer ID of this test item answer.
	 *
	 * @param answerId the answer ID of this test item answer
	 */
	public void setAnswerId(long answerId);

	/**
	 * Returns the question ID of this test item answer.
	 *
	 * @return the question ID of this test item answer
	 */
	public long getQuestionId();

	/**
	 * Sets the question ID of this test item answer.
	 *
	 * @param questionId the question ID of this test item answer
	 */
	public void setQuestionId(long questionId);

	/**
	 * Returns the answer of this test item answer.
	 *
	 * @return the answer of this test item answer
	 */
	@AutoEscape
	public String getAnswer();

	/**
	 * Sets the answer of this test item answer.
	 *
	 * @param answer the answer of this test item answer
	 */
	public void setAnswer(String answer);

	/**
	 * Returns the is correct of this test item answer.
	 *
	 * @return the is correct of this test item answer
	 */
	public boolean getIsCorrect();

	/**
	 * Returns <code>true</code> if this test item answer is is correct.
	 *
	 * @return <code>true</code> if this test item answer is is correct; <code>false</code> otherwise
	 */
	public boolean isIsCorrect();

	/**
	 * Sets whether this test item answer is is correct.
	 *
	 * @param isCorrect the is correct of this test item answer
	 */
	public void setIsCorrect(boolean isCorrect);

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
	public int compareTo(ru.dokstudio.model.TestItemAnswer testItemAnswer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ru.dokstudio.model.TestItemAnswer> toCacheModel();

	@Override
	public ru.dokstudio.model.TestItemAnswer toEscapedModel();

	@Override
	public ru.dokstudio.model.TestItemAnswer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}