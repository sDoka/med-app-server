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
 * Provides a wrapper for {@link ApplicationAccountLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationAccountLocalService
 * @generated
 */
@ProviderType
public class ApplicationAccountLocalServiceWrapper
	implements ApplicationAccountLocalService,
		ServiceWrapper<ApplicationAccountLocalService> {
	public ApplicationAccountLocalServiceWrapper(
		ApplicationAccountLocalService applicationAccountLocalService) {
		_applicationAccountLocalService = applicationAccountLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _applicationAccountLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _applicationAccountLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _applicationAccountLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationAccountLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationAccountLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of application accounts.
	*
	* @return the number of application accounts
	*/
	@Override
	public int getApplicationAccountsCount() {
		return _applicationAccountLocalService.getApplicationAccountsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _applicationAccountLocalService.getOSGiServiceIdentifier();
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
		return _applicationAccountLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _applicationAccountLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _applicationAccountLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the application accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of application accounts
	* @param end the upper bound of the range of application accounts (not inclusive)
	* @return the range of application accounts
	*/
	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.ApplicationAccount> getApplicationAccounts(
		int start, int end) {
		return _applicationAccountLocalService.getApplicationAccounts(start, end);
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
		return _applicationAccountLocalService.dynamicQueryCount(dynamicQuery);
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
		return _applicationAccountLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the application account to the database. Also notifies the appropriate model listeners.
	*
	* @param applicationAccount the application account
	* @return the application account that was added
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount addApplicationAccount(
		ru.dokstrudio.med.srv.model.ApplicationAccount applicationAccount) {
		return _applicationAccountLocalService.addApplicationAccount(applicationAccount);
	}

	/**
	* Creates a new application account with the primary key. Does not add the application account to the database.
	*
	* @param accountTypeId the primary key for the new application account
	* @return the new application account
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount createApplicationAccount(
		long accountTypeId) {
		return _applicationAccountLocalService.createApplicationAccount(accountTypeId);
	}

	/**
	* Deletes the application account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account that was removed
	* @throws PortalException if a application account with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount deleteApplicationAccount(
		long accountTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationAccountLocalService.deleteApplicationAccount(accountTypeId);
	}

	/**
	* Deletes the application account from the database. Also notifies the appropriate model listeners.
	*
	* @param applicationAccount the application account
	* @return the application account that was removed
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount deleteApplicationAccount(
		ru.dokstrudio.med.srv.model.ApplicationAccount applicationAccount) {
		return _applicationAccountLocalService.deleteApplicationAccount(applicationAccount);
	}

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount fetchApplicationAccount(
		long accountTypeId) {
		return _applicationAccountLocalService.fetchApplicationAccount(accountTypeId);
	}

	/**
	* Returns the application account with the primary key.
	*
	* @param accountTypeId the primary key of the application account
	* @return the application account
	* @throws PortalException if a application account with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount getApplicationAccount(
		long accountTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _applicationAccountLocalService.getApplicationAccount(accountTypeId);
	}

	/**
	* Updates the application account in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param applicationAccount the application account
	* @return the application account that was updated
	*/
	@Override
	public ru.dokstrudio.med.srv.model.ApplicationAccount updateApplicationAccount(
		ru.dokstrudio.med.srv.model.ApplicationAccount applicationAccount) {
		return _applicationAccountLocalService.updateApplicationAccount(applicationAccount);
	}

	@Override
	public ApplicationAccountLocalService getWrappedService() {
		return _applicationAccountLocalService;
	}

	@Override
	public void setWrappedService(
		ApplicationAccountLocalService applicationAccountLocalService) {
		_applicationAccountLocalService = applicationAccountLocalService;
	}

	private ApplicationAccountLocalService _applicationAccountLocalService;
}