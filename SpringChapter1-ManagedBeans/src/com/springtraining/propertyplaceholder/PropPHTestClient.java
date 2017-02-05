package com.springtraining.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropPHTestClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springtraining/propertyplaceholder/beans-xsd.xml");
		Payment pmt = (Payment) ctx.getBean("pmnt");
		pmt.pay();
	}

}
