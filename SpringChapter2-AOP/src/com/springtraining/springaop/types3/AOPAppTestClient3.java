package com.springtraining.springaop.types3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPAppTestClient3 {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "com/springtraining/springaop/types3/Spring-Customer.xml" });

		CustomerService cust = (CustomerService) appContext
				.getBean("customerServiceProxy");//Try customerService

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