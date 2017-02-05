package com.springtraining.multipleconfigs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MutipleConfigTestClient {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext ctxStatic = new ClassPathXmlApplicationContext(
		"com/springtraining/multipleconfigs/staticbeans.xml");
		
		ClassPathXmlApplicationContext ctxMain = new ClassPathXmlApplicationContext(
		new String[]{"com/springtraining/multipleconfigs/projectConfig.xml"},ctxStatic);

		Payment pmt = (Payment) ctxMain.getBean("pmnt");
		pmt.pay();
	}

}
