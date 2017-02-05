package com.springtraining.springaop.proxy2.interfaced;

public class CurrentAccount implements Account{

	private String accountNumber;

	public CurrentAccount() {
		this.accountNumber = "Y6789";
	}

	public CurrentAccount(String s) {
		this.accountNumber = s;
	}

	public String getDetails() {
		return this.accountNumber;
	}

}
