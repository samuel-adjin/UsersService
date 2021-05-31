package org.amalitech.userServices.Services;

import java.util.List;

import org.amalitech.userServices.Entity.Department;
import org.amalitech.userServices.Repository.DepartmentRepository;
import org.amalitech.userServices.dto.DepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departRepository;
	
	
	public Department createNewDept(Department dept) {
		return this.departRepository.save(dept);
	}
	
	public List<Department> findAllDept(){
		return this.departRepository.findAll();
	}
	
	
	 public void deleteDepartment(int deptId) {
			this.departRepository.deleteById(deptId); 
		 }
	 

		public Department updateDept(DepartmentDto deptDto) {
			Department depart =departRepository.findById(deptDto.deptId).orElseThrow();
			depart.setDepartname(deptDto.departName);
			return this.departRepository.save(depart);
		}
		

}
