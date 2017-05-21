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

package ru.dokstudio.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstudio.exception.NoSuchTestItemQuestionException;

import ru.dokstudio.model.TestItemQuestion;
import ru.dokstudio.model.impl.TestItemQuestionImpl;
import ru.dokstudio.model.impl.TestItemQuestionModelImpl;

import ru.dokstudio.service.persistence.TestItemQuestionPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the test item question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemQuestionPersistence
 * @see ru.dokstudio.service.persistence.TestItemQuestionUtil
 * @generated
 */
@ProviderType
public class TestItemQuestionPersistenceImpl extends BasePersistenceImpl<TestItemQuestion>
	implements TestItemQuestionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestItemQuestionUtil} to access the test item question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestItemQuestionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED,
			TestItemQuestionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED,
			TestItemQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED,
			TestItemQuestionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED,
			TestItemQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TestItemQuestionModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the test item questions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching test item questions
	 */
	@Override
	public List<TestItemQuestion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestItemQuestion> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<TestItemQuestion> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<TestItemQuestion> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<TestItemQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestItemQuestion testItemQuestion : list) {
					if (!Objects.equals(uuid, testItemQuestion.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TESTITEMQUESTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestItemQuestionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<TestItemQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemQuestion>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first test item question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item question
	 * @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	 */
	@Override
	public TestItemQuestion findByUuid_First(String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator)
		throws NoSuchTestItemQuestionException {
		TestItemQuestion testItemQuestion = fetchByUuid_First(uuid,
				orderByComparator);

		if (testItemQuestion != null) {
			return testItemQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemQuestionException(msg.toString());
	}

	/**
	 * Returns the first test item question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item question, or <code>null</code> if a matching test item question could not be found
	 */
	@Override
	public TestItemQuestion fetchByUuid_First(String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		List<TestItemQuestion> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test item question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item question
	 * @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	 */
	@Override
	public TestItemQuestion findByUuid_Last(String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator)
		throws NoSuchTestItemQuestionException {
		TestItemQuestion testItemQuestion = fetchByUuid_Last(uuid,
				orderByComparator);

		if (testItemQuestion != null) {
			return testItemQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemQuestionException(msg.toString());
	}

	/**
	 * Returns the last test item question in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item question, or <code>null</code> if a matching test item question could not be found
	 */
	@Override
	public TestItemQuestion fetchByUuid_Last(String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TestItemQuestion> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TestItemQuestion[] findByUuid_PrevAndNext(long questionId,
		String uuid, OrderByComparator<TestItemQuestion> orderByComparator)
		throws NoSuchTestItemQuestionException {
		TestItemQuestion testItemQuestion = findByPrimaryKey(questionId);

		Session session = null;

		try {
			session = openSession();

			TestItemQuestion[] array = new TestItemQuestionImpl[3];

			array[0] = getByUuid_PrevAndNext(session, testItemQuestion, uuid,
					orderByComparator, true);

			array[1] = testItemQuestion;

			array[2] = getByUuid_PrevAndNext(session, testItemQuestion, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestItemQuestion getByUuid_PrevAndNext(Session session,
		TestItemQuestion testItemQuestion, String uuid,
		OrderByComparator<TestItemQuestion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTITEMQUESTION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TestItemQuestionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testItemQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestItemQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test item questions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TestItemQuestion testItemQuestion : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testItemQuestion);
		}
	}

	/**
	 * Returns the number of test item questions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching test item questions
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTITEMQUESTION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "testItemQuestion.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "testItemQuestion.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(testItemQuestion.uuid IS NULL OR testItemQuestion.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_QUESTIONNUMBER = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED,
			TestItemQuestionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByQuestionNumber", new String[] { Long.class.getName() },
			TestItemQuestionModelImpl.QUESTIONNUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUESTIONNUMBER = new FinderPath(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuestionNumber",
			new String[] { Long.class.getName() });

	/**
	 * Returns the test item question where questionNumber = &#63; or throws a {@link NoSuchTestItemQuestionException} if it could not be found.
	 *
	 * @param questionNumber the question number
	 * @return the matching test item question
	 * @throws NoSuchTestItemQuestionException if a matching test item question could not be found
	 */
	@Override
	public TestItemQuestion findByQuestionNumber(long questionNumber)
		throws NoSuchTestItemQuestionException {
		TestItemQuestion testItemQuestion = fetchByQuestionNumber(questionNumber);

		if (testItemQuestion == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("questionNumber=");
			msg.append(questionNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTestItemQuestionException(msg.toString());
		}

		return testItemQuestion;
	}

	/**
	 * Returns the test item question where questionNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param questionNumber the question number
	 * @return the matching test item question, or <code>null</code> if a matching test item question could not be found
	 */
	@Override
	public TestItemQuestion fetchByQuestionNumber(long questionNumber) {
		return fetchByQuestionNumber(questionNumber, true);
	}

	/**
	 * Returns the test item question where questionNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param questionNumber the question number
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching test item question, or <code>null</code> if a matching test item question could not be found
	 */
	@Override
	public TestItemQuestion fetchByQuestionNumber(long questionNumber,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { questionNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER,
					finderArgs, this);
		}

		if (result instanceof TestItemQuestion) {
			TestItemQuestion testItemQuestion = (TestItemQuestion)result;

			if ((questionNumber != testItemQuestion.getQuestionNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TESTITEMQUESTION_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONNUMBER_QUESTIONNUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionNumber);

				List<TestItemQuestion> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"TestItemQuestionPersistenceImpl.fetchByQuestionNumber(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TestItemQuestion testItemQuestion = list.get(0);

					result = testItemQuestion;

					cacheResult(testItemQuestion);

					if ((testItemQuestion.getQuestionNumber() != questionNumber)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER,
							finderArgs, testItemQuestion);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (TestItemQuestion)result;
		}
	}

	/**
	 * Removes the test item question where questionNumber = &#63; from the database.
	 *
	 * @param questionNumber the question number
	 * @return the test item question that was removed
	 */
	@Override
	public TestItemQuestion removeByQuestionNumber(long questionNumber)
		throws NoSuchTestItemQuestionException {
		TestItemQuestion testItemQuestion = findByQuestionNumber(questionNumber);

		return remove(testItemQuestion);
	}

	/**
	 * Returns the number of test item questions where questionNumber = &#63;.
	 *
	 * @param questionNumber the question number
	 * @return the number of matching test item questions
	 */
	@Override
	public int countByQuestionNumber(long questionNumber) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUESTIONNUMBER;

		Object[] finderArgs = new Object[] { questionNumber };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTITEMQUESTION_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONNUMBER_QUESTIONNUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionNumber);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_QUESTIONNUMBER_QUESTIONNUMBER_2 = "testItemQuestion.questionNumber = ?";

	public TestItemQuestionPersistenceImpl() {
		setModelClass(TestItemQuestion.class);
	}

	/**
	 * Caches the test item question in the entity cache if it is enabled.
	 *
	 * @param testItemQuestion the test item question
	 */
	@Override
	public void cacheResult(TestItemQuestion testItemQuestion) {
		entityCache.putResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionImpl.class, testItemQuestion.getPrimaryKey(),
			testItemQuestion);

		finderCache.putResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER,
			new Object[] { testItemQuestion.getQuestionNumber() },
			testItemQuestion);

		testItemQuestion.resetOriginalValues();
	}

	/**
	 * Caches the test item questions in the entity cache if it is enabled.
	 *
	 * @param testItemQuestions the test item questions
	 */
	@Override
	public void cacheResult(List<TestItemQuestion> testItemQuestions) {
		for (TestItemQuestion testItemQuestion : testItemQuestions) {
			if (entityCache.getResult(
						TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
						TestItemQuestionImpl.class,
						testItemQuestion.getPrimaryKey()) == null) {
				cacheResult(testItemQuestion);
			}
			else {
				testItemQuestion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test item questions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestItemQuestionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test item question.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestItemQuestion testItemQuestion) {
		entityCache.removeResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionImpl.class, testItemQuestion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TestItemQuestionModelImpl)testItemQuestion,
			true);
	}

	@Override
	public void clearCache(List<TestItemQuestion> testItemQuestions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestItemQuestion testItemQuestion : testItemQuestions) {
			entityCache.removeResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
				TestItemQuestionImpl.class, testItemQuestion.getPrimaryKey());

			clearUniqueFindersCache((TestItemQuestionModelImpl)testItemQuestion,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		TestItemQuestionModelImpl testItemQuestionModelImpl) {
		Object[] args = new Object[] {
				testItemQuestionModelImpl.getQuestionNumber()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_QUESTIONNUMBER, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER, args,
			testItemQuestionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		TestItemQuestionModelImpl testItemQuestionModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					testItemQuestionModelImpl.getQuestionNumber()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTIONNUMBER, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER, args);
		}

		if ((testItemQuestionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_QUESTIONNUMBER.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					testItemQuestionModelImpl.getOriginalQuestionNumber()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTIONNUMBER, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_QUESTIONNUMBER, args);
		}
	}

	/**
	 * Creates a new test item question with the primary key. Does not add the test item question to the database.
	 *
	 * @param questionId the primary key for the new test item question
	 * @return the new test item question
	 */
	@Override
	public TestItemQuestion create(long questionId) {
		TestItemQuestion testItemQuestion = new TestItemQuestionImpl();

		testItemQuestion.setNew(true);
		testItemQuestion.setPrimaryKey(questionId);

		String uuid = PortalUUIDUtil.generate();

		testItemQuestion.setUuid(uuid);

		return testItemQuestion;
	}

	/**
	 * Removes the test item question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param questionId the primary key of the test item question
	 * @return the test item question that was removed
	 * @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	 */
	@Override
	public TestItemQuestion remove(long questionId)
		throws NoSuchTestItemQuestionException {
		return remove((Serializable)questionId);
	}

	/**
	 * Removes the test item question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test item question
	 * @return the test item question that was removed
	 * @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	 */
	@Override
	public TestItemQuestion remove(Serializable primaryKey)
		throws NoSuchTestItemQuestionException {
		Session session = null;

		try {
			session = openSession();

			TestItemQuestion testItemQuestion = (TestItemQuestion)session.get(TestItemQuestionImpl.class,
					primaryKey);

			if (testItemQuestion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestItemQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testItemQuestion);
		}
		catch (NoSuchTestItemQuestionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TestItemQuestion removeImpl(TestItemQuestion testItemQuestion) {
		testItemQuestion = toUnwrappedModel(testItemQuestion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testItemQuestion)) {
				testItemQuestion = (TestItemQuestion)session.get(TestItemQuestionImpl.class,
						testItemQuestion.getPrimaryKeyObj());
			}

			if (testItemQuestion != null) {
				session.delete(testItemQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testItemQuestion != null) {
			clearCache(testItemQuestion);
		}

		return testItemQuestion;
	}

	@Override
	public TestItemQuestion updateImpl(TestItemQuestion testItemQuestion) {
		testItemQuestion = toUnwrappedModel(testItemQuestion);

		boolean isNew = testItemQuestion.isNew();

		TestItemQuestionModelImpl testItemQuestionModelImpl = (TestItemQuestionModelImpl)testItemQuestion;

		if (Validator.isNull(testItemQuestion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			testItemQuestion.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (testItemQuestion.isNew()) {
				session.save(testItemQuestion);

				testItemQuestion.setNew(false);
			}
			else {
				testItemQuestion = (TestItemQuestion)session.merge(testItemQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TestItemQuestionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((testItemQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testItemQuestionModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { testItemQuestionModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}
		}

		entityCache.putResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TestItemQuestionImpl.class, testItemQuestion.getPrimaryKey(),
			testItemQuestion, false);

		clearUniqueFindersCache(testItemQuestionModelImpl, false);
		cacheUniqueFindersCache(testItemQuestionModelImpl);

		testItemQuestion.resetOriginalValues();

		return testItemQuestion;
	}

	protected TestItemQuestion toUnwrappedModel(
		TestItemQuestion testItemQuestion) {
		if (testItemQuestion instanceof TestItemQuestionImpl) {
			return testItemQuestion;
		}

		TestItemQuestionImpl testItemQuestionImpl = new TestItemQuestionImpl();

		testItemQuestionImpl.setNew(testItemQuestion.isNew());
		testItemQuestionImpl.setPrimaryKey(testItemQuestion.getPrimaryKey());

		testItemQuestionImpl.setUuid(testItemQuestion.getUuid());
		testItemQuestionImpl.setQuestionId(testItemQuestion.getQuestionId());
		testItemQuestionImpl.setQuestionNumber(testItemQuestion.getQuestionNumber());
		testItemQuestionImpl.setQuestion(testItemQuestion.getQuestion());
		testItemQuestionImpl.setModifiedDate(testItemQuestion.getModifiedDate());

		return testItemQuestionImpl;
	}

	/**
	 * Returns the test item question with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test item question
	 * @return the test item question
	 * @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	 */
	@Override
	public TestItemQuestion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestItemQuestionException {
		TestItemQuestion testItemQuestion = fetchByPrimaryKey(primaryKey);

		if (testItemQuestion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestItemQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testItemQuestion;
	}

	/**
	 * Returns the test item question with the primary key or throws a {@link NoSuchTestItemQuestionException} if it could not be found.
	 *
	 * @param questionId the primary key of the test item question
	 * @return the test item question
	 * @throws NoSuchTestItemQuestionException if a test item question with the primary key could not be found
	 */
	@Override
	public TestItemQuestion findByPrimaryKey(long questionId)
		throws NoSuchTestItemQuestionException {
		return findByPrimaryKey((Serializable)questionId);
	}

	/**
	 * Returns the test item question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test item question
	 * @return the test item question, or <code>null</code> if a test item question with the primary key could not be found
	 */
	@Override
	public TestItemQuestion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
				TestItemQuestionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TestItemQuestion testItemQuestion = (TestItemQuestion)serializable;

		if (testItemQuestion == null) {
			Session session = null;

			try {
				session = openSession();

				testItemQuestion = (TestItemQuestion)session.get(TestItemQuestionImpl.class,
						primaryKey);

				if (testItemQuestion != null) {
					cacheResult(testItemQuestion);
				}
				else {
					entityCache.putResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
						TestItemQuestionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
					TestItemQuestionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testItemQuestion;
	}

	/**
	 * Returns the test item question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param questionId the primary key of the test item question
	 * @return the test item question, or <code>null</code> if a test item question with the primary key could not be found
	 */
	@Override
	public TestItemQuestion fetchByPrimaryKey(long questionId) {
		return fetchByPrimaryKey((Serializable)questionId);
	}

	@Override
	public Map<Serializable, TestItemQuestion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestItemQuestion> map = new HashMap<Serializable, TestItemQuestion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestItemQuestion testItemQuestion = fetchByPrimaryKey(primaryKey);

			if (testItemQuestion != null) {
				map.put(primaryKey, testItemQuestion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
					TestItemQuestionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TestItemQuestion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTITEMQUESTION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (TestItemQuestion testItemQuestion : (List<TestItemQuestion>)q.list()) {
				map.put(testItemQuestion.getPrimaryKeyObj(), testItemQuestion);

				cacheResult(testItemQuestion);

				uncachedPrimaryKeys.remove(testItemQuestion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestItemQuestionModelImpl.ENTITY_CACHE_ENABLED,
					TestItemQuestionImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the test item questions.
	 *
	 * @return the test item questions
	 */
	@Override
	public List<TestItemQuestion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestItemQuestion> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TestItemQuestion> findAll(int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TestItemQuestion> findAll(int start, int end,
		OrderByComparator<TestItemQuestion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TestItemQuestion> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemQuestion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTITEMQUESTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTITEMQUESTION;

				if (pagination) {
					sql = sql.concat(TestItemQuestionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestItemQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemQuestion>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the test item questions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestItemQuestion testItemQuestion : findAll()) {
			remove(testItemQuestion);
		}
	}

	/**
	 * Returns the number of test item questions.
	 *
	 * @return the number of test item questions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTITEMQUESTION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TestItemQuestionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test item question persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestItemQuestionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTITEMQUESTION = "SELECT testItemQuestion FROM TestItemQuestion testItemQuestion";
	private static final String _SQL_SELECT_TESTITEMQUESTION_WHERE_PKS_IN = "SELECT testItemQuestion FROM TestItemQuestion testItemQuestion WHERE questionId IN (";
	private static final String _SQL_SELECT_TESTITEMQUESTION_WHERE = "SELECT testItemQuestion FROM TestItemQuestion testItemQuestion WHERE ";
	private static final String _SQL_COUNT_TESTITEMQUESTION = "SELECT COUNT(testItemQuestion) FROM TestItemQuestion testItemQuestion";
	private static final String _SQL_COUNT_TESTITEMQUESTION_WHERE = "SELECT COUNT(testItemQuestion) FROM TestItemQuestion testItemQuestion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testItemQuestion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestItemQuestion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TestItemQuestion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TestItemQuestionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}