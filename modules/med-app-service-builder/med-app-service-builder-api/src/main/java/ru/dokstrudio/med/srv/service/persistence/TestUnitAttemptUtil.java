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

import ru.dokstrudio.med.srv.model.TestUnitAttempt;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the test unit attempt service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.TestUnitAttemptPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAttemptPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitAttemptPersistenceImpl
 * @generated
 */
@ProviderType
public class TestUnitAttemptUtil {
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
	public static void clearCache(TestUnitAttempt testUnitAttempt) {
		getPersistence().clearCache(testUnitAttempt);
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
	public static List<TestUnitAttempt> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestUnitAttempt> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestUnitAttempt> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestUnitAttempt update(TestUnitAttempt testUnitAttempt) {
		return getPersistence().update(testUnitAttempt);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestUnitAttempt update(TestUnitAttempt testUnitAttempt,
		ServiceContext serviceContext) {
		return getPersistence().update(testUnitAttempt, serviceContext);
	}

	/**
	* Returns all the test unit attempts where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @return the matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByTestUnitId(long testUnitAnswerId) {
		return getPersistence().findByTestUnitId(testUnitAnswerId);
	}

	/**
	* Returns a range of all the test unit attempts where testUnitAnswerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @return the range of matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByTestUnitId(
		long testUnitAnswerId, int start, int end) {
		return getPersistence().findByTestUnitId(testUnitAnswerId, start, end);
	}

	/**
	* Returns an ordered range of all the test unit attempts where testUnitAnswerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByTestUnitId(
		long testUnitAnswerId, int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence()
				   .findByTestUnitId(testUnitAnswerId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the test unit attempts where testUnitAnswerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByTestUnitId(
		long testUnitAnswerId, int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTestUnitId(testUnitAnswerId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit attempt
	* @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt findByTestUnitId_First(
		long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence()
				   .findByTestUnitId_First(testUnitAnswerId, orderByComparator);
	}

	/**
	* Returns the first test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt fetchByTestUnitId_First(
		long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence()
				   .fetchByTestUnitId_First(testUnitAnswerId, orderByComparator);
	}

	/**
	* Returns the last test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit attempt
	* @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt findByTestUnitId_Last(long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence()
				   .findByTestUnitId_Last(testUnitAnswerId, orderByComparator);
	}

	/**
	* Returns the last test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt fetchByTestUnitId_Last(
		long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence()
				   .fetchByTestUnitId_Last(testUnitAnswerId, orderByComparator);
	}

	/**
	* Returns the test unit attempts before and after the current test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAttemptId the primary key of the current test unit attempt
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit attempt
	* @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	*/
	public static TestUnitAttempt[] findByTestUnitId_PrevAndNext(
		long testUnitAttemptId, long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence()
				   .findByTestUnitId_PrevAndNext(testUnitAttemptId,
			testUnitAnswerId, orderByComparator);
	}

	/**
	* Removes all the test unit attempts where testUnitAnswerId = &#63; from the database.
	*
	* @param testUnitAnswerId the test unit answer ID
	*/
	public static void removeByTestUnitId(long testUnitAnswerId) {
		getPersistence().removeByTestUnitId(testUnitAnswerId);
	}

	/**
	* Returns the number of test unit attempts where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @return the number of matching test unit attempts
	*/
	public static int countByTestUnitId(long testUnitAnswerId) {
		return getPersistence().countByTestUnitId(testUnitAnswerId);
	}

	/**
	* Returns all the test unit attempts where userId = &#63; and submitTime &ge; &#63;.
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @return the matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByUserIdAndSubmitTime(long userId,
		Date submitTime) {
		return getPersistence().findByUserIdAndSubmitTime(userId, submitTime);
	}

	/**
	* Returns a range of all the test unit attempts where userId = &#63; and submitTime &ge; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @return the range of matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByUserIdAndSubmitTime(long userId,
		Date submitTime, int start, int end) {
		return getPersistence()
				   .findByUserIdAndSubmitTime(userId, submitTime, start, end);
	}

	/**
	* Returns an ordered range of all the test unit attempts where userId = &#63; and submitTime &ge; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByUserIdAndSubmitTime(long userId,
		Date submitTime, int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence()
				   .findByUserIdAndSubmitTime(userId, submitTime, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the test unit attempts where userId = &#63; and submitTime &ge; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test unit attempts
	*/
	public static List<TestUnitAttempt> findByUserIdAndSubmitTime(long userId,
		Date submitTime, int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserIdAndSubmitTime(userId, submitTime, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first test unit attempt in the ordered set where userId = &#63; and submitTime &ge; &#63;.
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit attempt
	* @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt findByUserIdAndSubmitTime_First(long userId,
		Date submitTime, OrderByComparator<TestUnitAttempt> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence()
				   .findByUserIdAndSubmitTime_First(userId, submitTime,
			orderByComparator);
	}

	/**
	* Returns the first test unit attempt in the ordered set where userId = &#63; and submitTime &ge; &#63;.
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt fetchByUserIdAndSubmitTime_First(
		long userId, Date submitTime,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence()
				   .fetchByUserIdAndSubmitTime_First(userId, submitTime,
			orderByComparator);
	}

	/**
	* Returns the last test unit attempt in the ordered set where userId = &#63; and submitTime &ge; &#63;.
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit attempt
	* @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt findByUserIdAndSubmitTime_Last(long userId,
		Date submitTime, OrderByComparator<TestUnitAttempt> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence()
				   .findByUserIdAndSubmitTime_Last(userId, submitTime,
			orderByComparator);
	}

	/**
	* Returns the last test unit attempt in the ordered set where userId = &#63; and submitTime &ge; &#63;.
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	*/
	public static TestUnitAttempt fetchByUserIdAndSubmitTime_Last(long userId,
		Date submitTime, OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence()
				   .fetchByUserIdAndSubmitTime_Last(userId, submitTime,
			orderByComparator);
	}

	/**
	* Returns the test unit attempts before and after the current test unit attempt in the ordered set where userId = &#63; and submitTime &ge; &#63;.
	*
	* @param testUnitAttemptId the primary key of the current test unit attempt
	* @param userId the user ID
	* @param submitTime the submit time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit attempt
	* @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	*/
	public static TestUnitAttempt[] findByUserIdAndSubmitTime_PrevAndNext(
		long testUnitAttemptId, long userId, Date submitTime,
		OrderByComparator<TestUnitAttempt> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence()
				   .findByUserIdAndSubmitTime_PrevAndNext(testUnitAttemptId,
			userId, submitTime, orderByComparator);
	}

	/**
	* Removes all the test unit attempts where userId = &#63; and submitTime &ge; &#63; from the database.
	*
	* @param userId the user ID
	* @param submitTime the submit time
	*/
	public static void removeByUserIdAndSubmitTime(long userId, Date submitTime) {
		getPersistence().removeByUserIdAndSubmitTime(userId, submitTime);
	}

	/**
	* Returns the number of test unit attempts where userId = &#63; and submitTime &ge; &#63;.
	*
	* @param userId the user ID
	* @param submitTime the submit time
	* @return the number of matching test unit attempts
	*/
	public static int countByUserIdAndSubmitTime(long userId, Date submitTime) {
		return getPersistence().countByUserIdAndSubmitTime(userId, submitTime);
	}

	/**
	* Caches the test unit attempt in the entity cache if it is enabled.
	*
	* @param testUnitAttempt the test unit attempt
	*/
	public static void cacheResult(TestUnitAttempt testUnitAttempt) {
		getPersistence().cacheResult(testUnitAttempt);
	}

	/**
	* Caches the test unit attempts in the entity cache if it is enabled.
	*
	* @param testUnitAttempts the test unit attempts
	*/
	public static void cacheResult(List<TestUnitAttempt> testUnitAttempts) {
		getPersistence().cacheResult(testUnitAttempts);
	}

	/**
	* Creates a new test unit attempt with the primary key. Does not add the test unit attempt to the database.
	*
	* @param testUnitAttemptId the primary key for the new test unit attempt
	* @return the new test unit attempt
	*/
	public static TestUnitAttempt create(long testUnitAttemptId) {
		return getPersistence().create(testUnitAttemptId);
	}

	/**
	* Removes the test unit attempt with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt that was removed
	* @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	*/
	public static TestUnitAttempt remove(long testUnitAttemptId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence().remove(testUnitAttemptId);
	}

	public static TestUnitAttempt updateImpl(TestUnitAttempt testUnitAttempt) {
		return getPersistence().updateImpl(testUnitAttempt);
	}

	/**
	* Returns the test unit attempt with the primary key or throws a {@link NoSuchTestUnitAttemptException} if it could not be found.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt
	* @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	*/
	public static TestUnitAttempt findByPrimaryKey(long testUnitAttemptId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException {
		return getPersistence().findByPrimaryKey(testUnitAttemptId);
	}

	/**
	* Returns the test unit attempt with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt, or <code>null</code> if a test unit attempt with the primary key could not be found
	*/
	public static TestUnitAttempt fetchByPrimaryKey(long testUnitAttemptId) {
		return getPersistence().fetchByPrimaryKey(testUnitAttemptId);
	}

	public static java.util.Map<java.io.Serializable, TestUnitAttempt> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test unit attempts.
	*
	* @return the test unit attempts
	*/
	public static List<TestUnitAttempt> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test unit attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @return the range of test unit attempts
	*/
	public static List<TestUnitAttempt> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test unit attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test unit attempts
	*/
	public static List<TestUnitAttempt> findAll(int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test unit attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test unit attempts
	*/
	public static List<TestUnitAttempt> findAll(int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test unit attempts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test unit attempts.
	*
	* @return the number of test unit attempts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TestUnitAttemptPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestUnitAttemptPersistence, TestUnitAttemptPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestUnitAttemptPersistence.class);
}