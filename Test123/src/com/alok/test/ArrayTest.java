package com.alok.test;

public class ArrayTest {

	    public static void main(String [] args) 
	    {
	    	String args2[] = {"1","2","3"};
	        String [][] argCopy = new String[2][2];
	        String s[] = new String[3];
	        int x;
	        argCopy[0] = args2;
	        x = argCopy[0].length;
	        //signed int ij=10;
	        for (int y = 0; y < x; y++) 
	        {
	            System.out.print(" " + argCopy[0][y]);
	        }
	    }
	}
