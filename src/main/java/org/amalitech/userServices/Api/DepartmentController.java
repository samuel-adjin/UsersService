package org.amalitech.userServices.Api;

import java.util.List;

import org.amalitech.userServices.Entity.Department;
import org.amalitech.userServices.Services.DepartmentService;
import org.amalitech.userServices.dto.DepartmentDto;
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
@RequestMapping("/depart")
public class DepartmentController {

	
	@Autowired
	DepartmentService departService;
	
	@PostMapping
	public Department createNewDept(@RequestBody DepartmentDto deptDto) {
		Department dept = new Department();
		dept.setDepartname(deptDto.getDepartName());
		return this.departService.createNewDept(dept);
	}
	
	@GetMapping
	public List<Department> getAllDept(){
		return this.departService.findAllDept();
	}
	
	@PutMapping
	public Department updateDept(@RequestBody DepartmentDto deptDto) {
		Department dept = new Department();
		dept.setDepartname(deptDto.getDepartName());
		return this.departService.updateDept(dept);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserGroup(@PathVariable("id") int deptId) {
		this.departService.deleteDepartment(deptId);
	}
	
	
}
