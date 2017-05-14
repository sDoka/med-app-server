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

package ru.dokstrudio.med.srv.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import ru.dokstrudio.med.srv.exception.NoSuchTestUnitSpecializationException;
import ru.dokstrudio.med.srv.model.TestUnitSpecialization;
import ru.dokstrudio.med.srv.model.impl.TestUnitSpecializationImpl;
import ru.dokstrudio.med.srv.model.impl.TestUnitSpecializationModelImpl;
import ru.dokstrudio.med.srv.service.persistence.TestUnitSpecializationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the test unit specialization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUnitSpecializationPersistence
 * @see ru.dokstrudio.med.srv.service.persistence.TestUnitSpecializationUtil
 * @generated
 */
@ProviderType
public class TestUnitSpecializationPersistenceImpl extends BasePersistenceImpl<TestUnitSpecialization>
	implements TestUnitSpecializationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestUnitSpecializationUtil} to access the test unit specialization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestUnitSpecializationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitSpecializationModelImpl.FINDER_CACHE_ENABLED,
			TestUnitSpecializationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitSpecializationModelImpl.FINDER_CACHE_ENABLED,
			TestUnitSpecializationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitSpecializationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TestUnitSpecializationPersistenceImpl() {
		setModelClass(TestUnitSpecialization.class);
	}

	/**
	 * Caches the test unit specialization in the entity cache if it is enabled.
	 *
	 * @param testUnitSpecialization the test unit specialization
	 */
	@Override
	public void cacheResult(TestUnitSpecialization testUnitSpecialization) {
		entityCache.putResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitSpecializationImpl.class,
			testUnitSpecialization.getPrimaryKey(), testUnitSpecialization);

		testUnitSpecialization.resetOriginalValues();
	}

	/**
	 * Caches the test unit specializations in the entity cache if it is enabled.
	 *
	 * @param testUnitSpecializations the test unit specializations
	 */
	@Override
	public void cacheResult(
		List<TestUnitSpecialization> testUnitSpecializations) {
		for (TestUnitSpecialization testUnitSpecialization : testUnitSpecializations) {
			if (entityCache.getResult(
						TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitSpecializationImpl.class,
						testUnitSpecialization.getPrimaryKey()) == null) {
				cacheResult(testUnitSpecialization);
			}
			else {
				testUnitSpecialization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test unit specializations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestUnitSpecializationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test unit specialization.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestUnitSpecialization testUnitSpecialization) {
		entityCache.removeResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitSpecializationImpl.class,
			testUnitSpecialization.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TestUnitSpecialization> testUnitSpecializations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestUnitSpecialization testUnitSpecialization : testUnitSpecializations) {
			entityCache.removeResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitSpecializationImpl.class,
				testUnitSpecialization.getPrimaryKey());
		}
	}

	/**
	 * Creates a new test unit specialization with the primary key. Does not add the test unit specialization to the database.
	 *
	 * @param specializationId the primary key for the new test unit specialization
	 * @return the new test unit specialization
	 */
	@Override
	public TestUnitSpecialization create(long specializationId) {
		TestUnitSpecialization testUnitSpecialization = new TestUnitSpecializationImpl();

		testUnitSpecialization.setNew(true);
		testUnitSpecialization.setPrimaryKey(specializationId);

		return testUnitSpecialization;
	}

	/**
	 * Removes the test unit specialization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param specializationId the primary key of the test unit specialization
	 * @return the test unit specialization that was removed
	 * @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	 */
	@Override
	public TestUnitSpecialization remove(long specializationId)
		throws NoSuchTestUnitSpecializationException {
		return remove((Serializable)specializationId);
	}

	/**
	 * Removes the test unit specialization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test unit specialization
	 * @return the test unit specialization that was removed
	 * @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	 */
	@Override
	public TestUnitSpecialization remove(Serializable primaryKey)
		throws NoSuchTestUnitSpecializationException {
		Session session = null;

		try {
			session = openSession();

			TestUnitSpecialization testUnitSpecialization = (TestUnitSpecialization)session.get(TestUnitSpecializationImpl.class,
					primaryKey);

			if (testUnitSpecialization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestUnitSpecializationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testUnitSpecialization);
		}
		catch (NoSuchTestUnitSpecializationException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TestUnitSpecialization removeImpl(
		TestUnitSpecialization testUnitSpecialization) {
		testUnitSpecialization = toUnwrappedModel(testUnitSpecialization);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testUnitSpecialization)) {
				testUnitSpecialization = (TestUnitSpecialization)session.get(TestUnitSpecializationImpl.class,
						testUnitSpecialization.getPrimaryKeyObj());
			}

			if (testUnitSpecialization != null) {
				session.delete(testUnitSpecialization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testUnitSpecialization != null) {
			clearCache(testUnitSpecialization);
		}

		return testUnitSpecialization;
	}

	@Override
	public TestUnitSpecialization updateImpl(
		TestUnitSpecialization testUnitSpecialization) {
		testUnitSpecialization = toUnwrappedModel(testUnitSpecialization);

		boolean isNew = testUnitSpecialization.isNew();

		Session session = null;

		try {
			session = openSession();

			if (testUnitSpecialization.isNew()) {
				session.save(testUnitSpecialization);

				testUnitSpecialization.setNew(false);
			}
			else {
				testUnitSpecialization = (TestUnitSpecialization)session.merge(testUnitSpecialization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
			TestUnitSpecializationImpl.class,
			testUnitSpecialization.getPrimaryKey(), testUnitSpecialization,
			false);

		testUnitSpecialization.resetOriginalValues();

		return testUnitSpecialization;
	}

	protected TestUnitSpecialization toUnwrappedModel(
		TestUnitSpecialization testUnitSpecialization) {
		if (testUnitSpecialization instanceof TestUnitSpecializationImpl) {
			return testUnitSpecialization;
		}

		TestUnitSpecializationImpl testUnitSpecializationImpl = new TestUnitSpecializationImpl();

		testUnitSpecializationImpl.setNew(testUnitSpecialization.isNew());
		testUnitSpecializationImpl.setPrimaryKey(testUnitSpecialization.getPrimaryKey());

		testUnitSpecializationImpl.setSpecializationId(testUnitSpecialization.getSpecializationId());
		testUnitSpecializationImpl.setNameLocalizationKey(testUnitSpecialization.getNameLocalizationKey());

		return testUnitSpecializationImpl;
	}

	/**
	 * Returns the test unit specialization with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit specialization
	 * @return the test unit specialization
	 * @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	 */
	@Override
	public TestUnitSpecialization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestUnitSpecializationException {
		TestUnitSpecialization testUnitSpecialization = fetchByPrimaryKey(primaryKey);

		if (testUnitSpecialization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestUnitSpecializationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testUnitSpecialization;
	}

	/**
	 * Returns the test unit specialization with the primary key or throws a {@link NoSuchTestUnitSpecializationException} if it could not be found.
	 *
	 * @param specializationId the primary key of the test unit specialization
	 * @return the test unit specialization
	 * @throws NoSuchTestUnitSpecializationException if a test unit specialization with the primary key could not be found
	 */
	@Override
	public TestUnitSpecialization findByPrimaryKey(long specializationId)
		throws NoSuchTestUnitSpecializationException {
		return findByPrimaryKey((Serializable)specializationId);
	}

	/**
	 * Returns the test unit specialization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test unit specialization
	 * @return the test unit specialization, or <code>null</code> if a test unit specialization with the primary key could not be found
	 */
	@Override
	public TestUnitSpecialization fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
				TestUnitSpecializationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TestUnitSpecialization testUnitSpecialization = (TestUnitSpecialization)serializable;

		if (testUnitSpecialization == null) {
			Session session = null;

			try {
				session = openSession();

				testUnitSpecialization = (TestUnitSpecialization)session.get(TestUnitSpecializationImpl.class,
						primaryKey);

				if (testUnitSpecialization != null) {
					cacheResult(testUnitSpecialization);
				}
				else {
					entityCache.putResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
						TestUnitSpecializationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitSpecializationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testUnitSpecialization;
	}

	/**
	 * Returns the test unit specialization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param specializationId the primary key of the test unit specialization
	 * @return the test unit specialization, or <code>null</code> if a test unit specialization with the primary key could not be found
	 */
	@Override
	public TestUnitSpecialization fetchByPrimaryKey(long specializationId) {
		return fetchByPrimaryKey((Serializable)specializationId);
	}

	@Override
	public Map<Serializable, TestUnitSpecialization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestUnitSpecialization> map = new HashMap<Serializable, TestUnitSpecialization>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestUnitSpecialization testUnitSpecialization = fetchByPrimaryKey(primaryKey);

			if (testUnitSpecialization != null) {
				map.put(primaryKey, testUnitSpecialization);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitSpecializationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TestUnitSpecialization)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTUNITSPECIALIZATION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (TestUnitSpecialization testUnitSpecialization : (List<TestUnitSpecialization>)q.list()) {
				map.put(testUnitSpecialization.getPrimaryKeyObj(),
					testUnitSpecialization);

				cacheResult(testUnitSpecialization);

				uncachedPrimaryKeys.remove(testUnitSpecialization.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestUnitSpecializationModelImpl.ENTITY_CACHE_ENABLED,
					TestUnitSpecializationImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the test unit specializations.
	 *
	 * @return the test unit specializations
	 */
	@Override
	public List<TestUnitSpecialization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestUnitSpecialization> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TestUnitSpecialization> findAll(int start, int end,
		OrderByComparator<TestUnitSpecialization> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TestUnitSpecialization> findAll(int start, int end,
		OrderByComparator<TestUnitSpecialization> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TestUnitSpecialization> list = null;

		if (retrieveFromCache) {
			list = (List<TestUnitSpecialization>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTUNITSPECIALIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTUNITSPECIALIZATION;

				if (pagination) {
					sql = sql.concat(TestUnitSpecializationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestUnitSpecialization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestUnitSpecialization>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the test unit specializations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestUnitSpecialization testUnitSpecialization : findAll()) {
			remove(testUnitSpecialization);
		}
	}

	/**
	 * Returns the number of test unit specializations.
	 *
	 * @return the number of test unit specializations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTUNITSPECIALIZATION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TestUnitSpecializationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test unit specialization persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestUnitSpecializationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTUNITSPECIALIZATION = "SELECT testUnitSpecialization FROM TestUnitSpecialization testUnitSpecialization";
	private static final String _SQL_SELECT_TESTUNITSPECIALIZATION_WHERE_PKS_IN = "SELECT testUnitSpecialization FROM TestUnitSpecialization testUnitSpecialization WHERE specializationId IN (";
	private static final String _SQL_COUNT_TESTUNITSPECIALIZATION = "SELECT COUNT(testUnitSpecialization) FROM TestUnitSpecialization testUnitSpecialization";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testUnitSpecialization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestUnitSpecialization exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(TestUnitSpecializationPersistenceImpl.class);
}