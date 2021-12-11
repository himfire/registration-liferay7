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

package site.user.registration.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Registration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Registration
 * @generated
 */
public class RegistrationWrapper
	implements ModelWrapper<Registration>, Registration {

	public RegistrationWrapper(Registration registration) {
		_registration = registration;
	}

	@Override
	public Class<?> getModelClass() {
		return Registration.class;
	}

	@Override
	public String getModelClassName() {
		return Registration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("registrationId", getRegistrationId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("phone", getPhone());
		attributes.put("address", getAddress());
		attributes.put("city", getCity());
		attributes.put("country", getCountry());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long registrationId = (Long)attributes.get("registrationId");

		if (registrationId != null) {
			setRegistrationId(registrationId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		Long country = (Long)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public Object clone() {
		return new RegistrationWrapper((Registration)_registration.clone());
	}

	@Override
	public int compareTo(
		site.user.registration.model.Registration registration) {

		return _registration.compareTo(registration);
	}

	/**
	 * Returns the address of this registration.
	 *
	 * @return the address of this registration
	 */
	@Override
	public String getAddress() {
		return _registration.getAddress();
	}

	/**
	 * Returns the city of this registration.
	 *
	 * @return the city of this registration
	 */
	@Override
	public String getCity() {
		return _registration.getCity();
	}

	/**
	 * Returns the company ID of this registration.
	 *
	 * @return the company ID of this registration
	 */
	@Override
	public long getCompanyId() {
		return _registration.getCompanyId();
	}

	/**
	 * Returns the country of this registration.
	 *
	 * @return the country of this registration
	 */
	@Override
	public long getCountry() {
		return _registration.getCountry();
	}

	/**
	 * Returns the create date of this registration.
	 *
	 * @return the create date of this registration
	 */
	@Override
	public Date getCreateDate() {
		return _registration.getCreateDate();
	}

	/**
	 * Returns the email of this registration.
	 *
	 * @return the email of this registration
	 */
	@Override
	public String getEmail() {
		return _registration.getEmail();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _registration.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this registration.
	 *
	 * @return the group ID of this registration
	 */
	@Override
	public long getGroupId() {
		return _registration.getGroupId();
	}

	/**
	 * Returns the modified date of this registration.
	 *
	 * @return the modified date of this registration
	 */
	@Override
	public Date getModifiedDate() {
		return _registration.getModifiedDate();
	}

	/**
	 * Returns the name of this registration.
	 *
	 * @return the name of this registration
	 */
	@Override
	public String getName() {
		return _registration.getName();
	}

	/**
	 * Returns the phone of this registration.
	 *
	 * @return the phone of this registration
	 */
	@Override
	public String getPhone() {
		return _registration.getPhone();
	}

	/**
	 * Returns the primary key of this registration.
	 *
	 * @return the primary key of this registration
	 */
	@Override
	public long getPrimaryKey() {
		return _registration.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _registration.getPrimaryKeyObj();
	}

	/**
	 * Returns the registration ID of this registration.
	 *
	 * @return the registration ID of this registration
	 */
	@Override
	public long getRegistrationId() {
		return _registration.getRegistrationId();
	}

	/**
	 * Returns the user ID of this registration.
	 *
	 * @return the user ID of this registration
	 */
	@Override
	public long getUserId() {
		return _registration.getUserId();
	}

	/**
	 * Returns the user name of this registration.
	 *
	 * @return the user name of this registration
	 */
	@Override
	public String getUserName() {
		return _registration.getUserName();
	}

	/**
	 * Returns the user uuid of this registration.
	 *
	 * @return the user uuid of this registration
	 */
	@Override
	public String getUserUuid() {
		return _registration.getUserUuid();
	}

	/**
	 * Returns the uuid of this registration.
	 *
	 * @return the uuid of this registration
	 */
	@Override
	public String getUuid() {
		return _registration.getUuid();
	}

	@Override
	public int hashCode() {
		return _registration.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _registration.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _registration.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _registration.isNew();
	}

	@Override
	public void persist() {
		_registration.persist();
	}

	/**
	 * Sets the address of this registration.
	 *
	 * @param address the address of this registration
	 */
	@Override
	public void setAddress(String address) {
		_registration.setAddress(address);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_registration.setCachedModel(cachedModel);
	}

	/**
	 * Sets the city of this registration.
	 *
	 * @param city the city of this registration
	 */
	@Override
	public void setCity(String city) {
		_registration.setCity(city);
	}

	/**
	 * Sets the company ID of this registration.
	 *
	 * @param companyId the company ID of this registration
	 */
	@Override
	public void setCompanyId(long companyId) {
		_registration.setCompanyId(companyId);
	}

	/**
	 * Sets the country of this registration.
	 *
	 * @param country the country of this registration
	 */
	@Override
	public void setCountry(long country) {
		_registration.setCountry(country);
	}

	/**
	 * Sets the create date of this registration.
	 *
	 * @param createDate the create date of this registration
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_registration.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this registration.
	 *
	 * @param email the email of this registration
	 */
	@Override
	public void setEmail(String email) {
		_registration.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_registration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_registration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_registration.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this registration.
	 *
	 * @param groupId the group ID of this registration
	 */
	@Override
	public void setGroupId(long groupId) {
		_registration.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this registration.
	 *
	 * @param modifiedDate the modified date of this registration
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_registration.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this registration.
	 *
	 * @param name the name of this registration
	 */
	@Override
	public void setName(String name) {
		_registration.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_registration.setNew(n);
	}

	/**
	 * Sets the phone of this registration.
	 *
	 * @param phone the phone of this registration
	 */
	@Override
	public void setPhone(String phone) {
		_registration.setPhone(phone);
	}

	/**
	 * Sets the primary key of this registration.
	 *
	 * @param primaryKey the primary key of this registration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_registration.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_registration.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the registration ID of this registration.
	 *
	 * @param registrationId the registration ID of this registration
	 */
	@Override
	public void setRegistrationId(long registrationId) {
		_registration.setRegistrationId(registrationId);
	}

	/**
	 * Sets the user ID of this registration.
	 *
	 * @param userId the user ID of this registration
	 */
	@Override
	public void setUserId(long userId) {
		_registration.setUserId(userId);
	}

	/**
	 * Sets the user name of this registration.
	 *
	 * @param userName the user name of this registration
	 */
	@Override
	public void setUserName(String userName) {
		_registration.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this registration.
	 *
	 * @param userUuid the user uuid of this registration
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_registration.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this registration.
	 *
	 * @param uuid the uuid of this registration
	 */
	@Override
	public void setUuid(String uuid) {
		_registration.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<site.user.registration.model.Registration> toCacheModel() {

		return _registration.toCacheModel();
	}

	@Override
	public site.user.registration.model.Registration toEscapedModel() {
		return new RegistrationWrapper(_registration.toEscapedModel());
	}

	@Override
	public String toString() {
		return _registration.toString();
	}

	@Override
	public site.user.registration.model.Registration toUnescapedModel() {
		return new RegistrationWrapper(_registration.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _registration.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RegistrationWrapper)) {
			return false;
		}

		RegistrationWrapper registrationWrapper = (RegistrationWrapper)object;

		if (Objects.equals(_registration, registrationWrapper._registration)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _registration.getStagedModelType();
	}

	@Override
	public Registration getWrappedModel() {
		return _registration;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _registration.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _registration.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_registration.resetOriginalValues();
	}

	private final Registration _registration;

}