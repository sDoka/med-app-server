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

import ru.dokstrudio.med.srv.model.TestUnitAnswer;

import java.util.List;

/**
 * The persistence utility for the test unit answer service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.TestUnitAnswerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAnswerPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitAnswerPersistenceImpl
 * @generated
 */
@ProviderType
public class TestUnitAnswerUtil {
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
	public static void clearCache(TestUnitAnswer testUnitAnswer) {
		getPersistence().clearCache(testUnitAnswer);
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
	public static List<TestUnitAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestUnitAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestUnitAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestUnitAnswer> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestUnitAnswer update(TestUnitAnswer testUnitAnswer) {
		return getPersistence().update(testUnitAnswer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestUnitAnswer update(TestUnitAnswer testUnitAnswer,
		ServiceContext serviceContext) {
		return getPersistence().update(testUnitAnswer, serviceContext);
	}

	/**
	* Returns all the test unit answers where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @return the matching test unit answers
	*/
	public static List<TestUnitAnswer> findByTestUnitId(long testUnitId) {
		return getPersistence().findByTestUnitId(testUnitId);
	}

	/**
	* Returns a range of all the test unit answers where testUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param testUnitId the test unit ID
	* @param start the lower bound of the range of test unit answers
	* @param end the upper bound of the range of test unit answers (not inclusive)
	* @return the range of matching test unit answers
	*/
	public static List<TestUnitAnswer> findByTestUnitId(long testUnitId,
		int start, int end) {
		return getPersistence().findByTestUnitId(testUnitId, start, end);
	}

	/**
	* Returns an ordered range of all the test unit answers where testUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param testUnitId the test unit ID
	* @param start the lower bound of the range of test unit answers
	* @param end the upper bound of the range of test unit answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test unit answers
	*/
	public static List<TestUnitAnswer> findByTestUnitId(long testUnitId,
		int start, int end, OrderByComparator<TestUnitAnswer> orderByComparator) {
		return getPersistence()
				   .findByTestUnitId(testUnitId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test unit answers where testUnitId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param testUnitId the test unit ID
	* @param start the lower bound of the range of test unit answers
	* @param end the upper bound of the range of test unit answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test unit answers
	*/
	public static List<TestUnitAnswer> findByTestUnitId(long testUnitId,
		int start, int end,
		OrderByComparator<TestUnitAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTestUnitId(testUnitId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit answer
	* @throws NoSuchTestUnitAnswerException if a matching test unit answer could not be found
	*/
	public static TestUnitAnswer findByTestUnitId_First(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAnswerException {
		return getPersistence()
				   .findByTestUnitId_First(testUnitId, orderByComparator);
	}

	/**
	* Returns the first test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit answer, or <code>null</code> if a matching test unit answer could not be found
	*/
	public static TestUnitAnswer fetchByTestUnitId_First(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByTestUnitId_First(testUnitId, orderByComparator);
	}

	/**
	* Returns the last test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit answer
	* @throws NoSuchTestUnitAnswerException if a matching test unit answer could not be found
	*/
	public static TestUnitAnswer findByTestUnitId_Last(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAnswerException {
		return getPersistence()
				   .findByTestUnitId_Last(testUnitId, orderByComparator);
	}

	/**
	* Returns the last test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit answer, or <code>null</code> if a matching test unit answer could not be found
	*/
	public static TestUnitAnswer fetchByTestUnitId_Last(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByTestUnitId_Last(testUnitId, orderByComparator);
	}

	/**
	* Returns the test unit answers before and after the current test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitAnswerId the primary key of the current test unit answer
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit answer
	* @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	*/
	public static TestUnitAnswer[] findByTestUnitId_PrevAndNext(
		long testUnitAnswerId, long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAnswerException {
		return getPersistence()
				   .findByTestUnitId_PrevAndNext(testUnitAnswerId, testUnitId,
			orderByComparator);
	}

	/**
	* Removes all the test unit answers where testUnitId = &#63; from the database.
	*
	* @param testUnitId the test unit ID
	*/
	public static void removeByTestUnitId(long testUnitId) {
		getPersistence().removeByTestUnitId(testUnitId);
	}

	/**
	* Returns the number of test unit answers where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @return the number of matching test unit answers
	*/
	public static int countByTestUnitId(long testUnitId) {
		return getPersistence().countByTestUnitId(testUnitId);
	}

	/**
	* Caches the test unit answer in the entity cache if it is enabled.
	*
	* @param testUnitAnswer the test unit answer
	*/
	public static void cacheResult(TestUnitAnswer testUnitAnswer) {
		getPersistence().cacheResult(testUnitAnswer);
	}

	/**
	* Caches the test unit answers in the entity cache if it is enabled.
	*
	* @param testUnitAnswers the test unit answers
	*/
	public static void cacheResult(List<TestUnitAnswer> testUnitAnswers) {
		getPersistence().cacheResult(testUnitAnswers);
	}

	/**
	* Creates a new test unit answer with the primary key. Does not add the test unit answer to the database.
	*
	* @param testUnitAnswerId the primary key for the new test unit answer
	* @return the new test unit answer
	*/
	public static TestUnitAnswer create(long testUnitAnswerId) {
		return getPersistence().create(testUnitAnswerId);
	}

	/**
	* Removes the test unit answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer that was removed
	* @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	*/
	public static TestUnitAnswer remove(long testUnitAnswerId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAnswerException {
		return getPersistence().remove(testUnitAnswerId);
	}

	public static TestUnitAnswer updateImpl(TestUnitAnswer testUnitAnswer) {
		return getPersistence().updateImpl(testUnitAnswer);
	}

	/**
	* Returns the test unit answer with the primary key or throws a {@link NoSuchTestUnitAnswerException} if it could not be found.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer
	* @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	*/
	public static TestUnitAnswer findByPrimaryKey(long testUnitAnswerId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitAnswerException {
		return getPersistence().findByPrimaryKey(testUnitAnswerId);
	}

	/**
	* Returns the test unit answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer, or <code>null</code> if a test unit answer with the primary key could not be found
	*/
	public static TestUnitAnswer fetchByPrimaryKey(long testUnitAnswerId) {
		return getPersistence().fetchByPrimaryKey(testUnitAnswerId);
	}

	public static java.util.Map<java.io.Serializable, TestUnitAnswer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test unit answers.
	*
	* @return the test unit answers
	*/
	public static List<TestUnitAnswer> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test unit answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit answers
	* @param end the upper bound of the range of test unit answers (not inclusive)
	* @return the range of test unit answers
	*/
	public static List<TestUnitAnswer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test unit answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit answers
	* @param end the upper bound of the range of test unit answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test unit answers
	*/
	public static List<TestUnitAnswer> findAll(int start, int end,
		OrderByComparator<TestUnitAnswer> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test unit answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit answers
	* @param end the upper bound of the range of test unit answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test unit answers
	*/
	public static List<TestUnitAnswer> findAll(int start, int end,
		OrderByComparator<TestUnitAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test unit answers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test unit answers.
	*
	* @return the number of test unit answers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TestUnitAnswerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestUnitAnswerPersistence, TestUnitAnswerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestUnitAnswerPersistence.class);
}