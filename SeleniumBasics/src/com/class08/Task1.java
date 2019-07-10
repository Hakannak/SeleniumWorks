package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class06.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		driver.findElement(By.cssSelector("button[name='click']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		WebElement doub=driver.findElement(By.cssSelector("button[name='dblClick']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(doub).perform();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
