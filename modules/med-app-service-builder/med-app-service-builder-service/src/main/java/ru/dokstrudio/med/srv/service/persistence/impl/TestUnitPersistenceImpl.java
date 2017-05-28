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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitException;
import ru.dokstrudio.med.srv.model.TestUnit;
import ru.dokstrudio.med.srv.model.impl.TestUnitImpl;
import ru.dokstrudio.med.srv.model.impl.TestUnitModelImpl;
import ru.dokstrudio.med.srv.service.persistence.TestUnitPersistence;

import java.io.Serializable;

import java.sql.Timestamp;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the test unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.TestUnitUtil
 * @generated
 */
@ProviderType
public class TestUnitPersistenceImpl extends BasePersistenceImpl<TestUnit>
	implements TestUnitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestUnitUtil} to access the test unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestUnitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TESTUNITNUMBER =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTestUnitNumber",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITNUMBER =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTestUnitNumber",
			new String[] { Long.class.getName() },
			TestUnitModelImpl.NUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TESTUNITNUMBER = new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTestUnitNumber",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the test units where number = &#63;.
	 *
	 * @param number the number
	 * @return the matching test units
	 */
	@Override
	public List<TestUnit> findByTestUnitNumber(long number) {
		return findByTestUnitNumber(number, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the test units where number = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param number the number
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @return the range of matching test units
	 */
	@Override
	public List<TestUnit> findByTestUnitNumber(long number, int start, int end) {
		return findByTestUnitNumber(number, start, end, null);
	}

	/**
	 * Returns an ordered range of all the test units where number = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param number the number
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching test units
	 */
	@Override
	public List<TestUnit> findByTestUnitNumber(long number, int start, int end,
		OrderByComparator<TestUnit> orderByComparator) {
		return findByTestUnitNumber(number, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the test units where number = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param number the number
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching test units
	 */
	@Override
	public List<TestUnit> findByTestUnitNumber(long number, int start, int end,
		OrderByComparator<TestUnit> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITNUMBER;
			finderArgs = new Object[] { number };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TESTUNITNUMBER;
			finderArgs = new Object[] { number, start, end, orderByComparator };
		}

		List<TestUnit> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnit>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestUnit testUnit : list) {
					if ((number != testUnit.getNumber())) {
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

			query.append(_SQL_SELECT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITNUMBER_NUMBER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(number);

				if (!pagination) {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first test unit in the ordered set where number = &#63;.
	 *
	 * @param number the number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit
	 * @throws NoSuchTestUnitException if a matching test unit could not be found
	 */
	@Override
	public TestUnit findByTestUnitNumber_First(long number,
		OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = fetchByTestUnitNumber_First(number,
				orderByComparator);

		if (testUnit != null) {
			return testUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("number=");
		msg.append(number);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitException(msg.toString());
	}

	/**
	 * Returns the first test unit in the ordered set where number = &#63;.
	 *
	 * @param number the number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchByTestUnitNumber_First(long number,
		OrderByComparator<TestUnit> orderByComparator) {
		List<TestUnit> list = findByTestUnitNumber(number, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test unit in the ordered set where number = &#63;.
	 *
	 * @param number the number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit
	 * @throws NoSuchTestUnitException if a matching test unit could not be found
	 */
	@Override
	public TestUnit findByTestUnitNumber_Last(long number,
		OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = fetchByTestUnitNumber_Last(number, orderByComparator);

		if (testUnit != null) {
			return testUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("number=");
		msg.append(number);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitException(msg.toString());
	}

	/**
	 * Returns the last test unit in the ordered set where number = &#63;.
	 *
	 * @param number the number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchByTestUnitNumber_Last(long number,
		OrderByComparator<TestUnit> orderByComparator) {
		int count = countByTestUnitNumber(number);

		if (count == 0) {
			return null;
		}

		List<TestUnit> list = findByTestUnitNumber(number, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the test units before and after the current test unit in the ordered set where number = &#63;.
	 *
	 * @param testUnitId the primary key of the current test unit
	 * @param number the number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test unit
	 * @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit[] findByTestUnitNumber_PrevAndNext(long testUnitId,
		long number, OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = findByPrimaryKey(testUnitId);

		Session session = null;

		try {
			session = openSession();

			TestUnit[] array = new TestUnitImpl[3];

			array[0] = getByTestUnitNumber_PrevAndNext(session, testUnit,
					number, orderByComparator, true);

			array[1] = testUnit;

			array[2] = getByTestUnitNumber_PrevAndNext(session, testUnit,
					number, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestUnit getByTestUnitNumber_PrevAndNext(Session session,
		TestUnit testUnit, long number,
		OrderByComparator<TestUnit> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTUNIT_WHERE);

		query.append(_FINDER_COLUMN_TESTUNITNUMBER_NUMBER_2);

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
			query.append(TestUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(number);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test units where number = &#63; from the database.
	 *
	 * @param number the number
	 */
	@Override
	public void removeByTestUnitNumber(long number) {
		for (TestUnit testUnit : findByTestUnitNumber(number,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testUnit);
		}
	}

	/**
	 * Returns the number of test units where number = &#63;.
	 *
	 * @param number the number
	 * @return the number of matching test units
	 */
	@Override
	public int countByTestUnitNumber(long number) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TESTUNITNUMBER;

		Object[] finderArgs = new Object[] { number };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITNUMBER_NUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(number);

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

	private static final String _FINDER_COLUMN_TESTUNITNUMBER_NUMBER_2 = "testUnit.number = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPECIALIZATIONID =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySpecializationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIALIZATIONID =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySpecializationId", new String[] { Long.class.getName() },
			TestUnitModelImpl.SPECIALIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPECIALIZATIONID = new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySpecializationId", new String[] { Long.class.getName() });

	/**
	 * Returns all the test units where specializationId = &#63;.
	 *
	 * @param specializationId the specialization ID
	 * @return the matching test units
	 */
	@Override
	public List<TestUnit> findBySpecializationId(long specializationId) {
		return findBySpecializationId(specializationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the test units where specializationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specializationId the specialization ID
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @return the range of matching test units
	 */
	@Override
	public List<TestUnit> findBySpecializationId(long specializationId,
		int start, int end) {
		return findBySpecializationId(specializationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the test units where specializationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specializationId the specialization ID
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching test units
	 */
	@Override
	public List<TestUnit> findBySpecializationId(long specializationId,
		int start, int end, OrderByComparator<TestUnit> orderByComparator) {
		return findBySpecializationId(specializationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the test units where specializationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specializationId the specialization ID
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching test units
	 */
	@Override
	public List<TestUnit> findBySpecializationId(long specializationId,
		int start, int end, OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIALIZATIONID;
			finderArgs = new Object[] { specializationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SPECIALIZATIONID;
			finderArgs = new Object[] {
					specializationId,
					
					start, end, orderByComparator
				};
		}

		List<TestUnit> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnit>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestUnit testUnit : list) {
					if ((specializationId != testUnit.getSpecializationId())) {
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

			query.append(_SQL_SELECT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_SPECIALIZATIONID_SPECIALIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(specializationId);

				if (!pagination) {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first test unit in the ordered set where specializationId = &#63;.
	 *
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit
	 * @throws NoSuchTestUnitException if a matching test unit could not be found
	 */
	@Override
	public TestUnit findBySpecializationId_First(long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = fetchBySpecializationId_First(specializationId,
				orderByComparator);

		if (testUnit != null) {
			return testUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specializationId=");
		msg.append(specializationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitException(msg.toString());
	}

	/**
	 * Returns the first test unit in the ordered set where specializationId = &#63;.
	 *
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchBySpecializationId_First(long specializationId,
		OrderByComparator<TestUnit> orderByComparator) {
		List<TestUnit> list = findBySpecializationId(specializationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test unit in the ordered set where specializationId = &#63;.
	 *
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit
	 * @throws NoSuchTestUnitException if a matching test unit could not be found
	 */
	@Override
	public TestUnit findBySpecializationId_Last(long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = fetchBySpecializationId_Last(specializationId,
				orderByComparator);

		if (testUnit != null) {
			return testUnit;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specializationId=");
		msg.append(specializationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitException(msg.toString());
	}

	/**
	 * Returns the last test unit in the ordered set where specializationId = &#63;.
	 *
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchBySpecializationId_Last(long specializationId,
		OrderByComparator<TestUnit> orderByComparator) {
		int count = countBySpecializationId(specializationId);

		if (count == 0) {
			return null;
		}

		List<TestUnit> list = findBySpecializationId(specializationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the test units before and after the current test unit in the ordered set where specializationId = &#63;.
	 *
	 * @param testUnitId the primary key of the current test unit
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test unit
	 * @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit[] findBySpecializationId_PrevAndNext(long testUnitId,
		long specializationId, OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = findByPrimaryKey(testUnitId);

		Session session = null;

		try {
			session = openSession();

			TestUnit[] array = new TestUnitImpl[3];

			array[0] = getBySpecializationId_PrevAndNext(session, testUnit,
					specializationId, orderByComparator, true);

			array[1] = testUnit;

			array[2] = getBySpecializationId_PrevAndNext(session, testUnit,
					specializationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestUnit getBySpecializationId_PrevAndNext(Session session,
		TestUnit testUnit, long specializationId,
		OrderByComparator<TestUnit> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTUNIT_WHERE);

		query.append(_FINDER_COLUMN_SPECIALIZATIONID_SPECIALIZATIONID_2);

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
			query.append(TestUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(specializationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test units where specializationId = &#63; from the database.
	 *
	 * @param specializationId the specialization ID
	 */
	@Override
	public void removeBySpecializationId(long specializationId) {
		for (TestUnit testUnit : findBySpecializationId(specializationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testUnit);
		}
	}

	/**
	 * Returns the number of test units where specializationId = &#63;.
	 *
	 * @param specializationId the specialization ID
	 * @return the number of matching test units
	 */
	@Override
	public int countBySpecializationId(long specializationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPECIALIZATIONID;

		Object[] finderArgs = new Object[] { specializationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_SPECIALIZATIONID_SPECIALIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(specializationId);

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

	private static final String _FINDER_COLUMN_SPECIALIZATIONID_SPECIALIZATIONID_2 =
		"testUnit.specializationId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_ENTITY,
			"fetchByTestUnitNumberAndSpecializationId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TestUnitModelImpl.NUMBER_COLUMN_BITMASK |
			TestUnitModelImpl.SPECIALIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TESTUNITNUMBERANDSPECIALIZATIONID =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTestUnitNumberAndSpecializationId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the test unit where number = &#63; and specializationId = &#63; or throws a {@link NoSuchTestUnitException} if it could not be found.
	 *
	 * @param number the number
	 * @param specializationId the specialization ID
	 * @return the matching test unit
	 * @throws NoSuchTestUnitException if a matching test unit could not be found
	 */
	@Override
	public TestUnit findByTestUnitNumberAndSpecializationId(long number,
		long specializationId) throws NoSuchTestUnitException {
		TestUnit testUnit = fetchByTestUnitNumberAndSpecializationId(number,
				specializationId);

		if (testUnit == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("number=");
			msg.append(number);

			msg.append(", specializationId=");
			msg.append(specializationId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTestUnitException(msg.toString());
		}

		return testUnit;
	}

	/**
	 * Returns the test unit where number = &#63; and specializationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param number the number
	 * @param specializationId the specialization ID
	 * @return the matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchByTestUnitNumberAndSpecializationId(long number,
		long specializationId) {
		return fetchByTestUnitNumberAndSpecializationId(number,
			specializationId, true);
	}

	/**
	 * Returns the test unit where number = &#63; and specializationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param number the number
	 * @param specializationId the specialization ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchByTestUnitNumberAndSpecializationId(long number,
		long specializationId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { number, specializationId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
					finderArgs, this);
		}

		if (result instanceof TestUnit) {
			TestUnit testUnit = (TestUnit)result;

			if ((number != testUnit.getNumber()) ||
					(specializationId != testUnit.getSpecializationId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITNUMBERANDSPECIALIZATIONID_NUMBER_2);

			query.append(_FINDER_COLUMN_TESTUNITNUMBERANDSPECIALIZATIONID_SPECIALIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(number);

				qPos.add(specializationId);

				List<TestUnit> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"TestUnitPersistenceImpl.fetchByTestUnitNumberAndSpecializationId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TestUnit testUnit = list.get(0);

					result = testUnit;

					cacheResult(testUnit);

					if ((testUnit.getNumber() != number) ||
							(testUnit.getSpecializationId() != specializationId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
							finderArgs, testUnit);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
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
			return (TestUnit)result;
		}
	}

	/**
	 * Removes the test unit where number = &#63; and specializationId = &#63; from the database.
	 *
	 * @param number the number
	 * @param specializationId the specialization ID
	 * @return the test unit that was removed
	 */
	@Override
	public TestUnit removeByTestUnitNumberAndSpecializationId(long number,
		long specializationId) throws NoSuchTestUnitException {
		TestUnit testUnit = findByTestUnitNumberAndSpecializationId(number,
				specializationId);

		return remove(testUnit);
	}

	/**
	 * Returns the number of test units where number = &#63; and specializationId = &#63;.
	 *
	 * @param number the number
	 * @param specializationId the specialization ID
	 * @return the number of matching test units
	 */
	@Override
	public int countByTestUnitNumberAndSpecializationId(long number,
		long specializationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TESTUNITNUMBERANDSPECIALIZATIONID;

		Object[] finderArgs = new Object[] { number, specializationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_TESTUNITNUMBERANDSPECIALIZATIONID_NUMBER_2);

			query.append(_FINDER_COLUMN_TESTUNITNUMBERANDSPECIALIZATIONID_SPECIALIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(number);

				qPos.add(specializationId);

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

	private static final String _FINDER_COLUMN_TESTUNITNUMBERANDSPECIALIZATIONID_NUMBER_2 =
		"testUnit.number = ? AND ";
	private static final String _FINDER_COLUMN_TESTUNITNUMBERANDSPECIALIZATIONID_SPECIALIZATIONID_2 =
		"testUnit.specializationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, TestUnitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIsActualAndModifiedDateAndSpecializationId",
			new String[] {
				Boolean.class.getName(), Date.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID =
		new FinderPath(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByIsActualAndModifiedDateAndSpecializationId",
			new String[] {
				Boolean.class.getName(), Date.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @return the matching test units
	 */
	@Override
	public List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId) {
		return findByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @return the range of matching test units
	 */
	@Override
	public List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end) {
		return findByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching test units
	 */
	@Override
	public List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end, OrderByComparator<TestUnit> orderByComparator) {
		return findByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching test units
	 */
	@Override
	public List<TestUnit> findByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId, int start,
		int end, OrderByComparator<TestUnit> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID;
		finderArgs = new Object[] {
				isActual, modifiedDate, specializationId,
				
				start, end, orderByComparator
			};

		List<TestUnit> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnit>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestUnit testUnit : list) {
					if ((isActual != testUnit.getIsActual()) ||
							(modifiedDate.getTime() > testUnit.getModifiedDate()
																  .getTime()) ||
							(specializationId != testUnit.getSpecializationId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_ISACTUAL_2);

			boolean bindModifiedDate = false;

			if (modifiedDate == null) {
				query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_1);
			}
			else {
				bindModifiedDate = true;

				query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_2);
			}

			query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_SPECIALIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestUnitModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActual);

				if (bindModifiedDate) {
					qPos.add(new Timestamp(modifiedDate.getTime()));
				}

				qPos.add(specializationId);

				if (!pagination) {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit
	 * @throws NoSuchTestUnitException if a matching test unit could not be found
	 */
	@Override
	public TestUnit findByIsActualAndModifiedDateAndSpecializationId_First(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = fetchByIsActualAndModifiedDateAndSpecializationId_First(isActual,
				modifiedDate, specializationId, orderByComparator);

		if (testUnit != null) {
			return testUnit;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActual=");
		msg.append(isActual);

		msg.append(", modifiedDate=");
		msg.append(modifiedDate);

		msg.append(", specializationId=");
		msg.append(specializationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitException(msg.toString());
	}

	/**
	 * Returns the first test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchByIsActualAndModifiedDateAndSpecializationId_First(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator) {
		List<TestUnit> list = findByIsActualAndModifiedDateAndSpecializationId(isActual,
				modifiedDate, specializationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit
	 * @throws NoSuchTestUnitException if a matching test unit could not be found
	 */
	@Override
	public TestUnit findByIsActualAndModifiedDateAndSpecializationId_Last(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = fetchByIsActualAndModifiedDateAndSpecializationId_Last(isActual,
				modifiedDate, specializationId, orderByComparator);

		if (testUnit != null) {
			return testUnit;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isActual=");
		msg.append(isActual);

		msg.append(", modifiedDate=");
		msg.append(modifiedDate);

		msg.append(", specializationId=");
		msg.append(specializationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestUnitException(msg.toString());
	}

	/**
	 * Returns the last test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test unit, or <code>null</code> if a matching test unit could not be found
	 */
	@Override
	public TestUnit fetchByIsActualAndModifiedDateAndSpecializationId_Last(
		boolean isActual, Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator) {
		int count = countByIsActualAndModifiedDateAndSpecializationId(isActual,
				modifiedDate, specializationId);

		if (count == 0) {
			return null;
		}

		List<TestUnit> list = findByIsActualAndModifiedDateAndSpecializationId(isActual,
				modifiedDate, specializationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the test units before and after the current test unit in the ordered set where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * @param testUnitId the primary key of the current test unit
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test unit
	 * @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit[] findByIsActualAndModifiedDateAndSpecializationId_PrevAndNext(
		long testUnitId, boolean isActual, Date modifiedDate,
		long specializationId, OrderByComparator<TestUnit> orderByComparator)
		throws NoSuchTestUnitException {
		TestUnit testUnit = findByPrimaryKey(testUnitId);

		Session session = null;

		try {
			session = openSession();

			TestUnit[] array = new TestUnitImpl[3];

			array[0] = getByIsActualAndModifiedDateAndSpecializationId_PrevAndNext(session,
					testUnit, isActual, modifiedDate, specializationId,
					orderByComparator, true);

			array[1] = testUnit;

			array[2] = getByIsActualAndModifiedDateAndSpecializationId_PrevAndNext(session,
					testUnit, isActual, modifiedDate, specializationId,
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

	protected TestUnit getByIsActualAndModifiedDateAndSpecializationId_PrevAndNext(
		Session session, TestUnit testUnit, boolean isActual,
		Date modifiedDate, long specializationId,
		OrderByComparator<TestUnit> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_TESTUNIT_WHERE);

		query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_ISACTUAL_2);

		boolean bindModifiedDate = false;

		if (modifiedDate == null) {
			query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_1);
		}
		else {
			bindModifiedDate = true;

			query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_2);
		}

		query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_SPECIALIZATIONID_2);

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
			query.append(TestUnitModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isActual);

		if (bindModifiedDate) {
			qPos.add(new Timestamp(modifiedDate.getTime()));
		}

		qPos.add(specializationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testUnit);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestUnit> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63; from the database.
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 */
	@Override
	public void removeByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId) {
		for (TestUnit testUnit : findByIsActualAndModifiedDateAndSpecializationId(
				isActual, modifiedDate, specializationId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(testUnit);
		}
	}

	/**
	 * Returns the number of test units where isActual = &#63; and modifiedDate &ge; &#63; and specializationId = &#63;.
	 *
	 * @param isActual the is actual
	 * @param modifiedDate the modified date
	 * @param specializationId the specialization ID
	 * @return the number of matching test units
	 */
	@Override
	public int countByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, Date modifiedDate, long specializationId) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID;

		Object[] finderArgs = new Object[] {
				isActual, modifiedDate, specializationId
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TESTUNIT_WHERE);

			query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_ISACTUAL_2);

			boolean bindModifiedDate = false;

			if (modifiedDate == null) {
				query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_1);
			}
			else {
				bindModifiedDate = true;

				query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_2);
			}

			query.append(_FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_SPECIALIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isActual);

				if (bindModifiedDate) {
					qPos.add(new Timestamp(modifiedDate.getTime()));
				}

				qPos.add(specializationId);

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

	private static final String _FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_ISACTUAL_2 =
		"testUnit.isActual = ? AND ";
	private static final String _FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_1 =
		"testUnit.modifiedDate IS NULL AND ";
	private static final String _FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_MODIFIEDDATE_2 =
		"testUnit.modifiedDate >= ? AND ";
	private static final String _FINDER_COLUMN_ISACTUALANDMODIFIEDDATEANDSPECIALIZATIONID_SPECIALIZATIONID_2 =
		"testUnit.specializationId = ?";

	public TestUnitPersistenceImpl() {
		setModelClass(TestUnit.class);
	}

	/**
	 * Caches the test unit in the entity cache if it is enabled.
	 *
	 * @param testUnit the test unit
	 */
	@Override
	public void cacheResult(TestUnit testUnit) {
		entityCache.putResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitImpl.class, testUnit.getPrimaryKey(), testUnit);

		finderCache.putResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
			new Object[] { testUnit.getNumber(), testUnit.getSpecializationId() },
			testUnit);

		testUnit.resetOriginalValues();
	}

	/**
	 * Caches the test units in the entity cache if it is enabled.
	 *
	 * @param testUnits the test units
	 */
	@Override
	public void cacheResult(List<TestUnit> testUnits) {
		for (TestUnit testUnit : testUnits) {
			if (entityCache.getResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitImpl.class, testUnit.getPrimaryKey()) == null) {
				cacheResult(testUnit);
			}
			else {
				testUnit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test units.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestUnitImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test unit.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestUnit testUnit) {
		entityCache.removeResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitImpl.class, testUnit.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TestUnitModelImpl)testUnit, true);
	}

	@Override
	public void clearCache(List<TestUnit> testUnits) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestUnit testUnit : testUnits) {
			entityCache.removeResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitImpl.class, testUnit.getPrimaryKey());

			clearUniqueFindersCache((TestUnitModelImpl)testUnit, true);
		}
	}

	protected void cacheUniqueFindersCache(TestUnitModelImpl testUnitModelImpl) {
		Object[] args = new Object[] {
				testUnitModelImpl.getNumber(),
				testUnitModelImpl.getSpecializationId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
			args, testUnitModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		TestUnitModelImpl testUnitModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					testUnitModelImpl.getNumber(),
					testUnitModelImpl.getSpecializationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
				args);
		}

		if ((testUnitModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					testUnitModelImpl.getOriginalNumber(),
					testUnitModelImpl.getOriginalSpecializationId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TESTUNITNUMBERANDSPECIALIZATIONID,
				args);
		}
	}

	/**
	 * Creates a new test unit with the primary key. Does not add the test unit to the database.
	 *
	 * @param testUnitId the primary key for the new test unit
	 * @return the new test unit
	 */
	@Override
	public TestUnit create(long testUnitId) {
		TestUnit testUnit = new TestUnitImpl();

		testUnit.setNew(true);
		testUnit.setPrimaryKey(testUnitId);

		return testUnit;
	}

	/**
	 * Removes the test unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testUnitId the primary key of the test unit
	 * @return the test unit that was removed
	 * @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit remove(long testUnitId) throws NoSuchTestUnitException {
		return remove((Serializable)testUnitId);
	}

	/**
	 * Removes the test unit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test unit
	 * @return the test unit that was removed
	 * @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit remove(Serializable primaryKey)
		throws NoSuchTestUnitException {
		Session session = null;

		try {
			session = openSession();

			TestUnit testUnit = (TestUnit)session.get(TestUnitImpl.class,
					primaryKey);

			if (testUnit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testUnit);
		}
		catch (NoSuchTestUnitException nsee) {
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
	protected TestUnit removeImpl(TestUnit testUnit) {
		testUnit = toUnwrappedModel(testUnit);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testUnit)) {
				testUnit = (TestUnit)session.get(TestUnitImpl.class,
						testUnit.getPrimaryKeyObj());
			}

			if (testUnit != null) {
				session.delete(testUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testUnit != null) {
			clearCache(testUnit);
		}

		return testUnit;
	}

	@Override
	public TestUnit updateImpl(TestUnit testUnit) {
		testUnit = toUnwrappedModel(testUnit);

		boolean isNew = testUnit.isNew();

		TestUnitModelImpl testUnitModelImpl = (TestUnitModelImpl)testUnit;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (testUnit.getCreateDate() == null)) {
			if (serviceContext == null) {
				testUnit.setCreateDate(now);
			}
			else {
				testUnit.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!testUnitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				testUnit.setModifiedDate(now);
			}
			else {
				testUnit.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (testUnit.isNew()) {
				session.save(testUnit);

				testUnit.setNew(false);
			}
			else {
				testUnit = (TestUnit)session.merge(testUnit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TestUnitModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((testUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITNUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testUnitModelImpl.getOriginalNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITNUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITNUMBER,
					args);

				args = new Object[] { testUnitModelImpl.getNumber() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TESTUNITNUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TESTUNITNUMBER,
					args);
			}

			if ((testUnitModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIALIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testUnitModelImpl.getOriginalSpecializationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPECIALIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIALIZATIONID,
					args);

				args = new Object[] { testUnitModelImpl.getSpecializationId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPECIALIZATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPECIALIZATIONID,
					args);
			}
		}

		entityCache.putResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitImpl.class, testUnit.getPrimaryKey(), testUnit, false);

		clearUniqueFindersCache(testUnitModelImpl, false);
		cacheUniqueFindersCache(testUnitModelImpl);

		testUnit.resetOriginalValues();

		return testUnit;
	}

	protected TestUnit toUnwrappedModel(TestUnit testUnit) {
		if (testUnit instanceof TestUnitImpl) {
			return testUnit;
		}

		TestUnitImpl testUnitImpl = new TestUnitImpl();

		testUnitImpl.setNew(testUnit.isNew());
		testUnitImpl.setPrimaryKey(testUnit.getPrimaryKey());

		testUnitImpl.setTestUnitId(testUnit.getTestUnitId());
		testUnitImpl.setNumber(testUnit.getNumber());
		testUnitImpl.setCode(testUnit.getCode());
		testUnitImpl.setSpecializationId(testUnit.getSpecializationId());
		testUnitImpl.setQuestionText(testUnit.getQuestionText());
		testUnitImpl.setQuestionType(testUnit.getQuestionType());
		testUnitImpl.setQuestionDlFileEntryId(testUnit.getQuestionDlFileEntryId());
		testUnitImpl.setIsActual(testUnit.isIsActual());
		testUnitImpl.setCreateDate(testUnit.getCreateDate());
		testUnitImpl.setModifiedDate(testUnit.getModifiedDate());

		return testUnitImpl;
	}

	/**
	 * Returns the test unit with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit
	 * @return the test unit
	 * @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestUnitException {
		TestUnit testUnit = fetchByPrimaryKey(primaryKey);

		if (testUnit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestUnitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testUnit;
	}

	/**
	 * Returns the test unit with the primary key or throws a {@link NoSuchTestUnitException} if it could not be found.
	 *
	 * @param testUnitId the primary key of the test unit
	 * @return the test unit
	 * @throws NoSuchTestUnitException if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit findByPrimaryKey(long testUnitId)
		throws NoSuchTestUnitException {
		return findByPrimaryKey((Serializable)testUnitId);
	}

	/**
	 * Returns the test unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit
	 * @return the test unit, or <code>null</code> if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TestUnit testUnit = (TestUnit)serializable;

		if (testUnit == null) {
			Session session = null;

			try {
				session = openSession();

				testUnit = (TestUnit)session.get(TestUnitImpl.class, primaryKey);

				if (testUnit != null) {
					cacheResult(testUnit);
				}
				else {
					entityCache.putResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testUnit;
	}

	/**
	 * Returns the test unit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param testUnitId the primary key of the test unit
	 * @return the test unit, or <code>null</code> if a test unit with the primary key could not be found
	 */
	@Override
	public TestUnit fetchByPrimaryKey(long testUnitId) {
		return fetchByPrimaryKey((Serializable)testUnitId);
	}

	@Override
	public Map<Serializable, TestUnit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestUnit> map = new HashMap<Serializable, TestUnit>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestUnit testUnit = fetchByPrimaryKey(primaryKey);

			if (testUnit != null) {
				map.put(primaryKey, testUnit);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TestUnit)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTUNIT_WHERE_PKS_IN);

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

			for (TestUnit testUnit : (List<TestUnit>)q.list()) {
				map.put(testUnit.getPrimaryKeyObj(), testUnit);

				cacheResult(testUnit);

				uncachedPrimaryKeys.remove(testUnit.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestUnitModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitImpl.class, primaryKey, nullModel);
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
	 * Returns all the test units.
	 *
	 * @return the test units
	 */
	@Override
	public List<TestUnit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the test units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @return the range of test units
	 */
	@Override
	public List<TestUnit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the test units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of test units
	 */
	@Override
	public List<TestUnit> findAll(int start, int end,
		OrderByComparator<TestUnit> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the test units.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of test units
	 * @param end the upper bound of the range of test units (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of test units
	 */
	@Override
	public List<TestUnit> findAll(int start, int end,
		OrderByComparator<TestUnit> orderByComparator, boolean retrieveFromCache) {
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

		List<TestUnit> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnit>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTUNIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTUNIT;

				if (pagination) {
					sql = sql.concat(TestUnitModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnit>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the test units from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestUnit testUnit : findAll()) {
			remove(testUnit);
		}
	}

	/**
	 * Returns the number of test units.
	 *
	 * @return the number of test units
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTUNIT);

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
		return TestUnitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test unit persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestUnitImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTUNIT = "SELECT testUnit FROM TestUnit testUnit";
	private static final String _SQL_SELECT_TESTUNIT_WHERE_PKS_IN = "SELECT testUnit FROM TestUnit testUnit WHERE testUnitId IN (";
	private static final String _SQL_SELECT_TESTUNIT_WHERE = "SELECT testUnit FROM TestUnit testUnit WHERE ";
	private static final String _SQL_COUNT_TESTUNIT = "SELECT COUNT(testUnit) FROM TestUnit testUnit";
	private static final String _SQL_COUNT_TESTUNIT_WHERE = "SELECT COUNT(testUnit) FROM TestUnit testUnit WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testUnit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestUnit exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TestUnit exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TestUnitPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"number", "code"
			});
}