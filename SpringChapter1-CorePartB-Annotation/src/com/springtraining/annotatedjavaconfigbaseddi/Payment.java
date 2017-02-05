package com.springtraining.annotatedjavaconfigbaseddi;

public class Payment {

	private SavingsAccount savingsAccount;
	
	private PaymentDBService pmntDbService;
	

	public Payment() {
		super();
		System.out.println("Payment() called");
	}

	
	public Payment(SavingsAccount savingsAccount) {
		super();
		this.savingsAccount = savingsAccount;
		System.out.println("Payment(savingsAccount) called");
	}
	
	public Payment(SavingsAccount savingsAccount,PaymentDBService pmntDbService) {
		super();
		this.savingsAccount = savingsAccount;
		this.pmntDbService = pmntDbService;
		System.out.println("Payment(SavingsAccount savingsAccount,PaymentDBService pmntDbService) called");
	}
	
	
	
	public void pay()
	{
		pmntDbService.executeSql(this.savingsAccount.getDetails());
		System.out.println("Payment processed for the account no: "+this.savingsAccount.getDetails());
	}
	

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount sa) {
		System.out.println("setSavingsAccount(SavingsAccount sa) called");
		this.savingsAccount = sa;
	}
	public PaymentDBService getPmntDbService() {
		return pmntDbService;
	}

	public void setPmntDbService(PaymentDBService pmntDbService) {
		this.pmntDbService = pmntDbService;
	}

}
