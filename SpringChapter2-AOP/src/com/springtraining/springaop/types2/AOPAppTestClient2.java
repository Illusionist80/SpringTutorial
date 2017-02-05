package com.springtraining.springaop.types2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPAppTestClient2 {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "com/springtraining/springaop/types2/Spring-Customer.xml" });

		CustomerService cust = (CustomerService) appContext
				.getBean("customerServiceProxy");

		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printId();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {

		}
	}
}