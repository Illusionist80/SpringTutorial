package com.springtraining.springaop.types2;


import org.springframework.aop.ThrowsAdvice;

public class InsertThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("InsertThrowException : Throw exception inserted!");
	}
}