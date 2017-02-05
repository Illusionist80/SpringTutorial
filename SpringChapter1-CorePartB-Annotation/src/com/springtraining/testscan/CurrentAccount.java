package com.springtraining.testscan;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;

import com.springtraining.SetterInj.Account;
@Controller
public class CurrentAccount implements Account{
	
	private int accountNumber;
	private String accountName;
	private Date dob;
	
	
	public CurrentAccount() {
		super();
		System.out.println("CurrentAccount() called");
	}


	public String getDetails()
	{
		
		return this.accountNumber+" - "+this.accountName+" - "+this.dob ;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
		System.out.println("setAccountName(String accountName)");
	}

    
	public Date getDob() {
		return dob;
	}

	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@PostConstruct
	public void customInit(){
		
		System.out.println("customInit() called");
	}
	
	@PreDestroy
	public void cleanup(){
		
		System.out.println("cleanup() called");
	}
	
}
