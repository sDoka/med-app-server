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

import ru.dokstudio.model.TestItemAnswer;

import java.util.List;

/**
 * The persistence utility for the test item answer service. This utility wraps {@link ru.dokstudio.service.persistence.impl.TestItemAnswerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAnswerPersistence
 * @see ru.dokstudio.service.persistence.impl.TestItemAnswerPersistenceImpl
 * @generated
 */
@ProviderType
public class TestItemAnswerUtil {
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
	public static void clearCache(TestItemAnswer testItemAnswer) {
		getPersistence().clearCache(testItemAnswer);
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
	public static List<TestItemAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestItemAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestItemAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestItemAnswer update(TestItemAnswer testItemAnswer) {
		return getPersistence().update(testItemAnswer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestItemAnswer update(TestItemAnswer testItemAnswer,
		ServiceContext serviceContext) {
		return getPersistence().update(testItemAnswer, serviceContext);
	}

	/**
	* Returns all the test item answers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test item answers
	*/
	public static List<TestItemAnswer> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the test item answers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @return the range of matching test item answers
	*/
	public static List<TestItemAnswer> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the test item answers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test item answers
	*/
	public static List<TestItemAnswer> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item answers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test item answers
	*/
	public static List<TestItemAnswer> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public static TestItemAnswer findByUuid_First(java.lang.String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public static TestItemAnswer fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public static TestItemAnswer findByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public static TestItemAnswer fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the test item answers before and after the current test item answer in the ordered set where uuid = &#63;.
	*
	* @param answerId the primary key of the current test item answer
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item answer
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public static TestItemAnswer[] findByUuid_PrevAndNext(long answerId,
		java.lang.String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence()
				   .findByUuid_PrevAndNext(answerId, uuid, orderByComparator);
	}

	/**
	* Removes all the test item answers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of test item answers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test item answers
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the test item answers where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the matching test item answers
	*/
	public static List<TestItemAnswer> findByQuestion(long questionId) {
		return getPersistence().findByQuestion(questionId);
	}

	/**
	* Returns a range of all the test item answers where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @return the range of matching test item answers
	*/
	public static List<TestItemAnswer> findByQuestion(long questionId,
		int start, int end) {
		return getPersistence().findByQuestion(questionId, start, end);
	}

	/**
	* Returns an ordered range of all the test item answers where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test item answers
	*/
	public static List<TestItemAnswer> findByQuestion(long questionId,
		int start, int end, OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence()
				   .findByQuestion(questionId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item answers where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test item answers
	*/
	public static List<TestItemAnswer> findByQuestion(long questionId,
		int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByQuestion(questionId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public static TestItemAnswer findByQuestion_First(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence()
				   .findByQuestion_First(questionId, orderByComparator);
	}

	/**
	* Returns the first test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public static TestItemAnswer fetchByQuestion_First(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByQuestion_First(questionId, orderByComparator);
	}

	/**
	* Returns the last test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public static TestItemAnswer findByQuestion_Last(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence()
				   .findByQuestion_Last(questionId, orderByComparator);
	}

	/**
	* Returns the last test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public static TestItemAnswer fetchByQuestion_Last(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByQuestion_Last(questionId, orderByComparator);
	}

	/**
	* Returns the test item answers before and after the current test item answer in the ordered set where questionId = &#63;.
	*
	* @param answerId the primary key of the current test item answer
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item answer
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public static TestItemAnswer[] findByQuestion_PrevAndNext(long answerId,
		long questionId, OrderByComparator<TestItemAnswer> orderByComparator)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence()
				   .findByQuestion_PrevAndNext(answerId, questionId,
			orderByComparator);
	}

	/**
	* Removes all the test item answers where questionId = &#63; from the database.
	*
	* @param questionId the question ID
	*/
	public static void removeByQuestion(long questionId) {
		getPersistence().removeByQuestion(questionId);
	}

	/**
	* Returns the number of test item answers where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the number of matching test item answers
	*/
	public static int countByQuestion(long questionId) {
		return getPersistence().countByQuestion(questionId);
	}

	/**
	* Caches the test item answer in the entity cache if it is enabled.
	*
	* @param testItemAnswer the test item answer
	*/
	public static void cacheResult(TestItemAnswer testItemAnswer) {
		getPersistence().cacheResult(testItemAnswer);
	}

	/**
	* Caches the test item answers in the entity cache if it is enabled.
	*
	* @param testItemAnswers the test item answers
	*/
	public static void cacheResult(List<TestItemAnswer> testItemAnswers) {
		getPersistence().cacheResult(testItemAnswers);
	}

	/**
	* Creates a new test item answer with the primary key. Does not add the test item answer to the database.
	*
	* @param answerId the primary key for the new test item answer
	* @return the new test item answer
	*/
	public static TestItemAnswer create(long answerId) {
		return getPersistence().create(answerId);
	}

	/**
	* Removes the test item answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer that was removed
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public static TestItemAnswer remove(long answerId)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence().remove(answerId);
	}

	public static TestItemAnswer updateImpl(TestItemAnswer testItemAnswer) {
		return getPersistence().updateImpl(testItemAnswer);
	}

	/**
	* Returns the test item answer with the primary key or throws a {@link NoSuchTestItemAnswerException} if it could not be found.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public static TestItemAnswer findByPrimaryKey(long answerId)
		throws ru.dokstudio.exception.NoSuchTestItemAnswerException {
		return getPersistence().findByPrimaryKey(answerId);
	}

	/**
	* Returns the test item answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer, or <code>null</code> if a test item answer with the primary key could not be found
	*/
	public static TestItemAnswer fetchByPrimaryKey(long answerId) {
		return getPersistence().fetchByPrimaryKey(answerId);
	}

	public static java.util.Map<java.io.Serializable, TestItemAnswer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test item answers.
	*
	* @return the test item answers
	*/
	public static List<TestItemAnswer> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test item answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @return the range of test item answers
	*/
	public static List<TestItemAnswer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test item answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test item answers
	*/
	public static List<TestItemAnswer> findAll(int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test item answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test item answers
	*/
	public static List<TestItemAnswer> findAll(int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test item answers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test item answers.
	*
	* @return the number of test item answers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TestItemAnswerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestItemAnswerPersistence, TestItemAnswerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestItemAnswerPersistence.class);
}