package com.springtraining.springaop2.annotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOTest5Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springtraining/springaop2/annotated/spring-aop-config.xml");

		TestApplication testApplication = (TestApplication) context.getBean("testApp1");
		System.out.println("*********************");
		testApplication.testMethod();
		System.out.println("*********************");
		testApplication.testMethod1();
		System.out.println("*********************");
		testApplication.testRandomName();
		System.out.println("*********************");
		testApplication.testRandomName2("qaz");
		System.out.println("*********************");
	}
}