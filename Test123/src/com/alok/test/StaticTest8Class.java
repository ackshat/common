package com.alok.test;

public class StaticTest8Class {

	private static int i = 0;
	
	StaticTest8Class(){
		i=i+1;
	}
	
	public String fName ;
	public String lName ;
	
	public static int getObjectsCreated(){
		return i;
	}
}
