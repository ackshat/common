package com.alok.test;

import java.util.Scanner;

public class TestAssert {

	    public static void main(String[] args) 
	    { 
	        /*int x = 0;  
	        assert (x > 0) ? "assertion failed" : "assertion passed" ; 
	        System.out.println("finished");  */
	    	
	    	Scanner scanner = new Scanner( System.in );  
	    	  System.out.print("Enter ur age ");  
	    	    
	    	  int value = scanner.nextInt();  
	    	  assert value >= 18:" Not valid";  
	    	  
	    	  System.out.println("value is "+value);  
	    } 
	
}
