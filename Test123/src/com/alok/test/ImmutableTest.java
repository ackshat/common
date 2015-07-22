package com.alok.test;

public class ImmutableTest {

	
	class CustImmutable {
		
		private  String name;
		private  int age;
		
		public CustImmutable(final String name, final int age){
			this.age = age;
			this.name = name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		
		
	}
}
