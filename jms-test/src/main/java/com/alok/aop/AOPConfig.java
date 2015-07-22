package com.alok.aop;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import com.alok.jms.JmsMessageSender;
import com.alok.jmstest.test.TestMessage;

@Aspect
public class AOPConfig {

	@Autowired
	JmsMessageSender jmsMessageSender;
	
	// getting arguments
	@AfterReturning(
			pointcut=" execution(* com.alok.service.DemoServiceImpl.sayHello(..))",
		/*	argNames="name, lastName, age,flagOb",*/
			returning="flagOb"
			
			)
	public void checkHello(JoinPoint jp,/* Object name, Object lastName,*/ Object flagOb){
		
	/*	String name1 = (String)name;
		String lastName1 = (String)lastName;*/
		boolean flag = (Boolean)flagOb;
		Queue queue = new ActiveMQQueue("AnotherDest");
		    jmsMessageSender.send(queue, "hello Another Message");
		    
		    TestMessage msg = new TestMessage("flag",String.valueOf(jp.getArgs()[0]));
	         jmsMessageSender.send(msg);
	         
		System.out.println("AOP fetched values ...");
		System.out.println("Name --> "+jp.getArgs()[0]+ "LastName --> "+jp.getArgs()[1] + "flag ===> "+flag);
	}
	
	
	
	// working fine -- getting return value 
	/*@AfterReturning(
			pointcut=" execution(* com.alok.service.DemoServiceImpl.sayHello(..))",
			argNames="name, lastName, age,flagOb",
			returning="flagOb"
			
			)
	public void checkHello(JoinPoint jp, Object name, Object lastName, Object flagOb){
		
		String name1 = (String)name;
		String lastName1 = (String)lastName;
		boolean flag = (Boolean)flagOb;
		Queue queue = new ActiveMQQueue("AnotherDest");
		    jmsMessageSender.send(queue, "hello Another Message");
		    
		    TestMessage msg = new TestMessage("flag",String.valueOf(flagOb));
	         jmsMessageSender.send(msg);
	         
		System.out.println("AOP fetched values ...");
		System.out.println("Name --> "+name1+ "LastName --> "+lastName1 + "flag ===> "+flag);
	}*/
}
