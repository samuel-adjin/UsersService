package org.amalitech.userServices.Services;

import java.util.List;


import org.amalitech.userServices.Entity.UserGroup;
import org.amalitech.userServices.Repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserGroupService {
	
	
	@Autowired
	UserGroupRepository userGroupRepository;
	

	public UserGroup createNewUserGroup(UserGroup group) {
		return this.userGroupRepository.save(group);
	}
	
	public List<UserGroup> getAllUserGroups() {
		return this.userGroupRepository.findAll();
	}
	
	
	public UserGroup updateUserGroup(UserGroup group) {
		return this.userGroupRepository.save(group);
	}
	 public void deleteUserGroup(int usergroupId) {
			this.userGroupRepository.deleteById(usergroupId); 
		 }

}
