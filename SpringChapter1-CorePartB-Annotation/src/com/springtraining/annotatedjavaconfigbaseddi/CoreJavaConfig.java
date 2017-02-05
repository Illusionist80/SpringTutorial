package com.springtraining.annotatedjavaconfigbaseddi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DependencyJavaConfig.class)
@ImportResource("classpath:/com/springtraining/annotatedjavaconfigbaseddi/spring-annotationconfig.xml")
public class CoreJavaConfig {
	
	private @Autowired PaymentDBService paymentDBService;
	
	@Bean(name={"pmnt","payment","dummypayment"})
	@Scope("prototype")
	public Payment pmnt1(){
		
		return new Payment(savingsAccount(),paymentDBService);
	}
	
	@Bean(initMethod="customInit", destroyMethod="cleanup")
	public SavingsAccount savingsAccount(){
		
		return new SavingsAccount(12345,"accName", new Date());
	}

}
