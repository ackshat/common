package com.learn.springdi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppDemo /*implements BeanFactoryAware*/
{

	/*private BeanFactory factory;
	 
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
	this.factory = factory	;
	}*/

		   public static void main(String[] args) {
			   System.out.println("start");
		     /* ApplicationContext ctx = 
		      new AnnotationConfigApplicationContext(App.class);*/
		   
			   ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
			   
		      Customer cust = ctx.getBean(Customer.class);
		      System.out.println(cust);
		      Customer cust2 = ctx.getBean(Customer.class);
		      System.out.println(cust2);
		      System.out.println("end");
		   }

}