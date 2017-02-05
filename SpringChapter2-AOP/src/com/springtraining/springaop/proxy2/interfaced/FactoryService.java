package com.springtraining.springaop.proxy2.interfaced;

public class FactoryService {

  public Object getBean(String beanType){
	  
	  if(beanType.equals("savingsAccount")){
		  //Create savings account
		  SavingsAccount sa=new SavingsAccount();
		  
		  //Create savings account proxy
		  SavingsAccountProxy saProxy=new SavingsAccountProxy();
		  //wrap target object in proxy
		  saProxy.setSavingsAccount(sa);
		  //Return Proxy
		  return saProxy;
	  }
	  if(beanType.equals("currentAccount")){
		  return new CurrentAccount();
	  }
	return null;
  }	

}
