package com.springtraining.constructorInj;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjTestClient {

	
	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/constructorInj/beans-xsd.xml");
      Payment pmt=(Payment) ctx.getBean("pmnt");
      pmt.pay();
	}

}
