package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class06.CommonMethods;

public class Task extends CommonMethods {

public static void main(String[] args) throws InterruptedException {
        
        
        setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        
        //login to the application
        sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
        sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        
        Thread.sleep(3000);
        WebElement el=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[6]/td[2]"));
        
        if(el.isDisplayed()) {
            System.out.println(el.getText());
        }else {
            System.out.println("Element is not displayed");
        }
    
        
        driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[6]/td[13]")).click();
        driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName")).click();   
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan McFly");
        driver.findElement(By.cssSelector("a#ctl00_MainContent_fmwOrder_UpdateButton")).click();
        
        Thread.sleep(3000);
        WebElement el1=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[6]/td[2]"));
        
        if(el1.isDisplayed()) {
            System.out.println("successfull = "+el1.getText());
        }else {
            System.out.println("Element is not change");
        }
    
        Thread.sleep(3000);
        driver.quit();
    }
}