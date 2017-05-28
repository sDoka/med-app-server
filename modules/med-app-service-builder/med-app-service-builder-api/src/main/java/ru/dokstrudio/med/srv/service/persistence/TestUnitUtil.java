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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import ru.dokstrudio.med.srv.model.TestUnit;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the test unit service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.TestUnitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitPersistenceImpl
 * @generated
 */
@ProviderType
public class TestUnitUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(TestUnit testUnit) {
		getPersistence().clearCache(testUnit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TestUnit> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestUnit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestUnit update(TestUnit testUnit) {
		return getPersistence().update(testUnit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestUnit update(TestUnit testUnit,
		ServiceContext serviceContext) {
		return getPersistence().update(testUnit, serviceContext);
	}

	/**
	* Returns all the test units where number = &#63;.
	*
	* @param number the number
	* @return the matching test units
	*/
	public static List<TestUnit> findByTestUnitNumber(long number) {
		return getPersistence().findByTestUnitNumber(number);
	}

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
	public static List<TestUnit> findByTestUnitNumber(long number, int start,
		int end) {
		return getPersistence().findByTestUnitNumber(number, start, end);
	}

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
	public static List<TestUnit> findByTestUnitNumber(long number, int start,
		int end, OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .findByTestUnitNumber(number, start, end, orderByComparator);
	}

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
	public static List<TestUnit> findByTestUnitNumber(long number, int start,
		int end, OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTestUnitNumber(number, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public static TestUnit findByTestUnitNumber_First(long number,
		OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findByTestUnitNumber_First(number, orderByComparator);
	}

	/**
	* Returns the first test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchByTestUnitNumber_First(long number,
		OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .fetchByTestUnitNumber_First(number, orderByComparator);
	}

	/**
	* Returns the last test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public static TestUnit findByTestUnitNumber_Last(long number,
		OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findByTestUnitNumber_Last(number, orderByComparator);
	}

	/**
	* Returns the last test unit in the ordered set where number = &#63;.
	*
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchByTestUnitNumber_Last(long number,
		OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .fetchByTestUnitNumber_Last(number, orderByComparator);
	}

	/**
	* Returns the test units before and after the current test unit in the ordered set where number = &#63;.
	*
	* @param testUnitId the primary key of the current test unit
	* @param number the number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public static TestUnit[] findByTestUnitNumber_PrevAndNext(long testUnitId,
		long number, OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findByTestUnitNumber_PrevAndNext(testUnitId, number,
			orderByComparator);
	}

	/**
	* Removes all the test units where number = &#63; from the database.
	*
	* @param number the number
	*/
	public static void removeByTestUnitNumber(long number) {
		getPersistence().removeByTestUnitNumber(number);
	}

	/**
	* Returns the number of test units where number = &#63;.
	*
	* @param number the number
	* @return the number of matching test units
	*/
	public static int countByTestUnitNumber(long number) {
		return getPersistence().countByTestUnitNumber(number);
	}

	/**
	* Returns all the test units where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @return the matching test units
	*/
	public static List<TestUnit> findBySpecializationId(long specializationId) {
		return getPersistence().findBySpecializationId(specializationId);
	}

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
	public static List<TestUnit> findBySpecializationId(long specializationId,
		int start, int end) {
		return getPersistence()
				   .findBySpecializationId(specializationId, start, end);
	}

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
	public static List<TestUnit> findBySpecializationId(long specializationId,
		int start, int end, OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .findBySpecializationId(specializationId, start, end,
			orderByComparator);
	}

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
	public static List<TestUnit> findBySpecializationId(long specializationId,
		int start, int end, OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySpecializationId(specializationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public static TestUnit findBySpecializationId_First(long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findBySpecializationId_First(specializationId,
			orderByComparator);
	}

	/**
	* Returns the first test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchBySpecializationId_First(
		long specializationId, OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .fetchBySpecializationId_First(specializationId,
			orderByComparator);
	}

	/**
	* Returns the last test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public static TestUnit findBySpecializationId_Last(long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findBySpecializationId_Last(specializationId,
			orderByComparator);
	}

	/**
	* Returns the last test unit in the ordered set where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchBySpecializationId_Last(long specializationId,
		OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .fetchBySpecializationId_Last(specializationId,
			orderByComparator);
	}

	/**
	* Returns the test units before and after the current test unit in the ordered set where specializationId = &#63;.
	*
	* @param testUnitId the primary key of the current test unit
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public static TestUnit[] findBySpecializationId_PrevAndNext(
		long testUnitId, long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findBySpecializationId_PrevAndNext(testUnitId,
			specializationId, orderByComparator);
	}

	/**
	* Removes all the test units where specializationId = &#63; from the database.
	*
	* @param specializationId the specialization ID
	*/
	public static void removeBySpecializationId(long specializationId) {
		getPersistence().removeBySpecializationId(specializationId);
	}

	/**
	* Returns the number of test units where specializationId = &#63;.
	*
	* @param specializationId the specialization ID
	* @return the number of matching test units
	*/
	public static int countBySpecializationId(long specializationId) {
		return getPersistence().countBySpecializationId(specializationId);
	}

	/**
	* Returns the test unit where number = &#63; and specializationId = &#63; or throws a {@link NoSuchTestUnitException} if it could not be found.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the matching test unit
	* @throws NoSuchTestUnitException if a matching test unit could not be found
	*/
	public static TestUnit findByTestUnitNumberAndSpecializationId(
		long number, long specializationId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findByTestUnitNumberAndSpecializationId(number,
			specializationId);
	}

	/**
	* Returns the test unit where number = &#63; and specializationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchByTestUnitNumberAndSpecializationId(
		long number, long specializationId) {
		return getPersistence()
				   .fetchByTestUnitNumberAndSpecializationId(number,
			specializationId);
	}

	/**
	* Returns the test unit where number = &#63; and specializationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchByTestUnitNumberAndSpecializationId(
		long number, long specializationId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByTestUnitNumberAndSpecializationId(number,
			specializationId, retrieveFromCache);
	}

	/**
	* Removes the test unit where number = &#63; and specializationId = &#63; from the database.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the test unit that was removed
	*/
	public static TestUnit removeByTestUnitNumberAndSpecializationId(
		long number, long specializationId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .removeByTestUnitNumberAndSpecializationId(number,
			specializationId);
	}

	/**
	* Returns the number of test units where number = &#63; and specializationId = &#63;.
	*
	* @param number the number
	* @param specializationId the specialization ID
	* @return the number of matching test units
	*/
	public static int countByTestUnitNumberAndSpecializationId(long number,
		long specializationId) {
		return getPersistence()
				   .countByTestUnitNumberAndSpecializationId(number,
			specializationId);
	}

	/**
	* Returns all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @return the matching test units
	*/
	public static List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId) {
		return getPersistence()
				   .findByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId);
	}

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
	public static List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end) {
		return getPersistence()
				   .findByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId, start, end);
	}

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
	public static List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end, OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .findByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId, start, end, orderByComparator);
	}

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
	public static List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end, OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId, start, end, orderByComparator,
			retrieveFromCache);
	}

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
	public static TestUnit findByIsActualAndModifiedDateAndSpecializationId_First(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findByIsActualAndModifiedDateAndSpecializationId_First(isActual,
			modifiedDate, specializationId, orderByComparator);
	}

	/**
	* Returns the first test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchByIsActualAndModifiedDateAndSpecializationId_First(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .fetchByIsActualAndModifiedDateAndSpecializationId_First(isActual,
			modifiedDate, specializationId, orderByComparator);
	}

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
	public static TestUnit findByIsActualAndModifiedDateAndSpecializationId_Last(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findByIsActualAndModifiedDateAndSpecializationId_Last(isActual,
			modifiedDate, specializationId, orderByComparator);
	}

	/**
	* Returns the last test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	*/
	public static TestUnit fetchByIsActualAndModifiedDateAndSpecializationId_Last(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence()
				   .fetchByIsActualAndModifiedDateAndSpecializationId_Last(isActual,
			modifiedDate, specializationId, orderByComparator);
	}

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
	public static TestUnit[] findByIsActualAndModifiedDateAndSpecializationId_PrevAndNext(
		long testUnitId, boolean isActual, Date modifiedDate,
		long specializationId, OrderByComparator<TestUnit> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence()
				   .findByIsActualAndModifiedDateAndSpecializationId_PrevAndNext(testUnitId,
			isActual, modifiedDate, specializationId, orderByComparator);
	}

	/**
	* Removes all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63; from the database.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	*/
	public static void removeByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId) {
		getPersistence()
			.removeByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId);
	}

	/**
	* Returns the number of test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	*
	* @param isActual the is actual
	* @param modifiedDate the modified date
	* @param specializationId the specialization ID
	* @return the number of matching test units
	*/
	public static int countByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId) {
		return getPersistence()
				   .countByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId);
	}

	/**
	* Caches the test unit in the entity cache if it is enabled.
	*
	* @param testUnit the test unit
	*/
	public static void cacheResult(TestUnit testUnit) {
		getPersistence().cacheResult(testUnit);
	}

	/**
	* Caches the test units in the entity cache if it is enabled.
	*
	* @param testUnits the test units
	*/
	public static void cacheResult(List<TestUnit> testUnits) {
		getPersistence().cacheResult(testUnits);
	}

	/**
	* Creates a new test unit with the primary key. Does not add the test unit to the database.
	*
	* @param testUnitId the primary key for the new test unit
	* @return the new test unit
	*/
	public static TestUnit create(long testUnitId) {
		return getPersistence().create(testUnitId);
	}

	/**
	* Removes the test unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit that was removed
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public static TestUnit remove(long testUnitId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence().remove(testUnitId);
	}

	public static TestUnit updateImpl(TestUnit testUnit) {
		return getPersistence().updateImpl(testUnit);
	}

	/**
	* Returns the test unit with the primary key or throws a {@link NoSuchTestUnitException} if it could not be found.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit
	* @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	*/
	public static TestUnit findByPrimaryKey(long testUnitId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return getPersistence().findByPrimaryKey(testUnitId);
	}

	/**
	* Returns the test unit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit, or <code>null</code> if a test unit with the primary key could not be found
	*/
	public static TestUnit fetchByPrimaryKey(long testUnitId) {
		return getPersistence().fetchByPrimaryKey(testUnitId);
	}

	public static java.util.Map<java.io.Serializable, TestUnit> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test units.
	*
	* @return the test units
	*/
	public static List<TestUnit> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<TestUnit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<TestUnit> findAll(int start, int end,
		OrderByComparator<TestUnit> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<TestUnit> findAll(int start, int end,
		OrderByComparator<TestUnit> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test units from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test units.
	*
	* @return the number of test units
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TestUnitPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestUnitPersistence, TestUnitPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestUnitPersistence.class);
}