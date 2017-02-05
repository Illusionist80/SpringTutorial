package com.springtraining.springaop.types2;


import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class InsertAfterMethod implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("InsertAfterMethod : After method inserted!");
	}
}