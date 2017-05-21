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

package ru.dokstudio.service.impl;

import java.util.List;

import aQute.bnd.annotation.ProviderType;
import ru.dokstudio.model.TestItemAnswer;
import ru.dokstudio.service.base.TestItemAnswerLocalServiceBaseImpl;

/**
 * The implementation of the test item answer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.dokstudio.service.TestItemAnswerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAnswerLocalServiceBaseImpl
 * @see ru.dokstudio.service.TestItemAnswerLocalServiceUtil
 */
@ProviderType
public class TestItemAnswerLocalServiceImpl
	extends TestItemAnswerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link ru.dokstudio.service.TestItemAnswerLocalServiceUtil} to access the test item answer local service.
	 */
	public List<TestItemAnswer> getAnswersByQuestionId(long questionId) {
		return testItemAnswerPersistence.findByQuestion(questionId);
	}
}