package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		
		WebDriver task=new ChromeDriver();
		
	    task.get("https://www.amazon.com");
	    
	    System.out.println(task.getTitle());
	    
	    String title=task.getTitle();
	    
	    if(title.equalsIgnoreCase("amazon")) {
	    
	    System.out.println("this is right title");
	    }
	    else {
	    	System.out.println("this is wrong title");
	    }
      task.close();
	}

}
