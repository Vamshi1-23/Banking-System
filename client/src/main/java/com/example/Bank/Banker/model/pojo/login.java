package com.example.Bank.Banker.model.pojo;
public class login {
	
	private Integer userId;
	private Integer password;
	
	public login() {
		super();
	}

	public login( Integer userId,Integer password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}
}
