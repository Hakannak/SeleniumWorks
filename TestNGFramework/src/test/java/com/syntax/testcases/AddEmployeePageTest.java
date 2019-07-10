package com.syntax.testcases;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;

public class AddEmployeePageTest extends BaseClass {

	@Test(dataProvider="Employee Data",groups="Smoke")
	public void addEmployee(String name,String mName,String lName,String locations) throws InterruptedException {

		LoginPage login = new LoginPage();
		HomePage home =new HomePage();
		AddEmployeePage addEmp=new AddEmployeePage();
		Thread.sleep(500);
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		Thread.sleep(500);
		CommonMethods.click(home.PIM);
		Thread.sleep(500);
		CommonMethods.click(home.addEmployee);
		Thread.sleep(500);
		CommonMethods.sendText(addEmp.firstName, name);
		Thread.sleep(500);
		CommonMethods.sendText(addEmp.lastName, lName);
		Thread.sleep(500);
		CommonMethods.sendText(addEmp.middleName,mName);
		Thread.sleep(500);
		CommonMethods.click(addEmp.location);
		
		/*How to handle this dropdown
		 * 1. identify list
		 * 2. get all child with li tags
		 * 3. loop through each li tag and get text
		 * 4. if text is matching then we click
		 * 5. break
		 * 
		 */
		
        CommonMethods.selectList(addEmp.locationList,locations);
        Thread.sleep(500);
		CommonMethods.click(addEmp.saveBtn);
     
	}
    
	@DataProvider(name= "employee details")
    public Object[][] getData(){
		
		Object[][] data=new Object[3][4];
		
		data[0][0]="John";
		data[0][1]="Snow";
		data[0][2]="White";
		data[0][3]="HQ";
	
		data[1][0]="Arya";
		data[1][1]="Stark";
		data[1][2]="Sword";
		data[1][3]="London Office";
	    
		data[2][0]="Sansa";
		data[2][1]="Stark";
		data[2][2]="Beuty";
		data[2][3]="New York Sales Office";
	
	   return data;
	
	
	}

     
	@DataProvider(name="Employee Data")
	public Object[][] getEmpData(){
		
		ExcelUtility obj=new ExcelUtility();
		
		obj.openExcel(Constants.XL_FILEPATH, "EmployeeDetails");
		
		int rows=obj.getRowNum(); //11
		int cols=obj.getColNum(0); //4
		
		Object[][] data=new Object[rows-1][cols]; // Object[10][4]
		
		for(int i=1;i<rows;i++) {
			for(int y=0;y<cols;y++) {
				
				String value=obj.getCellData(i, y);
				data[i-1][y]=value;
				
			}
		}
		
		return data;
	}
}