package com.springtraining.annotatedjavaconfigbaseddi;

import java.util.Properties;

public class PaymentDBService {
	
   private Properties dbConnectioInfo;

	
	
	public PaymentDBService() {
		super();
		System.out.println("PaymentDBService() called");
	}

	public boolean executeSql(String param)
	{
		
		System.out.println("Payment Request Sent to DB : "+param);
		return true;
	}

	public Properties getDbConnectioInfo() {
		return dbConnectioInfo;
	}

	public void setDbConnectioInfo(Properties dbConnectioInfo) {
		this.dbConnectioInfo = dbConnectioInfo;
	}
	
}
