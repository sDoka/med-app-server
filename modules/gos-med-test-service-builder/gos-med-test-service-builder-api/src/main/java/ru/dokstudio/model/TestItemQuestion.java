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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the TestItemQuestion service. Represents a row in the &quot;gmt_TestItemQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TestItemQuestionModel
 * @see ru.dokstudio.model.impl.TestItemQuestionImpl
 * @see ru.dokstudio.model.impl.TestItemQuestionModelImpl
 * @generated
 */
@ImplementationClassName("ru.dokstudio.model.impl.TestItemQuestionImpl")
@ProviderType
public interface TestItemQuestion extends TestItemQuestionModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ru.dokstudio.model.impl.TestItemQuestionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TestItemQuestion, Long> QUESTION_ID_ACCESSOR = new Accessor<TestItemQuestion, Long>() {
			@Override
			public Long get(TestItemQuestion testItemQuestion) {
				return testItemQuestion.getQuestionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TestItemQuestion> getTypeClass() {
				return TestItemQuestion.class;
			}
		};
}