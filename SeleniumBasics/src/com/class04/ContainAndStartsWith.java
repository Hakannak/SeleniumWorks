package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainAndStartsWith {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("hakanak54500@gmal.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123214");

		Thread.sleep(3000);
       // These are methods that we can use to find and execute code
		//a[contains(text(),'Forgot account')]
		//a[text()='Forgot account?']               
		//a[starts-with(text(),'Forgot')]
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_2')]")).click();
	}

}
