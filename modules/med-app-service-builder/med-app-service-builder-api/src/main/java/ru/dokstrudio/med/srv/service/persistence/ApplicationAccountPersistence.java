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

import ru.dokstrudio.med.srv.exception.NoSuchApplicationAccountException;
import ru.dokstrudio.med.srv.model.ApplicationAccount;

/**
 * The persistence interface for the application account service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.ApplicationAccountPersistenceImpl
 * @see ApplicationAccountUtil
 * @generated
 */
@ProviderType
public interface ApplicationAccountPersistence extends BasePersistence<ApplicationAccount> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplicationAccountUtil} to access the application account persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the application account in the entity cache if it is enabled.
	*
	* @param applicationAccount the application account
	*/
	public void cacheResult(ApplicationAccount applicationAccount);

	/**
	* Caches the application accounts in the entity cache if it is enabled.
	*
	* @param applicationAccounts the application accounts
	*/
	public void cacheResult(
		java.util.List<ApplicationAccount> applicationAccounts);

	/**
	* Creates a new application account with the primary key. Does not add the application account to the database.
	*
	* @param accountTypeId the primary key for the new application account
	* @return the new application account
	*/
	public ApplicationAccount create(long accountTypeId);

	/**
	* Removes the application account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account that was removed
	* @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	*/
	public ApplicationAccount remove(long accountTypeId)
		throws NoSuchApplicationAccountException;

	public ApplicationAccount updateImpl(ApplicationAccount applicationAccount);

	/**
	* Returns the application account with the primary key or throws a {@link NoSuchApplicationAccountException} if it could not be found.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account
	* @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	*/
	public ApplicationAccount findByPrimaryKey(long accountTypeId)
		throws NoSuchApplicationAccountException;

	/**
	* Returns the application account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account, or <code>null</code> if a application account with the primary key could not be found
	*/
	public ApplicationAccount fetchByPrimaryKey(long accountTypeId);

	@Override
	public java.util.Map<java.io.Serializable, ApplicationAccount> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the application accounts.
	*
	* @return the application accounts
	*/
	public java.util.List<ApplicationAccount> findAll();

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
	public java.util.List<ApplicationAccount> findAll(int start, int end);

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
	public java.util.List<ApplicationAccount> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationAccount> orderByComparator);

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
	public java.util.List<ApplicationAccount> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationAccount> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the application accounts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of application accounts.
	*
	* @return the number of application accounts
	*/
	public int countAll();
}