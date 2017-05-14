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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for TestItemQuestion. This utility wraps
 * {@link ru.dokstudio.service.impl.TestItemQuestionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TestItemQuestionLocalService
 * @see ru.dokstudio.service.base.TestItemQuestionLocalServiceBaseImpl
 * @see ru.dokstudio.service.impl.TestItemQuestionLocalServiceImpl
 * @generated
 */
@ProviderType
public class TestItemQuestionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ru.dokstudio.service.impl.TestItemQuestionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of test item questions.
	*
	* @return the number of test item questions
	*/
	public static int getTestItemQuestionsCount() {
		return getService().getTestItemQuestionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the test item questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstudio.model.impl.TestItemQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test item questions
	* @param end the upper bound of the range of test item questions (not inclusive)
	* @return the range of test item questions
	*/
	public static java.util.List<ru.dokstudio.model.TestItemQuestion> getTestItemQuestions(
		int start, int end) {
		return getService().getTestItemQuestions(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the test item question to the database. Also notifies the appropriate model listeners.
	*
	* @param testItemQuestion the test item question
	* @return the test item question that was added
	*/
	public static ru.dokstudio.model.TestItemQuestion addTestItemQuestion(
		ru.dokstudio.model.TestItemQuestion testItemQuestion) {
		return getService().addTestItemQuestion(testItemQuestion);
	}

	/**
	* Creates a new test item question with the primary key. Does not add the test item question to the database.
	*
	* @param questionId the primary key for the new test item question
	* @return the new test item question
	*/
	public static ru.dokstudio.model.TestItemQuestion createTestItemQuestion(
		long questionId) {
		return getService().createTestItemQuestion(questionId);
	}

	/**
	* Deletes the test item question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question that was removed
	* @throws PortalException if a test item question with the primary key could not be found
	*/
	public static ru.dokstudio.model.TestItemQuestion deleteTestItemQuestion(
		long questionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTestItemQuestion(questionId);
	}

	/**
	* Deletes the test item question from the database. Also notifies the appropriate model listeners.
	*
	* @param testItemQuestion the test item question
	* @return the test item question that was removed
	*/
	public static ru.dokstudio.model.TestItemQuestion deleteTestItemQuestion(
		ru.dokstudio.model.TestItemQuestion testItemQuestion) {
		return getService().deleteTestItemQuestion(testItemQuestion);
	}

	public static ru.dokstudio.model.TestItemQuestion fetchTestItemQuestion(
		long questionId) {
		return getService().fetchTestItemQuestion(questionId);
	}

	/**
	* Note: may return {@code null} if no question exists with such number
	*
	* @param questionNumber
	* @return
	* @throws SystemException
	*/
	public static ru.dokstudio.model.TestItemQuestion getQuestionByQuestionNumber(
		long questionNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestionByQuestionNumber(questionNumber);
	}

	/**
	* Returns the test item question with the primary key.
	*
	* @param questionId the primary key of the test item question
	* @return the test item question
	* @throws PortalException if a test item question with the primary key could not be found
	*/
	public static ru.dokstudio.model.TestItemQuestion getTestItemQuestion(
		long questionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTestItemQuestion(questionId);
	}

	/**
	* Updates the test item question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testItemQuestion the test item question
	* @return the test item question that was updated
	*/
	public static ru.dokstudio.model.TestItemQuestion updateTestItemQuestion(
		ru.dokstudio.model.TestItemQuestion testItemQuestion) {
		return getService().updateTestItemQuestion(testItemQuestion);
	}

	public static TestItemQuestionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestItemQuestionLocalService, TestItemQuestionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TestItemQuestionLocalService.class);
}