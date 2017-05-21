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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstudio.exception.NoSuchTestItemAnswerException;

import ru.dokstudio.model.TestItemAnswer;
import ru.dokstudio.model.impl.TestItemAnswerImpl;
import ru.dokstudio.model.impl.TestItemAnswerModelImpl;

import ru.dokstudio.service.persistence.TestItemAnswerPersistence;

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
 * The persistence implementation for the test item answer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAnswerPersistence
 * @see ru.dokstudio.service.persistence.TestItemAnswerUtil
 * @generated
 */
@ProviderType
public class TestItemAnswerPersistenceImpl extends BasePersistenceImpl<TestItemAnswer>
	implements TestItemAnswerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestItemAnswerUtil} to access the test item answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestItemAnswerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestItemAnswerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestItemAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestItemAnswerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestItemAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TestItemAnswerModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the test item answers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching test item answers
	 */
	@Override
	public List<TestItemAnswer> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestItemAnswer> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<TestItemAnswer> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<TestItemAnswer> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator,
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

		List<TestItemAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestItemAnswer testItemAnswer : list) {
					if (!Objects.equals(uuid, testItemAnswer.getUuid())) {
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

			query.append(_SQL_SELECT_TESTITEMANSWER_WHERE);

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
				query.append(TestItemAnswerModelImpl.ORDER_BY_JPQL);
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
					list = (List<TestItemAnswer>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemAnswer>)QueryUtil.list(q,
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
	 * Returns the first test item answer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item answer
	 * @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer findByUuid_First(String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException {
		TestItemAnswer testItemAnswer = fetchByUuid_First(uuid,
				orderByComparator);

		if (testItemAnswer != null) {
			return testItemAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAnswerException(msg.toString());
	}

	/**
	 * Returns the first test item answer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item answer, or <code>null</code> if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer fetchByUuid_First(String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		List<TestItemAnswer> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test item answer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item answer
	 * @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer findByUuid_Last(String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException {
		TestItemAnswer testItemAnswer = fetchByUuid_Last(uuid, orderByComparator);

		if (testItemAnswer != null) {
			return testItemAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAnswerException(msg.toString());
	}

	/**
	 * Returns the last test item answer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item answer, or <code>null</code> if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer fetchByUuid_Last(String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TestItemAnswer> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TestItemAnswer[] findByUuid_PrevAndNext(long answerId, String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException {
		TestItemAnswer testItemAnswer = findByPrimaryKey(answerId);

		Session session = null;

		try {
			session = openSession();

			TestItemAnswer[] array = new TestItemAnswerImpl[3];

			array[0] = getByUuid_PrevAndNext(session, testItemAnswer, uuid,
					orderByComparator, true);

			array[1] = testItemAnswer;

			array[2] = getByUuid_PrevAndNext(session, testItemAnswer, uuid,
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

	protected TestItemAnswer getByUuid_PrevAndNext(Session session,
		TestItemAnswer testItemAnswer, String uuid,
		OrderByComparator<TestItemAnswer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTITEMANSWER_WHERE);

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
			query.append(TestItemAnswerModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(testItemAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestItemAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test item answers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TestItemAnswer testItemAnswer : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testItemAnswer);
		}
	}

	/**
	 * Returns the number of test item answers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching test item answers
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTITEMANSWER_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "testItemAnswer.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "testItemAnswer.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(testItemAnswer.uuid IS NULL OR testItemAnswer.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUESTION = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestItemAnswerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuestion",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION =
		new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestItemAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQuestion",
			new String[] { Long.class.getName() },
			TestItemAnswerModelImpl.QUESTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUESTION = new FinderPath(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuestion",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the test item answers where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the matching test item answers
	 */
	@Override
	public List<TestItemAnswer> findByQuestion(long questionId) {
		return findByQuestion(questionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<TestItemAnswer> findByQuestion(long questionId, int start,
		int end) {
		return findByQuestion(questionId, start, end, null);
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
	@Override
	public List<TestItemAnswer> findByQuestion(long questionId, int start,
		int end, OrderByComparator<TestItemAnswer> orderByComparator) {
		return findByQuestion(questionId, start, end, orderByComparator, true);
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
	@Override
	public List<TestItemAnswer> findByQuestion(long questionId, int start,
		int end, OrderByComparator<TestItemAnswer> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION;
			finderArgs = new Object[] { questionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUESTION;
			finderArgs = new Object[] { questionId, start, end, orderByComparator };
		}

		List<TestItemAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestItemAnswer testItemAnswer : list) {
					if ((questionId != testItemAnswer.getQuestionId())) {
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

			query.append(_SQL_SELECT_TESTITEMANSWER_WHERE);

			query.append(_FINDER_COLUMN_QUESTION_QUESTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestItemAnswerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

				if (!pagination) {
					list = (List<TestItemAnswer>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemAnswer>)QueryUtil.list(q,
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
	 * Returns the first test item answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item answer
	 * @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer findByQuestion_First(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException {
		TestItemAnswer testItemAnswer = fetchByQuestion_First(questionId,
				orderByComparator);

		if (testItemAnswer != null) {
			return testItemAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionId=");
		msg.append(questionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAnswerException(msg.toString());
	}

	/**
	 * Returns the first test item answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item answer, or <code>null</code> if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer fetchByQuestion_First(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		List<TestItemAnswer> list = findByQuestion(questionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test item answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item answer
	 * @throws NoSuchTestItemAnswerException if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer findByQuestion_Last(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException {
		TestItemAnswer testItemAnswer = fetchByQuestion_Last(questionId,
				orderByComparator);

		if (testItemAnswer != null) {
			return testItemAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionId=");
		msg.append(questionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAnswerException(msg.toString());
	}

	/**
	 * Returns the last test item answer in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item answer, or <code>null</code> if a matching test item answer could not be found
	 */
	@Override
	public TestItemAnswer fetchByQuestion_Last(long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		int count = countByQuestion(questionId);

		if (count == 0) {
			return null;
		}

		List<TestItemAnswer> list = findByQuestion(questionId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TestItemAnswer[] findByQuestion_PrevAndNext(long answerId,
		long questionId, OrderByComparator<TestItemAnswer> orderByComparator)
		throws NoSuchTestItemAnswerException {
		TestItemAnswer testItemAnswer = findByPrimaryKey(answerId);

		Session session = null;

		try {
			session = openSession();

			TestItemAnswer[] array = new TestItemAnswerImpl[3];

			array[0] = getByQuestion_PrevAndNext(session, testItemAnswer,
					questionId, orderByComparator, true);

			array[1] = testItemAnswer;

			array[2] = getByQuestion_PrevAndNext(session, testItemAnswer,
					questionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestItemAnswer getByQuestion_PrevAndNext(Session session,
		TestItemAnswer testItemAnswer, long questionId,
		OrderByComparator<TestItemAnswer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTITEMANSWER_WHERE);

		query.append(_FINDER_COLUMN_QUESTION_QUESTIONID_2);

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
			query.append(TestItemAnswerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(questionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testItemAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestItemAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test item answers where questionId = &#63; from the database.
	 *
	 * @param questionId the question ID
	 */
	@Override
	public void removeByQuestion(long questionId) {
		for (TestItemAnswer testItemAnswer : findByQuestion(questionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testItemAnswer);
		}
	}

	/**
	 * Returns the number of test item answers where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the number of matching test item answers
	 */
	@Override
	public int countByQuestion(long questionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUESTION;

		Object[] finderArgs = new Object[] { questionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTITEMANSWER_WHERE);

			query.append(_FINDER_COLUMN_QUESTION_QUESTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

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

	private static final String _FINDER_COLUMN_QUESTION_QUESTIONID_2 = "testItemAnswer.questionId = ?";

	public TestItemAnswerPersistenceImpl() {
		setModelClass(TestItemAnswer.class);
	}

	/**
	 * Caches the test item answer in the entity cache if it is enabled.
	 *
	 * @param testItemAnswer the test item answer
	 */
	@Override
	public void cacheResult(TestItemAnswer testItemAnswer) {
		entityCache.putResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerImpl.class, testItemAnswer.getPrimaryKey(),
			testItemAnswer);

		testItemAnswer.resetOriginalValues();
	}

	/**
	 * Caches the test item answers in the entity cache if it is enabled.
	 *
	 * @param testItemAnswers the test item answers
	 */
	@Override
	public void cacheResult(List<TestItemAnswer> testItemAnswers) {
		for (TestItemAnswer testItemAnswer : testItemAnswers) {
			if (entityCache.getResult(
						TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
						TestItemAnswerImpl.class, testItemAnswer.getPrimaryKey()) == null) {
				cacheResult(testItemAnswer);
			}
			else {
				testItemAnswer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test item answers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestItemAnswerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test item answer.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestItemAnswer testItemAnswer) {
		entityCache.removeResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerImpl.class, testItemAnswer.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TestItemAnswer> testItemAnswers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestItemAnswer testItemAnswer : testItemAnswers) {
			entityCache.removeResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
				TestItemAnswerImpl.class, testItemAnswer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new test item answer with the primary key. Does not add the test item answer to the database.
	 *
	 * @param answerId the primary key for the new test item answer
	 * @return the new test item answer
	 */
	@Override
	public TestItemAnswer create(long answerId) {
		TestItemAnswer testItemAnswer = new TestItemAnswerImpl();

		testItemAnswer.setNew(true);
		testItemAnswer.setPrimaryKey(answerId);

		String uuid = PortalUUIDUtil.generate();

		testItemAnswer.setUuid(uuid);

		return testItemAnswer;
	}

	/**
	 * Removes the test item answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param answerId the primary key of the test item answer
	 * @return the test item answer that was removed
	 * @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	 */
	@Override
	public TestItemAnswer remove(long answerId)
		throws NoSuchTestItemAnswerException {
		return remove((Serializable)answerId);
	}

	/**
	 * Removes the test item answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test item answer
	 * @return the test item answer that was removed
	 * @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	 */
	@Override
	public TestItemAnswer remove(Serializable primaryKey)
		throws NoSuchTestItemAnswerException {
		Session session = null;

		try {
			session = openSession();

			TestItemAnswer testItemAnswer = (TestItemAnswer)session.get(TestItemAnswerImpl.class,
					primaryKey);

			if (testItemAnswer == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestItemAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testItemAnswer);
		}
		catch (NoSuchTestItemAnswerException nsee) {
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
	protected TestItemAnswer removeImpl(TestItemAnswer testItemAnswer) {
		testItemAnswer = toUnwrappedModel(testItemAnswer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testItemAnswer)) {
				testItemAnswer = (TestItemAnswer)session.get(TestItemAnswerImpl.class,
						testItemAnswer.getPrimaryKeyObj());
			}

			if (testItemAnswer != null) {
				session.delete(testItemAnswer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testItemAnswer != null) {
			clearCache(testItemAnswer);
		}

		return testItemAnswer;
	}

	@Override
	public TestItemAnswer updateImpl(TestItemAnswer testItemAnswer) {
		testItemAnswer = toUnwrappedModel(testItemAnswer);

		boolean isNew = testItemAnswer.isNew();

		TestItemAnswerModelImpl testItemAnswerModelImpl = (TestItemAnswerModelImpl)testItemAnswer;

		if (Validator.isNull(testItemAnswer.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			testItemAnswer.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (testItemAnswer.isNew()) {
				session.save(testItemAnswer);

				testItemAnswer.setNew(false);
			}
			else {
				testItemAnswer = (TestItemAnswer)session.merge(testItemAnswer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TestItemAnswerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((testItemAnswerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testItemAnswerModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { testItemAnswerModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((testItemAnswerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testItemAnswerModelImpl.getOriginalQuestionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION,
					args);

				args = new Object[] { testItemAnswerModelImpl.getQuestionId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION,
					args);
			}
		}

		entityCache.putResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAnswerImpl.class, testItemAnswer.getPrimaryKey(),
			testItemAnswer, false);

		testItemAnswer.resetOriginalValues();

		return testItemAnswer;
	}

	protected TestItemAnswer toUnwrappedModel(TestItemAnswer testItemAnswer) {
		if (testItemAnswer instanceof TestItemAnswerImpl) {
			return testItemAnswer;
		}

		TestItemAnswerImpl testItemAnswerImpl = new TestItemAnswerImpl();

		testItemAnswerImpl.setNew(testItemAnswer.isNew());
		testItemAnswerImpl.setPrimaryKey(testItemAnswer.getPrimaryKey());

		testItemAnswerImpl.setUuid(testItemAnswer.getUuid());
		testItemAnswerImpl.setAnswerId(testItemAnswer.getAnswerId());
		testItemAnswerImpl.setQuestionId(testItemAnswer.getQuestionId());
		testItemAnswerImpl.setAnswer(testItemAnswer.getAnswer());
		testItemAnswerImpl.setIsCorrect(testItemAnswer.isIsCorrect());

		return testItemAnswerImpl;
	}

	/**
	 * Returns the test item answer with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test item answer
	 * @return the test item answer
	 * @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	 */
	@Override
	public TestItemAnswer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestItemAnswerException {
		TestItemAnswer testItemAnswer = fetchByPrimaryKey(primaryKey);

		if (testItemAnswer == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestItemAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testItemAnswer;
	}

	/**
	 * Returns the test item answer with the primary key or throws a {@link NoSuchTestItemAnswerException} if it could not be found.
	 *
	 * @param answerId the primary key of the test item answer
	 * @return the test item answer
	 * @throws NoSuchTestItemAnswerException if a test item answer with the primary key could not be found
	 */
	@Override
	public TestItemAnswer findByPrimaryKey(long answerId)
		throws NoSuchTestItemAnswerException {
		return findByPrimaryKey((Serializable)answerId);
	}

	/**
	 * Returns the test item answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test item answer
	 * @return the test item answer, or <code>null</code> if a test item answer with the primary key could not be found
	 */
	@Override
	public TestItemAnswer fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
				TestItemAnswerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TestItemAnswer testItemAnswer = (TestItemAnswer)serializable;

		if (testItemAnswer == null) {
			Session session = null;

			try {
				session = openSession();

				testItemAnswer = (TestItemAnswer)session.get(TestItemAnswerImpl.class,
						primaryKey);

				if (testItemAnswer != null) {
					cacheResult(testItemAnswer);
				}
				else {
					entityCache.putResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
						TestItemAnswerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
					TestItemAnswerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testItemAnswer;
	}

	/**
	 * Returns the test item answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param answerId the primary key of the test item answer
	 * @return the test item answer, or <code>null</code> if a test item answer with the primary key could not be found
	 */
	@Override
	public TestItemAnswer fetchByPrimaryKey(long answerId) {
		return fetchByPrimaryKey((Serializable)answerId);
	}

	@Override
	public Map<Serializable, TestItemAnswer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestItemAnswer> map = new HashMap<Serializable, TestItemAnswer>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestItemAnswer testItemAnswer = fetchByPrimaryKey(primaryKey);

			if (testItemAnswer != null) {
				map.put(primaryKey, testItemAnswer);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
					TestItemAnswerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TestItemAnswer)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTITEMANSWER_WHERE_PKS_IN);

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

			for (TestItemAnswer testItemAnswer : (List<TestItemAnswer>)q.list()) {
				map.put(testItemAnswer.getPrimaryKeyObj(), testItemAnswer);

				cacheResult(testItemAnswer);

				uncachedPrimaryKeys.remove(testItemAnswer.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestItemAnswerModelImpl.ENTITY_CACHE_ENABLED,
					TestItemAnswerImpl.class, primaryKey, nullModel);
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
	 * Returns all the test item answers.
	 *
	 * @return the test item answers
	 */
	@Override
	public List<TestItemAnswer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestItemAnswer> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TestItemAnswer> findAll(int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TestItemAnswer> findAll(int start, int end,
		OrderByComparator<TestItemAnswer> orderByComparator,
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

		List<TestItemAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTITEMANSWER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTITEMANSWER;

				if (pagination) {
					sql = sql.concat(TestItemAnswerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestItemAnswer>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemAnswer>)QueryUtil.list(q,
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
	 * Removes all the test item answers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestItemAnswer testItemAnswer : findAll()) {
			remove(testItemAnswer);
		}
	}

	/**
	 * Returns the number of test item answers.
	 *
	 * @return the number of test item answers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTITEMANSWER);

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
		return TestItemAnswerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test item answer persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestItemAnswerImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTITEMANSWER = "SELECT testItemAnswer FROM TestItemAnswer testItemAnswer";
	private static final String _SQL_SELECT_TESTITEMANSWER_WHERE_PKS_IN = "SELECT testItemAnswer FROM TestItemAnswer testItemAnswer WHERE answerId IN (";
	private static final String _SQL_SELECT_TESTITEMANSWER_WHERE = "SELECT testItemAnswer FROM TestItemAnswer testItemAnswer WHERE ";
	private static final String _SQL_COUNT_TESTITEMANSWER = "SELECT COUNT(testItemAnswer) FROM TestItemAnswer testItemAnswer";
	private static final String _SQL_COUNT_TESTITEMANSWER_WHERE = "SELECT COUNT(testItemAnswer) FROM TestItemAnswer testItemAnswer WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testItemAnswer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestItemAnswer exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TestItemAnswer exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TestItemAnswerPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}