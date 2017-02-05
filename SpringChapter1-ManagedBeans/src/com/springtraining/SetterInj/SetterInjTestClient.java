package com.springtraining.SetterInj;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjTestClient {

	
	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/SetterInj/beans-xsd.xml");
      //Payment pmt=(Payment) ctx.getBean("pmnt");
      //pmt.pay();
      ctx.registerShutdownHook();
	}
}
