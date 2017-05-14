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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for TestUnitSpecialization. This utility wraps
 * {@link ru.dokstrudio.med.srv.service.impl.TestUnitSpecializationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitSpecializationLocalService
 * @see ru.dokstrudio.med.srv.service.base.TestUnitSpecializationLocalServiceBaseImpl
 * @see ru.dokstrudio.med.srv.service.impl.TestUnitSpecializationLocalServiceImpl
 * @generated
 */
@ProviderType
public class TestUnitSpecializationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ru.dokstrudio.med.srv.service.impl.TestUnitSpecializationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of test unit specializations.
	*
	* @return the number of test unit specializations
	*/
	public static int getTestUnitSpecializationsCount() {
		return getService().getTestUnitSpecializationsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the test unit specializations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit specializations
	* @param end the upper bound of the range of test unit specializations (not inclusive)
	* @return the range of test unit specializations
	*/
	public static java.util.List<ru.dokstrudio.med.srv.model.TestUnitSpecialization> getTestUnitSpecializations(
		int start, int end) {
		return getService().getTestUnitSpecializations(start, end);
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
	* Adds the test unit specialization to the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitSpecialization the test unit specialization
	* @return the test unit specialization that was added
	*/
	public static ru.dokstrudio.med.srv.model.TestUnitSpecialization addTestUnitSpecialization(
		ru.dokstrudio.med.srv.model.TestUnitSpecialization testUnitSpecialization) {
		return getService().addTestUnitSpecialization(testUnitSpecialization);
	}

	/**
	* Creates a new test unit specialization with the primary key. Does not add the test unit specialization to the database.
	*
	* @param specializationId the primary key for the new test unit specialization
	* @return the new test unit specialization
	*/
	public static ru.dokstrudio.med.srv.model.TestUnitSpecialization createTestUnitSpecialization(
		long specializationId) {
		return getService().createTestUnitSpecialization(specializationId);
	}

	/**
	* Deletes the test unit specialization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization that was removed
	* @throws PortalException if a test unit specialization with the primary key could not be found
	*/
	public static ru.dokstrudio.med.srv.model.TestUnitSpecialization deleteTestUnitSpecialization(
		long specializationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTestUnitSpecialization(specializationId);
	}

	/**
	* Deletes the test unit specialization from the database. Also notifies the appropriate model listeners.
	*
	* @param testUnitSpecialization the test unit specialization
	* @return the test unit specialization that was removed
	*/
	public static ru.dokstrudio.med.srv.model.TestUnitSpecialization deleteTestUnitSpecialization(
		ru.dokstrudio.med.srv.model.TestUnitSpecialization testUnitSpecialization) {
		return getService().deleteTestUnitSpecialization(testUnitSpecialization);
	}

	public static ru.dokstrudio.med.srv.model.TestUnitSpecialization fetchTestUnitSpecialization(
		long specializationId) {
		return getService().fetchTestUnitSpecialization(specializationId);
	}

	/**
	* Returns the test unit specialization with the primary key.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization
	* @throws PortalException if a test unit specialization with the primary key could not be found
	*/
	public static ru.dokstrudio.med.srv.model.TestUnitSpecialization getTestUnitSpecialization(
		long specializationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTestUnitSpecialization(specializationId);
	}

	/**
	* Updates the test unit specialization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testUnitSpecialization the test unit specialization
	* @return the test unit specialization that was updated
	*/
	public static ru.dokstrudio.med.srv.model.TestUnitSpecialization updateTestUnitSpecialization(
		ru.dokstrudio.med.srv.model.TestUnitSpecialization testUnitSpecialization) {
		return getService().updateTestUnitSpecialization(testUnitSpecialization);
	}

	public static TestUnitSpecializationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestUnitSpecializationLocalService, TestUnitSpecializationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TestUnitSpecializationLocalService.class);
}