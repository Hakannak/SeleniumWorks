package com.class02;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task extends CommonMethods{

	@BeforeMethod
	
	public static void openPage() throws InterruptedException {
		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chorme", url);
		String expTitle="OrangeHRM";
		String title=driver.getTitle();
		if(title.equals(expTitle)) {
			System.out.println("This is right title");
		}else {
			System.out.println("This is wrong title ");
		}
	}
   
	@Test
	
	public void login() {
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
  
	@AfterMethod
	
	public void logOut() {
	
		driver.quit();	
		
	}
}
