package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Link T")).click();

	}

}