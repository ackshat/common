package com.learn.springdi;

public class Person 
{
	private String name;
	private String address;
	private double age = Math.random();
 
	//getter and setter methods
 
	
	
	@Override
	public String toString() {
		return "Person [address=" + address + " , age=" + age + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	

}
