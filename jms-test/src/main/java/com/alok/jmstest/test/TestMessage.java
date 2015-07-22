package com.alok.jmstest.test;

import java.io.Serializable;

public class TestMessage extends MyMessage implements Serializable, MessageBase {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4318962210887385055L;
	
	private String key;
	private String value;
	private String test;
	
	
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

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
