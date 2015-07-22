package com.alok.jms;
import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alok.jmstest.test.TestMessage;
import com.alok.service.DemoService;
 
 
public class DemoMain {
 
	
  public static void main(String[] args) {
    // init spring context
    ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
         
    // get bean from context
    JmsMessageSender jmsMessageSender = (JmsMessageSender)ctx.getBean("jmsMessageSender");
    
    DemoService demoService = (DemoService)ctx.getBean("demoService");
         demoService.sayHello("Alok", "Sharma", 25);
    // send to default destination
   // TestMessage msg = new TestMessage("key0", "value0_123");
    
        /* TestMessage msg = new TestMessage("Key001","Value001");
         jmsMessageSender.send(msg);*/
         
    // send to a code specified destination
   /* Queue queue = new ActiveMQQueue("AnotherDest");
    jmsMessageSender.send(queue, "hello Another Message");*/
   
    // close spring application context
    ((ClassPathXmlApplicationContext)ctx).close();
  }
 
}