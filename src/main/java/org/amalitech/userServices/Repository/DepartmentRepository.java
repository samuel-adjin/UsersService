package org.amalitech.userServices.Repository;

import org.amalitech.userServices.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
