package com.alok.test;

public class StaticTest8ClassTest {

	public static void main(String[] args) {
		StaticTest8Class a = new StaticTest8Class();
		
		System.out.println("Objects Created :   "+ StaticTest8Class.getObjectsCreated());
		
		StaticTest8Class b = new StaticTest8Class();
		
		
		System.out.println("i in b --->"+ a.getObjectsCreated());
	}
	
}
