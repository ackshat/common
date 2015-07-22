package com.alok.test;

 interface HelloWorld<E> {

	public void sayHelloToWorld(String message);
	
}


class TestHelloWorld implements Cloneable {
	
	static int n = 0;
	public TestHelloWorld() {
		n=n+1;
		System.out.println("Object number " +n +" created ");
	}
	
	public TestHelloWorld clone() throws CloneNotSupportedException{
		return (TestHelloWorld) super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		TestHelloWorld thw = new TestHelloWorld();
		TestHelloWorld thwClone = thw.clone();
		
		HelloWorld<String> helloW = new HelloWorld<String>() {
			@Override
			public void sayHelloToWorld(String message) {
				// TODO Auto-generated method stub
			}
			
		};
	}
}