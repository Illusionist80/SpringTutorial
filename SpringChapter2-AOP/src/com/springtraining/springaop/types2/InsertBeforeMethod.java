package com.springtraining.springaop.types2;


import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class InsertBeforeMethod implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("InsertBeforeMethod : Before method inserted!");
	}
}