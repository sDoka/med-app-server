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

package ru.dokstrudio.med.srv.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitSpecializationException;
import ru.dokstrudio.med.srv.model.TestUnitSpecialization;

/**
 * The persistence interface for the test unit specialization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitSpecializationPersistenceImpl
 * @see TestUnitSpecializationUtil
 * @generated
 */
@ProviderType
public interface TestUnitSpecializationPersistence extends BasePersistence<TestUnitSpecialization> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestUnitSpecializationUtil} to access the test unit specialization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the test unit specialization in the entity cache if it is enabled.
	*
	* @param testUnitSpecialization the test unit specialization
	*/
	public void cacheResult(TestUnitSpecialization testUnitSpecialization);

	/**
	* Caches the test unit specializations in the entity cache if it is enabled.
	*
	* @param testUnitSpecializations the test unit specializations
	*/
	public void cacheResult(
		java.util.List<TestUnitSpecialization> testUnitSpecializations);

	/**
	* Creates a new test unit specialization with the primary key. Does not add the test unit specialization to the database.
	*
	* @param specializationId the primary key for the new test unit specialization
	* @return the new test unit specialization
	*/
	public TestUnitSpecialization create(long specializationId);

	/**
	* Removes the test unit specialization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization that was removed
	* @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	*/
	public TestUnitSpecialization remove(long specializationId)
		throws NoSuchTestUnitSpecializationException;

	public TestUnitSpecialization updateImpl(
		TestUnitSpecialization testUnitSpecialization);

	/**
	* Returns the test unit specialization with the primary key or throws a {@link NoSuchTestUnitSpecializationException} if it could not be found.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization
	* @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	*/
	public TestUnitSpecialization findByPrimaryKey(long specializationId)
		throws NoSuchTestUnitSpecializationException;

	/**
	* Returns the test unit specialization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization, or <code>null</code> if a test unit specialization with the primary key could not be found
	*/
	public TestUnitSpecialization fetchByPrimaryKey(long specializationId);

	@Override
	public java.util.Map<java.io.Serializable, TestUnitSpecialization> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test unit specializations.
	*
	* @return the test unit specializations
	*/
	public java.util.List<TestUnitSpecialization> findAll();

	/**
	* Returns a range of all the test unit specializations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit specializations
	* @param end the upper bound of the range of test unit specializations (not inclusive)
	* @return the range of test unit specializations
	*/
	public java.util.List<TestUnitSpecialization> findAll(int start, int end);

	/**
	* Returns an ordered range of all the test unit specializations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit specializations
	* @param end the upper bound of the range of test unit specializations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test unit specializations
	*/
	public java.util.List<TestUnitSpecialization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitSpecialization> orderByComparator);

	/**
	* Returns an ordered range of all the test unit specializations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit specializations
	* @param end the upper bound of the range of test unit specializations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test unit specializations
	*/
	public java.util.List<TestUnitSpecialization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitSpecialization> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test unit specializations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test unit specializations.
	*
	* @return the number of test unit specializations
	*/
	public int countAll();
}