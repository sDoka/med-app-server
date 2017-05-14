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

package ru.dokstrudio.med.srv.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import ru.dokstrudio.med.srv.model.TestUnitSpecialization;

import java.util.List;

/**
 * The persistence utility for the test unit specialization service. This utility wraps {@link ru.dokstrudio.med.srv.service.persistence.impl.TestUnitSpecializationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitSpecializationPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.impl.TestUnitSpecializationPersistenceImpl
 * @generated
 */
@ProviderType
public class TestUnitSpecializationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(TestUnitSpecialization testUnitSpecialization) {
		getPersistence().clearCache(testUnitSpecialization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TestUnitSpecialization> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestUnitSpecialization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestUnitSpecialization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestUnitSpecialization> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestUnitSpecialization update(
		TestUnitSpecialization testUnitSpecialization) {
		return getPersistence().update(testUnitSpecialization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestUnitSpecialization update(
		TestUnitSpecialization testUnitSpecialization,
		ServiceContext serviceContext) {
		return getPersistence().update(testUnitSpecialization, serviceContext);
	}

	/**
	* Caches the test unit specialization in the entity cache if it is enabled.
	*
	* @param testUnitSpecialization the test unit specialization
	*/
	public static void cacheResult(
		TestUnitSpecialization testUnitSpecialization) {
		getPersistence().cacheResult(testUnitSpecialization);
	}

	/**
	* Caches the test unit specializations in the entity cache if it is enabled.
	*
	* @param testUnitSpecializations the test unit specializations
	*/
	public static void cacheResult(
		List<TestUnitSpecialization> testUnitSpecializations) {
		getPersistence().cacheResult(testUnitSpecializations);
	}

	/**
	* Creates a new test unit specialization with the primary key. Does not add the test unit specialization to the database.
	*
	* @param specializationId the primary key for the new test unit specialization
	* @return the new test unit specialization
	*/
	public static TestUnitSpecialization create(long specializationId) {
		return getPersistence().create(specializationId);
	}

	/**
	* Removes the test unit specialization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization that was removed
	* @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	*/
	public static TestUnitSpecialization remove(long specializationId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitSpecializationException {
		return getPersistence().remove(specializationId);
	}

	public static TestUnitSpecialization updateImpl(
		TestUnitSpecialization testUnitSpecialization) {
		return getPersistence().updateImpl(testUnitSpecialization);
	}

	/**
	* Returns the test unit specialization with the primary key or throws a {@link NoSuchTestUnitSpecializationException} if it could not be found.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization
	* @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	*/
	public static TestUnitSpecialization findByPrimaryKey(long specializationId)
		throws ru.dokstrudio.med.srv.exception.NoSuchTestUnitSpecializationException {
		return getPersistence().findByPrimaryKey(specializationId);
	}

	/**
	* Returns the test unit specialization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param specializationId the primary key of the test unit specialization
	* @return the test unit specialization, or <code>null</code> if a test unit specialization with the primary key could not be found
	*/
	public static TestUnitSpecialization fetchByPrimaryKey(
		long specializationId) {
		return getPersistence().fetchByPrimaryKey(specializationId);
	}

	public static java.util.Map<java.io.Serializable, TestUnitSpecialization> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test unit specializations.
	*
	* @return the test unit specializations
	*/
	public static List<TestUnitSpecialization> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test unit specializations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit specializations
	* @param end the upper bound of the range of test unit specializations (not inclusive)
	* @return the range of test unit specializations
	*/
	public static List<TestUnitSpecialization> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test unit specializations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit specializations
	* @param end the upper bound of the range of test unit specializations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test unit specializations
	*/
	public static List<TestUnitSpecialization> findAll(int start, int end,
		OrderByComparator<TestUnitSpecialization> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test unit specializations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestUnitSpecializationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test unit specializations
	* @param end the upper bound of the range of test unit specializations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test unit specializations
	*/
	public static List<TestUnitSpecialization> findAll(int start, int end,
		OrderByComparator<TestUnitSpecialization> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test unit specializations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test unit specializations.
	*
	* @return the number of test unit specializations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TestUnitSpecializationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestUnitSpecializationPersistence, TestUnitSpecializationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestUnitSpecializationPersistence.class);
}