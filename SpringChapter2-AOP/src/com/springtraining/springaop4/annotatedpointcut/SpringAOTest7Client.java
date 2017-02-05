package com.springtraining.springaop4.annotatedpointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtraining.springaop.svc.PaymentService;
import com.springtraining.springaop.svc.StatementService;

public class SpringAOTest7Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springtraining/springaop4/annotatedpointcut/spring-aop-config.xml");

		PaymentService paymentService = (PaymentService) context.getBean("paymentService");
		System.out.println("*********************");
		paymentService.getS1();
		System.out.println("*********************");
		
		StatementService statementService = (StatementService) context.getBean("statementService");
		System.out.println("*********************");
		statementService.setS6("");
		System.out.println("*********************");
		
	}
}