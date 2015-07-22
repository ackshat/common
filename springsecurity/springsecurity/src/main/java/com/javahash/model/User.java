package com.javahash.model;

public class User {

	
	private Long id;
	
	private String fname;
	private String lNmae;
	private String address;
	
	
	
	
	public User(Long id, String fname, String lNmae, String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lNmae = lNmae;
		this.address = address;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getlNmae() {
		return lNmae;
	}
	public void setlNmae(String lNmae) {
		this.lNmae = lNmae;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
