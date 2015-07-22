package com.alok.test;

public class NestedClass {

	private String name;
	
	public static class InnerClass{
		
		String name;
		
		public InnerClass(){
		  	
		}
		
		public InnerClass(String nme){
		  	name = nme ;
		}

		public String getName() {
			return name;
		}

		public void setName(String nme) {
			name = nme;
		}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		NestedClass nC = new NestedClass();
		NestedClass.InnerClass in = new NestedClass.InnerClass();
		
	}
	
}
