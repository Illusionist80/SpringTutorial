package com.springtraining.constructorInj;

import java.util.Date;

public class SavingsAccount {
	
	private int accountNumber;
	private String accountName;
	private Date dob;

	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int accountNumber,String accountNname) {
		this.accountNumber = accountNumber;
		this.accountName = accountNname;
	}
	public SavingsAccount(int accountNumber,String accountNname,Date dob) {
		this.accountNumber = accountNumber;
		this.accountName = accountNname;
		this.dob = dob;
	}

	
	public String getDetails()
	{
		
		return this.accountNumber+" - "+this.accountName+" - "+this.dob ;
	}

}
