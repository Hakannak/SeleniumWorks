package com.class01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("bob");
         Thread.sleep(2000);
        driver.findElement(By.name("customer.lastName")).sendKeys("tom");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Asel town");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("Va"); 
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("arif1");
         Thread.sleep(2000);
        driver.findElement(By.id("customer.password")).sendKeys("arif10");
         Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("arif10");
         Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        
        driver.quit();

	}

}
