package com.springtraining.springaop.proxy2.interfaced;

/**
 * Dynamic proxy class which implements the interfaces of the target 
 * object.This proxy wraps the target class, perform the advice 
 * functionality and then invokes target method
 * 
 */
public class SavingsAccountProxy implements Account {

	public SavingsAccountProxy() {
		super();
		System.out.println("SavingsAccountProxy() called.");
	}

	private SavingsAccount savingsAccount;

	public String getDetails() {
		// Call Advice
		new AuditAdvice().auditAdvice();
		// Call the wrapped target class
		return this.savingsAccount.getDetails();
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

}
