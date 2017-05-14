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
 * Provides a wrapper for {@link TestUnitAnswerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitAnswerLocalService
 * @generated
 */
@ProviderType
public class TestUnitAnswerLocalServiceWrapper
	implements TestUnitAnswerLocalService,
		ServiceWrapper<TestUnitAnswerLocalService> {
	public TestUnitAnswerLocalServiceWrapper(
		TestUnitAnswerLocalService testUnitAnswerLocalService) {
		_testUnitAnswerLocalService = testUnitAnswerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _testUnitAnswerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testUnitAnswerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _testUnitAnswerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAnswerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAnswerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of test unit answers.
	*
	* @return the number of test unit answers
	*/
	@Override
	public int getTestUnitAnswersCount() {
		return _testUnitAnswerLocalService.getTestUnitAnswersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _testUnitAnswerLocalService.getOSGiServiceIdentifier();
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
		return _testUnitAnswerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testUnitAnswerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testUnitAnswerLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the test unit answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit answers
	* @param end the upper bound of the range of test unit answers (not inclusive)
	* @return the range of test unit answers
	*/
	@Override
	public java.util.List<ru.dokstrudio.med.srv.model.TestUnitAnswer> getTestUnitAnswers(
		int start, int end) {
		return _testUnitAnswerLocalService.getTestUnitAnswers(start, end);
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
		return _testUnitAnswerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _testUnitAnswerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the test unit answer to the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAnswer the test unit answer
	* @return the test unit answer that was added
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer addTestUnitAnswer(
		ru.dokstrudio.med.srv.model.TestUnitAnswer testUnitAnswer) {
		return _testUnitAnswerLocalService.addTestUnitAnswer(testUnitAnswer);
	}

	/**
	* Creates a new test unit answer with the primary key. Does not add the test unit answer to the database.
	*
	* @param testUnitAnswerId the primary key for the new test unit answer
	* @return the new test unit answer
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer createTestUnitAnswer(
		long testUnitAnswerId) {
		return _testUnitAnswerLocalService.createTestUnitAnswer(testUnitAnswerId);
	}

	/**
	* Deletes the test unit answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer that was removed
	* @throws PortalException if a test unit answer with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer deleteTestUnitAnswer(
		long testUnitAnswerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAnswerLocalService.deleteTestUnitAnswer(testUnitAnswerId);
	}

	/**
	* Deletes the test unit answer from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitAnswer the test unit answer
	* @return the test unit answer that was removed
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer deleteTestUnitAnswer(
		ru.dokstrudio.med.srv.model.TestUnitAnswer testUnitAnswer) {
		return _testUnitAnswerLocalService.deleteTestUnitAnswer(testUnitAnswer);
	}

	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer fetchTestUnitAnswer(
		long testUnitAnswerId) {
		return _testUnitAnswerLocalService.fetchTestUnitAnswer(testUnitAnswerId);
	}

	/**
	* Returns the test unit answer with the primary key.
	*
	* @param testUnitAnswerId the primary key of the test unit answer
	* @return the test unit answer
	* @throws PortalException if a test unit answer with the primary key could not be found
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer getTestUnitAnswer(
		long testUnitAnswerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testUnitAnswerLocalService.getTestUnitAnswer(testUnitAnswerId);
	}

	/**
	* Updates the test unit answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testUnitAnswer the test unit answer
	* @return the test unit answer that was updated
	*/
	@Override
	public ru.dokstrudio.med.srv.model.TestUnitAnswer updateTestUnitAnswer(
		ru.dokstrudio.med.srv.model.TestUnitAnswer testUnitAnswer) {
		return _testUnitAnswerLocalService.updateTestUnitAnswer(testUnitAnswer);
	}

	@Override
	public TestUnitAnswerLocalService getWrappedService() {
		return _testUnitAnswerLocalService;
	}

	@Override
	public void setWrappedService(
		TestUnitAnswerLocalService testUnitAnswerLocalService) {
		_testUnitAnswerLocalService = testUnitAnswerLocalService;
	}

	private TestUnitAnswerLocalService _testUnitAnswerLocalService;
}