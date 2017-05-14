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

package ru.dokstrudio.med.srv.service.persistence.impl;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitAttemptException;
import ru.dokstrudio.med.srv.model.TestUnitAttempt;
import ru.dokstrudio.med.srv.model.impl.TestUnitAttemptImpl;
import ru.dokstrudio.med.srv.model.impl.TestUnitAttemptModelImpl;
import ru.dokstrudio.med.srv.service.persistence.TestUnitAttemptPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the test unit attempt service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAttemptPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.TestUnitAttemptUtil
 * @generated
 */
@ProviderType
public class TestUnitAttemptPersistenceImpl extends BasePersistenceImpl<TestUnitAttempt>
	implements TestUnitAttemptPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestUnitAttemptUtil} to access the test unit attempt persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestUnitAttemptImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAttemptImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAttemptImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TESTUNITID =
		new FinderPath(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAttemptImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTestUnitId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID =
		new FinderPath(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAttemptImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTestUnitId",
			new String[] { Long.class.getName() },
			TestUnitAttemptModelImpl.TESTUNITANSWERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TESTUNITID = new FinderPath(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTestUnitId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the test unit attempts where testUnitAnswerId = &#63;.
	 *
	 * @param testUnitAnswerId the test unit answer ID
	 * @return the matching test unit attempts
	 */
	@Override
	public List<TestUnitAttempt> findByTestUnitId(long testUnitAnswerId) {
		return findByTestUnitId(testUnitAnswerId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<TestUnitAttempt> findByTestUnitId(long testUnitAnswerId,
		int start, int end) {
		return findByTestUnitId(testUnitAnswerId, start, end, null);
	}

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
	@Override
	public List<TestUnitAttempt> findByTestUnitId(long testUnitAnswerId,
		int start, int end, OrderByComparator<TestUnitAttempt> orderByComparator) {
		return findByTestUnitId(testUnitAnswerId, start, end,
			orderByComparator, true);
	}

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
	@Override
	public List<TestUnitAttempt> findByTestUnitId(long testUnitAnswerId,
		int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID;
			finderArgs = new Object[] { testUnitAnswerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TESTUNITID;
			finderArgs = new Object[] {
					testUnitAnswerId,
					
					start, end, orderByComparator
				};
		}

		List<TestUnitAttempt> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnitAttempt>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestUnitAttempt testUnitAttempt : list) {
					if ((testUnitAnswerId != testUnitAttempt.getTestUnitAnswerId())) {
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

			query.append(_SQL_SELECT_TESTUNITATTEMPT_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITID_TESTUNITANSWERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestUnitAttemptModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(testUnitAnswerId);

				if (!pagination) {
					list = (List<TestUnitAttempt>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnitAttempt>)QueryUtil.list(q,
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
	 * Returns the first test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	 *
	 * @param testUnitAnswerId the test unit answer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit attempt
	 * @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	 */
	@Override
	public TestUnitAttempt findByTestUnitId_First(long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator)
		throws NoSuchTestUnitAttemptException {
		TestUnitAttempt testUnitAttempt = fetchByTestUnitId_First(testUnitAnswerId,
				orderByComparator);

		if (testUnitAttempt != null) {
			return testUnitAttempt;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("testUnitAnswerId=");
		msg.append(testUnitAnswerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitAttemptException(msg.toString());
	}

	/**
	 * Returns the first test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	 *
	 * @param testUnitAnswerId the test unit answer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	 */
	@Override
	public TestUnitAttempt fetchByTestUnitId_First(long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		List<TestUnitAttempt> list = findByTestUnitId(testUnitAnswerId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	 *
	 * @param testUnitAnswerId the test unit answer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit attempt
	 * @throws NoSuchTestUnitAttemptException if a matching test unit attempt could not be found
	 */
	@Override
	public TestUnitAttempt findByTestUnitId_Last(long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator)
		throws NoSuchTestUnitAttemptException {
		TestUnitAttempt testUnitAttempt = fetchByTestUnitId_Last(testUnitAnswerId,
				orderByComparator);

		if (testUnitAttempt != null) {
			return testUnitAttempt;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("testUnitAnswerId=");
		msg.append(testUnitAnswerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitAttemptException(msg.toString());
	}

	/**
	 * Returns the last test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	 *
	 * @param testUnitAnswerId the test unit answer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit attempt, or <code>null</code> if a matching test unit attempt could not be found
	 */
	@Override
	public TestUnitAttempt fetchByTestUnitId_Last(long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		int count = countByTestUnitId(testUnitAnswerId);

		if (count == 0) {
			return null;
		}

		List<TestUnitAttempt> list = findByTestUnitId(testUnitAnswerId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the test unit attempts before and after the current test unit attempt in the ordered set where testUnitAnswerId = &#63;.
	 *
	 * @param testUnitAttemptId the primary key of the current test unit attempt
	 * @param testUnitAnswerId the test unit answer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test unit attempt
	 * @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	 */
	@Override
	public TestUnitAttempt[] findByTestUnitId_PrevAndNext(
		long testUnitAttemptId, long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator)
		throws NoSuchTestUnitAttemptException {
		TestUnitAttempt testUnitAttempt = findByPrimaryKey(testUnitAttemptId);

		Session session = null;

		try {
			session = openSession();

			TestUnitAttempt[] array = new TestUnitAttemptImpl[3];

			array[0] = getByTestUnitId_PrevAndNext(session, testUnitAttempt,
					testUnitAnswerId, orderByComparator, true);

			array[1] = testUnitAttempt;

			array[2] = getByTestUnitId_PrevAndNext(session, testUnitAttempt,
					testUnitAnswerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestUnitAttempt getByTestUnitId_PrevAndNext(Session session,
		TestUnitAttempt testUnitAttempt, long testUnitAnswerId,
		OrderByComparator<TestUnitAttempt> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTUNITATTEMPT_WHERE);

		query.append(_FINDER_COLUMN_TESTUNITID_TESTUNITANSWERID_2);

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
			query.append(TestUnitAttemptModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(testUnitAnswerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testUnitAttempt);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestUnitAttempt> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test unit attempts where testUnitAnswerId = &#63; from the database.
	 *
	 * @param testUnitAnswerId the test unit answer ID
	 */
	@Override
	public void removeByTestUnitId(long testUnitAnswerId) {
		for (TestUnitAttempt testUnitAttempt : findByTestUnitId(
				testUnitAnswerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testUnitAttempt);
		}
	}

	/**
	 * Returns the number of test unit attempts where testUnitAnswerId = &#63;.
	 *
	 * @param testUnitAnswerId the test unit answer ID
	 * @return the number of matching test unit attempts
	 */
	@Override
	public int countByTestUnitId(long testUnitAnswerId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TESTUNITID;

		Object[] finderArgs = new Object[] { testUnitAnswerId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTUNITATTEMPT_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITID_TESTUNITANSWERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(testUnitAnswerId);

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

	private static final String _FINDER_COLUMN_TESTUNITID_TESTUNITANSWERID_2 = "testUnitAttempt.testUnitAnswerId = ?";

	public TestUnitAttemptPersistenceImpl() {
		setModelClass(TestUnitAttempt.class);
	}

	/**
	 * Caches the test unit attempt in the entity cache if it is enabled.
	 *
	 * @param testUnitAttempt the test unit attempt
	 */
	@Override
	public void cacheResult(TestUnitAttempt testUnitAttempt) {
		entityCache.putResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptImpl.class, testUnitAttempt.getPrimaryKey(),
			testUnitAttempt);

		testUnitAttempt.resetOriginalValues();
	}

	/**
	 * Caches the test unit attempts in the entity cache if it is enabled.
	 *
	 * @param testUnitAttempts the test unit attempts
	 */
	@Override
	public void cacheResult(List<TestUnitAttempt> testUnitAttempts) {
		for (TestUnitAttempt testUnitAttempt : testUnitAttempts) {
			if (entityCache.getResult(
						TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitAttemptImpl.class,
						testUnitAttempt.getPrimaryKey()) == null) {
				cacheResult(testUnitAttempt);
			}
			else {
				testUnitAttempt.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test unit attempts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestUnitAttemptImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test unit attempt.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestUnitAttempt testUnitAttempt) {
		entityCache.removeResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptImpl.class, testUnitAttempt.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TestUnitAttempt> testUnitAttempts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestUnitAttempt testUnitAttempt : testUnitAttempts) {
			entityCache.removeResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitAttemptImpl.class, testUnitAttempt.getPrimaryKey());
		}
	}

	/**
	 * Creates a new test unit attempt with the primary key. Does not add the test unit attempt to the database.
	 *
	 * @param testUnitAttemptId the primary key for the new test unit attempt
	 * @return the new test unit attempt
	 */
	@Override
	public TestUnitAttempt create(long testUnitAttemptId) {
		TestUnitAttempt testUnitAttempt = new TestUnitAttemptImpl();

		testUnitAttempt.setNew(true);
		testUnitAttempt.setPrimaryKey(testUnitAttemptId);

		return testUnitAttempt;
	}

	/**
	 * Removes the test unit attempt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testUnitAttemptId the primary key of the test unit attempt
	 * @return the test unit attempt that was removed
	 * @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	 */
	@Override
	public TestUnitAttempt remove(long testUnitAttemptId)
		throws NoSuchTestUnitAttemptException {
		return remove((Serializable)testUnitAttemptId);
	}

	/**
	 * Removes the test unit attempt with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test unit attempt
	 * @return the test unit attempt that was removed
	 * @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	 */
	@Override
	public TestUnitAttempt remove(Serializable primaryKey)
		throws NoSuchTestUnitAttemptException {
		Session session = null;

		try {
			session = openSession();

			TestUnitAttempt testUnitAttempt = (TestUnitAttempt)session.get(TestUnitAttemptImpl.class,
					primaryKey);

			if (testUnitAttempt == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestUnitAttemptException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testUnitAttempt);
		}
		catch (NoSuchTestUnitAttemptException nsee) {
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
	protected TestUnitAttempt removeImpl(TestUnitAttempt testUnitAttempt) {
		testUnitAttempt = toUnwrappedModel(testUnitAttempt);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testUnitAttempt)) {
				testUnitAttempt = (TestUnitAttempt)session.get(TestUnitAttemptImpl.class,
						testUnitAttempt.getPrimaryKeyObj());
			}

			if (testUnitAttempt != null) {
				session.delete(testUnitAttempt);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testUnitAttempt != null) {
			clearCache(testUnitAttempt);
		}

		return testUnitAttempt;
	}

	@Override
	public TestUnitAttempt updateImpl(TestUnitAttempt testUnitAttempt) {
		testUnitAttempt = toUnwrappedModel(testUnitAttempt);

		boolean isNew = testUnitAttempt.isNew();

		TestUnitAttemptModelImpl testUnitAttemptModelImpl = (TestUnitAttemptModelImpl)testUnitAttempt;

		Session session = null;

		try {
			session = openSession();

			if (testUnitAttempt.isNew()) {
				session.save(testUnitAttempt);

				testUnitAttempt.setNew(false);
			}
			else {
				testUnitAttempt = (TestUnitAttempt)session.merge(testUnitAttempt);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TestUnitAttemptModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((testUnitAttemptModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testUnitAttemptModelImpl.getOriginalTestUnitAnswerId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID,
					args);

				args = new Object[] {
						testUnitAttemptModelImpl.getTestUnitAnswerId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID,
					args);
			}
		}

		entityCache.putResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAttemptImpl.class, testUnitAttempt.getPrimaryKey(),
			testUnitAttempt, false);

		testUnitAttempt.resetOriginalValues();

		return testUnitAttempt;
	}

	protected TestUnitAttempt toUnwrappedModel(TestUnitAttempt testUnitAttempt) {
		if (testUnitAttempt instanceof TestUnitAttemptImpl) {
			return testUnitAttempt;
		}

		TestUnitAttemptImpl testUnitAttemptImpl = new TestUnitAttemptImpl();

		testUnitAttemptImpl.setNew(testUnitAttempt.isNew());
		testUnitAttemptImpl.setPrimaryKey(testUnitAttempt.getPrimaryKey());

		testUnitAttemptImpl.setTestUnitAttemptId(testUnitAttempt.getTestUnitAttemptId());
		testUnitAttemptImpl.setUserId(testUnitAttempt.getUserId());
		testUnitAttemptImpl.setTestUnitId(testUnitAttempt.getTestUnitId());
		testUnitAttemptImpl.setTestUnitAnswerId(testUnitAttempt.getTestUnitAnswerId());
		testUnitAttemptImpl.setSubmitTime(testUnitAttempt.getSubmitTime());

		return testUnitAttemptImpl;
	}

	/**
	 * Returns the test unit attempt with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit attempt
	 * @return the test unit attempt
	 * @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	 */
	@Override
	public TestUnitAttempt findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestUnitAttemptException {
		TestUnitAttempt testUnitAttempt = fetchByPrimaryKey(primaryKey);

		if (testUnitAttempt == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestUnitAttemptException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testUnitAttempt;
	}

	/**
	 * Returns the test unit attempt with the primary key or throws a {@link NoSuchTestUnitAttemptException} if it could not be found.
	 *
	 * @param testUnitAttemptId the primary key of the test unit attempt
	 * @return the test unit attempt
	 * @throws NoSuchTestUnitAttemptException if a test unit attempt with the primary key could not be found
	 */
	@Override
	public TestUnitAttempt findByPrimaryKey(long testUnitAttemptId)
		throws NoSuchTestUnitAttemptException {
		return findByPrimaryKey((Serializable)testUnitAttemptId);
	}

	/**
	 * Returns the test unit attempt with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit attempt
	 * @return the test unit attempt, or <code>null</code> if a test unit attempt with the primary key could not be found
	 */
	@Override
	public TestUnitAttempt fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitAttemptImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TestUnitAttempt testUnitAttempt = (TestUnitAttempt)serializable;

		if (testUnitAttempt == null) {
			Session session = null;

			try {
				session = openSession();

				testUnitAttempt = (TestUnitAttempt)session.get(TestUnitAttemptImpl.class,
						primaryKey);

				if (testUnitAttempt != null) {
					cacheResult(testUnitAttempt);
				}
				else {
					entityCache.putResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitAttemptImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitAttemptImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testUnitAttempt;
	}

	/**
	 * Returns the test unit attempt with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param testUnitAttemptId the primary key of the test unit attempt
	 * @return the test unit attempt, or <code>null</code> if a test unit attempt with the primary key could not be found
	 */
	@Override
	public TestUnitAttempt fetchByPrimaryKey(long testUnitAttemptId) {
		return fetchByPrimaryKey((Serializable)testUnitAttemptId);
	}

	@Override
	public Map<Serializable, TestUnitAttempt> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestUnitAttempt> map = new HashMap<Serializable, TestUnitAttempt>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestUnitAttempt testUnitAttempt = fetchByPrimaryKey(primaryKey);

			if (testUnitAttempt != null) {
				map.put(primaryKey, testUnitAttempt);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitAttemptImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TestUnitAttempt)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTUNITATTEMPT_WHERE_PKS_IN);

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

			for (TestUnitAttempt testUnitAttempt : (List<TestUnitAttempt>)q.list()) {
				map.put(testUnitAttempt.getPrimaryKeyObj(), testUnitAttempt);

				cacheResult(testUnitAttempt);

				uncachedPrimaryKeys.remove(testUnitAttempt.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestUnitAttemptModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitAttemptImpl.class, primaryKey, nullModel);
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
	 * Returns all the test unit attempts.
	 *
	 * @return the test unit attempts
	 */
	@Override
	public List<TestUnitAttempt> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<TestUnitAttempt> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<TestUnitAttempt> findAll(int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<TestUnitAttempt> findAll(int start, int end,
		OrderByComparator<TestUnitAttempt> orderByComparator,
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

		List<TestUnitAttempt> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnitAttempt>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTUNITATTEMPT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTUNITATTEMPT;

				if (pagination) {
					sql = sql.concat(TestUnitAttemptModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestUnitAttempt>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnitAttempt>)QueryUtil.list(q,
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
	 * Removes all the test unit attempts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestUnitAttempt testUnitAttempt : findAll()) {
			remove(testUnitAttempt);
		}
	}

	/**
	 * Returns the number of test unit attempts.
	 *
	 * @return the number of test unit attempts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTUNITATTEMPT);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return TestUnitAttemptModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test unit attempt persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestUnitAttemptImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTUNITATTEMPT = "SELECT testUnitAttempt FROM TestUnitAttempt testUnitAttempt";
	private static final String _SQL_SELECT_TESTUNITATTEMPT_WHERE_PKS_IN = "SELECT testUnitAttempt FROM TestUnitAttempt testUnitAttempt WHERE testUnitAttemptId IN (";
	private static final String _SQL_SELECT_TESTUNITATTEMPT_WHERE = "SELECT testUnitAttempt FROM TestUnitAttempt testUnitAttempt WHERE ";
	private static final String _SQL_COUNT_TESTUNITATTEMPT = "SELECT COUNT(testUnitAttempt) FROM TestUnitAttempt testUnitAttempt";
	private static final String _SQL_COUNT_TESTUNITATTEMPT_WHERE = "SELECT COUNT(testUnitAttempt) FROM TestUnitAttempt testUnitAttempt WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testUnitAttempt.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestUnitAttempt exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TestUnitAttempt exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TestUnitAttemptPersistenceImpl.class);
}