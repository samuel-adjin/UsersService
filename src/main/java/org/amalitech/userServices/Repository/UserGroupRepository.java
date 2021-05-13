package org.amalitech.userServices.Repository;

import org.amalitech.userServices.Entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup,Integer> {

	
	@Modifying
    @Query(value="update user_group set name= :userGroupName where id = :id", nativeQuery=true)
    void updateUserGroup(String userGroupName, int id);
}
