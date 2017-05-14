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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import ru.dokstudio.exception.NoSuchTestItemAttemptException;

import ru.dokstudio.model.TestItemAttempt;

/**
 * The persistence interface for the test item attempt service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstudio.service.persistence.impl.TestItemAttemptPersistenceImpl
 * @see TestItemAttemptUtil
 * @generated
 */
@ProviderType
public interface TestItemAttemptPersistence extends BasePersistence<TestItemAttempt> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestItemAttemptUtil} to access the test item attempt persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the test item attempts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test item attempts
	*/
	public java.util.List<TestItemAttempt> findByUuid(java.lang.String uuid);

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
	public java.util.List<TestItemAttempt> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<TestItemAttempt> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator);

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
	public java.util.List<TestItemAttempt> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public TestItemAttempt findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException;

	/**
	* Returns the first test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public TestItemAttempt fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator);

	/**
	* Returns the last test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public TestItemAttempt findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException;

	/**
	* Returns the last test item attempt in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public TestItemAttempt fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator);

	/**
	* Returns the test item attempts before and after the current test item attempt in the ordered set where uuid = &#63;.
	*
	* @param attemptId the primary key of the current test item attempt
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item attempt
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public TestItemAttempt[] findByUuid_PrevAndNext(long attemptId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException;

	/**
	* Removes all the test item attempts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of test item attempts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test item attempts
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the test item attempts where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the matching test item attempts
	*/
	public java.util.List<TestItemAttempt> findByQuestion(long questionId);

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
	public java.util.List<TestItemAttempt> findByQuestion(long questionId,
		int start, int end);

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
	public java.util.List<TestItemAttempt> findByQuestion(long questionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator);

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
	public java.util.List<TestItemAttempt> findByQuestion(long questionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public TestItemAttempt findByQuestion_First(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException;

	/**
	* Returns the first test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public TestItemAttempt fetchByQuestion_First(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator);

	/**
	* Returns the last test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt
	* @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	*/
	public TestItemAttempt findByQuestion_Last(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException;

	/**
	* Returns the last test item attempt in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	*/
	public TestItemAttempt fetchByQuestion_Last(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator);

	/**
	* Returns the test item attempts before and after the current test item attempt in the ordered set where questionId = &#63;.
	*
	* @param attemptId the primary key of the current test item attempt
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item attempt
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public TestItemAttempt[] findByQuestion_PrevAndNext(long attemptId,
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException;

	/**
	* Removes all the test item attempts where questionId = &#63; from the database.
	*
	* @param questionId the question ID
	*/
	public void removeByQuestion(long questionId);

	/**
	* Returns the number of test item attempts where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the number of matching test item attempts
	*/
	public int countByQuestion(long questionId);

	/**
	* Caches the test item attempt in the entity cache if it is enabled.
	*
	* @param testItemAttempt the test item attempt
	*/
	public void cacheResult(TestItemAttempt testItemAttempt);

	/**
	* Caches the test item attempts in the entity cache if it is enabled.
	*
	* @param testItemAttempts the test item attempts
	*/
	public void cacheResult(java.util.List<TestItemAttempt> testItemAttempts);

	/**
	* Creates a new test item attempt with the primary key. Does not add the test item attempt to the database.
	*
	* @param attemptId the primary key for the new test item attempt
	* @return the new test item attempt
	*/
	public TestItemAttempt create(long attemptId);

	/**
	* Removes the test item attempt with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt that was removed
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public TestItemAttempt remove(long attemptId)
		throws NoSuchTestItemAttemptException;

	public TestItemAttempt updateImpl(TestItemAttempt testItemAttempt);

	/**
	* Returns the test item attempt with the primary key or throws a {@link NoSuchTestItemAttemptException} if it could not be found.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt
	* @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	*/
	public TestItemAttempt findByPrimaryKey(long attemptId)
		throws NoSuchTestItemAttemptException;

	/**
	* Returns the test item attempt with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt, or <code>null</code> if a test item attempt with the primary key could not be found
	*/
	public TestItemAttempt fetchByPrimaryKey(long attemptId);

	@Override
	public java.util.Map<java.io.Serializable, TestItemAttempt> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test item attempts.
	*
	* @return the test item attempts
	*/
	public java.util.List<TestItemAttempt> findAll();

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
	public java.util.List<TestItemAttempt> findAll(int start, int end);

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
	public java.util.List<TestItemAttempt> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator);

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
	public java.util.List<TestItemAttempt> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAttempt> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test item attempts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test item attempts.
	*
	* @return the number of test item attempts
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}