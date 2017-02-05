package com.springtraining.beanref;

public class Payment {
	
	private SavingsAccount savingsAccount;
	
	public Payment() {
		super();
	}

	public Payment(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	
	
	public void pay()
	{
		
		System.out.println("Payment processed for the account no: "+this.savingsAccount.getDetails());
	}
	

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	

}
