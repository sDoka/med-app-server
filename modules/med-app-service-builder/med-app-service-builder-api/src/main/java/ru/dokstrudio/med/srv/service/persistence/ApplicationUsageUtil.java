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

import ru.dokstrudio.med.srv.model.ApplicationUsage;

import java.util.List;

/**
 * The persistence utility for the application usage service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.ApplicationUsagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationUsagePersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.ApplicationUsagePersistenceImpl
 * @generated
 */
@ProviderType
public class ApplicationUsageUtil {
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
	public static void clearCache(ApplicationUsage applicationUsage) {
		getPersistence().clearCache(applicationUsage);
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
	public static List<ApplicationUsage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ApplicationUsage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ApplicationUsage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ApplicationUsage update(ApplicationUsage applicationUsage) {
		return getPersistence().update(applicationUsage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ApplicationUsage update(ApplicationUsage applicationUsage,
		ServiceContext serviceContext) {
		return getPersistence().update(applicationUsage, serviceContext);
	}

	/**
	* Returns all the application usages where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the matching application usages
	*/
	public static List<ApplicationUsage> findByDeviceId(long deviceId) {
		return getPersistence().findByDeviceId(deviceId);
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
	public static List<ApplicationUsage> findByDeviceId(long deviceId,
		int start, int end) {
		return getPersistence().findByDeviceId(deviceId, start, end);
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
	public static List<ApplicationUsage> findByDeviceId(long deviceId,
		int start, int end,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		return getPersistence()
				   .findByDeviceId(deviceId, start, end, orderByComparator);
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
	public static List<ApplicationUsage> findByDeviceId(long deviceId,
		int start, int end,
		OrderByComparator<ApplicationUsage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDeviceId(deviceId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application usage
	* @throws NoSuchApplicationUsageException if a matching application usage could not be found
	*/
	public static ApplicationUsage findByDeviceId_First(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchApplicationUsageException {
		return getPersistence().findByDeviceId_First(deviceId, orderByComparator);
	}

	/**
	* Returns the first application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application usage, or <code>null</code> if a matching application usage could not be found
	*/
	public static ApplicationUsage fetchByDeviceId_First(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		return getPersistence()
				   .fetchByDeviceId_First(deviceId, orderByComparator);
	}

	/**
	* Returns the last application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application usage
	* @throws NoSuchApplicationUsageException if a matching application usage could not be found
	*/
	public static ApplicationUsage findByDeviceId_Last(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchApplicationUsageException {
		return getPersistence().findByDeviceId_Last(deviceId, orderByComparator);
	}

	/**
	* Returns the last application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application usage, or <code>null</code> if a matching application usage could not be found
	*/
	public static ApplicationUsage fetchByDeviceId_Last(long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		return getPersistence().fetchByDeviceId_Last(deviceId, orderByComparator);
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
	public static ApplicationUsage[] findByDeviceId_PrevAndNext(
		long applicationUserId, long deviceId,
		OrderByComparator<ApplicationUsage> orderByComparator)
		throws ru.dokstrudio.med.srv.exception.NoSuchApplicationUsageException {
		return getPersistence()
				   .findByDeviceId_PrevAndNext(applicationUserId, deviceId,
			orderByComparator);
	}

	/**
	* Removes all the application usages where deviceId = &#63; from the database.
	*
	* @param deviceId the device ID
	*/
	public static void removeByDeviceId(long deviceId) {
		getPersistence().removeByDeviceId(deviceId);
	}

	/**
	* Returns the number of application usages where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the number of matching application usages
	*/
	public static int countByDeviceId(long deviceId) {
		return getPersistence().countByDeviceId(deviceId);
	}

	/**
	* Caches the application usage in the entity cache if it is enabled.
	*
	* @param applicationUsage the application usage
	*/
	public static void cacheResult(ApplicationUsage applicationUsage) {
		getPersistence().cacheResult(applicationUsage);
	}

	/**
	* Caches the application usages in the entity cache if it is enabled.
	*
	* @param applicationUsages the application usages
	*/
	public static void cacheResult(List<ApplicationUsage> applicationUsages) {
		getPersistence().cacheResult(applicationUsages);
	}

	/**
	* Creates a new application usage with the primary key. Does not add the application usage to the database.
	*
	* @param applicationUserId the primary key for the new application usage
	* @return the new application usage
	*/
	public static ApplicationUsage create(long applicationUserId) {
		return getPersistence().create(applicationUserId);
	}

	/**
	* Removes the application usage with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage that was removed
	* @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	*/
	public static ApplicationUsage remove(long applicationUserId)
		throws ru.dokstrudio.med.srv.exception.NoSuchApplicationUsageException {
		return getPersistence().remove(applicationUserId);
	}

	public static ApplicationUsage updateImpl(ApplicationUsage applicationUsage) {
		return getPersistence().updateImpl(applicationUsage);
	}

	/**
	* Returns the application usage with the primary key or throws a {@link NoSuchApplicationUsageException} if it could not be found.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage
	* @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	*/
	public static ApplicationUsage findByPrimaryKey(long applicationUserId)
		throws ru.dokstrudio.med.srv.exception.NoSuchApplicationUsageException {
		return getPersistence().findByPrimaryKey(applicationUserId);
	}

	/**
	* Returns the application usage with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage, or <code>null</code> if a application usage with the primary key could not be found
	*/
	public static ApplicationUsage fetchByPrimaryKey(long applicationUserId) {
		return getPersistence().fetchByPrimaryKey(applicationUserId);
	}

	public static java.util.Map<java.io.Serializable, ApplicationUsage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the application usages.
	*
	* @return the application usages
	*/
	public static List<ApplicationUsage> findAll() {
		return getPersistence().findAll();
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
	public static List<ApplicationUsage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<ApplicationUsage> findAll(int start, int end,
		OrderByComparator<ApplicationUsage> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<ApplicationUsage> findAll(int start, int end,
		OrderByComparator<ApplicationUsage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the application usages from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of application usages.
	*
	* @return the number of application usages
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ApplicationUsagePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ApplicationUsagePersistence, ApplicationUsagePersistence> _serviceTracker =
		ServiceTrackerFactory.open(ApplicationUsagePersistence.class);
}