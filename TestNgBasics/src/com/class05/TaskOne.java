package com.class05;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class TaskOne extends CommonMethods {

	@BeforeMethod(alwaysRun = true)
	
	public void Navigate() {
		
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx";
		setUpDriver("chrome", url);
		driver.manage().deleteAllCookies();
		sendText(driver.findElement(By.cssSelector("input[id$='_username']")),"Tester");
		sendText(driver.findElement(By.cssSelector("input[id$='_password']")), "test");
		driver.findElement(By.cssSelector("input[id$='_button']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div.login_info")).isDisplayed(),true );
		System.out.println("succesfully login");
	
	}

  @DataProvider
  
  public Object[][] setData(){
	  
	  Object[][] data=new Object[2][9];
	  
	    data[0][0]="100";
		data[0][1]="John Smith";	
		data[0][2]="123 street ";
		data[0][3]="Ashburn";	
		data[0][4]="Va";
		data[0][5]="20147";	
		data[0][6]="Visa";
		data[0][7]="0000";	
		data[0][8]="00/00";	
		
		
		data[1][0]="200";
		data[1][1]="Mary Smith";	
		data[1][2]="123 street ";
		data[1][3]="Ashburn";	
		data[1][4]="Va";
		data[1][5]="20147";	
		data[1][6]="MasterCard";
		data[1][7]="0001";	
		data[1][8]="01/00";	
		
				
	    return data;
  }
	
      @Test(dataProvider="setData")
      
      public void  testUsers(String quantity, String customerName, String street, String city, String state, String zip, String card , String cardNr, String date) throws IOException {
    		driver.findElement(By.xpath("//a[text()='Order']")).click();
    		driver.findElement(By.xpath("//input[contains(@id,'Quantity')]")).sendKeys(quantity);
    		driver.findElement(By.xpath("//input[contains(@id,'Name')]")).sendKeys(customerName);
    		driver.findElement(By.xpath("//input[contains(@id,'TextBox2')]")).sendKeys(street);
    		driver.findElement(By.xpath("//input[contains(@id,'TextBox3')]")).sendKeys(city);
    		driver.findElement(By.xpath("//input[contains(@id,'TextBox4')]")).sendKeys(state);
    		driver.findElement(By.xpath("//input[contains(@id,'TextBox5')]")).sendKeys(zip);
    		driver.findElement(By.xpath("//input[contains(@value,'"+card+"')]")).click();
    		driver.findElement(By.xpath("//input[contains(@id,'TextBox6')]")).sendKeys(cardNr);
    		driver.findElement(By.xpath("//input[contains(@name,'TextBox1')]")).sendKeys(date);
    		if(customerName.contains("John Smith")) {
    		takeScreenshot("taskOne", "smartbearsoftwareUserOne");
    		}
    		else  {
    			takeScreenshot("taskOne", "smartbearsoftwareUserTwo");
    		}
    		driver.findElement(By.xpath("//a[contains(@id,'InsertButton')]")).click();
    			
    			
    			
    		}

    		@AfterMethod (alwaysRun = true)
    		public void tearDown() {
    		driver.close();

    		}
    	}