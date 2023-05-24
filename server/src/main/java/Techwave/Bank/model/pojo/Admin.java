package Techwave.Bank.model.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import javax.persistence.Table;

@Entity
@Table(name = "B_Admin")
public class Admin {

	@Id
	@Column(length = 20)
	private String adminId;
	
	@Column(length = 20)
	private String password;
	
	@Column(length = 20)
	private String adminName;
	

	public Admin(String adminId, String password, String adminName) {
		super();
		this.adminId = adminId;
		this.password = password;
		this.adminName = adminName;
		
	}

	public Admin() {
		super();
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	
	
}
