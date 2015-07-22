package com.alok.test.ser;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class PersistTime implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6310646371758658757L;

	private static final long APPEND_TIME = 1001l;
	
	private Date time ;
	private Date time2 ;
	private Date time3 ;
	
	
	
	public Date getTime3() {
		return time3;
	}
	public void setTime3(Date time3) {
		this.time3 = time3;
	}
	public Date getTime(){
		return time;
	}
	public Date getTime2(){
		return time2;
	}
	public void setTime(Date time){
		this.time = time;
		System.out.println("Ognl time : " + time.getTime());
	}
	public void setTime2(Date time2){
		this.time2 = time2;
		System.out.println("Ognl time2 : " + time2.getTime());
	}
	
	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException{
		
		this.time = (Date) in.readObject();
		this.time2 = (Date) in.readObject();
		decrypt();
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		encrypt();
		out.defaultWriteObject();
	}

	private void encrypt() {

		this.time.setTime(this.time.getTime()+APPEND_TIME);
		this.time2.setTime(this.time2.getTime()+APPEND_TIME);
		
		System.out.println("Encrypted time : time " + time.getTime() +" time2 : " + time2.getTime());
	}
	
	private void decrypt() {
		
		this.time.setTime(this.getTime().getTime()-APPEND_TIME);
		this.time2.setTime(this.getTime2().getTime()-APPEND_TIME);
	}
}
