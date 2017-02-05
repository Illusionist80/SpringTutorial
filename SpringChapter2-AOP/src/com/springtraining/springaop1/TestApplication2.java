package com.springtraining.springaop1;

public class TestApplication2 {

	public void testMethod(String s) {
		System.out
				.println("app2 method1 used for advice weaving before and after it.");
	}

	public void testMethod1() {

		System.out
				.println("app2 method2 used for advice weaving before and after it.");

	}
}
