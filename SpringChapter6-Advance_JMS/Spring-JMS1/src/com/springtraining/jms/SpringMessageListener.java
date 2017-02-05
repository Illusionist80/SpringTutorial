
package com.springtraining.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Class handles incoming messages
 *
 * @see PointOfIssueMessageEvent
 */
public class SpringMessageListener implements MessageListener
{

	private SpringMessageSender messageSender_i;


	/**
	 * Method implements JMS onMessage and acts as the entry
	 * point for messages consumed by Springs DefaultMessageListenerContainer.
	 * When DefaultMessageListenerContainer picks a message from the queue it
	 * invokes this method with the message payload.
	 */
	public void onMessage(Message message)
	{
		System.out.println("Received message from queue [" + message +"]");

		/* The message must be of type TextMessage */
		if (message instanceof TextMessage)
		{
			try
			{
				String msgText = ((TextMessage) message).getText();
				System.out.println("About to process message: " + msgText);

				/* call message sender to put message back to the queue */
				//messageSender_i.sendMessage(msgText);
				System.out.println("Processed message!");

			}
			catch (JMSException jmsEx_p)
			{
				String errMsg = "An error occurred extracting message";
				jmsEx_p.printStackTrace();
			}
		}
		else
		{
			String errMsg = "Message is not of expected type TextMessage";
			System.err.println(errMsg);
			throw new RuntimeException(errMsg);
		}
	}

	/**
	 * Sets the message sender.
	 *
	 * @param messageSender_p the new message sender
	 */
	public void setTestMessageSender(SpringMessageSender messageSender_p)
	{
		this.messageSender_i = messageSender_p;
	}
}
