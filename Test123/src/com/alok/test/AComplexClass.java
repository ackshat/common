package com.alok.test;

import java.util.Arrays;

public class AComplexClass {

	private int[] array1;
	private int[] array2;
	
	private String a;
	private String b;
	private User user;
	
	public AComplexClass(User user){this.user = user;}
	
	public AComplexClass(int[] array1, int[] array2, String a, String b) {
		super();
		this.array1 = array1;
		this.array2 = array2;
		this.a = a;
		this.b = b;
	}
	
	
	public AComplexClass() {
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int[] getArray1() {
		return array1;
	}
	public void setArray1(int[] array1) {
		this.array1 = array1;
	}
	public int[] getArray2() {
		return array2;
	}
	public void setArray2(int[] array2) {
		this.array2 = array2;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + Arrays.hashCode(array1);
		result = prime * result + Arrays.hashCode(array2);
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AComplexClass other = (AComplexClass) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (!Arrays.equals(array1, other.array1))
			return false;
		if (!Arrays.equals(array2, other.array2))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	
}
