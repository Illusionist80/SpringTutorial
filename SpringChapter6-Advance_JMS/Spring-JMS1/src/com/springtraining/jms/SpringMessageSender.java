package com.springtraining.jms;

import javax.jms.JMSException;
import javax.jms.Queue;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * The TestMessageSender class uses the injected JMSTemplate to send a message
 * to a specified Queue. In our case we're sending messages to 'TestQueueTwo'
 */
@Service
public class SpringMessageSender
{
	private JmsTemplate jmsTemplate_i;
	private Queue testQueue_i;
	/**
	 * Sends message using JMS Template.
	 *
	 * @param message_p the message_p
	 * @throws JMSException the jMS exception
	 */
	public void sendMessage(String message_p) throws JMSException
	{
		System.out.println("About to put message on queue. Queue[" + testQueue_i.toString() + "] Message[" + message_p + "]");
		jmsTemplate_i.convertAndSend(testQueue_i, message_p);
	}

	/**
	 * Sets the jms template.
	 *
	 * @param template the jms template
	 */
	public void setJmsTemplate(JmsTemplate tmpl)
	{
		this.jmsTemplate_i = tmpl;
	}

	/**
	 * Sets the test queue.
	 *
	 * @param queue the new test queue
	 */
	public void setTestQueue(Queue queue)
	{
		this.testQueue_i = queue;
	}
}