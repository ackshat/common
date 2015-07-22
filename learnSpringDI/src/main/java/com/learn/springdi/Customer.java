package com.learn.springdi;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	@Autowired
	private Person person;
 
	public Customer(Person person) {
		this.person = person;
	}
 
	/*public Customer() {Rs
	}*/
	
	public void setPerson(Person person) {
		this.person = person;
	}
 
	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
}