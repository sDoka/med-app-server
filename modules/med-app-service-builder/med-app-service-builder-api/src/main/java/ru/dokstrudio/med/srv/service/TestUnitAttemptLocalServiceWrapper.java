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
 * Provides a wrapper for {@link TestUnitAttemptLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAttemptLocalService
 * @generated
 */
@ProviderType
public class TestUnitAttemptLocalServiceWrapper
	implements TestUnitAttemptLocalService,
		ServiceWrapper<TestUnitAttemptLocalService> {
	public TestUnitAttemptLocalServiceWrapper(
		TestUnitAttemptLocalService testUnitAttemptLocalService) {
		_testUnitAttemptLocalService = testUnitAttemptLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _testUnitAttemptLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testUnitAttemptLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _testUnitAttemptLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAttemptLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAttemptLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of test unit attempts.
	*
	* @return the number of test unit attempts
	*/
	@Override
	public int getTestUnitAttemptsCount() {
		return _testUnitAttemptLocalService.getTestUnitAttemptsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _testUnitAttemptLocalService.getOSGiServiceIdentifier();
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
		return _testUnitAttemptLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testUnitAttemptLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testUnitAttemptLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the test unit attempts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitAttemptModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit attempts
	* @param end the upper bound of the range of test unit attempts (not inclusive)
	* @return the range of test unit attempts
	*/
	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.TestUnitAttempt> getTestUnitAttempts(
		int start, int end) {
		return _testUnitAttemptLocalService.getTestUnitAttempts(start, end);
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
		return _testUnitAttemptLocalService.dynamicQueryCount(dynamicQuery);
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
		return _testUnitAttemptLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the test unit attempt to the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAttempt the test unit attempt
	* @return the test unit attempt that was added
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt addTestUnitAttempt(
		ru.dokstrudio.med.srv.model.TestUnitAttempt testUnitAttempt) {
		return _testUnitAttemptLocalService.addTestUnitAttempt(testUnitAttempt);
	}

	/**
	* Creates a new test unit attempt with the primary key. Does not add the test unit attempt to the database.
	*
	* @param testUnitAttemptId the primary key for the new test unit attempt
	* @return the new test unit attempt
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt createTestUnitAttempt(
		long testUnitAttemptId) {
		return _testUnitAttemptLocalService.createTestUnitAttempt(testUnitAttemptId);
	}

	/**
	* Deletes the test unit attempt with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt that was removed
	* @throws PortalException if a test unit attempt with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt deleteTestUnitAttempt(
		long testUnitAttemptId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAttemptLocalService.deleteTestUnitAttempt(testUnitAttemptId);
	}

	/**
	* Deletes the test unit attempt from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAttempt the test unit attempt
	* @return the test unit attempt that was removed
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt deleteTestUnitAttempt(
		ru.dokstrudio.med.srv.model.TestUnitAttempt testUnitAttempt) {
		return _testUnitAttemptLocalService.deleteTestUnitAttempt(testUnitAttempt);
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt fetchTestUnitAttempt(
		long testUnitAttemptId) {
		return _testUnitAttemptLocalService.fetchTestUnitAttempt(testUnitAttemptId);
	}

	/**
	* Returns the test unit attempt with the primary key.
	*
	* @param testUnitAttemptId the primary key of the test unit attempt
	* @return the test unit attempt
	* @throws PortalException if a test unit attempt with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt getTestUnitAttempt(
		long testUnitAttemptId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAttemptLocalService.getTestUnitAttempt(testUnitAttemptId);
	}

	/**
	* Updates the test unit attempt in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testUnitAttempt the test unit attempt
	* @return the test unit attempt that was updated
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAttempt updateTestUnitAttempt(
		ru.dokstrudio.med.srv.model.TestUnitAttempt testUnitAttempt) {
		return _testUnitAttemptLocalService.updateTestUnitAttempt(testUnitAttempt);
	}

	@Override
	public TestUnitAttemptLocalService getWrappedService() {
		return _testUnitAttemptLocalService;
	}

	@Override
	public void setWrappedService(
		TestUnitAttemptLocalService testUnitAttemptLocalService) {
		_testUnitAttemptLocalService = testUnitAttemptLocalService;
	}

	private TestUnitAttemptLocalService _testUnitAttemptLocalService;
}