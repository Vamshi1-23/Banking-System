package com.example.Bank.Banker.model.pojo;

public class Admin {
	private String adminId;
	private String password;
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
