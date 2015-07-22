package com.alok.threadtest;

public class CustomThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i= 1;
		System.out.println("..."+i++);
	}

	

}
