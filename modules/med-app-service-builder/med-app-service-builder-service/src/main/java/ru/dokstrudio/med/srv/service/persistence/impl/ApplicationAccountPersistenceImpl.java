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

import ru.dokstrudio.med.srv.exception.NoSuchApplicationAccountException;
import ru.dokstrudio.med.srv.model.ApplicationAccount;
import ru.dokstrudio.med.srv.model.impl.ApplicationAccountImpl;
import ru.dokstrudio.med.srv.model.impl.ApplicationAccountModelImpl;
import ru.dokstrudio.med.srv.service.persistence.ApplicationAccountPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the application account service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationAccountPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.ApplicationAccountUtil
 * @generated
 */
@ProviderType
public class ApplicationAccountPersistenceImpl extends BasePersistenceImpl<ApplicationAccount>
	implements ApplicationAccountPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApplicationAccountUtil} to access the application account persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApplicationAccountImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationAccountModelImpl.FINDER_CACHE_ENABLED,
			ApplicationAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationAccountModelImpl.FINDER_CACHE_ENABLED,
			ApplicationAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ApplicationAccountPersistenceImpl() {
		setModelClass(ApplicationAccount.class);
	}

	/**
	 * Caches the application account in the entity cache if it is enabled.
	 *
	 * @param applicationAccount the application account
	 */
	@Override
	public void cacheResult(ApplicationAccount applicationAccount) {
		entityCache.putResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationAccountImpl.class, applicationAccount.getPrimaryKey(),
			applicationAccount);

		applicationAccount.resetOriginalValues();
	}

	/**
	 * Caches the application accounts in the entity cache if it is enabled.
	 *
	 * @param applicationAccounts the application accounts
	 */
	@Override
	public void cacheResult(List<ApplicationAccount> applicationAccounts) {
		for (ApplicationAccount applicationAccount : applicationAccounts) {
			if (entityCache.getResult(
						ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationAccountImpl.class,
						applicationAccount.getPrimaryKey()) == null) {
				cacheResult(applicationAccount);
			}
			else {
				applicationAccount.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all application accounts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ApplicationAccountImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the application account.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ApplicationAccount applicationAccount) {
		entityCache.removeResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationAccountImpl.class, applicationAccount.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ApplicationAccount> applicationAccounts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ApplicationAccount applicationAccount : applicationAccounts) {
			entityCache.removeResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationAccountImpl.class, applicationAccount.getPrimaryKey());
		}
	}

	/**
	 * Creates a new application account with the primary key. Does not add the application account to the database.
	 *
	 * @param accountTypeId the primary key for the new application account
	 * @return the new application account
	 */
	@Override
	public ApplicationAccount create(long accountTypeId) {
		ApplicationAccount applicationAccount = new ApplicationAccountImpl();

		applicationAccount.setNew(true);
		applicationAccount.setPrimaryKey(accountTypeId);

		return applicationAccount;
	}

	/**
	 * Removes the application account with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accountTypeId the primary key of the application account
	 * @return the application account that was removed
	 * @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	 */
	@Override
	public ApplicationAccount remove(long accountTypeId)
		throws NoSuchApplicationAccountException {
		return remove((Serializable)accountTypeId);
	}

	/**
	 * Removes the application account with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the application account
	 * @return the application account that was removed
	 * @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	 */
	@Override
	public ApplicationAccount remove(Serializable primaryKey)
		throws NoSuchApplicationAccountException {
		Session session = null;

		try {
			session = openSession();

			ApplicationAccount applicationAccount = (ApplicationAccount)session.get(ApplicationAccountImpl.class,
					primaryKey);

			if (applicationAccount == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplicationAccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(applicationAccount);
		}
		catch (NoSuchApplicationAccountException nsee) {
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
	protected ApplicationAccount removeImpl(
		ApplicationAccount applicationAccount) {
		applicationAccount = toUnwrappedModel(applicationAccount);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(applicationAccount)) {
				applicationAccount = (ApplicationAccount)session.get(ApplicationAccountImpl.class,
						applicationAccount.getPrimaryKeyObj());
			}

			if (applicationAccount != null) {
				session.delete(applicationAccount);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (applicationAccount != null) {
			clearCache(applicationAccount);
		}

		return applicationAccount;
	}

	@Override
	public ApplicationAccount updateImpl(ApplicationAccount applicationAccount) {
		applicationAccount = toUnwrappedModel(applicationAccount);

		boolean isNew = applicationAccount.isNew();

		Session session = null;

		try {
			session = openSession();

			if (applicationAccount.isNew()) {
				session.save(applicationAccount);

				applicationAccount.setNew(false);
			}
			else {
				applicationAccount = (ApplicationAccount)session.merge(applicationAccount);
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

		entityCache.putResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
			ApplicationAccountImpl.class, applicationAccount.getPrimaryKey(),
			applicationAccount, false);

		applicationAccount.resetOriginalValues();

		return applicationAccount;
	}

	protected ApplicationAccount toUnwrappedModel(
		ApplicationAccount applicationAccount) {
		if (applicationAccount instanceof ApplicationAccountImpl) {
			return applicationAccount;
		}

		ApplicationAccountImpl applicationAccountImpl = new ApplicationAccountImpl();

		applicationAccountImpl.setNew(applicationAccount.isNew());
		applicationAccountImpl.setPrimaryKey(applicationAccount.getPrimaryKey());

		applicationAccountImpl.setAccountTypeId(applicationAccount.getAccountTypeId());
		applicationAccountImpl.setName(applicationAccount.getName());
		applicationAccountImpl.setDescription(applicationAccount.getDescription());
		applicationAccountImpl.setDurationDays(applicationAccount.getDurationDays());

		return applicationAccountImpl;
	}

	/**
	 * Returns the application account with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the application account
	 * @return the application account
	 * @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	 */
	@Override
	public ApplicationAccount findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplicationAccountException {
		ApplicationAccount applicationAccount = fetchByPrimaryKey(primaryKey);

		if (applicationAccount == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplicationAccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return applicationAccount;
	}

	/**
	 * Returns the application account with the primary key or throws a {@link NoSuchApplicationAccountException} if it could not be found.
	 *
	 * @param accountTypeId the primary key of the application account
	 * @return the application account
	 * @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	 */
	@Override
	public ApplicationAccount findByPrimaryKey(long accountTypeId)
		throws NoSuchApplicationAccountException {
		return findByPrimaryKey((Serializable)accountTypeId);
	}

	/**
	 * Returns the application account with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the application account
	 * @return the application account, or <code>null</code> if a application account with the primary key could not be found
	 */
	@Override
	public ApplicationAccount fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
				ApplicationAccountImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ApplicationAccount applicationAccount = (ApplicationAccount)serializable;

		if (applicationAccount == null) {
			Session session = null;

			try {
				session = openSession();

				applicationAccount = (ApplicationAccount)session.get(ApplicationAccountImpl.class,
						primaryKey);

				if (applicationAccount != null) {
					cacheResult(applicationAccount);
				}
				else {
					entityCache.putResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
						ApplicationAccountImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationAccountImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return applicationAccount;
	}

	/**
	 * Returns the application account with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accountTypeId the primary key of the application account
	 * @return the application account, or <code>null</code> if a application account with the primary key could not be found
	 */
	@Override
	public ApplicationAccount fetchByPrimaryKey(long accountTypeId) {
		return fetchByPrimaryKey((Serializable)accountTypeId);
	}

	@Override
	public Map<Serializable, ApplicationAccount> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ApplicationAccount> map = new HashMap<Serializable, ApplicationAccount>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ApplicationAccount applicationAccount = fetchByPrimaryKey(primaryKey);

			if (applicationAccount != null) {
				map.put(primaryKey, applicationAccount);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationAccountImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ApplicationAccount)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_APPLICATIONACCOUNT_WHERE_PKS_IN);

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

			for (ApplicationAccount applicationAccount : (List<ApplicationAccount>)q.list()) {
				map.put(applicationAccount.getPrimaryKeyObj(),
					applicationAccount);

				cacheResult(applicationAccount);

				uncachedPrimaryKeys.remove(applicationAccount.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ApplicationAccountModelImpl.ENTITY_CACHE_ENABLED,
					ApplicationAccountImpl.class, primaryKey, nullModel);
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
	 * Returns all the application accounts.
	 *
	 * @return the application accounts
	 */
	@Override
	public List<ApplicationAccount> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the application accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application accounts
	 * @param end the upper bound of the range of application accounts (not inclusive)
	 * @return the range of application accounts
	 */
	@Override
	public List<ApplicationAccount> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the application accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application accounts
	 * @param end the upper bound of the range of application accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of application accounts
	 */
	@Override
	public List<ApplicationAccount> findAll(int start, int end,
		OrderByComparator<ApplicationAccount> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the application accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ApplicationAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application accounts
	 * @param end the upper bound of the range of application accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of application accounts
	 */
	@Override
	public List<ApplicationAccount> findAll(int start, int end,
		OrderByComparator<ApplicationAccount> orderByComparator,
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

		List<ApplicationAccount> list = null;

		if (retrieveFromCache) {
			list = (List<ApplicationAccount>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_APPLICATIONACCOUNT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPLICATIONACCOUNT;

				if (pagination) {
					sql = sql.concat(ApplicationAccountModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ApplicationAccount>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ApplicationAccount>)QueryUtil.list(q,
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
	 * Removes all the application accounts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ApplicationAccount applicationAccount : findAll()) {
			remove(applicationAccount);
		}
	}

	/**
	 * Returns the number of application accounts.
	 *
	 * @return the number of application accounts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_APPLICATIONACCOUNT);

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
		return ApplicationAccountModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the application account persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ApplicationAccountImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_APPLICATIONACCOUNT = "SELECT applicationAccount FROM ApplicationAccount applicationAccount";
	private static final String _SQL_SELECT_APPLICATIONACCOUNT_WHERE_PKS_IN = "SELECT applicationAccount FROM ApplicationAccount applicationAccount WHERE accountTypeId IN (";
	private static final String _SQL_COUNT_APPLICATIONACCOUNT = "SELECT COUNT(applicationAccount) FROM ApplicationAccount applicationAccount";
	private static final String _ORDER_BY_ENTITY_ALIAS = "applicationAccount.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ApplicationAccount exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ApplicationAccountPersistenceImpl.class);
}