package com.springtraining.springaop3.annotatedpointcut;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAdvice {
	
	//logging is applicable to all methods of the class
	@After("allAppMethods()") //Try allAppMethodswithin
	public void loggingAdvice() {
		System.out.println("logging code inserted after method execution");
	}
	
	//audit is applicable only to all getters
	@Before("allGetter()")
	public void auditAdvice() {
		System.out.println("audit code inserted before method execution");
	}
	
	@Pointcut("execution(public * get*(..)) ")
	public void allGetter(){}
	
	@Pointcut("execution(public * com.springtraining.springaop.svc.PaymentService.*(..))*")
	public void allAppMethods(){}
	
//	@Pointcut("within(com.springtraining.springaop.svc..*)")
//	public void allAppMethodswithin(){}
}
