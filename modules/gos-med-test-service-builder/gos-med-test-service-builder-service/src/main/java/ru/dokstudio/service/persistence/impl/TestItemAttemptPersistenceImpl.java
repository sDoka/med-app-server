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

import ru.dokstudio.exception.NoSuchTestItemAttemptException;

import ru.dokstudio.model.TestItemAttempt;
import ru.dokstudio.model.impl.TestItemAttemptImpl;
import ru.dokstudio.model.impl.TestItemAttemptModelImpl;

import ru.dokstudio.service.persistence.TestItemAttemptPersistence;

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
 * The persistence implementation for the test item attempt service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAttemptPersistence
 * @see ru.dokstudio.service.persistence.TestItemAttemptUtil
 * @generated
 */
@ProviderType
public class TestItemAttemptPersistenceImpl extends BasePersistenceImpl<TestItemAttempt>
	implements TestItemAttemptPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestItemAttemptUtil} to access the test item attempt persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestItemAttemptImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestItemAttemptImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestItemAttemptImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestItemAttemptImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestItemAttemptImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TestItemAttemptModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the test item attempts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching test item attempts
	 */
	@Override
	public List<TestItemAttempt> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<TestItemAttempt> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<TestItemAttempt> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<TestItemAttempt> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator,
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

		List<TestItemAttempt> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemAttempt>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestItemAttempt testItemAttempt : list) {
					if (!Objects.equals(uuid, testItemAttempt.getUuid())) {
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

			query.append(_SQL_SELECT_TESTITEMATTEMPT_WHERE);

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
				query.append(TestItemAttemptModelImpl.ORDER_BY_JPQL);
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
					list = (List<TestItemAttempt>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemAttempt>)QueryUtil.list(q,
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
	 * Returns the first test item attempt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item attempt
	 * @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt findByUuid_First(String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException {
		TestItemAttempt testItemAttempt = fetchByUuid_First(uuid,
				orderByComparator);

		if (testItemAttempt != null) {
			return testItemAttempt;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAttemptException(msg.toString());
	}

	/**
	 * Returns the first test item attempt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt fetchByUuid_First(String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		List<TestItemAttempt> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test item attempt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item attempt
	 * @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt findByUuid_Last(String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException {
		TestItemAttempt testItemAttempt = fetchByUuid_Last(uuid,
				orderByComparator);

		if (testItemAttempt != null) {
			return testItemAttempt;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAttemptException(msg.toString());
	}

	/**
	 * Returns the last test item attempt in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt fetchByUuid_Last(String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TestItemAttempt> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the test item attempts before and after the current test item attempt in the ordered set where uuid = &#63;.
	 *
	 * @param attemptId the primary key of the current test item attempt
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test item attempt
	 * @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt[] findByUuid_PrevAndNext(long attemptId,
		String uuid, OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException {
		TestItemAttempt testItemAttempt = findByPrimaryKey(attemptId);

		Session session = null;

		try {
			session = openSession();

			TestItemAttempt[] array = new TestItemAttemptImpl[3];

			array[0] = getByUuid_PrevAndNext(session, testItemAttempt, uuid,
					orderByComparator, true);

			array[1] = testItemAttempt;

			array[2] = getByUuid_PrevAndNext(session, testItemAttempt, uuid,
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

	protected TestItemAttempt getByUuid_PrevAndNext(Session session,
		TestItemAttempt testItemAttempt, String uuid,
		OrderByComparator<TestItemAttempt> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTITEMATTEMPT_WHERE);

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
			query.append(TestItemAttemptModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(testItemAttempt);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestItemAttempt> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test item attempts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TestItemAttempt testItemAttempt : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testItemAttempt);
		}
	}

	/**
	 * Returns the number of test item attempts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching test item attempts
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTITEMATTEMPT_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "testItemAttempt.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "testItemAttempt.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(testItemAttempt.uuid IS NULL OR testItemAttempt.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUESTION = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestItemAttemptImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuestion",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION =
		new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestItemAttemptImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQuestion",
			new String[] { Long.class.getName() },
			TestItemAttemptModelImpl.QUESTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUESTION = new FinderPath(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuestion",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the test item attempts where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the matching test item attempts
	 */
	@Override
	public List<TestItemAttempt> findByQuestion(long questionId) {
		return findByQuestion(questionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<TestItemAttempt> findByQuestion(long questionId, int start,
		int end) {
		return findByQuestion(questionId, start, end, null);
	}

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
	@Override
	public List<TestItemAttempt> findByQuestion(long questionId, int start,
		int end, OrderByComparator<TestItemAttempt> orderByComparator) {
		return findByQuestion(questionId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<TestItemAttempt> findByQuestion(long questionId, int start,
		int end, OrderByComparator<TestItemAttempt> orderByComparator,
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

		List<TestItemAttempt> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemAttempt>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestItemAttempt testItemAttempt : list) {
					if ((questionId != testItemAttempt.getQuestionId())) {
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

			query.append(_SQL_SELECT_TESTITEMATTEMPT_WHERE);

			query.append(_FINDER_COLUMN_QUESTION_QUESTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestItemAttemptModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionId);

				if (!pagination) {
					list = (List<TestItemAttempt>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemAttempt>)QueryUtil.list(q,
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
	 * Returns the first test item attempt in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item attempt
	 * @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt findByQuestion_First(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException {
		TestItemAttempt testItemAttempt = fetchByQuestion_First(questionId,
				orderByComparator);

		if (testItemAttempt != null) {
			return testItemAttempt;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionId=");
		msg.append(questionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAttemptException(msg.toString());
	}

	/**
	 * Returns the first test item attempt in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt fetchByQuestion_First(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		List<TestItemAttempt> list = findByQuestion(questionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test item attempt in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item attempt
	 * @throws NoSuchTestItemAttemptException if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt findByQuestion_Last(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException {
		TestItemAttempt testItemAttempt = fetchByQuestion_Last(questionId,
				orderByComparator);

		if (testItemAttempt != null) {
			return testItemAttempt;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionId=");
		msg.append(questionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestItemAttemptException(msg.toString());
	}

	/**
	 * Returns the last test item attempt in the ordered set where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test item attempt, or <code>null</code> if a matching test item attempt could not be found
	 */
	@Override
	public TestItemAttempt fetchByQuestion_Last(long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		int count = countByQuestion(questionId);

		if (count == 0) {
			return null;
		}

		List<TestItemAttempt> list = findByQuestion(questionId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the test item attempts before and after the current test item attempt in the ordered set where questionId = &#63;.
	 *
	 * @param attemptId the primary key of the current test item attempt
	 * @param questionId the question ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test item attempt
	 * @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt[] findByQuestion_PrevAndNext(long attemptId,
		long questionId, OrderByComparator<TestItemAttempt> orderByComparator)
		throws NoSuchTestItemAttemptException {
		TestItemAttempt testItemAttempt = findByPrimaryKey(attemptId);

		Session session = null;

		try {
			session = openSession();

			TestItemAttempt[] array = new TestItemAttemptImpl[3];

			array[0] = getByQuestion_PrevAndNext(session, testItemAttempt,
					questionId, orderByComparator, true);

			array[1] = testItemAttempt;

			array[2] = getByQuestion_PrevAndNext(session, testItemAttempt,
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

	protected TestItemAttempt getByQuestion_PrevAndNext(Session session,
		TestItemAttempt testItemAttempt, long questionId,
		OrderByComparator<TestItemAttempt> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTITEMATTEMPT_WHERE);

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
			query.append(TestItemAttemptModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(questionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testItemAttempt);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestItemAttempt> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test item attempts where questionId = &#63; from the database.
	 *
	 * @param questionId the question ID
	 */
	@Override
	public void removeByQuestion(long questionId) {
		for (TestItemAttempt testItemAttempt : findByQuestion(questionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testItemAttempt);
		}
	}

	/**
	 * Returns the number of test item attempts where questionId = &#63;.
	 *
	 * @param questionId the question ID
	 * @return the number of matching test item attempts
	 */
	@Override
	public int countByQuestion(long questionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUESTION;

		Object[] finderArgs = new Object[] { questionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTITEMATTEMPT_WHERE);

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

	private static final String _FINDER_COLUMN_QUESTION_QUESTIONID_2 = "testItemAttempt.questionId = ?";

	public TestItemAttemptPersistenceImpl() {
		setModelClass(TestItemAttempt.class);
	}

	/**
	 * Caches the test item attempt in the entity cache if it is enabled.
	 *
	 * @param testItemAttempt the test item attempt
	 */
	@Override
	public void cacheResult(TestItemAttempt testItemAttempt) {
		entityCache.putResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptImpl.class, testItemAttempt.getPrimaryKey(),
			testItemAttempt);

		testItemAttempt.resetOriginalValues();
	}

	/**
	 * Caches the test item attempts in the entity cache if it is enabled.
	 *
	 * @param testItemAttempts the test item attempts
	 */
	@Override
	public void cacheResult(List<TestItemAttempt> testItemAttempts) {
		for (TestItemAttempt testItemAttempt : testItemAttempts) {
			if (entityCache.getResult(
						TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
						TestItemAttemptImpl.class,
						testItemAttempt.getPrimaryKey()) == null) {
				cacheResult(testItemAttempt);
			}
			else {
				testItemAttempt.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test item attempts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestItemAttemptImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test item attempt.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestItemAttempt testItemAttempt) {
		entityCache.removeResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptImpl.class, testItemAttempt.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TestItemAttempt> testItemAttempts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestItemAttempt testItemAttempt : testItemAttempts) {
			entityCache.removeResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
				TestItemAttemptImpl.class, testItemAttempt.getPrimaryKey());
		}
	}

	/**
	 * Creates a new test item attempt with the primary key. Does not add the test item attempt to the database.
	 *
	 * @param attemptId the primary key for the new test item attempt
	 * @return the new test item attempt
	 */
	@Override
	public TestItemAttempt create(long attemptId) {
		TestItemAttempt testItemAttempt = new TestItemAttemptImpl();

		testItemAttempt.setNew(true);
		testItemAttempt.setPrimaryKey(attemptId);

		String uuid = PortalUUIDUtil.generate();

		testItemAttempt.setUuid(uuid);

		return testItemAttempt;
	}

	/**
	 * Removes the test item attempt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attemptId the primary key of the test item attempt
	 * @return the test item attempt that was removed
	 * @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt remove(long attemptId)
		throws NoSuchTestItemAttemptException {
		return remove((Serializable)attemptId);
	}

	/**
	 * Removes the test item attempt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test item attempt
	 * @return the test item attempt that was removed
	 * @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt remove(Serializable primaryKey)
		throws NoSuchTestItemAttemptException {
		Session session = null;

		try {
			session = openSession();

			TestItemAttempt testItemAttempt = (TestItemAttempt)session.get(TestItemAttemptImpl.class,
					primaryKey);

			if (testItemAttempt == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestItemAttemptException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testItemAttempt);
		}
		catch (NoSuchTestItemAttemptException nsee) {
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
	protected TestItemAttempt removeImpl(TestItemAttempt testItemAttempt) {
		testItemAttempt = toUnwrappedModel(testItemAttempt);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testItemAttempt)) {
				testItemAttempt = (TestItemAttempt)session.get(TestItemAttemptImpl.class,
						testItemAttempt.getPrimaryKeyObj());
			}

			if (testItemAttempt != null) {
				session.delete(testItemAttempt);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testItemAttempt != null) {
			clearCache(testItemAttempt);
		}

		return testItemAttempt;
	}

	@Override
	public TestItemAttempt updateImpl(TestItemAttempt testItemAttempt) {
		testItemAttempt = toUnwrappedModel(testItemAttempt);

		boolean isNew = testItemAttempt.isNew();

		TestItemAttemptModelImpl testItemAttemptModelImpl = (TestItemAttemptModelImpl)testItemAttempt;

		if (Validator.isNull(testItemAttempt.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			testItemAttempt.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (testItemAttempt.isNew()) {
				session.save(testItemAttempt);

				testItemAttempt.setNew(false);
			}
			else {
				testItemAttempt = (TestItemAttempt)session.merge(testItemAttempt);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TestItemAttemptModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((testItemAttemptModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testItemAttemptModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { testItemAttemptModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((testItemAttemptModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testItemAttemptModelImpl.getOriginalQuestionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION,
					args);

				args = new Object[] { testItemAttemptModelImpl.getQuestionId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_QUESTION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUESTION,
					args);
			}
		}

		entityCache.putResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestItemAttemptImpl.class, testItemAttempt.getPrimaryKey(),
			testItemAttempt, false);

		testItemAttempt.resetOriginalValues();

		return testItemAttempt;
	}

	protected TestItemAttempt toUnwrappedModel(TestItemAttempt testItemAttempt) {
		if (testItemAttempt instanceof TestItemAttemptImpl) {
			return testItemAttempt;
		}

		TestItemAttemptImpl testItemAttemptImpl = new TestItemAttemptImpl();

		testItemAttemptImpl.setNew(testItemAttempt.isNew());
		testItemAttemptImpl.setPrimaryKey(testItemAttempt.getPrimaryKey());

		testItemAttemptImpl.setUuid(testItemAttempt.getUuid());
		testItemAttemptImpl.setAttemptId(testItemAttempt.getAttemptId());
		testItemAttemptImpl.setQuestionId(testItemAttempt.getQuestionId());
		testItemAttemptImpl.setAnswerId(testItemAttempt.getAnswerId());
		testItemAttemptImpl.setIsSuccessAttempt(testItemAttempt.isIsSuccessAttempt());
		testItemAttemptImpl.setAttemptDate(testItemAttempt.getAttemptDate());

		return testItemAttemptImpl;
	}

	/**
	 * Returns the test item attempt with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test item attempt
	 * @return the test item attempt
	 * @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestItemAttemptException {
		TestItemAttempt testItemAttempt = fetchByPrimaryKey(primaryKey);

		if (testItemAttempt == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestItemAttemptException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testItemAttempt;
	}

	/**
	 * Returns the test item attempt with the primary key or throws a {@link NoSuchTestItemAttemptException} if it could not be found.
	 *
	 * @param attemptId the primary key of the test item attempt
	 * @return the test item attempt
	 * @throws NoSuchTestItemAttemptException if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt findByPrimaryKey(long attemptId)
		throws NoSuchTestItemAttemptException {
		return findByPrimaryKey((Serializable)attemptId);
	}

	/**
	 * Returns the test item attempt with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test item attempt
	 * @return the test item attempt, or <code>null</code> if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
				TestItemAttemptImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TestItemAttempt testItemAttempt = (TestItemAttempt)serializable;

		if (testItemAttempt == null) {
			Session session = null;

			try {
				session = openSession();

				testItemAttempt = (TestItemAttempt)session.get(TestItemAttemptImpl.class,
						primaryKey);

				if (testItemAttempt != null) {
					cacheResult(testItemAttempt);
				}
				else {
					entityCache.putResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
						TestItemAttemptImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
					TestItemAttemptImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testItemAttempt;
	}

	/**
	 * Returns the test item attempt with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attemptId the primary key of the test item attempt
	 * @return the test item attempt, or <code>null</code> if a test item attempt with the primary key could not be found
	 */
	@Override
	public TestItemAttempt fetchByPrimaryKey(long attemptId) {
		return fetchByPrimaryKey((Serializable)attemptId);
	}

	@Override
	public Map<Serializable, TestItemAttempt> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestItemAttempt> map = new HashMap<Serializable, TestItemAttempt>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestItemAttempt testItemAttempt = fetchByPrimaryKey(primaryKey);

			if (testItemAttempt != null) {
				map.put(primaryKey, testItemAttempt);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
					TestItemAttemptImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TestItemAttempt)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTITEMATTEMPT_WHERE_PKS_IN);

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

			for (TestItemAttempt testItemAttempt : (List<TestItemAttempt>)q.list()) {
				map.put(testItemAttempt.getPrimaryKeyObj(), testItemAttempt);

				cacheResult(testItemAttempt);

				uncachedPrimaryKeys.remove(testItemAttempt.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestItemAttemptModelImpl.ENTITY_CACHE_ENABLED,
					TestItemAttemptImpl.class, primaryKey, nullModel);
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
	 * Returns all the test item attempts.
	 *
	 * @return the test item attempts
	 */
	@Override
	public List<TestItemAttempt> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<TestItemAttempt> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<TestItemAttempt> findAll(int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<TestItemAttempt> findAll(int start, int end,
		OrderByComparator<TestItemAttempt> orderByComparator,
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

		List<TestItemAttempt> list = null;

		if (retrieveFromCache) {
			list = (List<TestItemAttempt>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTITEMATTEMPT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTITEMATTEMPT;

				if (pagination) {
					sql = sql.concat(TestItemAttemptModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestItemAttempt>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestItemAttempt>)QueryUtil.list(q,
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
	 * Removes all the test item attempts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestItemAttempt testItemAttempt : findAll()) {
			remove(testItemAttempt);
		}
	}

	/**
	 * Returns the number of test item attempts.
	 *
	 * @return the number of test item attempts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTITEMATTEMPT);

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
		return TestItemAttemptModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test item attempt persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestItemAttemptImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTITEMATTEMPT = "SELECT testItemAttempt FROM TestItemAttempt testItemAttempt";
	private static final String _SQL_SELECT_TESTITEMATTEMPT_WHERE_PKS_IN = "SELECT testItemAttempt FROM TestItemAttempt testItemAttempt WHERE attemptId IN (";
	private static final String _SQL_SELECT_TESTITEMATTEMPT_WHERE = "SELECT testItemAttempt FROM TestItemAttempt testItemAttempt WHERE ";
	private static final String _SQL_COUNT_TESTITEMATTEMPT = "SELECT COUNT(testItemAttempt) FROM TestItemAttempt testItemAttempt";
	private static final String _SQL_COUNT_TESTITEMATTEMPT_WHERE = "SELECT COUNT(testItemAttempt) FROM TestItemAttempt testItemAttempt WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testItemAttempt.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestItemAttempt exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TestItemAttempt exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TestItemAttemptPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}