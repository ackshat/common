/**
 * 
 */
package com.alok.service;


/**
 * @author alok.sharma
 *
 */
public class DemoServiceImpl implements DemoService {

	/* (non-Javadoc)
	 * @see com.alok.service.DemoService#sayHello(java.lang.String, java.lang.String, int)
	 */
	public boolean sayHello(String name, String lastName, int age) {
		boolean flag = true;
		System.out.println("Name : "+ name + " Last Name : "+lastName + " Age "+ age);
		if(age>0){
			flag= false;
			System.out.println("Invoking sayHello2..");
			sayHello2();
		}
		return flag;
	}

	public void sayHello2() {
		System.out.println("Inside Hello 2");
		
	}

}
