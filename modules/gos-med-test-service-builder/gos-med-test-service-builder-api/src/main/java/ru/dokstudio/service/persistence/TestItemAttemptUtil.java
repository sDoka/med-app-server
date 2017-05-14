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

package ru.dokstudio.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import ru.dokstudio.model.TestItemAttempt;

import java.util.List;

/**
 * The persistence utility for the test item attempt service. This utility wraps {@link ru.dokstudio.service.persistence.impl.TestItemAttemptPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAttemptPersistence
 * @see ru.dokstudio.service.persistence.impl.TestItemAttemptPersistenceImpl
 * @generated
 */
@ProviderType
public class TestItemAttemptUtil {
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
	public static void clearCache(TestItemAttempt testItemAttempt) {
		getPersistence().clearCache(testItemAttempt);
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
	public static List<TestItemAttempt> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestItemAttempt> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestItemAttempt> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestItemAttempt update(TestItemAttempt testItemAttempt) {
		return getPersistence().update(testItemAttempt);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestItemAttempt update(TestItemAttempt testItemAttempt,
		ServiceContext serviceContext) {
		return getPersistence().update(testItemAttempt, serviceContext);
	}

	/**
	* Returns all the test item attempts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test item attempts
	*/
	public static List<TestItemAttempt> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the test item attempts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @return the range of matching test item attempts
	*/
	public static List<TestItemAttempt> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the test item attempts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test item attempts
	*/
	public static List<TestItemAttempt> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item attempts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test item attempts
	*/
	public static List<TestItemAttempt> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public static TestItemAttempt findByUuid_First(java.lang.String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public static TestItemAttempt fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public static TestItemAttempt findByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public static TestItemAttempt fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the test item attempts before and after the current test item attempt in the ordered set where uuid = &#63;.
	*
	* @param attemptId the primary key of the current test item attempt
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item attempt
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public static TestItemAttempt[] findByUuid_PrevAndNext(long attemptId,
		java.lang.String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence()
				   .findByUuid_PrevAndNext(attemptId, uuid, orderByComparator);
	}

	/**
	* Removes all the test item attempts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of test item attempts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test item attempts
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the test item attempts where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the matching test item attempts
	*/
	public static List<TestItemAttempt> findByQuestion(long questionId) {
		return getPersistence().findByQuestion(questionId);
	}

	/**
	* Returns a range of all the test item attempts where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @return the range of matching test item attempts
	*/
	public static List<TestItemAttempt> findByQuestion(long questionId,
		int start, int end) {
		return getPersistence().findByQuestion(questionId, start, end);
	}

	/**
	* Returns an ordered range of all the test item attempts where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test item attempts
	*/
	public static List<TestItemAttempt> findByQuestion(long questionId,
		int start, int end, OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence()
				   .findByQuestion(questionId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item attempts where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test item attempts
	*/
	public static List<TestItemAttempt> findByQuestion(long questionId,
		int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByQuestion(questionId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public static TestItemAttempt findByQuestion_First(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence()
				   .findByQuestion_First(questionId, orderByComparator);
	}

	/**
	* Returns the first test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public static TestItemAttempt fetchByQuestion_First(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence()
				   .fetchByQuestion_First(questionId, orderByComparator);
	}

	/**
	* Returns the last test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public static TestItemAttempt findByQuestion_Last(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence()
				   .findByQuestion_Last(questionId, orderByComparator);
	}

	/**
	* Returns the last test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public static TestItemAttempt fetchByQuestion_Last(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence()
				   .fetchByQuestion_Last(questionId, orderByComparator);
	}

	/**
	* Returns the test item attempts before and after the current test item attempt in the ordered set where questionId = &#63;.
	*
	* @param attemptId the primary key of the current test item attempt
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item attempt
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public static TestItemAttempt[] findByQuestion_PrevAndNext(long attemptId,
		long questionId, OrderByComparator<TestItemAttempt> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence()
				   .findByQuestion_PrevAndNext(attemptId, questionId,
			orderByComparator);
	}

	/**
	* Removes all the test item attempts where questionId = &#63; from the database.
	*
	* @param questionId the question ID
	*/
	public static void removeByQuestion(long questionId) {
		getPersistence().removeByQuestion(questionId);
	}

	/**
	* Returns the number of test item attempts where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the number of matching test item attempts
	*/
	public static int countByQuestion(long questionId) {
		return getPersistence().countByQuestion(questionId);
	}

	/**
	* Caches the test item attempt in the entity cache if it is enabled.
	*
	* @param testItemAttempt the test item attempt
	*/
	public static void cacheResult(TestItemAttempt testItemAttempt) {
		getPersistence().cacheResult(testItemAttempt);
	}

	/**
	* Caches the test item attempts in the entity cache if it is enabled.
	*
	* @param testItemAttempts the test item attempts
	*/
	public static void cacheResult(List<TestItemAttempt> testItemAttempts) {
		getPersistence().cacheResult(testItemAttempts);
	}

	/**
	* Creates a new test item attempt with the primary key. Does not add the test item attempt to the database.
	*
	* @param attemptId the primary key for the new test item attempt
	* @return the new test item attempt
	*/
	public static TestItemAttempt create(long attemptId) {
		return getPersistence().create(attemptId);
	}

	/**
	* Removes the test item attempt with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt that was removed
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public static TestItemAttempt remove(long attemptId)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence().remove(attemptId);
	}

	public static TestItemAttempt updateImpl(TestItemAttempt testItemAttempt) {
		return getPersistence().updateImpl(testItemAttempt);
	}

	/**
	* Returns the test item attempt with the primary key or throws a {@link NoSuchTestItemAttemptException} if it could not be found.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public static TestItemAttempt findByPrimaryKey(long attemptId)
		throws ru.dokstudio.exception.NoSuchTestItemAttemptException {
		return getPersistence().findByPrimaryKey(attemptId);
	}

	/**
	* Returns the test item attempt with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt, or <code>null</code> if a test item attempt with the primary key could not be found
	*/
	public static TestItemAttempt fetchByPrimaryKey(long attemptId) {
		return getPersistence().fetchByPrimaryKey(attemptId);
	}

	public static java.util.Map<java.io.Serializable, TestItemAttempt> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test item attempts.
	*
	* @return the test item attempts
	*/
	public static List<TestItemAttempt> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test item attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @return the range of test item attempts
	*/
	public static List<TestItemAttempt> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test item attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test item attempts
	*/
	public static List<TestItemAttempt> findAll(int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test item attempts
	*/
	public static List<TestItemAttempt> findAll(int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test item attempts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test item attempts.
	*
	* @return the number of test item attempts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TestItemAttemptPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestItemAttemptPersistence, TestItemAttemptPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestItemAttemptPersistence.class);
}