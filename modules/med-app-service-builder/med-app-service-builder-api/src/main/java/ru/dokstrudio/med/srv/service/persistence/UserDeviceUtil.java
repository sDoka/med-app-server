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

import ru.dokstrudio.med.srv.model.UserDevice;

import java.util.List;

/**
 * The persistence utility for the user device service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.UserDevicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserDevicePersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.UserDevicePersistenceImpl
 * @generated
 */
@ProviderType
public class UserDeviceUtil {
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
	public static void clearCache(UserDevice userDevice) {
		getPersistence().clearCache(userDevice);
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
	public static List<UserDevice> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserDevice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserDevice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UserDevice> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UserDevice update(UserDevice userDevice) {
		return getPersistence().update(userDevice);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UserDevice update(UserDevice userDevice,
		ServiceContext serviceContext) {
		return getPersistence().update(userDevice, serviceContext);
	}

	/**
	* Caches the user device in the entity cache if it is enabled.
	*
	* @param userDevice the user device
	*/
	public static void cacheResult(UserDevice userDevice) {
		getPersistence().cacheResult(userDevice);
	}

	/**
	* Caches the user devices in the entity cache if it is enabled.
	*
	* @param userDevices the user devices
	*/
	public static void cacheResult(List<UserDevice> userDevices) {
		getPersistence().cacheResult(userDevices);
	}

	/**
	* Creates a new user device with the primary key. Does not add the user device to the database.
	*
	* @param deviceId the primary key for the new user device
	* @return the new user device
	*/
	public static UserDevice create(long deviceId) {
		return getPersistence().create(deviceId);
	}

	/**
	* Removes the user device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deviceId the primary key of the user device
	* @return the user device that was removed
	* @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	*/
	public static UserDevice remove(long deviceId)
		throws ru.dokstrudio.med.srv.exception.NoSuchUserDeviceException {
		return getPersistence().remove(deviceId);
	}

	public static UserDevice updateImpl(UserDevice userDevice) {
		return getPersistence().updateImpl(userDevice);
	}

	/**
	* Returns the user device with the primary key or throws a {@link NoSuchUserDeviceException} if it could not be found.
	*
	* @param deviceId the primary key of the user device
	* @return the user device
	* @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	*/
	public static UserDevice findByPrimaryKey(long deviceId)
		throws ru.dokstrudio.med.srv.exception.NoSuchUserDeviceException {
		return getPersistence().findByPrimaryKey(deviceId);
	}

	/**
	* Returns the user device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param deviceId the primary key of the user device
	* @return the user device, or <code>null</code> if a user device with the primary key could not be found
	*/
	public static UserDevice fetchByPrimaryKey(long deviceId) {
		return getPersistence().fetchByPrimaryKey(deviceId);
	}

	public static java.util.Map<java.io.Serializable, UserDevice> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the user devices.
	*
	* @return the user devices
	*/
	public static List<UserDevice> findAll() {
		return getPersistence().findAll();
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
	public static List<UserDevice> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<UserDevice> findAll(int start, int end,
		OrderByComparator<UserDevice> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<UserDevice> findAll(int start, int end,
		OrderByComparator<UserDevice> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the user devices from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user devices.
	*
	* @return the number of user devices
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UserDevicePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UserDevicePersistence, UserDevicePersistence> _serviceTracker =
		ServiceTrackerFactory.open(UserDevicePersistence.class);
}