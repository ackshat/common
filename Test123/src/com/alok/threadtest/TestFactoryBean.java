package com.alok.threadtest;

public interface TestFactoryBean<T> {

	T getType();
	
	Class<?> getObjectType();
	
	
	
}
