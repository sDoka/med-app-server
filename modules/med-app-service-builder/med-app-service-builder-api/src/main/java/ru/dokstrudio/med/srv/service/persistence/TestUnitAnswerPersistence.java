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

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitAnswerException;
import ru.dokstrudio.med.srv.model.TestUnitAnswer;

/**
 * The persistence interface for the test unit answer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitAnswerPersistenceImpl
 * @see TestUnitAnswerUtil
 * @generated
 */
@ProviderType
public interface TestUnitAnswerPersistence extends BasePersistence<TestUnitAnswer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestUnitAnswerUtil} to access the test unit answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the test unit answers where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @return the matching test unit answers
	*/
	public java.util.List<TestUnitAnswer> findByTestUnitId(long testUnitId);

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
	public java.util.List<TestUnitAnswer> findByTestUnitId(long testUnitId,
		int start, int end);

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
	public java.util.List<TestUnitAnswer> findByTestUnitId(long testUnitId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator);

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
	public java.util.List<TestUnitAnswer> findByTestUnitId(long testUnitId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit answer
	* @throws NoSuchTestUnitAnswerException if a matching test unit answer could not be found
	*/
	public TestUnitAnswer findByTestUnitId_First(long testUnitId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator)
		throws NoSuchTestUnitAnswerException;

	/**
	* Returns the first test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test unit answer, or <code>null</code> if a matching test unit answer could not be found
	*/
	public TestUnitAnswer fetchByTestUnitId_First(long testUnitId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator);

	/**
	* Returns the last test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit answer
	* @throws NoSuchTestUnitAnswerException if a matching test unit answer could not be found
	*/
	public TestUnitAnswer findByTestUnitId_Last(long testUnitId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator)
		throws NoSuchTestUnitAnswerException;

	/**
	* Returns the last test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test unit answer, or <code>null</code> if a matching test unit answer could not be found
	*/
	public TestUnitAnswer fetchByTestUnitId_Last(long testUnitId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator);

	/**
	* Returns the test unit answers before and after the current test unit answer in the ordered set where testUnitId = &#63;.
	*
	* @param testUnitAnswerId the primary key of the current test unit answer
	* @param testUnitId the test unit ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test unit answer
	* @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	*/
	public TestUnitAnswer[] findByTestUnitId_PrevAndNext(
		long testUnitAnswerId, long testUnitId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator)
		throws NoSuchTestUnitAnswerException;

	/**
	* Removes all the test unit answers where testUnitId = &#63; from the database.
	*
	* @param testUnitId the test unit ID
	*/
	public void removeByTestUnitId(long testUnitId);

	/**
	* Returns the number of test unit answers where testUnitId = &#63;.
	*
	* @param testUnitId the test unit ID
	* @return the number of matching test unit answers
	*/
	public int countByTestUnitId(long testUnitId);

	/**
	* Caches the test unit answer in the entity cache if it is enabled.
	*
	* @param testUnitAnswer the test unit answer
	*/
	public void cacheResult(TestUnitAnswer testUnitAnswer);

	/**
	* Caches the test unit answers in the entity cache if it is enabled.
	*
	* @param testUnitAnswers the test unit answers
	*/
	public void cacheResult(java.util.List<TestUnitAnswer> testUnitAnswers);

	/**
	* Creates a new test unit answer with the primary key. Does not add the test unit answer to the database.
	*
	* @param testUnitAnswerId the primary key for the new test unit answer
	* @return the new test unit answer
	*/
	public TestUnitAnswer create(long testUnitAnswerId);

	/**
	* Removes the test unit answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer that was removed
	* @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	*/
	public TestUnitAnswer remove(long testUnitAnswerId)
		throws NoSuchTestUnitAnswerException;

	public TestUnitAnswer updateImpl(TestUnitAnswer testUnitAnswer);

	/**
	* Returns the test unit answer with the primary key or throws a {@link NoSuchTestUnitAnswerException} if it could not be found.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer
	* @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	*/
	public TestUnitAnswer findByPrimaryKey(long testUnitAnswerId)
		throws NoSuchTestUnitAnswerException;

	/**
	* Returns the test unit answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer, or <code>null</code> if a test unit answer with the primary key could not be found
	*/
	public TestUnitAnswer fetchByPrimaryKey(long testUnitAnswerId);

	@Override
	public java.util.Map<java.io.Serializable, TestUnitAnswer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test unit answers.
	*
	* @return the test unit answers
	*/
	public java.util.List<TestUnitAnswer> findAll();

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
	public java.util.List<TestUnitAnswer> findAll(int start, int end);

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
	public java.util.List<TestUnitAnswer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator);

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
	public java.util.List<TestUnitAnswer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUnitAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test unit answers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test unit answers.
	*
	* @return the number of test unit answers
	*/
	public int countAll();
}