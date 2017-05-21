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

import ru.dokstudio.exception.NoSuchTestItemAnswerException;

import ru.dokstudio.model.TestItemAnswer;

/**
 * The persistence interface for the test item answer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstudio.service.persistence.impl.TestItemAnswerPersistenceImpl
 * @see TestItemAnswerUtil
 * @generated
 */
@ProviderType
public interface TestItemAnswerPersistence extends BasePersistence<TestItemAnswer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestItemAnswerUtil} to access the test item answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the test item answers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test item answers
	*/
	public java.util.List<TestItemAnswer> findByUuid(java.lang.String uuid);

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
	public java.util.List<TestItemAnswer> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<TestItemAnswer> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator);

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
	public java.util.List<TestItemAnswer> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public TestItemAnswer findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException;

	/**
	* Returns the first test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public TestItemAnswer fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator);

	/**
	* Returns the last test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public TestItemAnswer findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException;

	/**
	* Returns the last test item answer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public TestItemAnswer fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator);

	/**
	* Returns the test item answers before and after the current test item answer in the ordered set where uuid = &#63;.
	*
	* @param answerId the primary key of the current test item answer
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item answer
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public TestItemAnswer[] findByUuid_PrevAndNext(long answerId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException;

	/**
	* Removes all the test item answers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of test item answers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test item answers
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns all the test item answers where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the matching test item answers
	*/
	public java.util.List<TestItemAnswer> findByQuestion(long questionId);

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
	public java.util.List<TestItemAnswer> findByQuestion(long questionId,
		int start, int end);

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
	public java.util.List<TestItemAnswer> findByQuestion(long questionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator);

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
	public java.util.List<TestItemAnswer> findByQuestion(long questionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public TestItemAnswer findByQuestion_First(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException;

	/**
	* Returns the first test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public TestItemAnswer fetchByQuestion_First(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator);

	/**
	* Returns the last test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer
	* @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	*/
	public TestItemAnswer findByQuestion_Last(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException;

	/**
	* Returns the last test item answer in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test item answer, or <code>null</code> if a matching test item answer could not be found
	*/
	public TestItemAnswer fetchByQuestion_Last(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator);

	/**
	* Returns the test item answers before and after the current test item answer in the ordered set where questionId = &#63;.
	*
	* @param answerId the primary key of the current test item answer
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test item answer
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public TestItemAnswer[] findByQuestion_PrevAndNext(long answerId,
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException;

	/**
	* Removes all the test item answers where questionId = &#63; from the database.
	*
	* @param questionId the question ID
	*/
	public void removeByQuestion(long questionId);

	/**
	* Returns the number of test item answers where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the number of matching test item answers
	*/
	public int countByQuestion(long questionId);

	/**
	* Caches the test item answer in the entity cache if it is enabled.
	*
	* @param testItemAnswer the test item answer
	*/
	public void cacheResult(TestItemAnswer testItemAnswer);

	/**
	* Caches the test item answers in the entity cache if it is enabled.
	*
	* @param testItemAnswers the test item answers
	*/
	public void cacheResult(java.util.List<TestItemAnswer> testItemAnswers);

	/**
	* Creates a new test item answer with the primary key. Does not add the test item answer to the database.
	*
	* @param answerId the primary key for the new test item answer
	* @return the new test item answer
	*/
	public TestItemAnswer create(long answerId);

	/**
	* Removes the test item answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer that was removed
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public TestItemAnswer remove(long answerId)
		throws NoSuchTestItemAnswerException;

	public TestItemAnswer updateImpl(TestItemAnswer testItemAnswer);

	/**
	* Returns the test item answer with the primary key or throws a {@link NoSuchTestItemAnswerException} if it could not be found.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer
	* @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	*/
	public TestItemAnswer findByPrimaryKey(long answerId)
		throws NoSuchTestItemAnswerException;

	/**
	* Returns the test item answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer, or <code>null</code> if a test item answer with the primary key could not be found
	*/
	public TestItemAnswer fetchByPrimaryKey(long answerId);

	@Override
	public java.util.Map<java.io.Serializable, TestItemAnswer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test item answers.
	*
	* @return the test item answers
	*/
	public java.util.List<TestItemAnswer> findAll();

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
	public java.util.List<TestItemAnswer> findAll(int start, int end);

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
	public java.util.List<TestItemAnswer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator);

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
	public java.util.List<TestItemAnswer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestItemAnswer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test item answers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test item answers.
	*
	* @return the number of test item answers
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}