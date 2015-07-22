package com.alok.jms;

import java.io.Serializable;

public class TestMessage implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4318962210887385055L;
	
	private String key;
	private String value;
	
	public TestMessage(){
		
	}
	
	public TestMessage(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
}
