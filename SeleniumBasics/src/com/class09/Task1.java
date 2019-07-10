package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.class06.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
		String url="https://the-internet.herokuapp.com/";
        setUpDriver("chrome", url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebElement element=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        WebDriverWait wait=new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.visibilityOf(element));
       if(element.isDisplayed()) {
            String text=element.getText();
            System.out.println(text);
        }else {
            System.out.println("Element is not displayed");
        }
       Thread.sleep(2000);
       driver.quit();
	}
}