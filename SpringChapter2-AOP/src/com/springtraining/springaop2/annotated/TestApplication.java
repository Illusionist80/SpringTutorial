package com.springtraining.springaop2.annotated;

public class TestApplication {
	
	public void testMethod(){
		
	System.out.println("testMethod() used for advice weaving before and after it.");
	
	}
	
	public void testMethod1(){
		
	System.out.println("testMethod1() used for advice weaving before and after it.");
	
	}
	
	public void testRandomName(){
		
	System.out.println("testRandomName() used for advice weaving before and after it.");
	
	}
	
	
	public void testRandomName2(String param){
		
	System.out.println("testRandomName2() used for advice weaving before and after it.");
	
	}
}
