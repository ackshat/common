package com.learn.springdi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class App 
{


	@Bean()
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public static Person getPerson(){
		return new Person();
	}
	
	@Bean
	@Qualifier("customer")
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public static Customer getCustomer(){
		return new Customer(getPerson());
	}
	


}