package com.springtraining.SetterInj;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SavingsAccount implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware , BeanPostProcessor{
	
	private int accountNumber;
	private String accountName;
	private Date dob;
	
	private ApplicationContext ctxIns;

	
	public SavingsAccount() {
		super();
		System.out.println("SavingsAccount() called");
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
	
	public void customInit() {
		this.accountNumber=1111111;
		System.out.println("CustomInit() called");
	}
	public void cleanup() {
		System.out.println("cleanup() called");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() called");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() called");
	}


	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		System.out.println("setApplicationContext called:"+ctx);
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		this.ctxIns=ctx;
	}


	@Override
	public void setBeanName(String beanName) {
		
		System.out.println("setBeanName called -> "+beanName );
		
	}


	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessAfterInitialization called -> "+arg0 );
		return arg0;
	}


	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization called -> "+arg0 );
		return arg0;
	}
}
