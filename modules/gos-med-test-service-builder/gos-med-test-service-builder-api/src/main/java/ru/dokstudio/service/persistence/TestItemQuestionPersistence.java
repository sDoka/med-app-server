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

import ru.dokstudio.exception.NoSuchTestItemQuestionException;

import ru.dokstudio.model.TestItemQuestion;

/**
 * The persistence interface for the test item question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstudio.service.persistence.impl.TestItemQuestionPersistenceImpl
 * @see TestItemQuestionUtil
 * @generated
 */
@ProviderType
public interface TestItemQuestionPersistence extends BasePersistence<TestItemQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestItemQuestionUtil} to access the test item question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the test item questions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test item questions
	*/
	public java.util.List<TestItemQuestion> findByUuid(java.lang.String uuid);

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
	public java.util.List<TestItemQuestion> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<TestItemQuestion> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator);

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
	public java.util.List<TestItemQuestion> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item question
	* @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	*/
	public TestItemQuestion findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator)
		throws NoSuchTestItemQuestionException;

	/**
	* Returns the first test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public TestItemQuestion fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator);

	/**
	* Returns the last test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item question
	* @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	*/
	public TestItemQuestion findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator)
		throws NoSuchTestItemQuestionException;

	/**
	* Returns the last test item question in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public TestItemQuestion fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator);

	/**
	* Returns the test item questions before and after the current test item question in the ordered set where uuid = &#63;.
	*
	* @param questionId the primary key of the current test item question
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item question
	* @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	*/
	public TestItemQuestion[] findByUuid_PrevAndNext(long questionId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator)
		throws NoSuchTestItemQuestionException;

	/**
	* Removes all the test item questions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of test item questions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test item questions
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the test item question where questionNumber = &#63; or throws a {@link NoSuchTestItemQuestionException} if it could not be found.
	*
	* @param questionNumber the question number
	* @return the matching test item question
	* @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	*/
	public TestItemQuestion findByQuestionNumber(long questionNumber)
		throws NoSuchTestItemQuestionException;

	/**
	* Returns the test item question where questionNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param questionNumber the question number
	* @return the matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public TestItemQuestion fetchByQuestionNumber(long questionNumber);

	/**
	* Returns the test item question where questionNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param questionNumber the question number
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test item question, or <code>null</code> if a matching test item question could not be found
	*/
	public TestItemQuestion fetchByQuestionNumber(long questionNumber,
		boolean retrieveFromCache);

	/**
	* Removes the test item question where questionNumber = &#63; from the database.
	*
	* @param questionNumber the question number
	* @return the test item question that was removed
	*/
	public TestItemQuestion removeByQuestionNumber(long questionNumber)
		throws NoSuchTestItemQuestionException;

	/**
	* Returns the number of test item questions where questionNumber = &#63;.
	*
	* @param questionNumber the question number
	* @return the number of matching test item questions
	*/
	public int countByQuestionNumber(long questionNumber);

	/**
	* Caches the test item question in the entity cache if it is enabled.
	*
	* @param testItemQuestion the test item question
	*/
	public void cacheResult(TestItemQuestion testItemQuestion);

	/**
	* Caches the test item questions in the entity cache if it is enabled.
	*
	* @param testItemQuestions the test item questions
	*/
	public void cacheResult(java.util.List<TestItemQuestion> testItemQuestions);

	/**
	* Creates a new test item question with the primary key. Does not add the test item question to the database.
	*
	* @param questionId the primary key for the new test item question
	* @return the new test item question
	*/
	public TestItemQuestion create(long questionId);

	/**
	* Removes the test item question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question that was removed
	* @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	*/
	public TestItemQuestion remove(long questionId)
		throws NoSuchTestItemQuestionException;

	public TestItemQuestion updateImpl(TestItemQuestion testItemQuestion);

	/**
	* Returns the test item question with the primary key or throws a {@link NoSuchTestItemQuestionException} if it could not be found.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question
	* @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	*/
	public TestItemQuestion findByPrimaryKey(long questionId)
		throws NoSuchTestItemQuestionException;

	/**
	* Returns the test item question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question, or <code>null</code> if a test item question with the primary key could not be found
	*/
	public TestItemQuestion fetchByPrimaryKey(long questionId);

	@Override
	public java.util.Map<java.io.Serializable, TestItemQuestion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test item questions.
	*
	* @return the test item questions
	*/
	public java.util.List<TestItemQuestion> findAll();

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
	public java.util.List<TestItemQuestion> findAll(int start, int end);

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
	public java.util.List<TestItemQuestion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator);

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
	public java.util.List<TestItemQuestion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test item questions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test item questions.
	*
	* @return the number of test item questions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}