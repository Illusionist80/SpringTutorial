package com.springtraining.springaop2.annotated;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAdvice {
	
	@After("execution(public * test*(..)) ")
	public void loggingAdvice() {
		System.out.println("logging code inserted after method execution");
	}
	
	@Before("execution(* testMethod*()) ")
	public void securityAdvice() {
		System.out.println("security code inserted before method execution");
	}
}
