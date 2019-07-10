package com.syntax.practice;

import org.testng.annotations.Test;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;

public class ExcelFunctionsTest extends ExcelUtility {

	
	@Test
	public void excelTest() {
	
		ExcelUtility obj=new ExcelUtility();
		
		obj.openExcel(Constants.XL_FILEPATH,"EmployeeDetails");
		
		String value=obj.getCellData(4, 3);
		
		System.out.println(value);
		
		//retrieve all values from excell and store intoDataProvider (2D Object array)
		
		int row=obj.getRowNum();
		int cols=obj.getColNum(0);
		 
		Object[][] data=new Object[row][cols];
		// loop through each row and column
		for(int x=1; x<row;x++) {
			for(int y=0;y<cols;y++) {
				
				String allValue=obj.getCellData(x, y);
				
				data[x][y]=value;
				
				
				
				
			}
		}
		
		
	}
}
