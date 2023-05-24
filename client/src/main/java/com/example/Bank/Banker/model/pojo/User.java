package com.example.Bank.Banker.model.pojo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private int userId;

	private String fName;

	private String lName;

	private String email;

	private String gender;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;

	private String phNo;

	private String nationality;

	private String aadhar;

	private String address;

	private String ifsc;
	
	private int password;

	private Account accId;

	public User(int userId, String fName, String lName, String email, String gender, LocalDate dob, String phNo,
			String nationality, int password,String aadhar, String address, String branchLocation, Account accId) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.phNo = phNo;
		this.nationality = nationality;
		this.aadhar = aadhar;
		this.address = address;
		this.ifsc = branchLocation;
		this.accId = accId;
		this.password=password;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Account getAccId() {
		return accId;
	}

	public void setAccId(Account accId) {
		this.accId = accId;
	}

}
