package com.class04;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class NewTourDataProvider extends CommonMethods {

	@BeforeMethod(alwaysRun = true)

	public void setUp() {

		String url = "http://www.newtours.demoaut.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.manage().deleteAllCookies();
	}

	@DataProvider()
	
	public Object[][]setData(){
		
		Object[][] data=new Object[3][4];
	    
		data[0][0]="james";
		data[0][1]="arthur";
		data[0][2]="832-123-23-43";
		data[0][3]="james@gmail.com";
	
		data[1][0]="jack";
	    data[1][1]="jones";
	    data[1][2]="132-421-12-32";
	   	data[1][3]="jack@gmail.com";
	   	
	   	data[2][0]="mary";
	   	data[2][1]="lisa";
	   	data[2][2]="321-423-56-87";
	   	data[2][3]="mary@yahoo.com";
	   	
	   	return data;

	}
	
    @Test(dataProvider="setData")
    
    public void getData(String name,String last,String phone,String email) throws InterruptedException {
    	
    	sendText(driver.findElement(By.cssSelector("input[name='firstName']")), name);
    	Thread.sleep(1000);
    	sendText(driver.findElement(By.xpath("//input[@name='lastName']")), last);
    	Thread.sleep(1000);
    	sendText(driver.findElement(By.xpath("//input[@name='phone']")), phone);
    	Thread.sleep(1000);
    	sendText(driver.findElement(By.cssSelector("input#userName")), email);
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("input[name='register']")).click();
    
    }
    
    @AfterMethod(alwaysRun = true)
    
    public void tearDown() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.close();
    }
    
}
