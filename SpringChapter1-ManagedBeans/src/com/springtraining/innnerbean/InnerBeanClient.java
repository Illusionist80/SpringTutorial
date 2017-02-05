package com.springtraining.innnerbean;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanClient {

	
	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/innnerbean/beans-xsd.xml");
      Payment pmt=(Payment) ctx.getBean("pmnt");
      pmt.pay();
	}

}
