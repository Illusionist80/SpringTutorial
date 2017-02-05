package com.springtraining.springaop.svc;

public class StatementService {
	
	private String s6;
	
	public StatementService() {
		System.out.println("StatementService() called");
	}
	public String getS6() {
		
		System.out.println("getS6() called");
		return s6;
	}

	public void setS6(String s6) {
		System.out.println("setS6() called");
		this.s6 = s6;
	}
	
}
