package com.springtraining.springaop.proxy1.subclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtraining.springaop.svc.PaymentService;
import com.springtraining.springaop.svc.StatementService;

public class SpringAOPProxyTest8Client {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/springtraining/springaop4/annotatedpointcut/spring-aop-config.xml");
		FactoryService factoryService= new FactoryService();
		
//		PaymentService paymentService = (PaymentService) context.getBean("paymentService");
		PaymentService paymentService = (PaymentService) factoryService.getBean("paymentService");
		
		System.out.println("*********************");
		paymentService.getS1();
		System.out.println("*********************");
		
		
	}
}