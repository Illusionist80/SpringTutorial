package com.springtraining.methodreplacement;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodReplacementtestClient {

	
	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/methodreplacement/beans-xsd.xml");
      Payment pmt=(Payment) ctx.getBean("pmnt");
      pmt.pay();
	}

}
