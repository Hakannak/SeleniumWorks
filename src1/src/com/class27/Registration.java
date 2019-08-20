package com.class27;

public class Registration {
	
	private String email;
	private String userName;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("gmail")) {
			this.email = email;
		}else {
			System.out.println("Please use gmail adress");
		}
		
	}
	public String getUserName() {
			return userName;
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty() & userName.length()>6) {
			this.userName = userName;	
		}else {
			System.out.println("username must not be empty and should be larger than 6 characters");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!password.contains(userName)) {
			if(!password.isEmpty() & password.length()>6) {
				this.password = password;
			}
				
		}else {
			System.out.println("password can not contain username");
		}
	}
	

}
