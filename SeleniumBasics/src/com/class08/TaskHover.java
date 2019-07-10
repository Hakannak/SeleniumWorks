package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class06.CommonMethods;

public class TaskHover extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
         CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com");
         
         WebElement element=driver.findElement(By.xpath("//span[text()='Tutorial']"));
         
         Actions action=new Actions(driver);
         Thread.sleep(2000);
         action.moveToElement(element).click().perform();
         
         driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
         Thread.sleep(2000);
         driver.close();
         
	}

}
