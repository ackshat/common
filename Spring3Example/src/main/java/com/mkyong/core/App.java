package com.mkyong.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alok.service.DemoService;
import com.mkyong.customer.bo.CustomerBo;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		DemoService demoService = (DemoService) appContext.getBean("demoService");
		
		//demoService.sayHello("Alok", "Sharma", 25);
	//	demoService.sayHello2();
		//customer.addCustomer();
		
		//customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
		//customer.addCustomerAround("mkyong");
		
		collectionIterateEx();

	}
	
	public static void collectionIterateEx(){
		List<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		
		int i=1;
		
		try{
		for(String s : al){
			if(i==1){
			al.remove(2);
			i++;
			}
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(al.toString());
	}
}