package com.springtraining.springaop.proxy2.interfaced;

public class SavingsAccount implements Account{

	private String accountNumber;

	public SavingsAccount() {
		System.out.println("SavingsAccount() called.");
		this.accountNumber = "X1234";
	}

	public SavingsAccount(String s) {
		this.accountNumber = s;
	}

	public String getDetails() {
		System.out.println("SavingsAccount :getDetails() called : "+accountNumber);
		return this.accountNumber;
	}
}
