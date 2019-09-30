package com.example.functions.model;

public class User {
	private int id;
	private String username;
	private String fName;
	private String lName;

	public User() {
	}

	public User(int id, String username, String fName, String lName) {
		this.id = id;
		this.username = username;
		this.fName = fName;
		this.lName = lName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
}
