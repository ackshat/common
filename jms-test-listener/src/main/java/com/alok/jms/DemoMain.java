package com.alok.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class DemoMain {
 
  public static void main(String[] args) {
    // create Spring context
    ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
         
    // sleep for 1 second
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
   
    // close application context
    ((ClassPathXmlApplicationContext)ctx).close();
  }
  
  
}