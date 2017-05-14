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

import ru.dokstrudio.med.srv.exception.NoSuchApplicationUsageException;
import ru.dokstrudio.med.srv.model.ApplicationUsage;

/**
 * The persistence interface for the application usage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.persistence.impl.ApplicationUsagePersistenceImpl
 * @see ApplicationUsageUtil
 * @generated
 */
@ProviderType
public interface ApplicationUsagePersistence extends BasePersistence<ApplicationUsage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplicationUsageUtil} to access the application usage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the application usages where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the matching application usages
	*/
	public java.util.List<ApplicationUsage> findByDeviceId(long deviceId);

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
	public java.util.List<ApplicationUsage> findByDeviceId(long deviceId,
		int start, int end);

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
	public java.util.List<ApplicationUsage> findByDeviceId(long deviceId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator);

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
	public java.util.List<ApplicationUsage> findByDeviceId(long deviceId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application usage
	* @throws NoSuchApplicationUsageException if a matching application usage could not be found
	*/
	public ApplicationUsage findByDeviceId_First(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator)
		throws NoSuchApplicationUsageException;

	/**
	* Returns the first application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching application usage, or <code>null</code> if a matching application usage could not be found
	*/
	public ApplicationUsage fetchByDeviceId_First(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator);

	/**
	* Returns the last application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application usage
	* @throws NoSuchApplicationUsageException if a matching application usage could not be found
	*/
	public ApplicationUsage findByDeviceId_Last(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator)
		throws NoSuchApplicationUsageException;

	/**
	* Returns the last application usage in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching application usage, or <code>null</code> if a matching application usage could not be found
	*/
	public ApplicationUsage fetchByDeviceId_Last(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator);

	/**
	* Returns the application usages before and after the current application usage in the ordered set where deviceId = &#63;.
	*
	* @param applicationUserId the primary key of the current application usage
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next application usage
	* @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	*/
	public ApplicationUsage[] findByDeviceId_PrevAndNext(
		long applicationUserId, long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator)
		throws NoSuchApplicationUsageException;

	/**
	* Removes all the application usages where deviceId = &#63; from the database.
	*
	* @param deviceId the device ID
	*/
	public void removeByDeviceId(long deviceId);

	/**
	* Returns the number of application usages where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the number of matching application usages
	*/
	public int countByDeviceId(long deviceId);

	/**
	* Caches the application usage in the entity cache if it is enabled.
	*
	* @param applicationUsage the application usage
	*/
	public void cacheResult(ApplicationUsage applicationUsage);

	/**
	* Caches the application usages in the entity cache if it is enabled.
	*
	* @param applicationUsages the application usages
	*/
	public void cacheResult(java.util.List<ApplicationUsage> applicationUsages);

	/**
	* Creates a new application usage with the primary key. Does not add the application usage to the database.
	*
	* @param applicationUserId the primary key for the new application usage
	* @return the new application usage
	*/
	public ApplicationUsage create(long applicationUserId);

	/**
	* Removes the application usage with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage that was removed
	* @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	*/
	public ApplicationUsage remove(long applicationUserId)
		throws NoSuchApplicationUsageException;

	public ApplicationUsage updateImpl(ApplicationUsage applicationUsage);

	/**
	* Returns the application usage with the primary key or throws a {@link NoSuchApplicationUsageException} if it could not be found.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage
	* @throws NoSuchApplicationUsageException if a application usage with the primary key could not be found
	*/
	public ApplicationUsage findByPrimaryKey(long applicationUserId)
		throws NoSuchApplicationUsageException;

	/**
	* Returns the application usage with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage, or <code>null</code> if a application usage with the primary key could not be found
	*/
	public ApplicationUsage fetchByPrimaryKey(long applicationUserId);

	@Override
	public java.util.Map<java.io.Serializable, ApplicationUsage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the application usages.
	*
	* @return the application usages
	*/
	public java.util.List<ApplicationUsage> findAll();

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
	public java.util.List<ApplicationUsage> findAll(int start, int end);

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
	public java.util.List<ApplicationUsage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator);

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
	public java.util.List<ApplicationUsage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ApplicationUsage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the application usages from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of application usages.
	*
	* @return the number of application usages
	*/
	public int countAll();
}