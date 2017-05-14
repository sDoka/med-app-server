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
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstrudio.med.srv.exception.NoSuchUserAccountException;
import ru.dokstrudio.med.srv.model.UserAccount;
import ru.dokstrudio.med.srv.model.impl.UserAccountImpl;
import ru.dokstrudio.med.srv.model.impl.UserAccountModelImpl;
import ru.dokstrudio.med.srv.service.persistence.UserAccountPK;
import ru.dokstrudio.med.srv.service.persistence.UserAccountPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the user account service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAccountPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.UserAccountUtil
 * @generated
 */
@ProviderType
public class UserAccountPersistenceImpl extends BasePersistenceImpl<UserAccount>
	implements UserAccountPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserAccountUtil} to access the user account persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserAccountImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountModelImpl.FINDER_CACHE_ENABLED, UserAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountModelImpl.FINDER_CACHE_ENABLED, UserAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserAccountPersistenceImpl() {
		setModelClass(UserAccount.class);
	}

	/**
	 * Caches the user account in the entity cache if it is enabled.
	 *
	 * @param userAccount the user account
	 */
	@Override
	public void cacheResult(UserAccount userAccount) {
		entityCache.putResult(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountImpl.class, userAccount.getPrimaryKey(), userAccount);

		userAccount.resetOriginalValues();
	}

	/**
	 * Caches the user accounts in the entity cache if it is enabled.
	 *
	 * @param userAccounts the user accounts
	 */
	@Override
	public void cacheResult(List<UserAccount> userAccounts) {
		for (UserAccount userAccount : userAccounts) {
			if (entityCache.getResult(
						UserAccountModelImpl.ENTITY_CACHE_ENABLED,
						UserAccountImpl.class, userAccount.getPrimaryKey()) == null) {
				cacheResult(userAccount);
			}
			else {
				userAccount.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user accounts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UserAccountImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user account.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserAccount userAccount) {
		entityCache.removeResult(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountImpl.class, userAccount.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserAccount> userAccounts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserAccount userAccount : userAccounts) {
			entityCache.removeResult(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
				UserAccountImpl.class, userAccount.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user account with the primary key. Does not add the user account to the database.
	 *
	 * @param userAccountPK the primary key for the new user account
	 * @return the new user account
	 */
	@Override
	public UserAccount create(UserAccountPK userAccountPK) {
		UserAccount userAccount = new UserAccountImpl();

		userAccount.setNew(true);
		userAccount.setPrimaryKey(userAccountPK);

		return userAccount;
	}

	/**
	 * Removes the user account with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userAccountPK the primary key of the user account
	 * @return the user account that was removed
	 * @throws NoSuchUserAccountException if a user account with the primary key could not be found
	 */
	@Override
	public UserAccount remove(UserAccountPK userAccountPK)
		throws NoSuchUserAccountException {
		return remove((Serializable)userAccountPK);
	}

	/**
	 * Removes the user account with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user account
	 * @return the user account that was removed
	 * @throws NoSuchUserAccountException if a user account with the primary key could not be found
	 */
	@Override
	public UserAccount remove(Serializable primaryKey)
		throws NoSuchUserAccountException {
		Session session = null;

		try {
			session = openSession();

			UserAccount userAccount = (UserAccount)session.get(UserAccountImpl.class,
					primaryKey);

			if (userAccount == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserAccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userAccount);
		}
		catch (NoSuchUserAccountException nsee) {
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
	protected UserAccount removeImpl(UserAccount userAccount) {
		userAccount = toUnwrappedModel(userAccount);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userAccount)) {
				userAccount = (UserAccount)session.get(UserAccountImpl.class,
						userAccount.getPrimaryKeyObj());
			}

			if (userAccount != null) {
				session.delete(userAccount);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userAccount != null) {
			clearCache(userAccount);
		}

		return userAccount;
	}

	@Override
	public UserAccount updateImpl(UserAccount userAccount) {
		userAccount = toUnwrappedModel(userAccount);

		boolean isNew = userAccount.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userAccount.isNew()) {
				session.save(userAccount);

				userAccount.setNew(false);
			}
			else {
				userAccount = (UserAccount)session.merge(userAccount);
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

		entityCache.putResult(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountImpl.class, userAccount.getPrimaryKey(), userAccount,
			false);

		userAccount.resetOriginalValues();

		return userAccount;
	}

	protected UserAccount toUnwrappedModel(UserAccount userAccount) {
		if (userAccount instanceof UserAccountImpl) {
			return userAccount;
		}

		UserAccountImpl userAccountImpl = new UserAccountImpl();

		userAccountImpl.setNew(userAccount.isNew());
		userAccountImpl.setPrimaryKey(userAccount.getPrimaryKey());

		userAccountImpl.setUserId(userAccount.getUserId());
		userAccountImpl.setAccountTypeId(userAccount.getAccountTypeId());
		userAccountImpl.setActivationDate(userAccount.getActivationDate());
		userAccountImpl.setExpirationDate(userAccount.getExpirationDate());

		return userAccountImpl;
	}

	/**
	 * Returns the user account with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user account
	 * @return the user account
	 * @throws NoSuchUserAccountException if a user account with the primary key could not be found
	 */
	@Override
	public UserAccount findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserAccountException {
		UserAccount userAccount = fetchByPrimaryKey(primaryKey);

		if (userAccount == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserAccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userAccount;
	}

	/**
	 * Returns the user account with the primary key or throws a {@link NoSuchUserAccountException} if it could not be found.
	 *
	 * @param userAccountPK the primary key of the user account
	 * @return the user account
	 * @throws NoSuchUserAccountException if a user account with the primary key could not be found
	 */
	@Override
	public UserAccount findByPrimaryKey(UserAccountPK userAccountPK)
		throws NoSuchUserAccountException {
		return findByPrimaryKey((Serializable)userAccountPK);
	}

	/**
	 * Returns the user account with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user account
	 * @return the user account, or <code>null</code> if a user account with the primary key could not be found
	 */
	@Override
	public UserAccount fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
				UserAccountImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UserAccount userAccount = (UserAccount)serializable;

		if (userAccount == null) {
			Session session = null;

			try {
				session = openSession();

				userAccount = (UserAccount)session.get(UserAccountImpl.class,
						primaryKey);

				if (userAccount != null) {
					cacheResult(userAccount);
				}
				else {
					entityCache.putResult(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
						UserAccountImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
					UserAccountImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userAccount;
	}

	/**
	 * Returns the user account with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userAccountPK the primary key of the user account
	 * @return the user account, or <code>null</code> if a user account with the primary key could not be found
	 */
	@Override
	public UserAccount fetchByPrimaryKey(UserAccountPK userAccountPK) {
		return fetchByPrimaryKey((Serializable)userAccountPK);
	}

	@Override
	public Map<Serializable, UserAccount> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UserAccount> map = new HashMap<Serializable, UserAccount>();

		for (Serializable primaryKey : primaryKeys) {
			UserAccount userAccount = fetchByPrimaryKey(primaryKey);

			if (userAccount != null) {
				map.put(primaryKey, userAccount);
			}
		}

		return map;
	}

	/**
	 * Returns all the user accounts.
	 *
	 * @return the user accounts
	 */
	@Override
	public List<UserAccount> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user accounts
	 * @param end the upper bound of the range of user accounts (not inclusive)
	 * @return the range of user accounts
	 */
	@Override
	public List<UserAccount> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user accounts
	 * @param end the upper bound of the range of user accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user accounts
	 */
	@Override
	public List<UserAccount> findAll(int start, int end,
		OrderByComparator<UserAccount> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user accounts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user accounts
	 * @param end the upper bound of the range of user accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of user accounts
	 */
	@Override
	public List<UserAccount> findAll(int start, int end,
		OrderByComparator<UserAccount> orderByComparator,
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

		List<UserAccount> list = null;

		if (retrieveFromCache) {
			list = (List<UserAccount>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_USERACCOUNT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERACCOUNT;

				if (pagination) {
					sql = sql.concat(UserAccountModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserAccount>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UserAccount>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user accounts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserAccount userAccount : findAll()) {
			remove(userAccount);
		}
	}

	/**
	 * Returns the number of user accounts.
	 *
	 * @return the number of user accounts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERACCOUNT);

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
		return UserAccountModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user account persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UserAccountImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_USERACCOUNT = "SELECT userAccount FROM UserAccount userAccount";
	private static final String _SQL_COUNT_USERACCOUNT = "SELECT COUNT(userAccount) FROM UserAccount userAccount";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userAccount.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserAccount exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(UserAccountPersistenceImpl.class);
}