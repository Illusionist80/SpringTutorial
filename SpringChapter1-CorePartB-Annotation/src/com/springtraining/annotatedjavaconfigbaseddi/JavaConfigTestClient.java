package com.springtraining.annotatedjavaconfigbaseddi;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigTestClient {

	
	public static void main(String[] args) {

	 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(CoreJavaConfig.class);

		Payment pmt=(Payment) ctx.getBean("dummypayment");
      pmt.pay();
      ctx.registerShutdownHook();
	}
}
