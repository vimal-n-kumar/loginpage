package com.accenture.loginpage.entities;

public class User {

	private String name;
	private String designation;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
