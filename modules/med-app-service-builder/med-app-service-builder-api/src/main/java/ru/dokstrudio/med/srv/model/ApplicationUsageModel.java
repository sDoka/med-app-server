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

package ru.dokstrudio.med.srv.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ApplicationUsage service. Represents a row in the &quot;med_ApplicationUsage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ru.dokstrudio.med.srv.model.impl.ApplicationUsageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationUsage
 * @see ru.dokstrudio.med.srv.model.impl.ApplicationUsageImpl
 * @see ru.dokstrudio.med.srv.model.impl.ApplicationUsageModelImpl
 * @generated
 */
@ProviderType
public interface ApplicationUsageModel extends BaseModel<ApplicationUsage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a application usage model instance should use the {@link ApplicationUsage} interface instead.
	 */

	/**
	 * Returns the primary key of this application usage.
	 *
	 * @return the primary key of this application usage
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this application usage.
	 *
	 * @param primaryKey the primary key of this application usage
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the application user ID of this application usage.
	 *
	 * @return the application user ID of this application usage
	 */
	public long getApplicationUserId();

	/**
	 * Sets the application user ID of this application usage.
	 *
	 * @param applicationUserId the application user ID of this application usage
	 */
	public void setApplicationUserId(long applicationUserId);

	/**
	 * Returns the application user uuid of this application usage.
	 *
	 * @return the application user uuid of this application usage
	 */
	public String getApplicationUserUuid();

	/**
	 * Sets the application user uuid of this application usage.
	 *
	 * @param applicationUserUuid the application user uuid of this application usage
	 */
	public void setApplicationUserUuid(String applicationUserUuid);

	/**
	 * Returns the user ID of this application usage.
	 *
	 * @return the user ID of this application usage
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this application usage.
	 *
	 * @param userId the user ID of this application usage
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this application usage.
	 *
	 * @return the user uuid of this application usage
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this application usage.
	 *
	 * @param userUuid the user uuid of this application usage
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the ip address of this application usage.
	 *
	 * @return the ip address of this application usage
	 */
	@AutoEscape
	public String getIpAddress();

	/**
	 * Sets the ip address of this application usage.
	 *
	 * @param ipAddress the ip address of this application usage
	 */
	public void setIpAddress(String ipAddress);

	/**
	 * Returns the device ID of this application usage.
	 *
	 * @return the device ID of this application usage
	 */
	public long getDeviceId();

	/**
	 * Sets the device ID of this application usage.
	 *
	 * @param deviceId the device ID of this application usage
	 */
	public void setDeviceId(long deviceId);

	/**
	 * Returns the action type of this application usage.
	 *
	 * @return the action type of this application usage
	 */
	public int getActionType();

	/**
	 * Sets the action type of this application usage.
	 *
	 * @param actionType the action type of this application usage
	 */
	public void setActionType(int actionType);

	/**
	 * Returns the action time of this application usage.
	 *
	 * @return the action time of this application usage
	 */
	public Date getActionTime();

	/**
	 * Sets the action time of this application usage.
	 *
	 * @param actionTime the action time of this application usage
	 */
	public void setActionTime(Date actionTime);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		ru.dokstrudio.med.srv.model.ApplicationUsage applicationUsage);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ru.dokstrudio.med.srv.model.ApplicationUsage> toCacheModel();

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage toEscapedModel();

	@Override
	public ru.dokstrudio.med.srv.model.ApplicationUsage toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}