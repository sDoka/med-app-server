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
 * Provides a wrapper for {@link TestUnitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitLocalService
 * @generated
 */
@ProviderType
public class TestUnitLocalServiceWrapper implements TestUnitLocalService,
	ServiceWrapper<TestUnitLocalService> {
	public TestUnitLocalServiceWrapper(
		TestUnitLocalService testUnitLocalService) {
		_testUnitLocalService = testUnitLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _testUnitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testUnitLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _testUnitLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of test units.
	*
	* @return the number of test units
	*/
	@Override
	public int getTestUnitsCount() {
		return _testUnitLocalService.getTestUnitsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _testUnitLocalService.getOSGiServiceIdentifier();
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
		return _testUnitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testUnitLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testUnitLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.TestUnit> findTestUnitByIsActualAndModifiedDateAndSpecializationId(
		boolean isActual, java.util.Date modifiedDate, long specializationId) {
		return _testUnitLocalService.findTestUnitByIsActualAndModifiedDateAndSpecializationId(isActual,
			modifiedDate, specializationId);
	}

	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.TestUnit> findTestUnitBySpecializationId(
		long specializationId) {
		return _testUnitLocalService.findTestUnitBySpecializationId(specializationId);
	}

	/**
	* Returns a range of all the test units.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test units
	* @param end the upper bound of the range of test units (not inclusive)
	* @return the range of test units
	*/
	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.TestUnit> getTestUnits(
		int start, int end) {
		return _testUnitLocalService.getTestUnits(start, end);
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
		return _testUnitLocalService.dynamicQueryCount(dynamicQuery);
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
		return _testUnitLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the test unit to the database. Also notifies the appropriate model listeners.
	*
	* @param testUnit the test unit
	* @return the test unit that was added
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnit addTestUnit(
		ru.dokstrudio.med.srv.model.TestUnit testUnit) {
		return _testUnitLocalService.addTestUnit(testUnit);
	}

	/**
	* Creates a new test unit with the primary key. Does not add the test unit to the database.
	*
	* @param testUnitId the primary key for the new test unit
	* @return the new test unit
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnit createTestUnit(long testUnitId) {
		return _testUnitLocalService.createTestUnit(testUnitId);
	}

	/**
	* Deletes the test unit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit that was removed
	* @throws PortalException if a test unit with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnit deleteTestUnit(long testUnitId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitLocalService.deleteTestUnit(testUnitId);
	}

	/**
	* Deletes the test unit from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnit the test unit
	* @return the test unit that was removed
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnit deleteTestUnit(
		ru.dokstrudio.med.srv.model.TestUnit testUnit) {
		return _testUnitLocalService.deleteTestUnit(testUnit);
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnit fetchTestUnit(long testUnitId) {
		return _testUnitLocalService.fetchTestUnit(testUnitId);
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnit findTestUnitByNumberAndSpecializationId(
		long number, long specializationId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitException {
		return _testUnitLocalService.findTestUnitByNumberAndSpecializationId(number,
			specializationId);
	}

	/**
	* Returns the test unit with the primary key.
	*
	* @param testUnitId the primary key of the test unit
	* @return the test unit
	* @throws PortalException if a test unit with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnit getTestUnit(long testUnitId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitLocalService.getTestUnit(testUnitId);
	}

	/**
	* Updates the test unit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testUnit the test unit
	* @return the test unit that was updated
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnit updateTestUnit(
		ru.dokstrudio.med.srv.model.TestUnit testUnit) {
		return _testUnitLocalService.updateTestUnit(testUnit);
	}

	@Override
	public TestUnitLocalService getWrappedService() {
		return _testUnitLocalService;
	}

	@Override
	public void setWrappedService(TestUnitLocalService testUnitLocalService) {
		_testUnitLocalService = testUnitLocalService;
	}

	private TestUnitLocalService _testUnitLocalService;
}