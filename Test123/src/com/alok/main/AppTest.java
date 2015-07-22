package com.alok.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.alok.test.AComplexClass;
import com.alok.test.User;

public class AppTest {

	
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {8,7,6,5};
		User u1 = new User();
		String fName = "alok";
		u1.setfName(fName);
		User u2 = new User();
		u2.setfName(fName);

		//System.out.println(u1.hashCode());
		AComplexClass as1 = new AComplexClass();
		AComplexClass as2 = new AComplexClass();
		
		System.out.println(as1.equals(as1));
		
		
		
		AComplexClass acu1 = new AComplexClass(u1);
		AComplexClass acu2 = new AComplexClass(u2);
		
		System.out.println(acu1.equals(acu2));
		
		AComplexClass acc1 = new AComplexClass(array1, array2, "a", "b");
		AComplexClass acc2 = new AComplexClass(array1, array2, "a", "b");
		System.out.println(acc1.equals(acc2));
		System.out.println("Hash "+ acc1.hashCode());
		
		
		List list = new LinkedList<String>();
		Collections.synchronizedCollection(list);
	}
}
