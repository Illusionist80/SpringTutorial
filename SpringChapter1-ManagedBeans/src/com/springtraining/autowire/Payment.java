package com.springtraining.autowire;

public class Payment {
	
	private SavingsAccount savingsAccount;
	private StaticPaymentDBService staticPaymentDBService;
	
	public Payment(SavingsAccount savingsAccount) {
		super();
		this.savingsAccount = savingsAccount;
	}
	
	/**
	 * This method will do the payment
	 */
	public void pay()
	{
		//This code makes a call to DB and executes SQL statement
		staticPaymentDBService.executeSql(this.savingsAccount.getDetails());
		
		/*This code makes a call to DB and executes SQL statement*/
		System.out.println("Payment processed for the account no: "+this.savingsAccount.getDetails());
	}
	

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}


	public StaticPaymentDBService getStaticPaymentDBService() {
		return staticPaymentDBService;
	}

	public void setStaticPaymentDBService(
			StaticPaymentDBService staticPaymentDBService) {
		this.staticPaymentDBService = staticPaymentDBService;
	}
	
}
