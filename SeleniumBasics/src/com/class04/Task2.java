package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.newtours.demoaut.com/");
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'ma')]")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'reg')]")).click();
		
		//input#user-name


	}

}
