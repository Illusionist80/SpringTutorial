package com.springtraining.instatitation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiationTestClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springtraining/instatitation/beans-xsd.xml");
		Payment pmt = (Payment) ctx.getBean("pmnt");
		pmt.pay();
	}

}
