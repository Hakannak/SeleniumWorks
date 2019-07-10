package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://newtours.demoaut.com");

		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("firstName")).sendKeys("tom");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("rider");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("8145552452");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mehmetozcan546@outlook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("123 15 st");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("clifton");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("nj");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("07010");
		Thread.sleep(2000);
		driver.findElement(By.name("country")).sendKeys("United States");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mehmetozcan546@outlook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("6516516513");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("6516516513");
		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();

	}

}
