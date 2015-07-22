package com.alok.threadtest;

public class DemoThread {

	public static void main(String[] args) {
		
		User user1 = new User("Alok", "Sharma", "25");
		User user2 = new User("Alok2", "Sharma", "25");
		
		user1.sayHello(user2);
	}
}
