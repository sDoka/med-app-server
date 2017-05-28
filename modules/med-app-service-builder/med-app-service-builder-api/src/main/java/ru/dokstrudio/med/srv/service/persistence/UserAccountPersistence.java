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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import ru.dokstrudio.med.srv.exception.NoSuchUserAccountException;
import ru.dokstrudio.med.srv.model.UserAccount;

/**
 * The persistence interface for the user account service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.UserAccountPersistenceImpl
 * @see UserAccountUtil
 * @generated
 */
@ProviderType
public interface UserAccountPersistence extends BasePersistence<UserAccount> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserAccountUtil} to access the user account persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user accounts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user accounts
	*/
	public java.util.List<UserAccount> findByUserId(long userId);

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
	public java.util.List<UserAccount> findByUserId(long userId, int start,
		int end);

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
	public java.util.List<UserAccount> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator);

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
	public java.util.List<UserAccount> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user account
	* @throws NoSuchUserAccountException if a matching user account could not be found
	*/
	public UserAccount findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator)
		throws NoSuchUserAccountException;

	/**
	* Returns the first user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user account, or <code>null</code> if a matching user account could not be found
	*/
	public UserAccount fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator);

	/**
	* Returns the last user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user account
	* @throws NoSuchUserAccountException if a matching user account could not be found
	*/
	public UserAccount findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator)
		throws NoSuchUserAccountException;

	/**
	* Returns the last user account in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user account, or <code>null</code> if a matching user account could not be found
	*/
	public UserAccount fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator);

	/**
	* Returns the user accounts before and after the current user account in the ordered set where userId = &#63;.
	*
	* @param userAccountPK the primary key of the current user account
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user account
	* @throws NoSuchUserAccountException if a user account with the primary key could not be found
	*/
	public UserAccount[] findByUserId_PrevAndNext(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator)
		throws NoSuchUserAccountException;

	/**
	* Removes all the user accounts where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of user accounts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user accounts
	*/
	public int countByUserId(long userId);

	/**
	* Caches the user account in the entity cache if it is enabled.
	*
	* @param userAccount the user account
	*/
	public void cacheResult(UserAccount userAccount);

	/**
	* Caches the user accounts in the entity cache if it is enabled.
	*
	* @param userAccounts the user accounts
	*/
	public void cacheResult(java.util.List<UserAccount> userAccounts);

	/**
	* Creates a new user account with the primary key. Does not add the user account to the database.
	*
	* @param userAccountPK the primary key for the new user account
	* @return the new user account
	*/
	public UserAccount create(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK);

	/**
	* Removes the user account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account that was removed
	* @throws NoSuchUserAccountException if a user account with the primary key could not be found
	*/
	public UserAccount remove(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK)
		throws NoSuchUserAccountException;

	public UserAccount updateImpl(UserAccount userAccount);

	/**
	* Returns the user account with the primary key or throws a {@link NoSuchUserAccountException} if it could not be found.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account
	* @throws NoSuchUserAccountException if a user account with the primary key could not be found
	*/
	public UserAccount findByPrimaryKey(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK)
		throws NoSuchUserAccountException;

	/**
	* Returns the user account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account, or <code>null</code> if a user account with the primary key could not be found
	*/
	public UserAccount fetchByPrimaryKey(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK);

	@Override
	public java.util.Map<java.io.Serializable, UserAccount> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the user accounts.
	*
	* @return the user accounts
	*/
	public java.util.List<UserAccount> findAll();

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
	public java.util.List<UserAccount> findAll(int start, int end);

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
	public java.util.List<UserAccount> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator);

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
	public java.util.List<UserAccount> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAccount> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the user accounts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of user accounts.
	*
	* @return the number of user accounts
	*/
	public int countAll();
}