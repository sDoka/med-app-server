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

import ru.dokstudio.model.TestItemQuestion;

import java.util.List;

/**
 * The persistence utility for the test item question service. This utility wraps {@link ru.dokstudio.service.persistence.impl.TestItemQuestionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemQuestionPersistence
 * @see ru.dokstudio.service.persistence.impl.TestItemQuestionPersistenceImpl
 * @generated
 */
@ProviderType
public class TestItemQuestionUtil {
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
	public static void clearCache(TestItemQuestion testItemQuestion) {
		getPersistence().clearCache(testItemQuestion);
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
	public static List<TestItemQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestItemQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestItemQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestItemQuestion update(TestItemQuestion testItemQuestion) {
		return getPersistence().update(testItemQuestion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestItemQuestion update(TestItemQuestion testItemQuestion,
		ServiceContext serviceContext) {
		return getPersistence().update(testItemQuestion, serviceContext);
	}

	/**
	* Returns all the test item questions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test item questions
	*/
	public static List<TestItemQuestion> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the test item questions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item questions
	* @param end the upper bound of the range of test item questions (not inclusive)
	* @return the range of matching test item questions
	*/
	public static List<TestItemQuestion> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the test item questions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item questions
	* @param end the upper bound of the range of test item questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test item questions
	*/
	public static List<TestItemQuestion> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item questions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item questions
	* @param end the upper bound of the range of test item questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test item questions
	*/
	public static List<TestItemQuestion> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item question
	* @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	*/
	public static TestItemQuestion findByUuid_First(java.lang.String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemQuestionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public static TestItemQuestion fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item question
	* @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	*/
	public static TestItemQuestion findByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemQuestionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public static TestItemQuestion fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the test item questions before and after the current test item question in the ordered set where uuid = &#63;.
	*
	* @param questionId the primary key of the current test item question
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item question
	* @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	*/
	public static TestItemQuestion[] findByUuid_PrevAndNext(long questionId,
		java.lang.String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemQuestionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(questionId, uuid, orderByComparator);
	}

	/**
	* Removes all the test item questions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of test item questions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test item questions
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the test item question where questionNumber = &#63; or throws a {@link NoSuchTestItemQuestionException} if it could not be found.
	*
	* @param questionNumber the question number
	* @return the matching test item question
	* @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	*/
	public static TestItemQuestion findByQuestionNumber(long questionNumber)
		throws ru.dokstudio.exception.NoSuchTestItemQuestionException {
		return getPersistence().findByQuestionNumber(questionNumber);
	}

	/**
	* Returns the test item question where questionNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param questionNumber the question number
	* @return the matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public static TestItemQuestion fetchByQuestionNumber(long questionNumber) {
		return getPersistence().fetchByQuestionNumber(questionNumber);
	}

	/**
	* Returns the test item question where questionNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param questionNumber the question number
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public static TestItemQuestion fetchByQuestionNumber(long questionNumber,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByQuestionNumber(questionNumber, retrieveFromCache);
	}

	/**
	* Removes the test item question where questionNumber = &#63; from the database.
	*
	* @param questionNumber the question number
	* @return the test item question that was removed
	*/
	public static TestItemQuestion removeByQuestionNumber(long questionNumber)
		throws ru.dokstudio.exception.NoSuchTestItemQuestionException {
		return getPersistence().removeByQuestionNumber(questionNumber);
	}

	/**
	* Returns the number of test item questions where questionNumber = &#63;.
	*
	* @param questionNumber the question number
	* @return the number of matching test item questions
	*/
	public static int countByQuestionNumber(long questionNumber) {
		return getPersistence().countByQuestionNumber(questionNumber);
	}

	/**
	* Caches the test item question in the entity cache if it is enabled.
	*
	* @param testItemQuestion the test item question
	*/
	public static void cacheResult(TestItemQuestion testItemQuestion) {
		getPersistence().cacheResult(testItemQuestion);
	}

	/**
	* Caches the test item questions in the entity cache if it is enabled.
	*
	* @param testItemQuestions the test item questions
	*/
	public static void cacheResult(List<TestItemQuestion> testItemQuestions) {
		getPersistence().cacheResult(testItemQuestions);
	}

	/**
	* Creates a new test item question with the primary key. Does not add the test item question to the database.
	*
	* @param questionId the primary key for the new test item question
	* @return the new test item question
	*/
	public static TestItemQuestion create(long questionId) {
		return getPersistence().create(questionId);
	}

	/**
	* Removes the test item question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question that was removed
	* @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	*/
	public static TestItemQuestion remove(long questionId)
		throws ru.dokstudio.exception.NoSuchTestItemQuestionException {
		return getPersistence().remove(questionId);
	}

	public static TestItemQuestion updateImpl(TestItemQuestion testItemQuestion) {
		return getPersistence().updateImpl(testItemQuestion);
	}

	/**
	* Returns the test item question with the primary key or throws a {@link NoSuchTestItemQuestionException} if it could not be found.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question
	* @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	*/
	public static TestItemQuestion findByPrimaryKey(long questionId)
		throws ru.dokstudio.exception.NoSuchTestItemQuestionException {
		return getPersistence().findByPrimaryKey(questionId);
	}

	/**
	* Returns the test item question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question, or <code>null</code> if a test item question with the primary key could not be found
	*/
	public static TestItemQuestion fetchByPrimaryKey(long questionId) {
		return getPersistence().fetchByPrimaryKey(questionId);
	}

	public static java.util.Map<java.io.Serializable, TestItemQuestion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test item questions.
	*
	* @return the test item questions
	*/
	public static List<TestItemQuestion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test item questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item questions
	* @param end the upper bound of the range of test item questions (not inclusive)
	* @return the range of test item questions
	*/
	public static List<TestItemQuestion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test item questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item questions
	* @param end the upper bound of the range of test item questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test item questions
	*/
	public static List<TestItemQuestion> findAll(int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item questions
	* @param end the upper bound of the range of test item questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test item questions
	*/
	public static List<TestItemQuestion> findAll(int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test item questions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test item questions.
	*
	* @return the number of test item questions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TestItemQuestionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestItemQuestionPersistence, TestItemQuestionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestItemQuestionPersistence.class);
}