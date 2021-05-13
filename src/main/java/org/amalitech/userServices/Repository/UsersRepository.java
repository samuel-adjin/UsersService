package org.amalitech.userServices.Repository;

import java.util.List;

import org.amalitech.userServices.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

//	@Query(value ="SELECT * FROM users WHERE name =?1", nativeQuery = true)
	List<Users> findByName(String user);

	@Query(value ="SELECT * FROM users WHERE Department_id =?1", nativeQuery = true)
	List<Users> findByDeptId(int deptId);
	
	@Query(value ="SELECT * FROM users WHERE Usergroup_id =?1", nativeQuery = true)
	List<Users> findByGroupId(int groupId);

}
