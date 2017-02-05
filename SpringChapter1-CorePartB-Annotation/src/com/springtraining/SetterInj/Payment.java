package com.springtraining.SetterInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
@Service("pmnt")
@Scope("prototype")
public class Payment {
	@Autowired
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

	public void setSavingsAccount(SavingsAccount sa) {
		System.out.println("setSavingsAccount(SavingsAccount sa) called");
		this.savingsAccount = sa;
	}
	

}
