package com.springtraining.jms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * Class handles incoming messages
 * 
 * @see PointOfIssueMessageEvent
 */
public class BasicJMSChat implements MessageListener {

	private JmsTemplate chatJMSTemplate;
	private Topic chatTopic ;
	private static String userId;
	
	/**
	 * @param args
	 * @throws JMSException
	 * @throws IOException
	 */
	public static void main(String[] args) throws JMSException, IOException {
		
		if (args.length != 1) {
			System.out.println("User Name is required....");
		} else {
			userId = args[0];
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"com/springtraining/jms/spring-config.xml");

			BasicJMSChat basicJMSChat = (BasicJMSChat) ctx
					.getBean("basicJMSChat");
			TopicConnectionFactory topicConnectionFactory = (TopicConnectionFactory) basicJMSChat.chatJMSTemplate
					.getConnectionFactory();
			TopicConnection tc = topicConnectionFactory.createTopicConnection();

			basicJMSChat.publish(tc,  basicJMSChat.chatTopic, userId);
			basicJMSChat.subscribe(tc,  basicJMSChat.chatTopic, basicJMSChat);
		}
	}

	/**
	 * @param topicConnection
	 * @param chatTopic
	 * @param commandLineChat
	 * @throws JMSException
	 */
	void subscribe(TopicConnection topicConnection, Topic chatTopic,
			BasicJMSChat commandLineChat) throws JMSException {
		TopicSession tsession = topicConnection.createTopicSession(false,
				Session.AUTO_ACKNOWLEDGE);
		TopicSubscriber ts = tsession.createSubscriber(chatTopic);
		ts.setMessageListener(commandLineChat);
	}

	/**
	 * @param topicConnection
	 * @param chatTopic
	 * @param userId
	 * @throws JMSException
	 * @throws IOException
	 */
	void publish(TopicConnection topicConnection, Topic chatTopic, String userId)
			throws JMSException, IOException {
		TopicSession tsession = topicConnection.createTopicSession(false,
				Session.AUTO_ACKNOWLEDGE);
		TopicPublisher topicPublisher = tsession.createPublisher(chatTopic);
		topicConnection.start();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			String msgToSend = reader.readLine();
			if (msgToSend.equalsIgnoreCase("exit")) {
				topicConnection.close();
				System.exit(0);
			} else {

				TextMessage msg = (TextMessage) tsession.createTextMessage();
				msg.setText("\n["+userId + " : " + msgToSend+"]");
				topicPublisher.publish(msg);
			}
		}
	}

	/* (non-Javadoc)
	 * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
	 */
	public void onMessage(Message message) {

		/* The message must be of type TextMessage */
		if (message instanceof TextMessage) {
			try {
				String msgText = ((TextMessage) message).getText();
				//Avoid echo
				if(!msgText.startsWith("["+userId))
				System.out.println(msgText);

			} catch (JMSException jmsEx_p) {
				String errMsg = "An error occurred extracting message";
				jmsEx_p.printStackTrace();
			}
		} else {
			String errMsg = "Message is not of expected type TextMessage";
			System.err.println(errMsg);
			throw new RuntimeException(errMsg);
		}
	}

	public JmsTemplate getChatJMSTemplate() {
		return chatJMSTemplate;
	}

	public void setChatJMSTemplate(JmsTemplate chatJMSTemplate) {
		this.chatJMSTemplate = chatJMSTemplate;
	}

	public Topic getChatTopic() {
		return chatTopic;
	}

	public void setChatTopic(Topic chatTopic) {
		this.chatTopic = chatTopic;
	}
}
