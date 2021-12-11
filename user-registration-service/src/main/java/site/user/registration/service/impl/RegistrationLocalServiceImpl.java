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

package site.user.registration.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import site.user.registration.model.Registration;
import site.user.registration.service.base.RegistrationLocalServiceBaseImpl;

/**
 * The implementation of the registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>site.user.registration.service.RegistrationLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationLocalServiceBaseImpl
 */
public class RegistrationLocalServiceImpl
	extends RegistrationLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>site.user.registration.service.RegistrationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>site.user.registration.service.RegistrationLocalServiceUtil</code>.
	 */
	public List<Registration> findByNameOrEmail(String searchText){
		List<Registration> resultList;
		List<Registration> findByEmail = registrationPersistence.findByEmail("%" + searchText + "%");
		List<Registration> findByName = registrationPersistence.findByName("%" + searchText + "%");
		Set<Registration>  resultSet;
		if(findByEmail == null & findByName == null) {
			resultList = new ArrayList<Registration>();
			return resultList;
		}else if(findByEmail == null) {
			resultSet = new HashSet<>(findByName);
		}else if(findByName == null){
			resultSet = new HashSet<>(findByEmail);
		}else {
			resultSet = new HashSet<>();
			resultSet.addAll(findByName);
			resultSet.addAll(findByEmail);
		}
		
		resultList = new ArrayList<Registration>(resultSet);
		return resultList;
	}
}