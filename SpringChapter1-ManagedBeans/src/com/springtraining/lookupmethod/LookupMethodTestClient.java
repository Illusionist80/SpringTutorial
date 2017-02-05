package com.springtraining.lookupmethod;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupMethodTestClient {

	
	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/lookupmethod/beans-xsd.xml");
      Payment pmt=(Payment) ctx.getBean("pmnt");
      System.out.println(pmt.getAccount());
	}

}
