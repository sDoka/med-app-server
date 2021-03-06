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

package ru.dokstrudio.med.srv.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import ru.dokstrudio.med.srv.model.UserAccount;

import java.util.List;

/**
 * The persistence utility for the user account service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.UserAccountPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAccountPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.UserAccountPersistenceImpl
 * @generated
 */
@ProviderType
public class UserAccountUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(UserAccount userAccount) {
		getPersistence().clearCache(userAccount);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UserAccount> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UserAccount update(UserAccount userAccount) {
		return getPersistence().update(userAccount);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UserAccount update(UserAccount userAccount,
		ServiceContext serviceContext) {
		return getPersistence().update(userAccount, serviceContext);
	}

	/**
	* Returns all the user accounts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user accounts
	*/
	public static List<UserAccount> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
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
	public static List<UserAccount> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
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
	public static List<UserAccount> findByUserId(long userId, int start,
		int end, OrderByComparator<UserAccount> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
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
	public static List<UserAccount> findByUserId(long userId, int start,
		int end, OrderByComparator<UserAccount> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user account
	* @throws NoSuchUserAccountException if a matching user account could not be found
	*/
	public static UserAccount findByUserId_First(long userId,
		OrderByComparator<UserAccount> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchUserAccountException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user account, or <code>null</code> if a matching user account could not be found
	*/
	public static UserAccount fetchByUserId_First(long userId,
		OrderByComparator<UserAccount> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user account
	* @throws NoSuchUserAccountException if a matching user account could not be found
	*/
	public static UserAccount findByUserId_Last(long userId,
		OrderByComparator<UserAccount> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchUserAccountException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user account, or <code>null</code> if a matching user account could not be found
	*/
	public static UserAccount fetchByUserId_Last(long userId,
		OrderByComparator<UserAccount> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
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
	public static UserAccount[] findByUserId_PrevAndNext(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK,
		long userId, OrderByComparator<UserAccount> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchUserAccountException {
		return getPersistence()
				   .findByUserId_PrevAndNext(userAccountPK, userId,
			orderByComparator);
	}

	/**
	* Removes all the user accounts where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of user accounts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user accounts
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the user account in the entity cache if it is enabled.
	*
	* @param userAccount the user account
	*/
	public static void cacheResult(UserAccount userAccount) {
		getPersistence().cacheResult(userAccount);
	}

	/**
	* Caches the user accounts in the entity cache if it is enabled.
	*
	* @param userAccounts the user accounts
	*/
	public static void cacheResult(List<UserAccount> userAccounts) {
		getPersistence().cacheResult(userAccounts);
	}

	/**
	* Creates a new user account with the primary key. Does not add the user account to the database.
	*
	* @param userAccountPK the primary key for the new user account
	* @return the new user account
	*/
	public static UserAccount create(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK) {
		return getPersistence().create(userAccountPK);
	}

	/**
	* Removes the user account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account that was removed
	* @throws NoSuchUserAccountException if a user account with the primary key could not be found
	*/
	public static UserAccount remove(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK)
		throws ru.dokstrudio.med.srv.exception.NoSuchUserAccountException {
		return getPersistence().remove(userAccountPK);
	}

	public static UserAccount updateImpl(UserAccount userAccount) {
		return getPersistence().updateImpl(userAccount);
	}

	/**
	* Returns the user account with the primary key or throws a {@link NoSuchUserAccountException} if it could not be found.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account
	* @throws NoSuchUserAccountException if a user account with the primary key could not be found
	*/
	public static UserAccount findByPrimaryKey(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK)
		throws ru.dokstrudio.med.srv.exception.NoSuchUserAccountException {
		return getPersistence().findByPrimaryKey(userAccountPK);
	}

	/**
	* Returns the user account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account, or <code>null</code> if a user account with the primary key could not be found
	*/
	public static UserAccount fetchByPrimaryKey(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK) {
		return getPersistence().fetchByPrimaryKey(userAccountPK);
	}

	public static java.util.Map<java.io.Serializable, UserAccount> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the user accounts.
	*
	* @return the user accounts
	*/
	public static List<UserAccount> findAll() {
		return getPersistence().findAll();
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
	public static List<UserAccount> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<UserAccount> findAll(int start, int end,
		OrderByComparator<UserAccount> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<UserAccount> findAll(int start, int end,
		OrderByComparator<UserAccount> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the user accounts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user accounts.
	*
	* @return the number of user accounts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UserAccountPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UserAccountPersistence, UserAccountPersistence> _serviceTracker =
		ServiceTrackerFactory.open(UserAccountPersistence.class);
}