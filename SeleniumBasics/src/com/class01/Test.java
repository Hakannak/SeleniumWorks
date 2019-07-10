package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:/Selenium/geckodriver.exe");
		 WebDriver dre= new FirefoxDriver();
	     dre.get("http:/google.com");
	}
}
