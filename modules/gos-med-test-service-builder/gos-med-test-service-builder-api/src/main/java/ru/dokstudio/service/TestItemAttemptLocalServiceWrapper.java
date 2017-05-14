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

package ru.dokstudio.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TestItemAttemptLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAttemptLocalService
 * @generated
 */
@ProviderType
public class TestItemAttemptLocalServiceWrapper
	implements TestItemAttemptLocalService,
		ServiceWrapper<TestItemAttemptLocalService> {
	public TestItemAttemptLocalServiceWrapper(
		TestItemAttemptLocalService testItemAttemptLocalService) {
		_testItemAttemptLocalService = testItemAttemptLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _testItemAttemptLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testItemAttemptLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _testItemAttemptLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAttemptLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAttemptLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of test item attempts.
	*
	* @return the number of test item attempts
	*/
	@Override
	public int getTestItemAttemptsCount() {
		return _testItemAttemptLocalService.getTestItemAttemptsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _testItemAttemptLocalService.getOSGiServiceIdentifier();
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
		return _testItemAttemptLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testItemAttemptLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testItemAttemptLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the test item attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item attempts
	* @param end the upper bound of the range of test item attempts (not inclusive)
	* @return the range of test item attempts
	*/
	@Override
	public java.util.List<ru.dokstudio.model.TestItemAttempt> getTestItemAttempts(
		int start, int end) {
		return _testItemAttemptLocalService.getTestItemAttempts(start, end);
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
		return _testItemAttemptLocalService.dynamicQueryCount(dynamicQuery);
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
		return _testItemAttemptLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the test item attempt to the database. Also notifies the appropriate model listeners.
	*
	* @param testItemAttempt the test item attempt
	* @return the test item attempt that was added
	*/
	@Override
	public ru.dokstudio.model.TestItemAttempt addTestItemAttempt(
		ru.dokstudio.model.TestItemAttempt testItemAttempt) {
		return _testItemAttemptLocalService.addTestItemAttempt(testItemAttempt);
	}

	/**
	* Creates a new test item attempt with the primary key. Does not add the test item attempt to the database.
	*
	* @param attemptId the primary key for the new test item attempt
	* @return the new test item attempt
	*/
	@Override
	public ru.dokstudio.model.TestItemAttempt createTestItemAttempt(
		long attemptId) {
		return _testItemAttemptLocalService.createTestItemAttempt(attemptId);
	}

	/**
	* Deletes the test item attempt with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt that was removed
	* @throws PortalException if a test item attempt with the primary key could not be found
	*/
	@Override
	public ru.dokstudio.model.TestItemAttempt deleteTestItemAttempt(
		long attemptId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAttemptLocalService.deleteTestItemAttempt(attemptId);
	}

	/**
	* Deletes the test item attempt from the database. Also notifies the appropriate model listeners.
	*
	* @param testItemAttempt the test item attempt
	* @return the test item attempt that was removed
	*/
	@Override
	public ru.dokstudio.model.TestItemAttempt deleteTestItemAttempt(
		ru.dokstudio.model.TestItemAttempt testItemAttempt) {
		return _testItemAttemptLocalService.deleteTestItemAttempt(testItemAttempt);
	}

	@Override
	public ru.dokstudio.model.TestItemAttempt fetchTestItemAttempt(
		long attemptId) {
		return _testItemAttemptLocalService.fetchTestItemAttempt(attemptId);
	}

	/**
	* Returns the test item attempt with the primary key.
	*
	* @param attemptId the primary key of the test item attempt
	* @return the test item attempt
	* @throws PortalException if a test item attempt with the primary key could not be found
	*/
	@Override
	public ru.dokstudio.model.TestItemAttempt getTestItemAttempt(long attemptId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAttemptLocalService.getTestItemAttempt(attemptId);
	}

	/**
	* Updates the test item attempt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testItemAttempt the test item attempt
	* @return the test item attempt that was updated
	*/
	@Override
	public ru.dokstudio.model.TestItemAttempt updateTestItemAttempt(
		ru.dokstudio.model.TestItemAttempt testItemAttempt) {
		return _testItemAttemptLocalService.updateTestItemAttempt(testItemAttempt);
	}

	@Override
	public TestItemAttemptLocalService getWrappedService() {
		return _testItemAttemptLocalService;
	}

	@Override
	public void setWrappedService(
		TestItemAttemptLocalService testItemAttemptLocalService) {
		_testItemAttemptLocalService = testItemAttemptLocalService;
	}

	private TestItemAttemptLocalService _testItemAttemptLocalService;
}