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

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitAnswerException;
import ru.dokstrudio.med.srv.model.TestUnitAnswer;
import ru.dokstrudio.med.srv.model.impl.TestUnitAnswerImpl;
import ru.dokstrudio.med.srv.model.impl.TestUnitAnswerModelImpl;
import ru.dokstrudio.med.srv.service.persistence.TestUnitAnswerPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the test unit answer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAnswerPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.TestUnitAnswerUtil
 * @generated
 */
@ProviderType
public class TestUnitAnswerPersistenceImpl extends BasePersistenceImpl<TestUnitAnswer>
	implements TestUnitAnswerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestUnitAnswerUtil} to access the test unit answer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestUnitAnswerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAnswerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TESTUNITID =
		new FinderPath(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAnswerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTestUnitId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID =
		new FinderPath(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerModelImpl.FINDER_CACHE_ENABLED,
			TestUnitAnswerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTestUnitId",
			new String[] { Long.class.getName() },
			TestUnitAnswerModelImpl.TESTUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TESTUNITID = new FinderPath(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTestUnitId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the test unit answers where testUnitId = &#63;.
	 *
	 * @param testUnitId the test unit ID
	 * @return the matching test unit answers
	 */
	@Override
	public List<TestUnitAnswer> findByTestUnitId(long testUnitId) {
		return findByTestUnitId(testUnitId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestUnitAnswer> findByTestUnitId(long testUnitId, int start,
		int end) {
		return findByTestUnitId(testUnitId, start, end, null);
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
	@Override
	public List<TestUnitAnswer> findByTestUnitId(long testUnitId, int start,
		int end, OrderByComparator<TestUnitAnswer> orderByComparator) {
		return findByTestUnitId(testUnitId, start, end, orderByComparator, true);
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
	@Override
	public List<TestUnitAnswer> findByTestUnitId(long testUnitId, int start,
		int end, OrderByComparator<TestUnitAnswer> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID;
			finderArgs = new Object[] { testUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TESTUNITID;
			finderArgs = new Object[] { testUnitId, start, end, orderByComparator };
		}

		List<TestUnitAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnitAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestUnitAnswer testUnitAnswer : list) {
					if ((testUnitId != testUnitAnswer.getTestUnitId())) {
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

			query.append(_SQL_SELECT_TESTUNITANSWER_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITID_TESTUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestUnitAnswerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(testUnitId);

				if (!pagination) {
					list = (List<TestUnitAnswer>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnitAnswer>)QueryUtil.list(q,
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
	 * Returns the first test unit answer in the ordered set where testUnitId = &#63;.
	 *
	 * @param testUnitId the test unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit answer
	 * @throws NoSuchTestUnitAnswerException if a matching test unit answer could not be found
	 */
	@Override
	public TestUnitAnswer findByTestUnitId_First(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator)
		throws NoSuchTestUnitAnswerException {
		TestUnitAnswer testUnitAnswer = fetchByTestUnitId_First(testUnitId,
				orderByComparator);

		if (testUnitAnswer != null) {
			return testUnitAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("testUnitId=");
		msg.append(testUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitAnswerException(msg.toString());
	}

	/**
	 * Returns the first test unit answer in the ordered set where testUnitId = &#63;.
	 *
	 * @param testUnitId the test unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit answer, or <code>null</code> if a matching test unit answer could not be found
	 */
	@Override
	public TestUnitAnswer fetchByTestUnitId_First(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator) {
		List<TestUnitAnswer> list = findByTestUnitId(testUnitId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test unit answer in the ordered set where testUnitId = &#63;.
	 *
	 * @param testUnitId the test unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit answer
	 * @throws NoSuchTestUnitAnswerException if a matching test unit answer could not be found
	 */
	@Override
	public TestUnitAnswer findByTestUnitId_Last(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator)
		throws NoSuchTestUnitAnswerException {
		TestUnitAnswer testUnitAnswer = fetchByTestUnitId_Last(testUnitId,
				orderByComparator);

		if (testUnitAnswer != null) {
			return testUnitAnswer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("testUnitId=");
		msg.append(testUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitAnswerException(msg.toString());
	}

	/**
	 * Returns the last test unit answer in the ordered set where testUnitId = &#63;.
	 *
	 * @param testUnitId the test unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit answer, or <code>null</code> if a matching test unit answer could not be found
	 */
	@Override
	public TestUnitAnswer fetchByTestUnitId_Last(long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator) {
		int count = countByTestUnitId(testUnitId);

		if (count == 0) {
			return null;
		}

		List<TestUnitAnswer> list = findByTestUnitId(testUnitId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TestUnitAnswer[] findByTestUnitId_PrevAndNext(
		long testUnitAnswerId, long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator)
		throws NoSuchTestUnitAnswerException {
		TestUnitAnswer testUnitAnswer = findByPrimaryKey(testUnitAnswerId);

		Session session = null;

		try {
			session = openSession();

			TestUnitAnswer[] array = new TestUnitAnswerImpl[3];

			array[0] = getByTestUnitId_PrevAndNext(session, testUnitAnswer,
					testUnitId, orderByComparator, true);

			array[1] = testUnitAnswer;

			array[2] = getByTestUnitId_PrevAndNext(session, testUnitAnswer,
					testUnitId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestUnitAnswer getByTestUnitId_PrevAndNext(Session session,
		TestUnitAnswer testUnitAnswer, long testUnitId,
		OrderByComparator<TestUnitAnswer> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTUNITANSWER_WHERE);

		query.append(_FINDER_COLUMN_TESTUNITID_TESTUNITID_2);

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
			query.append(TestUnitAnswerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(testUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testUnitAnswer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestUnitAnswer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test unit answers where testUnitId = &#63; from the database.
	 *
	 * @param testUnitId the test unit ID
	 */
	@Override
	public void removeByTestUnitId(long testUnitId) {
		for (TestUnitAnswer testUnitAnswer : findByTestUnitId(testUnitId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testUnitAnswer);
		}
	}

	/**
	 * Returns the number of test unit answers where testUnitId = &#63;.
	 *
	 * @param testUnitId the test unit ID
	 * @return the number of matching test unit answers
	 */
	@Override
	public int countByTestUnitId(long testUnitId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TESTUNITID;

		Object[] finderArgs = new Object[] { testUnitId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTUNITANSWER_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITID_TESTUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(testUnitId);

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

	private static final String _FINDER_COLUMN_TESTUNITID_TESTUNITID_2 = "testUnitAnswer.testUnitId = ?";

	public TestUnitAnswerPersistenceImpl() {
		setModelClass(TestUnitAnswer.class);
	}

	/**
	 * Caches the test unit answer in the entity cache if it is enabled.
	 *
	 * @param testUnitAnswer the test unit answer
	 */
	@Override
	public void cacheResult(TestUnitAnswer testUnitAnswer) {
		entityCache.putResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerImpl.class, testUnitAnswer.getPrimaryKey(),
			testUnitAnswer);

		testUnitAnswer.resetOriginalValues();
	}

	/**
	 * Caches the test unit answers in the entity cache if it is enabled.
	 *
	 * @param testUnitAnswers the test unit answers
	 */
	@Override
	public void cacheResult(List<TestUnitAnswer> testUnitAnswers) {
		for (TestUnitAnswer testUnitAnswer : testUnitAnswers) {
			if (entityCache.getResult(
						TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitAnswerImpl.class, testUnitAnswer.getPrimaryKey()) == null) {
				cacheResult(testUnitAnswer);
			}
			else {
				testUnitAnswer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test unit answers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestUnitAnswerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test unit answer.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestUnitAnswer testUnitAnswer) {
		entityCache.removeResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerImpl.class, testUnitAnswer.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TestUnitAnswer> testUnitAnswers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestUnitAnswer testUnitAnswer : testUnitAnswers) {
			entityCache.removeResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitAnswerImpl.class, testUnitAnswer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new test unit answer with the primary key. Does not add the test unit answer to the database.
	 *
	 * @param testUnitAnswerId the primary key for the new test unit answer
	 * @return the new test unit answer
	 */
	@Override
	public TestUnitAnswer create(long testUnitAnswerId) {
		TestUnitAnswer testUnitAnswer = new TestUnitAnswerImpl();

		testUnitAnswer.setNew(true);
		testUnitAnswer.setPrimaryKey(testUnitAnswerId);

		return testUnitAnswer;
	}

	/**
	 * Removes the test unit answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testUnitAnswerId the primary key of the test unit answer
	 * @return the test unit answer that was removed
	 * @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	 */
	@Override
	public TestUnitAnswer remove(long testUnitAnswerId)
		throws NoSuchTestUnitAnswerException {
		return remove((Serializable)testUnitAnswerId);
	}

	/**
	 * Removes the test unit answer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test unit answer
	 * @return the test unit answer that was removed
	 * @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	 */
	@Override
	public TestUnitAnswer remove(Serializable primaryKey)
		throws NoSuchTestUnitAnswerException {
		Session session = null;

		try {
			session = openSession();

			TestUnitAnswer testUnitAnswer = (TestUnitAnswer)session.get(TestUnitAnswerImpl.class,
					primaryKey);

			if (testUnitAnswer == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestUnitAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testUnitAnswer);
		}
		catch (NoSuchTestUnitAnswerException nsee) {
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
	protected TestUnitAnswer removeImpl(TestUnitAnswer testUnitAnswer) {
		testUnitAnswer = toUnwrappedModel(testUnitAnswer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testUnitAnswer)) {
				testUnitAnswer = (TestUnitAnswer)session.get(TestUnitAnswerImpl.class,
						testUnitAnswer.getPrimaryKeyObj());
			}

			if (testUnitAnswer != null) {
				session.delete(testUnitAnswer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testUnitAnswer != null) {
			clearCache(testUnitAnswer);
		}

		return testUnitAnswer;
	}

	@Override
	public TestUnitAnswer updateImpl(TestUnitAnswer testUnitAnswer) {
		testUnitAnswer = toUnwrappedModel(testUnitAnswer);

		boolean isNew = testUnitAnswer.isNew();

		TestUnitAnswerModelImpl testUnitAnswerModelImpl = (TestUnitAnswerModelImpl)testUnitAnswer;

		Session session = null;

		try {
			session = openSession();

			if (testUnitAnswer.isNew()) {
				session.save(testUnitAnswer);

				testUnitAnswer.setNew(false);
			}
			else {
				testUnitAnswer = (TestUnitAnswer)session.merge(testUnitAnswer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TestUnitAnswerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((testUnitAnswerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testUnitAnswerModelImpl.getOriginalTestUnitId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID,
					args);

				args = new Object[] { testUnitAnswerModelImpl.getTestUnitId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITID,
					args);
			}
		}

		entityCache.putResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitAnswerImpl.class, testUnitAnswer.getPrimaryKey(),
			testUnitAnswer, false);

		testUnitAnswer.resetOriginalValues();

		return testUnitAnswer;
	}

	protected TestUnitAnswer toUnwrappedModel(TestUnitAnswer testUnitAnswer) {
		if (testUnitAnswer instanceof TestUnitAnswerImpl) {
			return testUnitAnswer;
		}

		TestUnitAnswerImpl testUnitAnswerImpl = new TestUnitAnswerImpl();

		testUnitAnswerImpl.setNew(testUnitAnswer.isNew());
		testUnitAnswerImpl.setPrimaryKey(testUnitAnswer.getPrimaryKey());

		testUnitAnswerImpl.setTestUnitAnswerId(testUnitAnswer.getTestUnitAnswerId());
		testUnitAnswerImpl.setTestUnitId(testUnitAnswer.getTestUnitId());
		testUnitAnswerImpl.setAnswerText(testUnitAnswer.getAnswerText());
		testUnitAnswerImpl.setAnswerType(testUnitAnswer.getAnswerType());
		testUnitAnswerImpl.setAnswerDlFileEntryId(testUnitAnswer.getAnswerDlFileEntryId());
		testUnitAnswerImpl.setIsCorrent(testUnitAnswer.isIsCorrent());

		return testUnitAnswerImpl;
	}

	/**
	 * Returns the test unit answer with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit answer
	 * @return the test unit answer
	 * @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	 */
	@Override
	public TestUnitAnswer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestUnitAnswerException {
		TestUnitAnswer testUnitAnswer = fetchByPrimaryKey(primaryKey);

		if (testUnitAnswer == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestUnitAnswerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testUnitAnswer;
	}

	/**
	 * Returns the test unit answer with the primary key or throws a {@link NoSuchTestUnitAnswerException} if it could not be found.
	 *
	 * @param testUnitAnswerId the primary key of the test unit answer
	 * @return the test unit answer
	 * @throws NoSuchTestUnitAnswerException if a test unit answer with the primary key could not be found
	 */
	@Override
	public TestUnitAnswer findByPrimaryKey(long testUnitAnswerId)
		throws NoSuchTestUnitAnswerException {
		return findByPrimaryKey((Serializable)testUnitAnswerId);
	}

	/**
	 * Returns the test unit answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit answer
	 * @return the test unit answer, or <code>null</code> if a test unit answer with the primary key could not be found
	 */
	@Override
	public TestUnitAnswer fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitAnswerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TestUnitAnswer testUnitAnswer = (TestUnitAnswer)serializable;

		if (testUnitAnswer == null) {
			Session session = null;

			try {
				session = openSession();

				testUnitAnswer = (TestUnitAnswer)session.get(TestUnitAnswerImpl.class,
						primaryKey);

				if (testUnitAnswer != null) {
					cacheResult(testUnitAnswer);
				}
				else {
					entityCache.putResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitAnswerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitAnswerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testUnitAnswer;
	}

	/**
	 * Returns the test unit answer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param testUnitAnswerId the primary key of the test unit answer
	 * @return the test unit answer, or <code>null</code> if a test unit answer with the primary key could not be found
	 */
	@Override
	public TestUnitAnswer fetchByPrimaryKey(long testUnitAnswerId) {
		return fetchByPrimaryKey((Serializable)testUnitAnswerId);
	}

	@Override
	public Map<Serializable, TestUnitAnswer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestUnitAnswer> map = new HashMap<Serializable, TestUnitAnswer>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestUnitAnswer testUnitAnswer = fetchByPrimaryKey(primaryKey);

			if (testUnitAnswer != null) {
				map.put(primaryKey, testUnitAnswer);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitAnswerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TestUnitAnswer)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTUNITANSWER_WHERE_PKS_IN);

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

			for (TestUnitAnswer testUnitAnswer : (List<TestUnitAnswer>)q.list()) {
				map.put(testUnitAnswer.getPrimaryKeyObj(), testUnitAnswer);

				cacheResult(testUnitAnswer);

				uncachedPrimaryKeys.remove(testUnitAnswer.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestUnitAnswerModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitAnswerImpl.class, primaryKey, nullModel);
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
	 * Returns all the test unit answers.
	 *
	 * @return the test unit answers
	 */
	@Override
	public List<TestUnitAnswer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestUnitAnswer> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TestUnitAnswer> findAll(int start, int end,
		OrderByComparator<TestUnitAnswer> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TestUnitAnswer> findAll(int start, int end,
		OrderByComparator<TestUnitAnswer> orderByComparator,
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

		List<TestUnitAnswer> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnitAnswer>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTUNITANSWER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTUNITANSWER;

				if (pagination) {
					sql = sql.concat(TestUnitAnswerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestUnitAnswer>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnitAnswer>)QueryUtil.list(q,
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
	 * Removes all the test unit answers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestUnitAnswer testUnitAnswer : findAll()) {
			remove(testUnitAnswer);
		}
	}

	/**
	 * Returns the number of test unit answers.
	 *
	 * @return the number of test unit answers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTUNITANSWER);

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
		return TestUnitAnswerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test unit answer persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestUnitAnswerImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTUNITANSWER = "SELECT testUnitAnswer FROM TestUnitAnswer testUnitAnswer";
	private static final String _SQL_SELECT_TESTUNITANSWER_WHERE_PKS_IN = "SELECT testUnitAnswer FROM TestUnitAnswer testUnitAnswer WHERE testUnitAnswerId IN (";
	private static final String _SQL_SELECT_TESTUNITANSWER_WHERE = "SELECT testUnitAnswer FROM TestUnitAnswer testUnitAnswer WHERE ";
	private static final String _SQL_COUNT_TESTUNITANSWER = "SELECT COUNT(testUnitAnswer) FROM TestUnitAnswer testUnitAnswer";
	private static final String _SQL_COUNT_TESTUNITANSWER_WHERE = "SELECT COUNT(testUnitAnswer) FROM TestUnitAnswer testUnitAnswer WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testUnitAnswer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestUnitAnswer exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TestUnitAnswer exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TestUnitAnswerPersistenceImpl.class);
}