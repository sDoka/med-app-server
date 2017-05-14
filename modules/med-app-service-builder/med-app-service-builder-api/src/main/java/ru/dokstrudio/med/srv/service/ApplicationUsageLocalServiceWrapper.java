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

package ru.dokstrudio.med.srv.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApplicationUsageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationUsageLocalService
 * @generated
 */
@ProviderType
public class ApplicationUsageLocalServiceWrapper
	implements ApplicationUsageLocalService,
		ServiceWrapper<ApplicationUsageLocalService> {
	public ApplicationUsageLocalServiceWrapper(
		ApplicationUsageLocalService applicationUsageLocalService) {
		_applicationUsageLocalService = applicationUsageLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _applicationUsageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _applicationUsageLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _applicationUsageLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationUsageLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationUsageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of application usages.
	*
	* @return the number of application usages
	*/
	@Override
	public int getApplicationUsagesCount() {
		return _applicationUsageLocalService.getApplicationUsagesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _applicationUsageLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _applicationUsageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _applicationUsageLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _applicationUsageLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the application usages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of application usages
	* @param end the upper bound of the range of application usages (not inclusive)
	* @return the range of application usages
	*/
	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.ApplicationUsage> getApplicationUsages(
		int start, int end) {
		return _applicationUsageLocalService.getApplicationUsages(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _applicationUsageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _applicationUsageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the application usage to the database. Also notifies the appropriate model listeners.
	*
	* @param applicationUsage the application usage
	* @return the application usage that was added
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage addApplicationUsage(
		ru.dokstrudio.med.srv.model.ApplicationUsage applicationUsage) {
		return _applicationUsageLocalService.addApplicationUsage(applicationUsage);
	}

	/**
	* Creates a new application usage with the primary key. Does not add the application usage to the database.
	*
	* @param applicationUserId the primary key for the new application usage
	* @return the new application usage
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage createApplicationUsage(
		long applicationUserId) {
		return _applicationUsageLocalService.createApplicationUsage(applicationUserId);
	}

	/**
	* Deletes the application usage with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage that was removed
	* @throws PortalException if a application usage with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage deleteApplicationUsage(
		long applicationUserId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationUsageLocalService.deleteApplicationUsage(applicationUserId);
	}

	/**
	* Deletes the application usage from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationUsage the application usage
	* @return the application usage that was removed
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage deleteApplicationUsage(
		ru.dokstrudio.med.srv.model.ApplicationUsage applicationUsage) {
		return _applicationUsageLocalService.deleteApplicationUsage(applicationUsage);
	}

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage fetchApplicationUsage(
		long applicationUserId) {
		return _applicationUsageLocalService.fetchApplicationUsage(applicationUserId);
	}

	/**
	* Returns the application usage with the primary key.
	*
	* @param applicationUserId the primary key of the application usage
	* @return the application usage
	* @throws PortalException if a application usage with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage getApplicationUsage(
		long applicationUserId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationUsageLocalService.getApplicationUsage(applicationUserId);
	}

	/**
	* Updates the application usage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param applicationUsage the application usage
	* @return the application usage that was updated
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage updateApplicationUsage(
		ru.dokstrudio.med.srv.model.ApplicationUsage applicationUsage) {
		return _applicationUsageLocalService.updateApplicationUsage(applicationUsage);
	}

	@Override
	public ApplicationUsageLocalService getWrappedService() {
		return _applicationUsageLocalService;
	}

	@Override
	public void setWrappedService(
		ApplicationUsageLocalService applicationUsageLocalService) {
		_applicationUsageLocalService = applicationUsageLocalService;
	}

	private ApplicationUsageLocalService _applicationUsageLocalService;
}