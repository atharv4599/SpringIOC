package com.model;

public class User {

	private int username;
	private String password;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
