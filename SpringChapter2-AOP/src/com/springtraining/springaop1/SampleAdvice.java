package com.springtraining.springaop1;

public class SampleAdvice {

	public void insertBefore() {
		System.out.println("Inserted before method execution");
	}

	public void insertAfter() {
		System.out.println("Inserted after method execution\n\n");
	}
}
