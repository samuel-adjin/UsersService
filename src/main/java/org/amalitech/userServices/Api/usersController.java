package org.amalitech.userServices.Api;

import java.util.List;






import org.amalitech.userServices.Entity.Users;
import org.amalitech.userServices.Services.UsersService;
import org.amalitech.userServices.dto.UsersDto;
//import org.amalitech.userServices.dto.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class usersController {
	
	@Autowired
	UsersService usersService;
	
	
	
	
	public usersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	@PostMapping
	public Users addNewUsers(@RequestBody UsersDto usersDto) {
		return this.usersService.addNewUsers(usersDto);
	}
	
	@GetMapping
	 public List<Users> findAllUsers() {
		 return this.usersService.findAllUsers();
		  
	 }
	
	@GetMapping("/username")
	 public List<Users> findByUser(@RequestParam String user) {
//		System.out.println(this.usersService.findUser(user));
		 return this.usersService.findUser(user);	 
	 }
	
	@GetMapping("/userdept")
	 public List<Users> findUserByDept(@RequestParam int deptId) {
		 return this.usersService.findUsersByDept(deptId); 
	 }
	
	@GetMapping("/getusergroup")
	 public List<Users> findUserByGroup(@RequestParam int groupId) {
		 return this.usersService.findUsersByGroup(groupId); 
	 }
	
	
	
	@GetMapping("/{id}")
	public Users getSingleUser(@PathVariable ("id") int userId) {
		
		return this.usersService.getSingleUser(userId);
		
	}
	
	
	@PutMapping
	public Users updateUsers(@RequestBody UsersDto usersDto) {
		return this.usersService.updateUsers(usersDto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int userId) {
		this.usersService.deleteUser(userId);
	}
	
//@PostMapping()
}
