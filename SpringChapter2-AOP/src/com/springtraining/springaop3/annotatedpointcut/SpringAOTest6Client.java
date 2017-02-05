package com.springtraining.springaop3.annotatedpointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtraining.springaop.svc.PaymentService;
import com.springtraining.springaop.svc.StatementService;

public class SpringAOTest6Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springtraining/springaop3/annotatedpointcut/spring-aop-config.xml");

		PaymentService paymentService = (PaymentService) context.getBean("paymentService");
		System.out.println("*********************");
		paymentService.getS1();
		System.out.println("*********************");
		paymentService.getS2();
		System.out.println("*********************");
		paymentService.getS3();
		System.out.println("*********************");
		paymentService.getS4();
		System.out.println("*********************");
		paymentService.getS5();
		System.out.println("*********************");
		System.out.println("*********************");
		paymentService.setS1("");
		System.out.println("*********************");
		paymentService.setS2("");
		System.out.println("*********************");
		paymentService.setS3("");
		System.out.println("*********************");
		paymentService.setS4("");
		System.out.println("*********************");
		paymentService.setS5("");
		System.out.println("*********************");
		
		
		StatementService statementService = (StatementService) context.getBean("statementService");
		System.out.println("*********************");
		statementService.getS6();
		statementService.setS6("");
		System.out.println("*********************");
		
	}
}