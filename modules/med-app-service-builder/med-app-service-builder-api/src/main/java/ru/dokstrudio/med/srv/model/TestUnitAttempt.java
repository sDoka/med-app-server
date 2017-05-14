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
 * The extended model interface for the TestUnitAttempt service. Represents a row in the &quot;med_TestUnitAttempt&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAttemptModel
 * @see ru.dokstrudio.med.srv.model.impl.TestUnitAttemptImpl
 * @see ru.dokstrudio.med.srv.model.impl.TestUnitAttemptModelImpl
 * @generated
 */
@ImplementationClassName("ru.dokstrudio.med.srv.model.impl.TestUnitAttemptImpl")
@ProviderType
public interface TestUnitAttempt extends TestUnitAttemptModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ru.dokstrudio.med.srv.model.impl.TestUnitAttemptImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TestUnitAttempt, Long> TEST_UNIT_ATTEMPT_ID_ACCESSOR =
		new Accessor<TestUnitAttempt, Long>() {
			@Override
			public Long get(TestUnitAttempt testUnitAttempt) {
				return testUnitAttempt.getTestUnitAttemptId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TestUnitAttempt> getTypeClass() {
				return TestUnitAttempt.class;
			}
		};
}