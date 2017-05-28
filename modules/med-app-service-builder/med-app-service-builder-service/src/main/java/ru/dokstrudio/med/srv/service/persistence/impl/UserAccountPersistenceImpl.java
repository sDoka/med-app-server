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
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountModelImpl.FINDER_CACHE_ENABLED, UserAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountModelImpl.FINDER_CACHE_ENABLED, UserAccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			UserAccountModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserAccountModelImpl.ENTITY_CACHE_ENABLED,
			UserAccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user accounts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user accounts
	 */
	@Override
	public List<UserAccount> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user accounts where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user accounts
	 * @param end the upper bound of the range of user accounts (not inclusive)
	 * @return the range of matching user accounts
	 */
	@Override
	public List<UserAccount> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user accounts where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user accounts
	 * @param end the upper bound of the range of user accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user accounts
	 */
	@Override
	public List<UserAccount> findByUserId(long userId, int start, int end,
		OrderByComparator<UserAccount> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user accounts where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of user accounts
	 * @param end the upper bound of the range of user accounts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching user accounts
	 */
	@Override
	public List<UserAccount> findByUserId(long userId, int start, int end,
		OrderByComparator<UserAccount> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<UserAccount> list = null;

		if (retrieveFromCache) {
			list = (List<UserAccount>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserAccount userAccount : list) {
					if ((userId != userAccount.getUserId())) {
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

			query.append(_SQL_SELECT_USERACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserAccountModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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
	 * Returns the first user account in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user account
	 * @throws NoSuchUserAccountException if a matching user account could not be found
	 */
	@Override
	public UserAccount findByUserId_First(long userId,
		OrderByComparator<UserAccount> orderByComparator)
		throws NoSuchUserAccountException {
		UserAccount userAccount = fetchByUserId_First(userId, orderByComparator);

		if (userAccount != null) {
			return userAccount;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserAccountException(msg.toString());
	}

	/**
	 * Returns the first user account in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user account, or <code>null</code> if a matching user account could not be found
	 */
	@Override
	public UserAccount fetchByUserId_First(long userId,
		OrderByComparator<UserAccount> orderByComparator) {
		List<UserAccount> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user account in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user account
	 * @throws NoSuchUserAccountException if a matching user account could not be found
	 */
	@Override
	public UserAccount findByUserId_Last(long userId,
		OrderByComparator<UserAccount> orderByComparator)
		throws NoSuchUserAccountException {
		UserAccount userAccount = fetchByUserId_Last(userId, orderByComparator);

		if (userAccount != null) {
			return userAccount;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserAccountException(msg.toString());
	}

	/**
	 * Returns the last user account in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user account, or <code>null</code> if a matching user account could not be found
	 */
	@Override
	public UserAccount fetchByUserId_Last(long userId,
		OrderByComparator<UserAccount> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<UserAccount> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user accounts before and after the current user account in the ordered set where userId = &#63;.
	 *
	 * @param userAccountPK the primary key of the current user account
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user account
	 * @throws NoSuchUserAccountException if a user account with the primary key could not be found
	 */
	@Override
	public UserAccount[] findByUserId_PrevAndNext(UserAccountPK userAccountPK,
		long userId, OrderByComparator<UserAccount> orderByComparator)
		throws NoSuchUserAccountException {
		UserAccount userAccount = findByPrimaryKey(userAccountPK);

		Session session = null;

		try {
			session = openSession();

			UserAccount[] array = new UserAccountImpl[3];

			array[0] = getByUserId_PrevAndNext(session, userAccount, userId,
					orderByComparator, true);

			array[1] = userAccount;

			array[2] = getByUserId_PrevAndNext(session, userAccount, userId,
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

	protected UserAccount getByUserId_PrevAndNext(Session session,
		UserAccount userAccount, long userId,
		OrderByComparator<UserAccount> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERACCOUNT_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(UserAccountModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userAccount);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserAccount> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user accounts where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (UserAccount userAccount : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(userAccount);
		}
	}

	/**
	 * Returns the number of user accounts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user accounts
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USERACCOUNT_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "userAccount.id.userId = ?";

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

		UserAccountModelImpl userAccountModelImpl = (UserAccountModelImpl)userAccount;

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

		if (isNew || !UserAccountModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userAccountModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userAccountModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { userAccountModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
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
	private static final String _SQL_SELECT_USERACCOUNT_WHERE = "SELECT userAccount FROM UserAccount userAccount WHERE ";
	private static final String _SQL_COUNT_USERACCOUNT = "SELECT COUNT(userAccount) FROM UserAccount userAccount";
	private static final String _SQL_COUNT_USERACCOUNT_WHERE = "SELECT COUNT(userAccount) FROM UserAccount userAccount WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userAccount.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserAccount exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserAccount exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(UserAccountPersistenceImpl.class);
}