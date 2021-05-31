package org.amalitech.userServices.Services;




import java.util.List;

import org.amalitech.userServices.Entity.Department;
import org.amalitech.userServices.Entity.UserGroup;
import org.amalitech.userServices.Entity.Users;
import org.amalitech.userServices.Repository.DepartmentRepository;
import org.amalitech.userServices.Repository.UserGroupRepository;
import org.amalitech.userServices.Repository.UsersRepository;
import org.amalitech.userServices.dto.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	
	@Autowired
	 UsersRepository usersRepository;

	@Autowired
	UserGroupRepository userGroupRepository;
	@Autowired
	DepartmentRepository departRepository;


	
	public UsersService(UsersRepository usersRepository) {
		super();
		this.usersRepository = usersRepository;
	}
	 
	 public Users addNewUsers(UsersDto userDto) {
		 UserGroup userGroup = this.userGroupRepository.findById(userDto.groupId).orElseThrow();
		 Department depart =   this.departRepository.findById(userDto.deptId).orElseThrow();
		 Users user = new Users(userDto.id, userDto.username, userDto.email,userGroup,depart);
	     return this.usersRepository.save(user); 
	 
	 }
	 
	 
	 
	 
	 public List<Users> findAllUsers() {
		 return this.usersRepository.findAll();
		  
	 }
	 
	 public List<Users> findUser(String user) {
		 return this.usersRepository.findByName(user);
	 }
	 
	 public List<Users> findUsersByDept(int deptId){
		 return this.usersRepository.findByDeptId(deptId);
	 }
	 
	 public List<Users> findUsersByGroup(int groupId){
		 return this.usersRepository.findByGroupId(groupId);
	 }
	 
	 public Users getSingleUser(int userId) {
		 
		 return this.usersRepository.findById(userId).orElseThrow();
	 }
	 
	
	 public Users updateUsers(UsersDto userDto) {
		Users users = usersRepository.findById(userDto.id).orElseThrow();
		Department dept = departRepository.findById(userDto.deptId).get();
		UserGroup group = userGroupRepository.findById(userDto.groupId).get();
		users.setDepartment(dept);
		users.setUserGroup(group);
		users.setEmail(userDto.email);
		users.setName(userDto.username);
	     return this.usersRepository.save(users); 
	 
	 }
	 
	 
	 public void deleteUser(int userId) {
		
		this.usersRepository.deleteById(userId);
		 
	 }
}


