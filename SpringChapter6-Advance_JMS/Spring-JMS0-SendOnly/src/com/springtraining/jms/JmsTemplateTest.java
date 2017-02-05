package com.springtraining.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;


public class JmsTemplateTest {

    public static void main(String[] args) throws Exception {


        ApplicationContext ctx = new ClassPathXmlApplicationContext(
          "com/springtraining/jms/JmsTemplateTest-context.xml");
        JmsTemplate template = (JmsTemplate) ctx.getBean("jmsTemplate");
        
       // for(int i=0; i<10; i++) {
            template.send("SpringSendTestQueue", new MessageCreator() {
                public Message createMessage(Session session)
                    throws JMSException {
                    TextMessage tm = session.createTextMessage();
                    tm.setText("This is a spring test message");
                    return tm;
                }
            });
            System.out.println("Message sent");
       // }
        System.exit(1);
    }
}