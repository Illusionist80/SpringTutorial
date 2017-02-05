package com.springtraining.springaop.proxy1.subclass;

import com.springtraining.springaop.svc.PaymentService;
import com.springtraining.springaop.svc.StatementService;

public class FactoryService {

  public Object getBean(String beanType){
	  
	  if(beanType.equals("paymentService")){
		  return new PaymentServiceProxy();//PaymentServiceProxy
	  }
	  if(beanType.equals("statementService")){
		  return new StatementService();
	  }
	return null;
  }	

}
