package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.class06.CommonMethods;

public class Task2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
		String url="https://the-internet.herokuapp.com/";
        
		setUpDriver("chrome", url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		Thread.sleep(2000);
		 WebElement element=driver.findElement(By.xpath("//input[@type='checkbox']"));
	        if(!element.isSelected()) {
	            element.click();
	            }else {
	                System.out.println("element is NOT Selected");
	            }
	        element=driver.findElement(By.xpath("//button[text()='Remove']"));
	        Thread.sleep(2000);
	        element.click();
	        WebDriverWait wait=new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element=driver.findElement(By.xpath("//button[text()='Add']"));
	        Thread.sleep(2000);
	        element.click();
	        wait.until(ExpectedConditions.visibilityOf(element));
	        WebElement message=driver.findElement(By.id("message"));
	        if(message.isDisplayed()) {
	            String text=message.getText();
	            System.out.println(text);
	            
	        }else {
	            System.out.println(" element is Not displayed");
	        }
	        Thread.sleep(2000);
	        driver.quit(); 
	     
	}

}
