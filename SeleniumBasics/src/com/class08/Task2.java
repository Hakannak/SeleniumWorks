package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
	   
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
         
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		
		driver.get("http://uitestpractice.com/Students/Index");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		
		Actions act=new Actions(driver);
		
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
