package com.springtraining.annotatedjavaconfigbaseddi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyJavaConfig {
	private @Value("${jdbc.url}") String url;
	private @Value("${jdbc.username}") String username;
	private @Value("${jdbc.password}") String pasword;
	private @Value("${jdbc.driverClass}") String driverClass;
	
	@Bean
	public PaymentDBService paymentDBService(){
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("pasword : "+pasword);
		System.out.println("driverClass : "+driverClass);
		return new PaymentDBService();
	}
}
