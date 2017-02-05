package com.springtraining.springaop.proxy1.subclass;

import com.springtraining.springaop.svc.PaymentService;

/**
 * Using CGLIB Spring generates a subclass of the target class 
 * and binds the advice and finally propagates method 
 * call to target class.
 */
public class PaymentServiceProxy extends PaymentService {
	public PaymentServiceProxy() {
		System.out.println("PaymentServiceProxy() called");
	}

	public String getS1() {

		System.out.println("PaymentServiceProxy: getS1() called");
		// Call Advice
		new AuditAdvice().auditAdvice();
		// Call parent method
		return super.getS1();
	}
}
