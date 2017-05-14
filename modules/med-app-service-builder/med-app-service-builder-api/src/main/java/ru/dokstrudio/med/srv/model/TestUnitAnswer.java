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
 * The extended model interface for the TestUnitAnswer service. Represents a row in the &quot;med_TestUnitAnswer&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAnswerModel
 * @see ru.dokstrudio.med.srv.model.impl.TestUnitAnswerImpl
 * @see ru.dokstrudio.med.srv.model.impl.TestUnitAnswerModelImpl
 * @generated
 */
@ImplementationClassName("ru.dokstrudio.med.srv.model.impl.TestUnitAnswerImpl")
@ProviderType
public interface TestUnitAnswer extends TestUnitAnswerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ru.dokstrudio.med.srv.model.impl.TestUnitAnswerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TestUnitAnswer, Long> TEST_UNIT_ANSWER_ID_ACCESSOR =
		new Accessor<TestUnitAnswer, Long>() {
			@Override
			public Long get(TestUnitAnswer testUnitAnswer) {
				return testUnitAnswer.getTestUnitAnswerId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TestUnitAnswer> getTypeClass() {
				return TestUnitAnswer.class;
			}
		};
}