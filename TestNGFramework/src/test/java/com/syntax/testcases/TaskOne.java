package com.syntax.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.AddLocationsPage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class TaskOne extends BaseClass {

	@Test(dataProvider="locations")
	public void setUp(String name,String country,String city,String zipCode) throws InterruptedException {
		
		
		LoginPage log = new LoginPage();
		log.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		boolean isDisp = driver.findElement(By.cssSelector("li.page-title")).isDisplayed();
		if (isDisp) {
			System.out.println("You have logged in succesfully");
		} else {
			System.out.println("You have not logged in succesfully");
		}
		HomePage home = new HomePage();
		Thread.sleep(500);
		CommonMethods.click(home.admin);
		Thread.sleep(500);
		CommonMethods.click(home.organization);
		Thread.sleep(500);
		CommonMethods.click(home.locations);
		Thread.sleep(500);
		CommonMethods.click(home.addLocations);
		Thread.sleep(2000);
		AddLocationsPage loc = new AddLocationsPage();
		CommonMethods.waitForElementBeVisible(loc.employeeName, 30);
		
		CommonMethods.sendText(loc.employeeName, name);
		Thread.sleep(500);
		
		CommonMethods.click(loc.country);
		Thread.sleep(500);
		CommonMethods.selectList(loc.countryList, country);
		Thread.sleep(500);
		CommonMethods.sendText(loc.city,city);
		Thread.sleep(500);
		CommonMethods.sendText(loc.zipCode,zipCode);
		Thread.sleep(500);
		CommonMethods.click(loc.saveBtn);

	}

	@DataProvider(name ="locations")
	public Object[][] getData() {

		Object[][] data = new Object[3][4];

		data[0][0] = "John";
		data[0][1] = "Albania";
		data[0][2] = "Tiran";
		data[0][3] = "083412";
		
		data[1][0]="Arya";
		data[1][1]="Turkey";
		data[1][2]="Istanbul";
		data[1][3]="939453";
	    
		data[2][0]="Sansa";
		data[2][1]="France";
		data[2][2]="Paris";
		data[2][3]="31204912";

		

		return data;
	}

}
