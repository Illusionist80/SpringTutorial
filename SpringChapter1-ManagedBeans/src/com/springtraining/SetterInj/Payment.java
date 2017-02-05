package com.springtraining.SetterInj;

public class Payment {
	
	private SavingsAccount savingsAccount;
	
	
	public Payment() {
		super();
		System.out.println("Payment() called");
	}


	public Payment(SavingsAccount savingsAccount) {
		super();
		this.savingsAccount = savingsAccount;
		System.out.println("Payment(savingsAccount) called");
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
