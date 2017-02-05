package com.springtraining.springaop.proxy2.interfaced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtraining.springaop.svc.PaymentService;
import com.springtraining.springaop.svc.StatementService;

public class SpringAOPProxyTest9Client {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/springtraining/springaop4/annotatedpointcut/spring-aop-config.xml");
		FactoryService factoryService= new FactoryService();
		
//		SavingsAccount savingsAccount = (SavingsAccount) context.getBean("savingsAccount");
		Account savingsAccount = (Account) factoryService.getBean("savingsAccount");
		
		System.out.println("*********************");
		savingsAccount.getDetails();
		System.out.println("*********************");
		
		
	}
}