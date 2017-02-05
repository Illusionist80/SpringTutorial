package com.springtraining.methodreplacement;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class SecurePaymentReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		Payment payment=(Payment)arg0;
		System.out.println("****Secure*****Payment processed for the account no: "+payment.getSavingsAccount().getDetails());
		
		return true;
	}
	
	

}
