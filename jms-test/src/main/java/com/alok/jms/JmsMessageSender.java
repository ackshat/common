package com.alok.jms;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
 
@Service
public class JmsMessageSender {
 
  @Autowired
  private JmsTemplate jmsTemplate;
  
  
   
  public JmsTemplate getJmsTemplate() {
	return jmsTemplate;
}

public void setJmsTemplate(JmsTemplate jmsTemplate) {
	this.jmsTemplate = jmsTemplate;
}

/**
   * send text to default destination
   * @param 
   */
  public void send(final TestMessage testMessage) {
     
    this.jmsTemplate.send(new MessageCreator() {
      public Message createMessage(Session session) throws JMSException {
        Message message = session.createObjectMessage(testMessage);
        return message;
      }
    });
  }
   
  /**
   * send text to default destination
   * @param 
   */
  public void send(final com.alok.jmstest.test.TestMessage testMessage) {
     
    this.jmsTemplate.send(new MessageCreator() {
      public Message createMessage(Session session) throws JMSException {
        Message message = session.createObjectMessage(testMessage);
        return message;
      }
    });
  }
  
  /**
   * send text to default destination
   * @param text
   */
  public void send(final String text) {
     
    this.jmsTemplate.send(new MessageCreator() {
      public Message createMessage(Session session) throws JMSException {
        Message message = session.createTextMessage(text);
        return message;
      }
    });
  }
   
  /**
   * Simplify the send by using convertAndSend
   * @param text
   */
  public void sendText(final String text) {
    this.jmsTemplate.convertAndSend(text);
  }
   
  /**
   * Send text message to a specified destination
   * @param text
   */
  public void send(final Destination dest,final String text) {
     
    this.jmsTemplate.send(dest,new MessageCreator() {
      public Message createMessage(Session session) throws JMSException {
        Message message = session.createTextMessage(text);
        return message;
      }
    });
  }
}