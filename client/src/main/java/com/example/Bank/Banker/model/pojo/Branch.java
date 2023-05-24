package com.example.Bank.Banker.model.pojo;
public class Branch {

	private String ifsc;
	private String bankName;
	private int pincode;
	private String city;

	public Branch() {
		super();
	}

	public Branch(String branchId, String bankName, int pincode, String city) {
		super();
		this.ifsc = branchId;
		this.bankName = bankName;
		this.pincode = pincode;
		this.city = city;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}
