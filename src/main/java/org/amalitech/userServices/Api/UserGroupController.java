package org.amalitech.userServices.Api;

import java.util.List;



import org.amalitech.userServices.Entity.UserGroup;
import org.amalitech.userServices.Services.UserGroupService;
import org.amalitech.userServices.dto.UserGroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/grp")
public class UserGroupController {
	
	@Autowired
	UserGroupService userGroupService;
	
	
	@PostMapping
	public UserGroup createNewUserGroup(@RequestBody UserGroupDto groupDto) {
		UserGroup usergroup = new UserGroup();
		usergroup.setName(groupDto.getName());
		return this.userGroupService.createNewUserGroup(usergroup);
	}
	
	@GetMapping
	public List<UserGroup> getAllUserGroups() {
		return this.userGroupService.getAllUserGroups();
	}

	@PutMapping
	public UserGroup updateUserGroup(@RequestBody UserGroupDto groupDto) {
		return this.userGroupService.updateUserGroup(groupDto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserGroup(@PathVariable("id") int userGroupId) {
		this.userGroupService.deleteUserGroup(userGroupId);
	}
	
	

}
