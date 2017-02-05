package com.springtraining.propertyplaceholder;

import java.util.Properties;

public class StaticPaymentDBService {
	
   private Properties dbConnectioInfo;

	
	
	public StaticPaymentDBService() {
		super();
	}

	public boolean executeSql(String param)
	{
		
		System.out.println(dbConnectioInfo);
		System.out.println(dbConnectioInfo.keySet());
		System.out.println(dbConnectioInfo.values());
		System.out.println("Connection made....");
		
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
