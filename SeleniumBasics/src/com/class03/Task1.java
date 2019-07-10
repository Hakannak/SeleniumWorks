package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("hakan-ak54@hotmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("pass")).sendKeys("hakan54");
        Thread.sleep(3000);
        driver.findElement(By.id("u_0_2")).click();

}
}
