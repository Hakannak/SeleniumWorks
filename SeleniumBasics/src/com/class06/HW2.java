package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://facebook.com");
	    Thread.sleep(500);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("hakan");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#u_0_e")).sendKeys("yýlmaz");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_h")).sendKeys("0531-211-52-42");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#u_0_o")).sendKeys("a3rfas42.");
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select obj=new Select(month);
	    
		List<WebElement>allMonth=obj.getOptions();
		System.out.println(allMonth.size()-1);
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		
	
	
	
	
	
	}

}
