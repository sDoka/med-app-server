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
 * Provides a wrapper for {@link TestItemAnswerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestItemAnswerLocalService
 * @generated
 */
@ProviderType
public class TestItemAnswerLocalServiceWrapper
	implements TestItemAnswerLocalService,
		ServiceWrapper<TestItemAnswerLocalService> {
	public TestItemAnswerLocalServiceWrapper(
		TestItemAnswerLocalService testItemAnswerLocalService) {
		_testItemAnswerLocalService = testItemAnswerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _testItemAnswerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testItemAnswerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _testItemAnswerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAnswerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAnswerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of test item answers.
	*
	* @return the number of test item answers
	*/
	@Override
	public int getTestItemAnswersCount() {
		return _testItemAnswerLocalService.getTestItemAnswersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _testItemAnswerLocalService.getOSGiServiceIdentifier();
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
		return _testItemAnswerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testItemAnswerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _testItemAnswerLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<ru.dokstudio.model.TestItemAnswer> getAnswersByQuestionId(
		long questionId) {
		return _testItemAnswerLocalService.getAnswersByQuestionId(questionId);
	}

	/**
	* Returns a range of all the test item answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item answers
	* @param end the upper bound of the range of test item answers (not inclusive)
	* @return the range of test item answers
	*/
	@Override
	public java.util.List<ru.dokstudio.model.TestItemAnswer> getTestItemAnswers(
		int start, int end) {
		return _testItemAnswerLocalService.getTestItemAnswers(start, end);
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
		return _testItemAnswerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _testItemAnswerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the test item answer to the database. Also notifies the appropriate model listeners.
	*
	* @param testItemAnswer the test item answer
	* @return the test item answer that was added
	*/
	@Override
	public ru.dokstudio.model.TestItemAnswer addTestItemAnswer(
		ru.dokstudio.model.TestItemAnswer testItemAnswer) {
		return _testItemAnswerLocalService.addTestItemAnswer(testItemAnswer);
	}

	/**
	* Creates a new test item answer with the primary key. Does not add the test item answer to the database.
	*
	* @param answerId the primary key for the new test item answer
	* @return the new test item answer
	*/
	@Override
	public ru.dokstudio.model.TestItemAnswer createTestItemAnswer(long answerId) {
		return _testItemAnswerLocalService.createTestItemAnswer(answerId);
	}

	/**
	* Deletes the test item answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer that was removed
	* @throws PortalException if a test item answer with the primary key could not be found
	*/
	@Override
	public ru.dokstudio.model.TestItemAnswer deleteTestItemAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAnswerLocalService.deleteTestItemAnswer(answerId);
	}

	/**
	* Deletes the test item answer from the database. Also notifies the appropriate model listeners.
	*
	* @param testItemAnswer the test item answer
	* @return the test item answer that was removed
	*/
	@Override
	public ru.dokstudio.model.TestItemAnswer deleteTestItemAnswer(
		ru.dokstudio.model.TestItemAnswer testItemAnswer) {
		return _testItemAnswerLocalService.deleteTestItemAnswer(testItemAnswer);
	}

	@Override
	public ru.dokstudio.model.TestItemAnswer fetchTestItemAnswer(long answerId) {
		return _testItemAnswerLocalService.fetchTestItemAnswer(answerId);
	}

	/**
	* Returns the test item answer with the primary key.
	*
	* @param answerId the primary key of the test item answer
	* @return the test item answer
	* @throws PortalException if a test item answer with the primary key could not be found
	*/
	@Override
	public ru.dokstudio.model.TestItemAnswer getTestItemAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _testItemAnswerLocalService.getTestItemAnswer(answerId);
	}

	/**
	* Updates the test item answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testItemAnswer the test item answer
	* @return the test item answer that was updated
	*/
	@Override
	public ru.dokstudio.model.TestItemAnswer updateTestItemAnswer(
		ru.dokstudio.model.TestItemAnswer testItemAnswer) {
		return _testItemAnswerLocalService.updateTestItemAnswer(testItemAnswer);
	}

	@Override
	public TestItemAnswerLocalService getWrappedService() {
		return _testItemAnswerLocalService;
	}

	@Override
	public void setWrappedService(
		TestItemAnswerLocalService testItemAnswerLocalService) {
		_testItemAnswerLocalService = testItemAnswerLocalService;
	}

	private TestItemAnswerLocalService _testItemAnswerLocalService;
}