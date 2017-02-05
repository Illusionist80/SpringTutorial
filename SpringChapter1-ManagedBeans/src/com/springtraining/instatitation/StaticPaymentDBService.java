package com.springtraining.instatitation;

public class StaticPaymentDBService {
	
	private static StaticPaymentDBService staticPaymentDBService= new StaticPaymentDBService();
	
	
	public StaticPaymentDBService createInstance() {
		return staticPaymentDBService;
	}
	
	
	public boolean executeSql(String param)
	{
		
		System.out.println("Payment Request Sent to DB : "+param);
		return true;
	}
	
}
