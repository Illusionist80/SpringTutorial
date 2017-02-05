package com.springtraining.jms;

import javax.jms.JMSException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJmsAsynchronousMessageTest {
	public static void main(String[] args) throws JMSException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"com/springtraining/jms/spring-config.xml"});

		SpringMessageSender testMessageSender = (SpringMessageSender) context.getBean("testMessageSender");
		
		testMessageSender.sendMessage("HHHHHHHHHHHHHHHHHHHHHHHHHH");
	}
}