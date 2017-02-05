package com.springtraining.springaop4.annotatedpointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.springtraining.springaop.svc.PaymentService;
import com.springtraining.springaop.svc.StatementService;

@Aspect
public class LoggingAdvice {

	// logging is applicable to all methods of the package
	@After("allAppMethodswithin()")
	// Try allAppMethodswithin
	public void loggingAdvice(JoinPoint jp) {
		
		System.out.println("JoinPoint  -> " + jp.toString());
		
		System.out.println("Target  -> " + jp.getTarget());
		
		if (jp.getTarget() instanceof StatementService) {
			System.out
					.println("logging code inserted after StatementService method execution");
		} else if (jp.getTarget() instanceof PaymentService) {
			System.out
					.println("logging code inserted after PaymentService method execution");
		}

	}

	// audit is applicable to all methods of the package
	@Before("allAppMethodswithin()")
	public void auditAdvice() {
		System.out.println("audit code inserted before method execution");
	}

	@Pointcut("within(com.springtraining.springaop.svc..*)")
	public void allAppMethodswithin() {
	}
}
