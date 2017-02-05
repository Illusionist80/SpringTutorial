package com.springtraining.propertyplaceholder;

public class Payment {
	
	private SavingsAccount savingsAccount;
	private StaticPaymentDBService staticPaymentDBService;
	
	public Payment(SavingsAccount savingsAccount) {
		super();
		this.savingsAccount = savingsAccount;
	}
	
	
	public void pay()
	{
		staticPaymentDBService.executeSql(this.savingsAccount.getDetails());
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
