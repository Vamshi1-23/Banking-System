package com.example.Bank.Banker.model.pojo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class NewUser {
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
	private String status;
	public NewUser(int userId, String fName, String lName, String email, String gender, LocalDate dob, String phNo,
			String nationality, String status,String aadhar, String address, String ifsc, Account accId) {
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
		this.ifsc = ifsc;
		this.status=status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public NewUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int string) {
		this.userId = string;
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
}
