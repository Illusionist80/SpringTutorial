package com.springtraining.multipleconfigs;

public class Payment {
	
	private SavingsAccount savingsAccount;
	
	
	public Payment(SavingsAccount savingsAccount) {
		super();
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
