package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
		d.get("https://facebook.com/");
		
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("hakanak54500@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("pass")).sendKeys("alora5454");
		Thread.sleep(2000);
		d.findElement(By.id("u_0_2")).click();
		

	}

}
