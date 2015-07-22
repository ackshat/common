package com.alok.test.ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class PersistTest {

	private static final String fileName = "D://time.ser";
	
	public static void main(String[] args) {
		
		// persist object to file
		//saveObjectToFile();
		// retrieve object from file 
		PersistTime timePer = getObjectFromFile();
		
		System.out.println(timePer.getTime().toString());
	}
	
	public static void saveObjectToFile(){
		
		FileOutputStream fos = null;
		ObjectOutputStream outStream = null;
		PersistTime persistTime = new PersistTime();
		persistTime.setTime(Calendar.getInstance().getTime());
		persistTime.setTime2(Calendar.getInstance().getTime());
		
		try {
			fos = new FileOutputStream(fileName);
			
			outStream = new ObjectOutputStream(fos);
			outStream.writeObject(persistTime);
			
			System.out.println("Time is : "+ persistTime.getTime().toString() +
					" -- MilliSeconds "+persistTime.getTime().getTime());
			
			outStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static PersistTime getObjectFromFile(){
		
		FileInputStream fis = null;
		ObjectInputStream oiS = null;
		PersistTime time = null;
		try {
			fis = new FileInputStream(fileName);
			oiS = new ObjectInputStream(fis);
			 time =  (PersistTime) oiS.readObject();
			 System.out.println("Deserialized \nTime is : "+ time.getTime().toString() +
						" -- MilliSeconds "+time.getTime().getTime());
			 System.out.println("Deserialized \nTime2 is : "+ time.getTime2().toString() +
						" -- MilliSeconds "+time.getTime2().getTime());
			 System.out.println("Deserialized \nTime3 is : "+ time.getTime3().toString() +
						" -- MilliSeconds "+time.getTime3().getTime());
			 oiS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  time;
	}
}
