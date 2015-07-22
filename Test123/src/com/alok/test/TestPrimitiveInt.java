package com.alok.test;

public class TestPrimitiveInt {

	   /* public static void main(String [] args) 
	    {
	    int [] [] [] x = new int [3] [] [];
	    int i, j;
	    x[0] = new int[4][];
	    x[1] = new int[2][];
	    x[2] = new int[5][];
	    for (i = 0; i < x.length; i++)
	    {
	        for (j = 0; j < x[i].length; j++) 
	        {
	            x[i][j] = new int [i + j + 1];
	            System.out.println("size = " + x[i][j].length);
	        }
	    }
	    }*/
	
		public static void main(String [] args){
	        String names [] = new String[5];
	        String [] args2= {"a","b"};
	        for (int x=0; x < args2.length; x++)
	            names[x] = args2[x];
	        System.out.println(names[2]);
	        
	    }
	}
