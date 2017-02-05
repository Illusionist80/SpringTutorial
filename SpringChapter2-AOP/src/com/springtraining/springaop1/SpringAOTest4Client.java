package com.springtraining.springaop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOTest4Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springtraining/springaop1/spring-aop-config.xml");

		TestApplication testApplication = (TestApplication) context.getBean("testApp1");
		testApplication.testMethod();
		
		TestApplication2 testApplication2 = (TestApplication2) context.getBean("testApp2");
		testApplication2.testMethod("s");
		testApplication2.testMethod1();
	}
}