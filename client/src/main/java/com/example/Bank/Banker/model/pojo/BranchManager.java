package com.example.Bank.Banker.model.pojo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class BranchManager {

	private String mgrId;

	private String fname;

	private String lname;

	private String address;

	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate doj;

	private Branch ifsc;

	private Admin adminId;

	public String getMgrId() {
		return mgrId;
	}

	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public Branch getIfsc() {
		return ifsc;
	}

	public void setIfsc(Branch ifsc) {
		this.ifsc = ifsc;
	}

	public Admin getAdminId() {
		return adminId;
	}

	public void setAdminId(Admin adminId) {
		this.adminId = adminId;
	}

	public BranchManager(String mgrId, String fname, String lname, String address, String gender, LocalDate dob,
			LocalDate doj, Branch branchId, Admin adminId) {
		super();
		this.mgrId = mgrId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.doj = doj;
		this.ifsc = branchId;
		this.adminId = adminId;
	}

	public BranchManager() {
		super();
		// TODO Auto-generated constructor stub
	}

}
