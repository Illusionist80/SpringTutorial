package com.springtraining.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTestClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springtraining/autowire/beans-xsd.xml");
		Payment pmt = (Payment) ctx.getBean("pmnt");
		pmt.pay();
	}

}
