package org.amalitech.userServices.Entity;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;




@Entity
@Table
public class Users {
	
	



	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	
	@CreationTimestamp
	private Date createdDate;
	
	@UpdateTimestamp
	
	private Date updatedDate;
	
	
	

	public Date getCreatedDate() {
		return createdDate;
	}




	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}




	public Date getUpdatedDate() {
		return updatedDate;
	}




	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}




	public Users(int id, String name, String email, Date createdDate, Date updatedDate, UserGroup userGroup) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.userGroup = userGroup;
	}




	public Users(int id, String name, String email, UserGroup userGroup) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userGroup = userGroup;
	}


	//Relationship 
	@ManyToOne
	@JoinColumn(name ="Usergroup_Id")
	UserGroup userGroup;
	
	
	
	@ManyToOne
	@JoinColumn(name ="Department_Id")
	private Department department;
	




	public Users(int id, String name, String email, UserGroup userGroup, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userGroup = userGroup;
		this.department = department;
	}




	public Users() {
		super();
	}
	
	
	

	public Users(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}




	public Users(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}







	public UserGroup getUserGroup() {
		return userGroup;
	}


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Department getDepartment() {
		return department;
	}




	public void setDepartment(Department department) {
		this.department = department;
	}


	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	
	
	
	
}
