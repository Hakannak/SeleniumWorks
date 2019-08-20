package com.class27;

public class TestRegistration {

	public static void main(String[] args) {
		Registration obj=new Registration();
		obj.setEmail("hakanak@gmail.com");
		obj.setUserName("hakanak");
		obj.setPassword("hello5454");
		
		System.out.println("User e-mail adress is "+obj.getEmail()+" user name is "+obj.getUserName()+" and passoword is "+obj.getPassword());
		
	}

}
