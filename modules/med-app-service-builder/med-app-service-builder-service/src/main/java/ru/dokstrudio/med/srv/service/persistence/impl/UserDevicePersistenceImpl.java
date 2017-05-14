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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstrudio.med.srv.exception.NoSuchUserDeviceException;
import ru.dokstrudio.med.srv.model.UserDevice;
import ru.dokstrudio.med.srv.model.impl.UserDeviceImpl;
import ru.dokstrudio.med.srv.model.impl.UserDeviceModelImpl;
import ru.dokstrudio.med.srv.service.persistence.UserDevicePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the user device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserDevicePersistence
 * @see ru.dokstrudio.med.srv.service.persistence.UserDeviceUtil
 * @generated
 */
@ProviderType
public class UserDevicePersistenceImpl extends BasePersistenceImpl<UserDevice>
	implements UserDevicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserDeviceUtil} to access the user device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserDeviceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
			UserDeviceModelImpl.FINDER_CACHE_ENABLED, UserDeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
			UserDeviceModelImpl.FINDER_CACHE_ENABLED, UserDeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
			UserDeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserDevicePersistenceImpl() {
		setModelClass(UserDevice.class);
	}

	/**
	 * Caches the user device in the entity cache if it is enabled.
	 *
	 * @param userDevice the user device
	 */
	@Override
	public void cacheResult(UserDevice userDevice) {
		entityCache.putResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
			UserDeviceImpl.class, userDevice.getPrimaryKey(), userDevice);

		userDevice.resetOriginalValues();
	}

	/**
	 * Caches the user devices in the entity cache if it is enabled.
	 *
	 * @param userDevices the user devices
	 */
	@Override
	public void cacheResult(List<UserDevice> userDevices) {
		for (UserDevice userDevice : userDevices) {
			if (entityCache.getResult(
						UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
						UserDeviceImpl.class, userDevice.getPrimaryKey()) == null) {
				cacheResult(userDevice);
			}
			else {
				userDevice.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user devices.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UserDeviceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user device.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserDevice userDevice) {
		entityCache.removeResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
			UserDeviceImpl.class, userDevice.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserDevice> userDevices) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserDevice userDevice : userDevices) {
			entityCache.removeResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
				UserDeviceImpl.class, userDevice.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user device with the primary key. Does not add the user device to the database.
	 *
	 * @param deviceId the primary key for the new user device
	 * @return the new user device
	 */
	@Override
	public UserDevice create(long deviceId) {
		UserDevice userDevice = new UserDeviceImpl();

		userDevice.setNew(true);
		userDevice.setPrimaryKey(deviceId);

		return userDevice;
	}

	/**
	 * Removes the user device with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param deviceId the primary key of the user device
	 * @return the user device that was removed
	 * @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	 */
	@Override
	public UserDevice remove(long deviceId) throws NoSuchUserDeviceException {
		return remove((Serializable)deviceId);
	}

	/**
	 * Removes the user device with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user device
	 * @return the user device that was removed
	 * @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	 */
	@Override
	public UserDevice remove(Serializable primaryKey)
		throws NoSuchUserDeviceException {
		Session session = null;

		try {
			session = openSession();

			UserDevice userDevice = (UserDevice)session.get(UserDeviceImpl.class,
					primaryKey);

			if (userDevice == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userDevice);
		}
		catch (NoSuchUserDeviceException nsee) {
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
	protected UserDevice removeImpl(UserDevice userDevice) {
		userDevice = toUnwrappedModel(userDevice);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userDevice)) {
				userDevice = (UserDevice)session.get(UserDeviceImpl.class,
						userDevice.getPrimaryKeyObj());
			}

			if (userDevice != null) {
				session.delete(userDevice);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userDevice != null) {
			clearCache(userDevice);
		}

		return userDevice;
	}

	@Override
	public UserDevice updateImpl(UserDevice userDevice) {
		userDevice = toUnwrappedModel(userDevice);

		boolean isNew = userDevice.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userDevice.isNew()) {
				session.save(userDevice);

				userDevice.setNew(false);
			}
			else {
				userDevice = (UserDevice)session.merge(userDevice);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
			UserDeviceImpl.class, userDevice.getPrimaryKey(), userDevice, false);

		userDevice.resetOriginalValues();

		return userDevice;
	}

	protected UserDevice toUnwrappedModel(UserDevice userDevice) {
		if (userDevice instanceof UserDeviceImpl) {
			return userDevice;
		}

		UserDeviceImpl userDeviceImpl = new UserDeviceImpl();

		userDeviceImpl.setNew(userDevice.isNew());
		userDeviceImpl.setPrimaryKey(userDevice.getPrimaryKey());

		userDeviceImpl.setDeviceId(userDevice.getDeviceId());
		userDeviceImpl.setUserId(userDevice.getUserId());
		userDeviceImpl.setDeviceTypeId(userDevice.getDeviceTypeId());
		userDeviceImpl.setDeviceKey(userDevice.getDeviceKey());
		userDeviceImpl.setOperatingSystem(userDevice.getOperatingSystem());

		return userDeviceImpl;
	}

	/**
	 * Returns the user device with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user device
	 * @return the user device
	 * @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	 */
	@Override
	public UserDevice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserDeviceException {
		UserDevice userDevice = fetchByPrimaryKey(primaryKey);

		if (userDevice == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userDevice;
	}

	/**
	 * Returns the user device with the primary key or throws a {@link NoSuchUserDeviceException} if it could not be found.
	 *
	 * @param deviceId the primary key of the user device
	 * @return the user device
	 * @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	 */
	@Override
	public UserDevice findByPrimaryKey(long deviceId)
		throws NoSuchUserDeviceException {
		return findByPrimaryKey((Serializable)deviceId);
	}

	/**
	 * Returns the user device with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user device
	 * @return the user device, or <code>null</code> if a user device with the primary key could not be found
	 */
	@Override
	public UserDevice fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
				UserDeviceImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UserDevice userDevice = (UserDevice)serializable;

		if (userDevice == null) {
			Session session = null;

			try {
				session = openSession();

				userDevice = (UserDevice)session.get(UserDeviceImpl.class,
						primaryKey);

				if (userDevice != null) {
					cacheResult(userDevice);
				}
				else {
					entityCache.putResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
						UserDeviceImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
					UserDeviceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userDevice;
	}

	/**
	 * Returns the user device with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param deviceId the primary key of the user device
	 * @return the user device, or <code>null</code> if a user device with the primary key could not be found
	 */
	@Override
	public UserDevice fetchByPrimaryKey(long deviceId) {
		return fetchByPrimaryKey((Serializable)deviceId);
	}

	@Override
	public Map<Serializable, UserDevice> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UserDevice> map = new HashMap<Serializable, UserDevice>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UserDevice userDevice = fetchByPrimaryKey(primaryKey);

			if (userDevice != null) {
				map.put(primaryKey, userDevice);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
					UserDeviceImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UserDevice)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_USERDEVICE_WHERE_PKS_IN);

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

			for (UserDevice userDevice : (List<UserDevice>)q.list()) {
				map.put(userDevice.getPrimaryKeyObj(), userDevice);

				cacheResult(userDevice);

				uncachedPrimaryKeys.remove(userDevice.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UserDeviceModelImpl.ENTITY_CACHE_ENABLED,
					UserDeviceImpl.class, primaryKey, nullModel);
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
	 * Returns all the user devices.
	 *
	 * @return the user devices
	 */
	@Override
	public List<UserDevice> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user devices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user devices
	 * @param end the upper bound of the range of user devices (not inclusive)
	 * @return the range of user devices
	 */
	@Override
	public List<UserDevice> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user devices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user devices
	 * @param end the upper bound of the range of user devices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user devices
	 */
	@Override
	public List<UserDevice> findAll(int start, int end,
		OrderByComparator<UserDevice> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user devices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user devices
	 * @param end the upper bound of the range of user devices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of user devices
	 */
	@Override
	public List<UserDevice> findAll(int start, int end,
		OrderByComparator<UserDevice> orderByComparator,
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

		List<UserDevice> list = null;

		if (retrieveFromCache) {
			list = (List<UserDevice>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_USERDEVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERDEVICE;

				if (pagination) {
					sql = sql.concat(UserDeviceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserDevice>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UserDevice>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user devices from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserDevice userDevice : findAll()) {
			remove(userDevice);
		}
	}

	/**
	 * Returns the number of user devices.
	 *
	 * @return the number of user devices
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERDEVICE);

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
		return UserDeviceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user device persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UserDeviceImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_USERDEVICE = "SELECT userDevice FROM UserDevice userDevice";
	private static final String _SQL_SELECT_USERDEVICE_WHERE_PKS_IN = "SELECT userDevice FROM UserDevice userDevice WHERE deviceId IN (";
	private static final String _SQL_COUNT_USERDEVICE = "SELECT COUNT(userDevice) FROM UserDevice userDevice";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userDevice.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserDevice exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(UserDevicePersistenceImpl.class);
}