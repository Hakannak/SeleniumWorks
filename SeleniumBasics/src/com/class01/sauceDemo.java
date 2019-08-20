package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("hakan-ak54@hotmail.com");
		
	}

}
