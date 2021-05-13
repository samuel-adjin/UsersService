package org.amalitech.userServices.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Table
@Entity
public class UserGroup {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy ="userGroup")
//    private List<Users> users ;

	


	public UserGroup() {
		super();
	}

	public UserGroup(String name) {
		super();
		this.name = name;
	}

	public UserGroup(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	

	
	
	

}
