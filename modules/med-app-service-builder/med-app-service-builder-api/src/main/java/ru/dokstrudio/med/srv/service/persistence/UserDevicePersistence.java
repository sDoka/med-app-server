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

import ru.dokstrudio.med.srv.exception.NoSuchUserDeviceException;
import ru.dokstrudio.med.srv.model.UserDevice;

/**
 * The persistence interface for the user device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.UserDevicePersistenceImpl
 * @see UserDeviceUtil
 * @generated
 */
@ProviderType
public interface UserDevicePersistence extends BasePersistence<UserDevice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserDeviceUtil} to access the user device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the user device in the entity cache if it is enabled.
	*
	* @param userDevice the user device
	*/
	public void cacheResult(UserDevice userDevice);

	/**
	* Caches the user devices in the entity cache if it is enabled.
	*
	* @param userDevices the user devices
	*/
	public void cacheResult(java.util.List<UserDevice> userDevices);

	/**
	* Creates a new user device with the primary key. Does not add the user device to the database.
	*
	* @param deviceId the primary key for the new user device
	* @return the new user device
	*/
	public UserDevice create(long deviceId);

	/**
	* Removes the user device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deviceId the primary key of the user device
	* @return the user device that was removed
	* @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	*/
	public UserDevice remove(long deviceId) throws NoSuchUserDeviceException;

	public UserDevice updateImpl(UserDevice userDevice);

	/**
	* Returns the user device with the primary key or throws a {@link NoSuchUserDeviceException} if it could not be found.
	*
	* @param deviceId the primary key of the user device
	* @return the user device
	* @throws NoSuchUserDeviceException if a user device with the primary key could not be found
	*/
	public UserDevice findByPrimaryKey(long deviceId)
		throws NoSuchUserDeviceException;

	/**
	* Returns the user device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param deviceId the primary key of the user device
	* @return the user device, or <code>null</code> if a user device with the primary key could not be found
	*/
	public UserDevice fetchByPrimaryKey(long deviceId);

	@Override
	public java.util.Map<java.io.Serializable, UserDevice> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the user devices.
	*
	* @return the user devices
	*/
	public java.util.List<UserDevice> findAll();

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
	public java.util.List<UserDevice> findAll(int start, int end);

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
	public java.util.List<UserDevice> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserDevice> orderByComparator);

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
	public java.util.List<UserDevice> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserDevice> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the user devices from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of user devices.
	*
	* @return the number of user devices
	*/
	public int countAll();
}