package com.springtraining.springaop.types1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InsertAroundMethod implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Method name : "
				+ methodInvocation.getMethod().getName());

		// same with MethodBeforeAdvice
		System.out.println("InsertAroundMethod : Before method inserted!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println("InsertAroundMethod : after method inserted!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out
					.println("InsertAroundMethod : Throw exception inserted!");
			throw e;
		}
	}
}