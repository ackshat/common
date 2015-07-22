package com.mkyong.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	/*@AfterReturning(
			pointcut=" com.alok.service.DemoServiceImpl.sayHello(..)",
			argNames="name , lastName..",
			returning="flagOb"
			
			)
	public void checkHello(JoinPoint jp, Object name, Object lastName, Object flagOb){
		
		String name1 = (String)name;
		String lastName1 = (String)lastName;
		boolean flag = (Boolean)flagOb;
		
		System.out.println("AOP fetched values ...");
		System.out.println("Name --> "+name1+ "LastName --> "+lastName1 + "flag ===> "+flag);
	}*/

	/*@AfterReturning( pointcut ="execution(* com.alok.service.DemoServiceImpl.sayHello(..))",
					 returning ="flagOb",
					 argNames="name")
	public void logAfterReturning(JoinPoint joinPoint, Object flagOb,Object name) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Args : " + joinPoint.getArgs()[0]);
		System.out.println("RetutnValue : " + flagOb);
		//System.out.println("Name : " + name);
		System.out.println("******");

	}*/
	
	@Before( "execution(* com.alok.service.DemoServiceImpl.sayHello(..))")
	public void checkSayHello(JoinPoint joinPoint) {
	
		System.out.println("checkSayHello() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		//System.out.println("Name : " + name);
		System.out.println("******");
	
	}
	
	@Before("execution(* com.alok.service.DemoServiceImpl.sayHello2())")
	public void checkSayHello2(JoinPoint joinPoint) {

		System.out.println("checkSayHello2() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
		
	}

	
	
	
	/*@Before("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}*/

	/*@After("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}*/
	
	/*@AfterReturning(
			pointcut = "execution(* com.mkyong.customer.bo.CustomerBo.addCustomerReturnValue(..))",
			returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");

	}*/
	
	/*@AfterThrowing(
			pointcut = "execution(* com.mkyong.customer.bo.CustomerBo.addCustomerThrowException(..))",
			throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");

	}*/
	
	
	@Around("execution(* com.mkyong.customer.bo.CustomerBo.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");
		
		System.out.println("******");

	}
	
}