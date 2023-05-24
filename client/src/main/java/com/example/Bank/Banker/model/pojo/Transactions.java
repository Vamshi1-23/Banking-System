package com.example.Bank.Banker.model.pojo;

import java.time.LocalDate;

public class Transactions {
	private String transId;
	private String transType;
	private double amount;
	private Account accNo;
	private LocalDate tansdate;
	private Integer acc;
	
	public Integer getAcc() {
		return acc;
	}

	public void setAcc(Integer acc) {
		this.acc = acc;
	}

	public Transactions(String transId, String transType, Account accId,double amount, LocalDate tansdate) {
		super();
		this.transId = transId;
		this.transType = transType;
		this.accNo = accId;
		this.amount=amount;
		this.tansdate = tansdate;
	}

	public LocalDate getTansdate() {
		return tansdate;
	}

	public void setTansdate(LocalDate tansdate) {
		this.tansdate = tansdate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Transactions() {
		super();

	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Account getAccNo() {
		return accNo;
	}

	public void setAccNo(Account accNo) {
		this.accNo = accNo;
	}


}
