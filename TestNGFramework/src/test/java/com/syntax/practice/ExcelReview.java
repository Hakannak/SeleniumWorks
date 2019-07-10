package com.syntax.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReview {
  
	@Test
	public void readExcel() throws IOException {
	String xlPath="src/test/resources/testData/OrangeHRMdata.xlsx";
     
	FileInputStream fis=new FileInputStream(xlPath);
	
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
	XSSFSheet sheet=workbook.getSheet("EmployeeDetails");
	
	//access value of specific cell
	
	String value=sheet.getRow(5).getCell(0).toString();
	System.out.println(value);
	
	//get number of col and row
	
	int row=sheet.getPhysicalNumberOfRows();
	int cols=sheet.getRow(0).getLastCellNum();
	
	System.out.println("Number of cols and row : "+cols+" "+row);
	
	//get value from each cell 1 by 1
	
	for(int a=0; a<row;a++) {
		
		for(int b=0; b<cols; b++) {
			
			String cellValue=sheet.getRow(a).getCell(b).toString();
			System.out.print(cellValue+" ");
		}
	   System.out.println();
	}
	
	
	
	//close workbook and stream
	
	workbook.close();
	
	fis.close();
	
	}
}