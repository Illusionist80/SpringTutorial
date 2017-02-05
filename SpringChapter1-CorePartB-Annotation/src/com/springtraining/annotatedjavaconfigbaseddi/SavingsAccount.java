package com.springtraining.annotatedjavaconfigbaseddi;

import java.util.Date;

public class SavingsAccount{
	
	private int accountNumber;
	private String accountName;
	private Date dob;
	
	
	public SavingsAccount() {
		super();
		System.out.println("SavingsAccount() called");
	}


	public SavingsAccount(int accountNumber, String accountName, Date dob) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.dob = dob;
		System.out.println("SavingsAccount(int accountNumber, String accountName, Date dob) called");
	}


	public String getDetails()
	{
		
		return this.accountNumber+" - "+this.accountName+" - "+this.dob ;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
		System.out.println("setAccountName(String accountName)");
	}

    
	public Date getDob() {
		return dob;
	}

	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void customInit(){
		
		System.out.println("customInit() called");
	}
	
	public void cleanup(){
		
		System.out.println("cleanup() called");
	}
	
}
