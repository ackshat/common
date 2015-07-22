package com.alok.threadtest;

public final class User extends Thread {

	private String fName;
	private String LName;
	private String age;
	

	public User(String fName, String lName, String age) {
		super();
		this.fName = fName;
		LName = lName;
		this.age = age;
	}

	public synchronized void sayHello(User user2)
	{
		System.out.println("Hello "+this.fName+ " "+this.LName );
		try {
			this.sleep(600);
			user2.sayHi();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void sayHi()
	{
		System.out.println("Hi "+this.fName+ " "+this.LName );
		try {
			this.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void sayWait()
	{
		System.out.println("Wait "+this.fName+ " "+this.LName );
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
