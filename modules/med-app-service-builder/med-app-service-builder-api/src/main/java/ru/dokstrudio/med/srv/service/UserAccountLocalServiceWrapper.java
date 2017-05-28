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
 * Provides a wrapper for {@link UserAccountLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserAccountLocalService
 * @generated
 */
@ProviderType
public class UserAccountLocalServiceWrapper implements UserAccountLocalService,
	ServiceWrapper<UserAccountLocalService> {
	public UserAccountLocalServiceWrapper(
		UserAccountLocalService userAccountLocalService) {
		_userAccountLocalService = userAccountLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _userAccountLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userAccountLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _userAccountLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _userAccountLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _userAccountLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of user accounts.
	*
	* @return the number of user accounts
	*/
	@Override
	public int getUserAccountsCount() {
		return _userAccountLocalService.getUserAccountsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _userAccountLocalService.getOSGiServiceIdentifier();
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
		return _userAccountLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userAccountLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _userAccountLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.UserAccount> findByUserId(
		long userId) {
		return _userAccountLocalService.findByUserId(userId);
	}

	/**
	* Returns a range of all the user accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.UserAccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user accounts
	* @param end the upper bound of the range of user accounts (not inclusive)
	* @return the range of user accounts
	*/
	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.UserAccount> getUserAccounts(
		int start, int end) {
		return _userAccountLocalService.getUserAccounts(start, end);
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
		return _userAccountLocalService.dynamicQueryCount(dynamicQuery);
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
		return _userAccountLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the user account to the database. Also notifies the appropriate model listeners.
	*
	* @param userAccount the user account
	* @return the user account that was added
	*/
	@Override
	public ru.dokstrudio.med.srv.model.UserAccount addUserAccount(
		ru.dokstrudio.med.srv.model.UserAccount userAccount) {
		return _userAccountLocalService.addUserAccount(userAccount);
	}

	@Override
	public ru.dokstrudio.med.srv.model.UserAccount createUserAccount(
		long userId, long accountTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _userAccountLocalService.createUserAccount(userId, accountTypeId);
	}

	/**
	* Creates a new user account with the primary key. Does not add the user account to the database.
	*
	* @param userAccountPK the primary key for the new user account
	* @return the new user account
	*/
	@Override
	public ru.dokstrudio.med.srv.model.UserAccount createUserAccount(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK) {
		return _userAccountLocalService.createUserAccount(userAccountPK);
	}

	/**
	* Deletes the user account from the database. Also notifies the appropriate model listeners.
	*
	* @param userAccount the user account
	* @return the user account that was removed
	*/
	@Override
	public ru.dokstrudio.med.srv.model.UserAccount deleteUserAccount(
		ru.dokstrudio.med.srv.model.UserAccount userAccount) {
		return _userAccountLocalService.deleteUserAccount(userAccount);
	}

	/**
	* Deletes the user account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account that was removed
	* @throws PortalException if a user account with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.UserAccount deleteUserAccount(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _userAccountLocalService.deleteUserAccount(userAccountPK);
	}

	@Override
	public ru.dokstrudio.med.srv.model.UserAccount fetchUserAccount(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK) {
		return _userAccountLocalService.fetchUserAccount(userAccountPK);
	}

	/**
	* Returns the user account with the primary key.
	*
	* @param userAccountPK the primary key of the user account
	* @return the user account
	* @throws PortalException if a user account with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.UserAccount getUserAccount(
		ru.dokstrudio.med.srv.service.persistence.UserAccountPK userAccountPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _userAccountLocalService.getUserAccount(userAccountPK);
	}

	/**
	* Updates the user account in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userAccount the user account
	* @return the user account that was updated
	*/
	@Override
	public ru.dokstrudio.med.srv.model.UserAccount updateUserAccount(
		ru.dokstrudio.med.srv.model.UserAccount userAccount) {
		return _userAccountLocalService.updateUserAccount(userAccount);
	}

	@Override
	public UserAccountLocalService getWrappedService() {
		return _userAccountLocalService;
	}

	@Override
	public void setWrappedService(
		UserAccountLocalService userAccountLocalService) {
		_userAccountLocalService = userAccountLocalService;
	}

	private UserAccountLocalService _userAccountLocalService;
}