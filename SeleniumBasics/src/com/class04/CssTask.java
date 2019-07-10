package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTask {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		

		driver.findElement(By.cssSelector("input#email")).sendKeys("hakanak54500@gmal.com");

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input#pass")).sendKeys("123214");

		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#u_0_2")).click();
		
		
	}

}
