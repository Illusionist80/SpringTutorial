package com.springtraining.springaop.types2;

public class CustomerService {

	private String name;
	private String id;

	public void setName(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("Customer name : " + this.name);
	}

	public void printId() {
		System.out.println("Customer ID : " + this.id);
	}

	public void setId(String id) {
		this.id = id;
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}