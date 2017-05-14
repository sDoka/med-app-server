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

import ru.dokstrudio.med.srv.exception.NoSuchApplicationUsageException;
import ru.dokstrudio.med.srv.model.ApplicationUsage;
import ru.dokstrudio.med.srv.model.impl.ApplicationUsageImpl;
import ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl;
import ru.dokstrudio.med.srv.service.persistence.ApplicationUsagePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the application usage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationUsagePersistence
 * @see ru.dokstrudio.med.srv.service.persistence.ApplicationUsageUtil
 * @generated
 */
@ProviderType
public class ApplicationUsagePersistenceImpl extends BasePersistenceImpl<ApplicationUsage>
	implements ApplicationUsagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApplicationUsageUtil} to access the application usage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApplicationUsageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageModelImpl.FINDER_CACHE_ENABLED,
			ApplicationUsageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageModelImpl.FINDER_CACHE_ENABLED,
			ApplicationUsageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID = new FinderPath(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageModelImpl.FINDER_CACHE_ENABLED,
			ApplicationUsageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDeviceId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID =
		new FinderPath(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageModelImpl.FINDER_CACHE_ENABLED,
			ApplicationUsageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeviceId",
			new String[] { Long.class.getName() },
			ApplicationUsageModelImpl.DEVICEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEID = new FinderPath(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDeviceId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the application usages where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the matching application usages
	 */
	@Override
	public List<ApplicationUsage> findByDeviceId(long deviceId) {
		return findByDeviceId(deviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the application usages where deviceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deviceId the device ID
	 * @param start the lower bound of the range of application usages
	 * @param end the upper bound of the range of application usages (not inclusive)
	 * @return the range of matching application usages
	 */
	@Override
	public List<ApplicationUsage> findByDeviceId(long deviceId, int start,
		int end) {
		return findByDeviceId(deviceId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the application usages where deviceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deviceId the device ID
	 * @param start the lower bound of the range of application usages
	 * @param end the upper bound of the range of application usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching application usages
	 */
	@Override
	public List<ApplicationUsage> findByDeviceId(long deviceId, int start,
		int end, OrderByComparator<ApplicationUsage> orderByComparator) {
		return findByDeviceId(deviceId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the application usages where deviceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deviceId the device ID
	 * @param start the lower bound of the range of application usages
	 * @param end the upper bound of the range of application usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching application usages
	 */
	@Override
	public List<ApplicationUsage> findByDeviceId(long deviceId, int start,
		int end, OrderByComparator<ApplicationUsage> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID;
			finderArgs = new Object[] { deviceId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID;
			finderArgs = new Object[] { deviceId, start, end, orderByComparator };
		}

		List<ApplicationUsage> list = null;

		if (retrieveFromCache) {
			list = (List<ApplicationUsage>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ApplicationUsage applicationUsage : list) {
					if ((deviceId != applicationUsage.getDeviceId())) {
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

			query.append(_SQL_SELECT_APPLICATIONUSAGE_WHERE);

			query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApplicationUsageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(deviceId);

				if (!pagination) {
					list = (List<ApplicationUsage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ApplicationUsage>)QueryUtil.list(q,
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
	 * Returns the first application usage in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application usage
	 * @throws NoSuchApplicationUsageException if a matching application usage could not be found
	 */
	@Override
	public ApplicationUsage findByDeviceId_First(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator)
		throws NoSuchApplicationUsageException {
		ApplicationUsage applicationUsage = fetchByDeviceId_First(deviceId,
				orderByComparator);

		if (applicationUsage != null) {
			return applicationUsage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deviceId=");
		msg.append(deviceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationUsageException(msg.toString());
	}

	/**
	 * Returns the first application usage in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application usage, or <code>null</code> if a matching application usage could not be found
	 */
	@Override
	public ApplicationUsage fetchByDeviceId_First(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		List<ApplicationUsage> list = findByDeviceId(deviceId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last application usage in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application usage
	 * @throws NoSuchApplicationUsageException if a matching application usage could not be found
	 */
	@Override
	public ApplicationUsage findByDeviceId_Last(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator)
		throws NoSuchApplicationUsageException {
		ApplicationUsage applicationUsage = fetchByDeviceId_Last(deviceId,
				orderByComparator);

		if (applicationUsage != null) {
			return applicationUsage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deviceId=");
		msg.append(deviceId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplicationUsageException(msg.toString());
	}

	/**
	 * Returns the last application usage in the ordered set where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application usage, or <code>null</code> if a matching application usage could not be found
	 */
	@Override
	public ApplicationUsage fetchByDeviceId_Last(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		int count = countByDeviceId(deviceId);

		if (count == 0) {
			return null;
		}

		List<ApplicationUsage> list = findByDeviceId(deviceId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the application usages before and after the current application usage in the ordered set where deviceId = &#63;.
	 *
	 * @param applicationUserId the primary key of the current application usage
	 * @param deviceId the device ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next application usage
	 * @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage[] findByDeviceId_PrevAndNext(
		long applicationUserId, long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator)
		throws NoSuchApplicationUsageException {
		ApplicationUsage applicationUsage = findByPrimaryKey(applicationUserId);

		Session session = null;

		try {
			session = openSession();

			ApplicationUsage[] array = new ApplicationUsageImpl[3];

			array[0] = getByDeviceId_PrevAndNext(session, applicationUsage,
					deviceId, orderByComparator, true);

			array[1] = applicationUsage;

			array[2] = getByDeviceId_PrevAndNext(session, applicationUsage,
					deviceId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ApplicationUsage getByDeviceId_PrevAndNext(Session session,
		ApplicationUsage applicationUsage, long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPLICATIONUSAGE_WHERE);

		query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

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
			query.append(ApplicationUsageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(deviceId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(applicationUsage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ApplicationUsage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the application usages where deviceId = &#63; from the database.
	 *
	 * @param deviceId the device ID
	 */
	@Override
	public void removeByDeviceId(long deviceId) {
		for (ApplicationUsage applicationUsage : findByDeviceId(deviceId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(applicationUsage);
		}
	}

	/**
	 * Returns the number of application usages where deviceId = &#63;.
	 *
	 * @param deviceId the device ID
	 * @return the number of matching application usages
	 */
	@Override
	public int countByDeviceId(long deviceId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEID;

		Object[] finderArgs = new Object[] { deviceId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPLICATIONUSAGE_WHERE);

			query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(deviceId);

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

	private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_2 = "applicationUsage.deviceId = ?";

	public ApplicationUsagePersistenceImpl() {
		setModelClass(ApplicationUsage.class);
	}

	/**
	 * Caches the application usage in the entity cache if it is enabled.
	 *
	 * @param applicationUsage the application usage
	 */
	@Override
	public void cacheResult(ApplicationUsage applicationUsage) {
		entityCache.putResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageImpl.class, applicationUsage.getPrimaryKey(),
			applicationUsage);

		applicationUsage.resetOriginalValues();
	}

	/**
	 * Caches the application usages in the entity cache if it is enabled.
	 *
	 * @param applicationUsages the application usages
	 */
	@Override
	public void cacheResult(List<ApplicationUsage> applicationUsages) {
		for (ApplicationUsage applicationUsage : applicationUsages) {
			if (entityCache.getResult(
						ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationUsageImpl.class,
						applicationUsage.getPrimaryKey()) == null) {
				cacheResult(applicationUsage);
			}
			else {
				applicationUsage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all application usages.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ApplicationUsageImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the application usage.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ApplicationUsage applicationUsage) {
		entityCache.removeResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageImpl.class, applicationUsage.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ApplicationUsage> applicationUsages) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ApplicationUsage applicationUsage : applicationUsages) {
			entityCache.removeResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationUsageImpl.class, applicationUsage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new application usage with the primary key. Does not add the application usage to the database.
	 *
	 * @param applicationUserId the primary key for the new application usage
	 * @return the new application usage
	 */
	@Override
	public ApplicationUsage create(long applicationUserId) {
		ApplicationUsage applicationUsage = new ApplicationUsageImpl();

		applicationUsage.setNew(true);
		applicationUsage.setPrimaryKey(applicationUserId);

		return applicationUsage;
	}

	/**
	 * Removes the application usage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationUserId the primary key of the application usage
	 * @return the application usage that was removed
	 * @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage remove(long applicationUserId)
		throws NoSuchApplicationUsageException {
		return remove((Serializable)applicationUserId);
	}

	/**
	 * Removes the application usage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the application usage
	 * @return the application usage that was removed
	 * @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage remove(Serializable primaryKey)
		throws NoSuchApplicationUsageException {
		Session session = null;

		try {
			session = openSession();

			ApplicationUsage applicationUsage = (ApplicationUsage)session.get(ApplicationUsageImpl.class,
					primaryKey);

			if (applicationUsage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplicationUsageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(applicationUsage);
		}
		catch (NoSuchApplicationUsageException nsee) {
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
	protected ApplicationUsage removeImpl(ApplicationUsage applicationUsage) {
		applicationUsage = toUnwrappedModel(applicationUsage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(applicationUsage)) {
				applicationUsage = (ApplicationUsage)session.get(ApplicationUsageImpl.class,
						applicationUsage.getPrimaryKeyObj());
			}

			if (applicationUsage != null) {
				session.delete(applicationUsage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (applicationUsage != null) {
			clearCache(applicationUsage);
		}

		return applicationUsage;
	}

	@Override
	public ApplicationUsage updateImpl(ApplicationUsage applicationUsage) {
		applicationUsage = toUnwrappedModel(applicationUsage);

		boolean isNew = applicationUsage.isNew();

		ApplicationUsageModelImpl applicationUsageModelImpl = (ApplicationUsageModelImpl)applicationUsage;

		Session session = null;

		try {
			session = openSession();

			if (applicationUsage.isNew()) {
				session.save(applicationUsage);

				applicationUsage.setNew(false);
			}
			else {
				applicationUsage = (ApplicationUsage)session.merge(applicationUsage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApplicationUsageModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((applicationUsageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						applicationUsageModelImpl.getOriginalDeviceId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
					args);

				args = new Object[] { applicationUsageModelImpl.getDeviceId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
					args);
			}
		}

		entityCache.putResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationUsageImpl.class, applicationUsage.getPrimaryKey(),
			applicationUsage, false);

		applicationUsage.resetOriginalValues();

		return applicationUsage;
	}

	protected ApplicationUsage toUnwrappedModel(
		ApplicationUsage applicationUsage) {
		if (applicationUsage instanceof ApplicationUsageImpl) {
			return applicationUsage;
		}

		ApplicationUsageImpl applicationUsageImpl = new ApplicationUsageImpl();

		applicationUsageImpl.setNew(applicationUsage.isNew());
		applicationUsageImpl.setPrimaryKey(applicationUsage.getPrimaryKey());

		applicationUsageImpl.setApplicationUserId(applicationUsage.getApplicationUserId());
		applicationUsageImpl.setUserId(applicationUsage.getUserId());
		applicationUsageImpl.setIpAddress(applicationUsage.getIpAddress());
		applicationUsageImpl.setDeviceId(applicationUsage.getDeviceId());
		applicationUsageImpl.setActionType(applicationUsage.getActionType());
		applicationUsageImpl.setActionTime(applicationUsage.getActionTime());

		return applicationUsageImpl;
	}

	/**
	 * Returns the application usage with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the application usage
	 * @return the application usage
	 * @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplicationUsageException {
		ApplicationUsage applicationUsage = fetchByPrimaryKey(primaryKey);

		if (applicationUsage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplicationUsageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return applicationUsage;
	}

	/**
	 * Returns the application usage with the primary key or throws a {@link NoSuchApplicationUsageException} if it could not be found.
	 *
	 * @param applicationUserId the primary key of the application usage
	 * @return the application usage
	 * @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage findByPrimaryKey(long applicationUserId)
		throws NoSuchApplicationUsageException {
		return findByPrimaryKey((Serializable)applicationUserId);
	}

	/**
	 * Returns the application usage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the application usage
	 * @return the application usage, or <code>null</code> if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationUsageImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ApplicationUsage applicationUsage = (ApplicationUsage)serializable;

		if (applicationUsage == null) {
			Session session = null;

			try {
				session = openSession();

				applicationUsage = (ApplicationUsage)session.get(ApplicationUsageImpl.class,
						primaryKey);

				if (applicationUsage != null) {
					cacheResult(applicationUsage);
				}
				else {
					entityCache.putResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationUsageImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationUsageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return applicationUsage;
	}

	/**
	 * Returns the application usage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param applicationUserId the primary key of the application usage
	 * @return the application usage, or <code>null</code> if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage fetchByPrimaryKey(long applicationUserId) {
		return fetchByPrimaryKey((Serializable)applicationUserId);
	}

	@Override
	public Map<Serializable, ApplicationUsage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ApplicationUsage> map = new HashMap<Serializable, ApplicationUsage>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ApplicationUsage applicationUsage = fetchByPrimaryKey(primaryKey);

			if (applicationUsage != null) {
				map.put(primaryKey, applicationUsage);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationUsageImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ApplicationUsage)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_APPLICATIONUSAGE_WHERE_PKS_IN);

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

			for (ApplicationUsage applicationUsage : (List<ApplicationUsage>)q.list()) {
				map.put(applicationUsage.getPrimaryKeyObj(), applicationUsage);

				cacheResult(applicationUsage);

				uncachedPrimaryKeys.remove(applicationUsage.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ApplicationUsageModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationUsageImpl.class, primaryKey, nullModel);
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
	 * Returns all the application usages.
	 *
	 * @return the application usages
	 */
	@Override
	public List<ApplicationUsage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the application usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application usages
	 * @param end the upper bound of the range of application usages (not inclusive)
	 * @return the range of application usages
	 */
	@Override
	public List<ApplicationUsage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the application usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application usages
	 * @param end the upper bound of the range of application usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of application usages
	 */
	@Override
	public List<ApplicationUsage> findAll(int start, int end,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the application usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application usages
	 * @param end the upper bound of the range of application usages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of application usages
	 */
	@Override
	public List<ApplicationUsage> findAll(int start, int end,
		OrderByComparator<ApplicationUsage> orderByComparator,
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

		List<ApplicationUsage> list = null;

		if (retrieveFromCache) {
			list = (List<ApplicationUsage>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_APPLICATIONUSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPLICATIONUSAGE;

				if (pagination) {
					sql = sql.concat(ApplicationUsageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ApplicationUsage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ApplicationUsage>)QueryUtil.list(q,
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
	 * Removes all the application usages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ApplicationUsage applicationUsage : findAll()) {
			remove(applicationUsage);
		}
	}

	/**
	 * Returns the number of application usages.
	 *
	 * @return the number of application usages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_APPLICATIONUSAGE);

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
		return ApplicationUsageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the application usage persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ApplicationUsageImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_APPLICATIONUSAGE = "SELECT applicationUsage FROM ApplicationUsage applicationUsage";
	private static final String _SQL_SELECT_APPLICATIONUSAGE_WHERE_PKS_IN = "SELECT applicationUsage FROM ApplicationUsage applicationUsage WHERE applicationUserId IN (";
	private static final String _SQL_SELECT_APPLICATIONUSAGE_WHERE = "SELECT applicationUsage FROM ApplicationUsage applicationUsage WHERE ";
	private static final String _SQL_COUNT_APPLICATIONUSAGE = "SELECT COUNT(applicationUsage) FROM ApplicationUsage applicationUsage";
	private static final String _SQL_COUNT_APPLICATIONUSAGE_WHERE = "SELECT COUNT(applicationUsage) FROM ApplicationUsage applicationUsage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "applicationUsage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ApplicationUsage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ApplicationUsage exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ApplicationUsagePersistenceImpl.class);
}