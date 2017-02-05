package com.springtraining.scope;

import java.util.Date;

public class HelloWorld {

	private String message;
	
	private Date date;
	
	private static int count=0;

	public HelloWorld() {
		System.out.println("HelloWorld() called");
		count++;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		HelloWorld.count = count;
	}
}
