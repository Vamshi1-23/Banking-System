package com.example.Bank.Banker.model.pojo;


public class Account {
	private int accNo;
	private double balance;

	public Account(int accId, double balance) {
		super();
		this.accNo = accId;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accId) {
		this.accNo = accId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}
