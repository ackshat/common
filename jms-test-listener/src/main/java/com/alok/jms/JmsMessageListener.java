package com.alok.jms;

import org.springframework.stereotype.Service;

import com.alok.jmstest.test.TestMessage;

@Service
/**
 * POJO class, have handleMessage(...) method.
 * The return of handleMessage(...) will be
 * automatically send back to message.getJMSReplyTo(). 
 */
public class JmsMessageListener {
 
  public String handleMessage(String text) {
    System.out.println("Received: " + text);
    return "ACK from handleMessage";
  }
  
  public String handleMessage(Object messageOb) {
	    TestMessage msg = (TestMessage) messageOb;
	    System.out.println("Received: key--> " + msg.getKey()+ " \n Value ---> "+ msg.getValue() );
	    return "ACK from handleMessage2";
	  }
}