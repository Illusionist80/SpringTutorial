package com.springtraining.scope;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTestClient {

	
	public static void main(String[] args) throws InterruptedException {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/springtraining/scope/beans-xsd.xml");
      //Thread.sleep(2000);
      
      HelloWorld prototypeScopeBean1=(HelloWorld) ctx.getBean("prototypeScopeBean");
      System.out.println(prototypeScopeBean1);
      prototypeScopeBean1.setMessage("prototypeScopeBean1 msg");
      System.out.println(prototypeScopeBean1.getCount());
      System.out.println(prototypeScopeBean1.getMessage());
      System.out.println("*********************");   
      
      HelloWorld prototypeScopeBean2=(HelloWorld) ctx.getBean("prototypeScopeBean");
      System.out.println(prototypeScopeBean2);
      //prototypeScopeBean2.setMessage("prototypeScopeBean2 msg");
      System.out.println(prototypeScopeBean2.getCount());
      System.out.println(prototypeScopeBean2.getMessage());
      System.out.println("*********************");
      
      HelloWorld singletonScopeBean1=(HelloWorld) ctx.getBean("singletonScopeBean");
      System.out.println(singletonScopeBean1);
      singletonScopeBean1.setMessage("singletonScopeBean1 msg");
      System.out.println(singletonScopeBean1.getCount());
      System.out.println(singletonScopeBean1.getMessage());
      System.out.println("*********************");
      HelloWorld singletonScopeBean2=(HelloWorld) ctx.getBean("singletonScopeBean");
      System.out.println(singletonScopeBean2);
      //singletonScopeBean2.setMessage("singletonScopeBean2 msg");
      System.out.println(singletonScopeBean2.getCount());
      System.out.println(singletonScopeBean2.getMessage());
	}

}
