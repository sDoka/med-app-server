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
 * The extended model interface for the TestUnit service. Represents a row in the &quot;med_TestUnit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitModel
 * @see ru.dokstrudio.med.srv.model.impl.TestUnitImpl
 * @see ru.dokstrudio.med.srv.model.impl.TestUnitModelImpl
 * @generated
 */
@ImplementationClassName("ru.dokstrudio.med.srv.model.impl.TestUnitImpl")
@ProviderType
public interface TestUnit extends TestUnitModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ru.dokstrudio.med.srv.model.impl.TestUnitImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TestUnit, Long> TEST_UNIT_ID_ACCESSOR = new Accessor<TestUnit, Long>() {
			@Override
			public Long get(TestUnit testUnit) {
				return testUnit.getTestUnitId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TestUnit> getTypeClass() {
				return TestUnit.class;
			}
		};
}