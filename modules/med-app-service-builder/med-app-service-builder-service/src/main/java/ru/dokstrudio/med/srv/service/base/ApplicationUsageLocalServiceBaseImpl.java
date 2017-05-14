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

package ru.dokstrudio.med.srv.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstrudio.med.srv.model.ApplicationUsage;
import ru.dokstrudio.med.srv.service.ApplicationUsageLocalService;
import ru.dokstrudio.med.srv.service.persistence.ApplicationAccountPersistence;
import ru.dokstrudio.med.srv.service.persistence.ApplicationUsagePersistence;
import ru.dokstrudio.med.srv.service.persistence.TestUnitAnswerPersistence;
import ru.dokstrudio.med.srv.service.persistence.TestUnitAttemptPersistence;
import ru.dokstrudio.med.srv.service.persistence.TestUnitPersistence;
import ru.dokstrudio.med.srv.service.persistence.TestUnitSpecializationPersistence;
import ru.dokstrudio.med.srv.service.persistence.UserAccountPersistence;
import ru.dokstrudio.med.srv.service.persistence.UserDevicePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the application usage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ru.dokstrudio.med.srv.service.impl.ApplicationUsageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.dokstrudio.med.srv.service.impl.ApplicationUsageLocalServiceImpl
 * @see ru.dokstrudio.med.srv.service.ApplicationUsageLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class ApplicationUsageLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements ApplicationUsageLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ru.dokstrudio.med.srv.service.ApplicationUsageLocalServiceUtil} to access the application usage local service.
	 */

	/**
	 * Adds the application usage to the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationUsage the application usage
	 * @return the application usage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ApplicationUsage addApplicationUsage(
		ApplicationUsage applicationUsage) {
		applicationUsage.setNew(true);

		return applicationUsagePersistence.update(applicationUsage);
	}

	/**
	 * Creates a new application usage with the primary key. Does not add the application usage to the database.
	 *
	 * @param applicationUserId the primary key for the new application usage
	 * @return the new application usage
	 */
	@Override
	public ApplicationUsage createApplicationUsage(long applicationUserId) {
		return applicationUsagePersistence.create(applicationUserId);
	}

	/**
	 * Deletes the application usage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationUserId the primary key of the application usage
	 * @return the application usage that was removed
	 * @throws PortalException if a application usage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ApplicationUsage deleteApplicationUsage(long applicationUserId)
		throws PortalException {
		return applicationUsagePersistence.remove(applicationUserId);
	}

	/**
	 * Deletes the application usage from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicationUsage the application usage
	 * @return the application usage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ApplicationUsage deleteApplicationUsage(
		ApplicationUsage applicationUsage) {
		return applicationUsagePersistence.remove(applicationUsage);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(ApplicationUsage.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return applicationUsagePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return applicationUsagePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return applicationUsagePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return applicationUsagePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return applicationUsagePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public ApplicationUsage fetchApplicationUsage(long applicationUserId) {
		return applicationUsagePersistence.fetchByPrimaryKey(applicationUserId);
	}

	/**
	 * Returns the application usage with the primary key.
	 *
	 * @param applicationUserId the primary key of the application usage
	 * @return the application usage
	 * @throws PortalException if a application usage with the primary key could not be found
	 */
	@Override
	public ApplicationUsage getApplicationUsage(long applicationUserId)
		throws PortalException {
		return applicationUsagePersistence.findByPrimaryKey(applicationUserId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(applicationUsageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ApplicationUsage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("applicationUserId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(applicationUsageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(ApplicationUsage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"applicationUserId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(applicationUsageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ApplicationUsage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("applicationUserId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return applicationUsageLocalService.deleteApplicationUsage((ApplicationUsage)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return applicationUsagePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the application usages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of application usages
	 * @param end the upper bound of the range of application usages (not inclusive)
	 * @return the range of application usages
	 */
	@Override
	public List<ApplicationUsage> getApplicationUsages(int start, int end) {
		return applicationUsagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of application usages.
	 *
	 * @return the number of application usages
	 */
	@Override
	public int getApplicationUsagesCount() {
		return applicationUsagePersistence.countAll();
	}

	/**
	 * Updates the application usage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param applicationUsage the application usage
	 * @return the application usage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ApplicationUsage updateApplicationUsage(
		ApplicationUsage applicationUsage) {
		return applicationUsagePersistence.update(applicationUsage);
	}

	/**
	 * Returns the application account local service.
	 *
	 * @return the application account local service
	 */
	public ru.dokstrudio.med.srv.service.ApplicationAccountLocalService getApplicationAccountLocalService() {
		return applicationAccountLocalService;
	}

	/**
	 * Sets the application account local service.
	 *
	 * @param applicationAccountLocalService the application account local service
	 */
	public void setApplicationAccountLocalService(
		ru.dokstrudio.med.srv.service.ApplicationAccountLocalService applicationAccountLocalService) {
		this.applicationAccountLocalService = applicationAccountLocalService;
	}

	/**
	 * Returns the application account persistence.
	 *
	 * @return the application account persistence
	 */
	public ApplicationAccountPersistence getApplicationAccountPersistence() {
		return applicationAccountPersistence;
	}

	/**
	 * Sets the application account persistence.
	 *
	 * @param applicationAccountPersistence the application account persistence
	 */
	public void setApplicationAccountPersistence(
		ApplicationAccountPersistence applicationAccountPersistence) {
		this.applicationAccountPersistence = applicationAccountPersistence;
	}

	/**
	 * Returns the application usage local service.
	 *
	 * @return the application usage local service
	 */
	public ApplicationUsageLocalService getApplicationUsageLocalService() {
		return applicationUsageLocalService;
	}

	/**
	 * Sets the application usage local service.
	 *
	 * @param applicationUsageLocalService the application usage local service
	 */
	public void setApplicationUsageLocalService(
		ApplicationUsageLocalService applicationUsageLocalService) {
		this.applicationUsageLocalService = applicationUsageLocalService;
	}

	/**
	 * Returns the application usage persistence.
	 *
	 * @return the application usage persistence
	 */
	public ApplicationUsagePersistence getApplicationUsagePersistence() {
		return applicationUsagePersistence;
	}

	/**
	 * Sets the application usage persistence.
	 *
	 * @param applicationUsagePersistence the application usage persistence
	 */
	public void setApplicationUsagePersistence(
		ApplicationUsagePersistence applicationUsagePersistence) {
		this.applicationUsagePersistence = applicationUsagePersistence;
	}

	/**
	 * Returns the test unit local service.
	 *
	 * @return the test unit local service
	 */
	public ru.dokstrudio.med.srv.service.TestUnitLocalService getTestUnitLocalService() {
		return testUnitLocalService;
	}

	/**
	 * Sets the test unit local service.
	 *
	 * @param testUnitLocalService the test unit local service
	 */
	public void setTestUnitLocalService(
		ru.dokstrudio.med.srv.service.TestUnitLocalService testUnitLocalService) {
		this.testUnitLocalService = testUnitLocalService;
	}

	/**
	 * Returns the test unit persistence.
	 *
	 * @return the test unit persistence
	 */
	public TestUnitPersistence getTestUnitPersistence() {
		return testUnitPersistence;
	}

	/**
	 * Sets the test unit persistence.
	 *
	 * @param testUnitPersistence the test unit persistence
	 */
	public void setTestUnitPersistence(TestUnitPersistence testUnitPersistence) {
		this.testUnitPersistence = testUnitPersistence;
	}

	/**
	 * Returns the test unit answer local service.
	 *
	 * @return the test unit answer local service
	 */
	public ru.dokstrudio.med.srv.service.TestUnitAnswerLocalService getTestUnitAnswerLocalService() {
		return testUnitAnswerLocalService;
	}

	/**
	 * Sets the test unit answer local service.
	 *
	 * @param testUnitAnswerLocalService the test unit answer local service
	 */
	public void setTestUnitAnswerLocalService(
		ru.dokstrudio.med.srv.service.TestUnitAnswerLocalService testUnitAnswerLocalService) {
		this.testUnitAnswerLocalService = testUnitAnswerLocalService;
	}

	/**
	 * Returns the test unit answer persistence.
	 *
	 * @return the test unit answer persistence
	 */
	public TestUnitAnswerPersistence getTestUnitAnswerPersistence() {
		return testUnitAnswerPersistence;
	}

	/**
	 * Sets the test unit answer persistence.
	 *
	 * @param testUnitAnswerPersistence the test unit answer persistence
	 */
	public void setTestUnitAnswerPersistence(
		TestUnitAnswerPersistence testUnitAnswerPersistence) {
		this.testUnitAnswerPersistence = testUnitAnswerPersistence;
	}

	/**
	 * Returns the test unit attempt local service.
	 *
	 * @return the test unit attempt local service
	 */
	public ru.dokstrudio.med.srv.service.TestUnitAttemptLocalService getTestUnitAttemptLocalService() {
		return testUnitAttemptLocalService;
	}

	/**
	 * Sets the test unit attempt local service.
	 *
	 * @param testUnitAttemptLocalService the test unit attempt local service
	 */
	public void setTestUnitAttemptLocalService(
		ru.dokstrudio.med.srv.service.TestUnitAttemptLocalService testUnitAttemptLocalService) {
		this.testUnitAttemptLocalService = testUnitAttemptLocalService;
	}

	/**
	 * Returns the test unit attempt persistence.
	 *
	 * @return the test unit attempt persistence
	 */
	public TestUnitAttemptPersistence getTestUnitAttemptPersistence() {
		return testUnitAttemptPersistence;
	}

	/**
	 * Sets the test unit attempt persistence.
	 *
	 * @param testUnitAttemptPersistence the test unit attempt persistence
	 */
	public void setTestUnitAttemptPersistence(
		TestUnitAttemptPersistence testUnitAttemptPersistence) {
		this.testUnitAttemptPersistence = testUnitAttemptPersistence;
	}

	/**
	 * Returns the test unit specialization local service.
	 *
	 * @return the test unit specialization local service
	 */
	public ru.dokstrudio.med.srv.service.TestUnitSpecializationLocalService getTestUnitSpecializationLocalService() {
		return testUnitSpecializationLocalService;
	}

	/**
	 * Sets the test unit specialization local service.
	 *
	 * @param testUnitSpecializationLocalService the test unit specialization local service
	 */
	public void setTestUnitSpecializationLocalService(
		ru.dokstrudio.med.srv.service.TestUnitSpecializationLocalService testUnitSpecializationLocalService) {
		this.testUnitSpecializationLocalService = testUnitSpecializationLocalService;
	}

	/**
	 * Returns the test unit specialization persistence.
	 *
	 * @return the test unit specialization persistence
	 */
	public TestUnitSpecializationPersistence getTestUnitSpecializationPersistence() {
		return testUnitSpecializationPersistence;
	}

	/**
	 * Sets the test unit specialization persistence.
	 *
	 * @param testUnitSpecializationPersistence the test unit specialization persistence
	 */
	public void setTestUnitSpecializationPersistence(
		TestUnitSpecializationPersistence testUnitSpecializationPersistence) {
		this.testUnitSpecializationPersistence = testUnitSpecializationPersistence;
	}

	/**
	 * Returns the user account local service.
	 *
	 * @return the user account local service
	 */
	public ru.dokstrudio.med.srv.service.UserAccountLocalService getUserAccountLocalService() {
		return userAccountLocalService;
	}

	/**
	 * Sets the user account local service.
	 *
	 * @param userAccountLocalService the user account local service
	 */
	public void setUserAccountLocalService(
		ru.dokstrudio.med.srv.service.UserAccountLocalService userAccountLocalService) {
		this.userAccountLocalService = userAccountLocalService;
	}

	/**
	 * Returns the user account persistence.
	 *
	 * @return the user account persistence
	 */
	public UserAccountPersistence getUserAccountPersistence() {
		return userAccountPersistence;
	}

	/**
	 * Sets the user account persistence.
	 *
	 * @param userAccountPersistence the user account persistence
	 */
	public void setUserAccountPersistence(
		UserAccountPersistence userAccountPersistence) {
		this.userAccountPersistence = userAccountPersistence;
	}

	/**
	 * Returns the user device local service.
	 *
	 * @return the user device local service
	 */
	public ru.dokstrudio.med.srv.service.UserDeviceLocalService getUserDeviceLocalService() {
		return userDeviceLocalService;
	}

	/**
	 * Sets the user device local service.
	 *
	 * @param userDeviceLocalService the user device local service
	 */
	public void setUserDeviceLocalService(
		ru.dokstrudio.med.srv.service.UserDeviceLocalService userDeviceLocalService) {
		this.userDeviceLocalService = userDeviceLocalService;
	}

	/**
	 * Returns the user device persistence.
	 *
	 * @return the user device persistence
	 */
	public UserDevicePersistence getUserDevicePersistence() {
		return userDevicePersistence;
	}

	/**
	 * Sets the user device persistence.
	 *
	 * @param userDevicePersistence the user device persistence
	 */
	public void setUserDevicePersistence(
		UserDevicePersistence userDevicePersistence) {
		this.userDevicePersistence = userDevicePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("ru.dokstrudio.med.srv.model.ApplicationUsage",
			applicationUsageLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"ru.dokstrudio.med.srv.model.ApplicationUsage");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ApplicationUsageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ApplicationUsage.class;
	}

	protected String getModelClassName() {
		return ApplicationUsage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = applicationUsagePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ru.dokstrudio.med.srv.service.ApplicationAccountLocalService.class)
	protected ru.dokstrudio.med.srv.service.ApplicationAccountLocalService applicationAccountLocalService;
	@BeanReference(type = ApplicationAccountPersistence.class)
	protected ApplicationAccountPersistence applicationAccountPersistence;
	@BeanReference(type = ApplicationUsageLocalService.class)
	protected ApplicationUsageLocalService applicationUsageLocalService;
	@BeanReference(type = ApplicationUsagePersistence.class)
	protected ApplicationUsagePersistence applicationUsagePersistence;
	@BeanReference(type = ru.dokstrudio.med.srv.service.TestUnitLocalService.class)
	protected ru.dokstrudio.med.srv.service.TestUnitLocalService testUnitLocalService;
	@BeanReference(type = TestUnitPersistence.class)
	protected TestUnitPersistence testUnitPersistence;
	@BeanReference(type = ru.dokstrudio.med.srv.service.TestUnitAnswerLocalService.class)
	protected ru.dokstrudio.med.srv.service.TestUnitAnswerLocalService testUnitAnswerLocalService;
	@BeanReference(type = TestUnitAnswerPersistence.class)
	protected TestUnitAnswerPersistence testUnitAnswerPersistence;
	@BeanReference(type = ru.dokstrudio.med.srv.service.TestUnitAttemptLocalService.class)
	protected ru.dokstrudio.med.srv.service.TestUnitAttemptLocalService testUnitAttemptLocalService;
	@BeanReference(type = TestUnitAttemptPersistence.class)
	protected TestUnitAttemptPersistence testUnitAttemptPersistence;
	@BeanReference(type = ru.dokstrudio.med.srv.service.TestUnitSpecializationLocalService.class)
	protected ru.dokstrudio.med.srv.service.TestUnitSpecializationLocalService testUnitSpecializationLocalService;
	@BeanReference(type = TestUnitSpecializationPersistence.class)
	protected TestUnitSpecializationPersistence testUnitSpecializationPersistence;
	@BeanReference(type = ru.dokstrudio.med.srv.service.UserAccountLocalService.class)
	protected ru.dokstrudio.med.srv.service.UserAccountLocalService userAccountLocalService;
	@BeanReference(type = UserAccountPersistence.class)
	protected UserAccountPersistence userAccountPersistence;
	@BeanReference(type = ru.dokstrudio.med.srv.service.UserDeviceLocalService.class)
	protected ru.dokstrudio.med.srv.service.UserDeviceLocalService userDeviceLocalService;
	@BeanReference(type = UserDevicePersistence.class)
	protected UserDevicePersistence userDevicePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}