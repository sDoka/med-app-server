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

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException;
import ru.dokstrudio.med.srv.model.TestUnitAttempt;

/**
 * The persistence interface for the test unit attempt service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitAttemptPersistenceImpl
 * @see TestUnitAttemptUtil
 * @generated
 */
@ProviderType
public interface TestUnitAttemptPersistence extends BasePersistence<TestUnitAttempt> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestUnitAttemptUtil} to access the test unit attempt persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the test unit attempts where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @return the matching test unit attempts
	*/
	public java.util.List<TestUnitAttempt> findByTestUnitId(
		long testUnitAnswerId);

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
	public java.util.List<TestUnitAttempt> findByTestUnitId(
		long testUnitAnswerId, int start, int end);

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
	public java.util.List<TestUnitAttempt> findByTestUnitId(
		long testUnitAnswerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator);

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
	public java.util.List<TestUnitAttempt> findByTestUnitId(
		long testUnitAnswerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit attempt
	* @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	*/
	public TestUnitAttempt findByTestUnitId_First(long testUnitAnswerId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator)
		throws NoSuchTestUnitAttemptException;

	/**
	* Returns the first test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	*/
	public TestUnitAttempt fetchByTestUnitId_First(long testUnitAnswerId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator);

	/**
	* Returns the last test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit attempt
	* @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	*/
	public TestUnitAttempt findByTestUnitId_Last(long testUnitAnswerId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator)
		throws NoSuchTestUnitAttemptException;

	/**
	* Returns the last test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	*/
	public TestUnitAttempt fetchByTestUnitId_Last(long testUnitAnswerId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator);

	/**
	* Returns the test unit attempts before and after the current test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	*
	* @param testUnitAttemptId the primary key of the current test unit attempt
	* @param testUnitAnswerId the test unit answer ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit attempt
	* @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	*/
	public TestUnitAttempt[] findByTestUnitId_PrevAndNext(
		long testUnitAttemptId, long testUnitAnswerId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator)
		throws NoSuchTestUnitAttemptException;

	/**
	* Removes all the test unit attempts where testUnitAnswerId = &#63; from the database.
	*
	* @param testUnitAnswerId the test unit answer ID
	*/
	public void removeByTestUnitId(long testUnitAnswerId);

	/**
	* Returns the number of test unit attempts where testUnitAnswerId = &#63;.
	*
	* @param testUnitAnswerId the test unit answer ID
	* @return the number of matching test unit attempts
	*/
	public int countByTestUnitId(long testUnitAnswerId);

	/**
	* Caches the test unit attempt in the entity cache if it is enabled.
	*
	* @param testUnitAttempt the test unit attempt
	*/
	public void cacheResult(TestUnitAttempt testUnitAttempt);

	/**
	* Caches the test unit attempts in the entity cache if it is enabled.
	*
	* @param testUnitAttempts the test unit attempts
	*/
	public void cacheResult(java.util.List<TestUnitAttempt> testUnitAttempts);

	/**
	* Creates a new test unit attempt with the primary key. Does not add the test unit attempt to the database.
	*
	* @param testUnitAttemptId the primary key for the new test unit attempt
	* @return the new test unit attempt
	*/
	public TestUnitAttempt create(long testUnitAttemptId);

	/**
	* Removes the test unit attempt with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt that was removed
	* @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	*/
	public TestUnitAttempt remove(long testUnitAttemptId)
		throws NoSuchTestUnitAttemptException;

	public TestUnitAttempt updateImpl(TestUnitAttempt testUnitAttempt);

	/**
	* Returns the test unit attempt with the primary key or throws a {@link NoSuchTestUnitAttemptException} if it could not be found.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt
	* @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	*/
	public TestUnitAttempt findByPrimaryKey(long testUnitAttemptId)
		throws NoSuchTestUnitAttemptException;

	/**
	* Returns the test unit attempt with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt, or <code>null</code> if a test unit attempt with the primary key could not be found
	*/
	public TestUnitAttempt fetchByPrimaryKey(long testUnitAttemptId);

	@Override
	public java.util.Map<java.io.Serializable, TestUnitAttempt> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test unit attempts.
	*
	* @return the test unit attempts
	*/
	public java.util.List<TestUnitAttempt> findAll();

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
	public java.util.List<TestUnitAttempt> findAll(int start, int end);

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
	public java.util.List<TestUnitAttempt> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator);

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
	public java.util.List<TestUnitAttempt> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAttempt> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test unit attempts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test unit attempts.
	*
	* @return the number of test unit attempts
	*/
	public int countAll();
}