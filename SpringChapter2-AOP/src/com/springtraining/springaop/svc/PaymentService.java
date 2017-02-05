package com.springtraining.springaop.svc;

public class PaymentService {
	
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;
	
	
	public PaymentService() {
		System.out.println("PaymentService() called");
	}

	public String getS1() {
		
		System.out.println("PaymentService : getS1() called");
		return s1;
	}

	public String getS2() {
		
		System.out.println("getS2() called");
		return s2;
	}

	public String getS3() {
		
		System.out.println("getS3() called");
		return s3;
	}

	public String getS4() {
		
		System.out.println("getS4() called");
		return s4;
	}

	public String getS5() {
		
		System.out.println("getS5() called");
		return s5;
	}

	public void setS1(String s1) {
		System.out.println("setS1() called");
		this.s1 = s1;
	}

	public void setS2(String s2) {
		System.out.println("setS2() called");
		this.s2 = s2;
	}

	public void setS3(String s3) {
		System.out.println("setS3() called");
		this.s3 = s3;
	}

	public void setS4(String s4) {
		System.out.println("setS4() called");
		this.s4 = s4;
	}

	public void setS5(String s5) {
		System.out.println("setS5() called");
		this.s5 = s5;
	}
	
}
