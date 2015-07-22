package com.alok.test;

public class CloneableTest implements Cloneable  {

		static int n = 0;
		public CloneableTest() {
			n=n+1;
			System.out.println("Object number " +n +" created ");
		}
		
		public CloneableTest clone() throws CloneNotSupportedException{
			return (CloneableTest) super.clone();
		}
		
		public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException {
			
			CloneableTest thw = new CloneableTest();
		//	CloneableTest thwClone = thw.clone();
			CloneableTest cloneTestRef = thw.getClass().newInstance();
			//System.out.println(thwClone.equals(thw));
		}
	}
