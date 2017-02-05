package com.springtraining.instatitation;

public class StaticVsInstanceTest {

	private String instanceVar="XYZ";
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StaticVsInstanceTest.validateDate();
		
		StaticVsInstanceTest sit=new StaticVsInstanceTest();
		
		
		sit.validateUserData();
	}
    //STATIC METHOD
	private static boolean validateDate(){
		System.out.println("static validateDate() called");
		return true;	
	}
	//INSTANCE METHOD
	private boolean validateUserData(){
		System.out.println("validateUserData() called : "+instanceVar);
		return true;	
	}
	
}
