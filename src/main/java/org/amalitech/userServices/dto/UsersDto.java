package org.amalitech.userServices.dto;


public class UsersDto {

public int id;
public String username;
public String email;
public int groupId;
public int deptId;


public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getGroupId() {
	return groupId;
}
public void setGroupId(int groupId) {
	this.groupId = groupId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}






}
