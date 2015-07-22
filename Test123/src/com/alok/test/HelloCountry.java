package com.alok.test;

public interface HelloCountry<E> extends HelloWorld<E> {

	public void sayHelloToCountry(String country);
}

abstract class TestHello implements HelloCountry<String>{
	
	public abstract void sayHelloToPerson();
	
}

class TestHello2 implements HelloCountry<String> {
	
	public static void main(String[] args) {
		
		HelloCountry<String> helloW = new TestHello() {

			@Override
			public void sayHelloToCountry(String country) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sayHelloToWorld(String message) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sayHelloToPerson() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

	@Override
	public void sayHelloToCountry(String country) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayHelloToWorld(String message) {
		// TODO Auto-generated method stub
		
	}
}