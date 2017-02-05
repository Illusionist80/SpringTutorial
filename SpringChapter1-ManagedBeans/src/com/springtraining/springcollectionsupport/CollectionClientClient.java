package com.springtraining.springcollectionsupport;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionClientClient {

	
	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/springcollectionsupport/mergecollbeans-xsd.xml");
      Customer cust=(Customer) ctx.getBean("mergeTest");
      System.out.println(cust);
	}

}
