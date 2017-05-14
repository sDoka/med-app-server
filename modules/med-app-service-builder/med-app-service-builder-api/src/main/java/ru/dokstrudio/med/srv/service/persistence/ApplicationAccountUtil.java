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

import ru.dokstrudio.med.srv.model.ApplicationAccount;

import java.util.List;

/**
 * The persistence utility for the application account service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.ApplicationAccountPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationAccountPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.ApplicationAccountPersistenceImpl
 * @generated
 */
@ProviderType
public class ApplicationAccountUtil {
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
	public static void clearCache(ApplicationAccount applicationAccount) {
		getPersistence().clearCache(applicationAccount);
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
	public static List<ApplicationAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ApplicationAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ApplicationAccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ApplicationAccount> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ApplicationAccount update(
		ApplicationAccount applicationAccount) {
		return getPersistence().update(applicationAccount);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ApplicationAccount update(
		ApplicationAccount applicationAccount, ServiceContext serviceContext) {
		return getPersistence().update(applicationAccount, serviceContext);
	}

	/**
	* Caches the application account in the entity cache if it is enabled.
	*
	* @param applicationAccount the application account
	*/
	public static void cacheResult(ApplicationAccount applicationAccount) {
		getPersistence().cacheResult(applicationAccount);
	}

	/**
	* Caches the application accounts in the entity cache if it is enabled.
	*
	* @param applicationAccounts the application accounts
	*/
	public static void cacheResult(List<ApplicationAccount> applicationAccounts) {
		getPersistence().cacheResult(applicationAccounts);
	}

	/**
	* Creates a new application account with the primary key. Does not add the application account to the database.
	*
	* @param accountTypeId the primary key for the new application account
	* @return the new application account
	*/
	public static ApplicationAccount create(long accountTypeId) {
		return getPersistence().create(accountTypeId);
	}

	/**
	* Removes the application account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account that was removed
	* @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	*/
	public static ApplicationAccount remove(long accountTypeId)
		throws ru.dokstrudio.med.srv.exception.NoSuchApplicationAccountException {
		return getPersistence().remove(accountTypeId);
	}

	public static ApplicationAccount updateImpl(
		ApplicationAccount applicationAccount) {
		return getPersistence().updateImpl(applicationAccount);
	}

	/**
	* Returns the application account with the primary key or throws a {@link NoSuchApplicationAccountException} if it could not be found.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account
	* @throws NoSuchApplicationAccountException if a application account with the primary key could not be found
	*/
	public static ApplicationAccount findByPrimaryKey(long accountTypeId)
		throws ru.dokstrudio.med.srv.exception.NoSuchApplicationAccountException {
		return getPersistence().findByPrimaryKey(accountTypeId);
	}

	/**
	* Returns the application account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account, or <code>null</code> if a application account with the primary key could not be found
	*/
	public static ApplicationAccount fetchByPrimaryKey(long accountTypeId) {
		return getPersistence().fetchByPrimaryKey(accountTypeId);
	}

	public static java.util.Map<java.io.Serializable, ApplicationAccount> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the application accounts.
	*
	* @return the application accounts
	*/
	public static List<ApplicationAccount> findAll() {
		return getPersistence().findAll();
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
	public static List<ApplicationAccount> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<ApplicationAccount> findAll(int start, int end,
		OrderByComparator<ApplicationAccount> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<ApplicationAccount> findAll(int start, int end,
		OrderByComparator<ApplicationAccount> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the application accounts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of application accounts.
	*
	* @return the number of application accounts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ApplicationAccountPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ApplicationAccountPersistence, ApplicationAccountPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ApplicationAccountPersistence.class);
}