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

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitException;
import ru.dokstrudio.med.srv.model.TestUnit;

import java.util.Date;

/**
 * The persistence interface for the test unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitPersistenceImpl
 * @see TestUnitUtil
 * @generated
 */
@ProviderType
public interface TestUnitPersistence extends BasePersistence<TestUnit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestUnitUtil} to access the test unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the test units where number = &#63;.
	*
	* @param number the number
	* @return the matching test units
	*/
	public java.util.List<TestUnit> findByTestUnitNumber(long number);

	/**
	* Returns a range of all the test units where number = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param number the number
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @return the range of matching test units
	*/
	public java.util.List<TestUnit> findByTestUnitNumber(long number,
		int start, int end);

	/**
	* Returns an ordered range of all the test units where number = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param number the number
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test units
	*/
	public java.util.List<TestUnit> findByTestUnitNumber(long number,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns an ordered range of all the test units where number = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param number the number
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test units
	*/
	public java.util.List<TestUnit> findByTestUnitNumber(long number,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public TestUnit findByTestUnitNumber_First(long number,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Returns the first test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchByTestUnitNumber_First(long number,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns the last test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public TestUnit findByTestUnitNumber_Last(long number,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Returns the last test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchByTestUnitNumber_Last(long number,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns the test units before and after the current test unit in the ordered set where number = &#63;.
	*
	* @param testUnitId the primary key of the current test unit
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public TestUnit[] findByTestUnitNumber_PrevAndNext(long testUnitId,
		long number,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Removes all the test units where number = &#63; from the database.
	*
	* @param number the number
	*/
	public void removeByTestUnitNumber(long number);

	/**
	* Returns the number of test units where number = &#63;.
	*
	* @param number the number
	* @return the number of matching test units
	*/
	public int countByTestUnitNumber(long number);

	/**
	* Returns all the test units where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @return the matching test units
	*/
	public java.util.List<TestUnit> findBySpecializationId(
		long specializationId);

	/**
	* Returns a range of all the test units where specializationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specializationId the specialization ID
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @return the range of matching test units
	*/
	public java.util.List<TestUnit> findBySpecializationId(
		long specializationId, int start, int end);

	/**
	* Returns an ordered range of all the test units where specializationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specializationId the specialization ID
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test units
	*/
	public java.util.List<TestUnit> findBySpecializationId(
		long specializationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns an ordered range of all the test units where specializationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specializationId the specialization ID
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test units
	*/
	public java.util.List<TestUnit> findBySpecializationId(
		long specializationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public TestUnit findBySpecializationId_First(long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Returns the first test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchBySpecializationId_First(long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns the last test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public TestUnit findBySpecializationId_Last(long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Returns the last test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchBySpecializationId_Last(long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns the test units before and after the current test unit in the ordered set where specializationId = &#63;.
	*
	* @param testUnitId the primary key of the current test unit
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public TestUnit[] findBySpecializationId_PrevAndNext(long testUnitId,
		long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Removes all the test units where specializationId = &#63; from the database.
	*
	* @param specializationId the specialization ID
	*/
	public void removeBySpecializationId(long specializationId);

	/**
	* Returns the number of test units where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @return the number of matching test units
	*/
	public int countBySpecializationId(long specializationId);

	/**
	* Returns the test unit where number = &#63; and specializationId = &#63; or throws a {@link NoSuchTestUnitException} if it could not be found.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public TestUnit findByTestUnitNumberAndSpecializationId(long number,
		long specializationId) throws NoSuchTestUnitException;

	/**
	* Returns the test unit where number = &#63; and specializationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchByTestUnitNumberAndSpecializationId(long number,
		long specializationId);

	/**
	* Returns the test unit where number = &#63; and specializationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchByTestUnitNumberAndSpecializationId(long number,
		long specializationId, boolean retrieveFromCache);

	/**
	* Removes the test unit where number = &#63; and specializationId = &#63; from the database.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the test unit that was removed
	*/
	public TestUnit removeByTestUnitNumberAndSpecializationId(long number,
		long specializationId) throws NoSuchTestUnitException;

	/**
	* Returns the number of test units where number = &#63; and specializationId = &#63;.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the number of matching test units
	*/
	public int countByTestUnitNumberAndSpecializationId(long number,
		long specializationId);

	/**
	* Returns all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @return the matching test units
	*/
	public java.util.List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId);

	/**
	* Returns a range of all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @return the range of matching test units
	*/
	public java.util.List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end);

	/**
	* Returns an ordered range of all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test units
	*/
	public java.util.List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns an ordered range of all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test units
	*/
	public java.util.List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public TestUnit findByIsActualAndModifiedDateAndSpecializationId_First(
		boolean isActual, Date modifiedDate, long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Returns the first test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchByIsActualAndModifiedDateAndSpecializationId_First(
		boolean isActual, Date modifiedDate, long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns the last test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public TestUnit findByIsActualAndModifiedDateAndSpecializationId_Last(
		boolean isActual, Date modifiedDate, long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Returns the last test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public TestUnit fetchByIsActualAndModifiedDateAndSpecializationId_Last(
		boolean isActual, Date modifiedDate, long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns the test units before and after the current test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param testUnitId the primary key of the current test unit
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public TestUnit[] findByIsActualAndModifiedDateAndSpecializationId_PrevAndNext(
		long testUnitId, boolean isActual, Date modifiedDate,
		long specializationId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException;

	/**
	* Removes all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63; from the database.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	*/
	public void removeByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId);

	/**
	* Returns the number of test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @return the number of matching test units
	*/
	public int countByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId);

	/**
	* Caches the test unit in the entity cache if it is enabled.
	*
	* @param testUnit the test unit
	*/
	public void cacheResult(TestUnit testUnit);

	/**
	* Caches the test units in the entity cache if it is enabled.
	*
	* @param testUnits the test units
	*/
	public void cacheResult(java.util.List<TestUnit> testUnits);

	/**
	* Creates a new test unit with the primary key. Does not add the test unit to the database.
	*
	* @param testUnitId the primary key for the new test unit
	* @return the new test unit
	*/
	public TestUnit create(long testUnitId);

	/**
	* Removes the test unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit that was removed
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public TestUnit remove(long testUnitId) throws NoSuchTestUnitException;

	public TestUnit updateImpl(TestUnit testUnit);

	/**
	* Returns the test unit with the primary key or throws a {@link NoSuchTestUnitException} if it could not be found.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public TestUnit findByPrimaryKey(long testUnitId)
		throws NoSuchTestUnitException;

	/**
	* Returns the test unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit, or <code>null</code> if a test unit with the primary key could not be found
	*/
	public TestUnit fetchByPrimaryKey(long testUnitId);

	@Override
	public java.util.Map<java.io.Serializable, TestUnit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test units.
	*
	* @return the test units
	*/
	public java.util.List<TestUnit> findAll();

	/**
	* Returns a range of all the test units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @return the range of test units
	*/
	public java.util.List<TestUnit> findAll(int start, int end);

	/**
	* Returns an ordered range of all the test units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test units
	*/
	public java.util.List<TestUnit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator);

	/**
	* Returns an ordered range of all the test units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test units
	*/
	public java.util.List<TestUnit> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test units from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test units.
	*
	* @return the number of test units
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}