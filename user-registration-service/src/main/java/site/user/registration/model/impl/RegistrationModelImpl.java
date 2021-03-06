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

package site.user.registration.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import site.user.registration.model.Registration;
import site.user.registration.model.RegistrationModel;

/**
 * The base model implementation for the Registration service. Represents a row in the &quot;FOO_Registration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>RegistrationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegistrationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationImpl
 * @generated
 */
public class RegistrationModelImpl
	extends BaseModelImpl<Registration> implements RegistrationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a registration model instance should use the <code>Registration</code> interface instead.
	 */
	public static final String TABLE_NAME = "FOO_Registration";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"registrationId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"email", Types.VARCHAR},
		{"phone", Types.VARCHAR}, {"address", Types.VARCHAR},
		{"city", Types.VARCHAR}, {"country", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("registrationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("country", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table FOO_Registration (uuid_ VARCHAR(75) null,registrationId LONG not null primary key,name VARCHAR(300) null,email VARCHAR(300) null,phone VARCHAR(75) null,address VARCHAR(500) null,city VARCHAR(300) null,country LONG,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table FOO_Registration";

	public static final String ORDER_BY_JPQL =
		" ORDER BY registration.modifiedDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY FOO_Registration.modifiedDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		site.user.registration.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.site.user.registration.model.Registration"),
		false);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		site.user.registration.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.site.user.registration.model.Registration"),
		false);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		site.user.registration.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.site.user.registration.model.Registration"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long EMAIL_COLUMN_BITMASK = 2L;

	public static final long GROUPID_COLUMN_BITMASK = 4L;

	public static final long NAME_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

	public static final long MODIFIEDDATE_COLUMN_BITMASK = 32L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		site.user.registration.service.util.ServiceProps.get(
			"lock.expiration.time.site.user.registration.model.Registration"));

	public RegistrationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _registrationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRegistrationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _registrationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		Map<String, Function<Registration, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Registration, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Registration, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((Registration)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Registration, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Registration, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Registration)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Registration, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Registration, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Registration>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Registration.class.getClassLoader(), Registration.class,
			ModelWrapper.class);

		try {
			Constructor<Registration> constructor =
				(Constructor<Registration>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Registration, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Registration, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Registration, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Registration, Object>>();
		Map<String, BiConsumer<Registration, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Registration, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object uuidObject) {

					registration.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"registrationId",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getRegistrationId();
				}

			});
		attributeSetterBiConsumers.put(
			"registrationId",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object registrationIdObject) {

					registration.setRegistrationId((Long)registrationIdObject);
				}

			});
		attributeGetterFunctions.put(
			"name",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getName();
				}

			});
		attributeSetterBiConsumers.put(
			"name",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object nameObject) {

					registration.setName((String)nameObject);
				}

			});
		attributeGetterFunctions.put(
			"email",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getEmail();
				}

			});
		attributeSetterBiConsumers.put(
			"email",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object emailObject) {

					registration.setEmail((String)emailObject);
				}

			});
		attributeGetterFunctions.put(
			"phone",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getPhone();
				}

			});
		attributeSetterBiConsumers.put(
			"phone",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object phoneObject) {

					registration.setPhone((String)phoneObject);
				}

			});
		attributeGetterFunctions.put(
			"address",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getAddress();
				}

			});
		attributeSetterBiConsumers.put(
			"address",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object addressObject) {

					registration.setAddress((String)addressObject);
				}

			});
		attributeGetterFunctions.put(
			"city",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getCity();
				}

			});
		attributeSetterBiConsumers.put(
			"city",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object cityObject) {

					registration.setCity((String)cityObject);
				}

			});
		attributeGetterFunctions.put(
			"country",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getCountry();
				}

			});
		attributeSetterBiConsumers.put(
			"country",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object countryObject) {

					registration.setCountry((Long)countryObject);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object groupIdObject) {

					registration.setGroupId((Long)groupIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object companyIdObject) {

					registration.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object userIdObject) {

					registration.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object userNameObject) {

					registration.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object createDateObject) {

					registration.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<Registration, Object>() {

				@Override
				public Object apply(Registration registration) {
					return registration.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<Registration, Object>() {

				@Override
				public void accept(
					Registration registration, Object modifiedDateObject) {

					registration.setModifiedDate((Date)modifiedDateObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getRegistrationId() {
		return _registrationId;
	}

	@Override
	public void setRegistrationId(long registrationId) {
		_registrationId = registrationId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_columnBitmask |= EMAIL_COLUMN_BITMASK;

		if (_originalEmail == null) {
			_originalEmail = _email;
		}

		_email = email;
	}

	public String getOriginalEmail() {
		return GetterUtil.getString(_originalEmail);
	}

	@Override
	public String getPhone() {
		if (_phone == null) {
			return "";
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@Override
	public String getCity() {
		if (_city == null) {
			return "";
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@Override
	public long getCountry() {
		return _country;
	}

	@Override
	public void setCountry(long country) {
		_country = country;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_columnBitmask = -1L;

		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Registration.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Registration.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Registration toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Registration>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RegistrationImpl registrationImpl = new RegistrationImpl();

		registrationImpl.setUuid(getUuid());
		registrationImpl.setRegistrationId(getRegistrationId());
		registrationImpl.setName(getName());
		registrationImpl.setEmail(getEmail());
		registrationImpl.setPhone(getPhone());
		registrationImpl.setAddress(getAddress());
		registrationImpl.setCity(getCity());
		registrationImpl.setCountry(getCountry());
		registrationImpl.setGroupId(getGroupId());
		registrationImpl.setCompanyId(getCompanyId());
		registrationImpl.setUserId(getUserId());
		registrationImpl.setUserName(getUserName());
		registrationImpl.setCreateDate(getCreateDate());
		registrationImpl.setModifiedDate(getModifiedDate());

		registrationImpl.resetOriginalValues();

		return registrationImpl;
	}

	@Override
	public int compareTo(Registration registration) {
		int value = 0;

		value = DateUtil.compareTo(
			getModifiedDate(), registration.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Registration)) {
			return false;
		}

		Registration registration = (Registration)object;

		long primaryKey = registration.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		RegistrationModelImpl registrationModelImpl = this;

		registrationModelImpl._originalUuid = registrationModelImpl._uuid;

		registrationModelImpl._originalName = registrationModelImpl._name;

		registrationModelImpl._originalEmail = registrationModelImpl._email;

		registrationModelImpl._originalGroupId = registrationModelImpl._groupId;

		registrationModelImpl._setOriginalGroupId = false;

		registrationModelImpl._originalCompanyId =
			registrationModelImpl._companyId;

		registrationModelImpl._setOriginalCompanyId = false;

		registrationModelImpl._setModifiedDate = false;

		registrationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Registration> toCacheModel() {
		RegistrationCacheModel registrationCacheModel =
			new RegistrationCacheModel();

		registrationCacheModel.uuid = getUuid();

		String uuid = registrationCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			registrationCacheModel.uuid = null;
		}

		registrationCacheModel.registrationId = getRegistrationId();

		registrationCacheModel.name = getName();

		String name = registrationCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			registrationCacheModel.name = null;
		}

		registrationCacheModel.email = getEmail();

		String email = registrationCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			registrationCacheModel.email = null;
		}

		registrationCacheModel.phone = getPhone();

		String phone = registrationCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			registrationCacheModel.phone = null;
		}

		registrationCacheModel.address = getAddress();

		String address = registrationCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			registrationCacheModel.address = null;
		}

		registrationCacheModel.city = getCity();

		String city = registrationCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			registrationCacheModel.city = null;
		}

		registrationCacheModel.country = getCountry();

		registrationCacheModel.groupId = getGroupId();

		registrationCacheModel.companyId = getCompanyId();

		registrationCacheModel.userId = getUserId();

		registrationCacheModel.userName = getUserName();

		String userName = registrationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			registrationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			registrationCacheModel.createDate = createDate.getTime();
		}
		else {
			registrationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			registrationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			registrationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return registrationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Registration, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Registration, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Registration, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Registration)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Registration, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Registration, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Registration, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Registration)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Registration>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _registrationId;
	private String _name;
	private String _originalName;
	private String _email;
	private String _originalEmail;
	private String _phone;
	private String _address;
	private String _city;
	private long _country;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private Registration _escapedModel;

}