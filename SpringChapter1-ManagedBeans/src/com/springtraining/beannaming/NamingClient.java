package com.springtraining.beannaming;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NamingClient {

	
	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/beannaming/beans-xsd.xml");
      Payment pmt=(Payment) ctx.getBean("externalPaymentServce");
      pmt.pay();
	}

}
