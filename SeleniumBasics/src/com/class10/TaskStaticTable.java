package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class06.CommonMethods;

public class TaskStaticTable  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://the-internet.herokuapp.com/";
		
		setUpDriver("chrome", url);
        
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
        System.out.println("Number of rows ="+rows.size());
		
		System.out.println("-----------ROW DATA-----------------");
		Iterator<WebElement>it=rows.iterator();
		
		while(it.hasNext()) {

		String rowsText=it.next().getText();
		System.out.println(rowsText);
		}
       
		List<WebElement>cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        
		System.out.println("Number of colums ="+cols.size());
		
		System.out.println("-----------COLUMNS HEADERS-----------------");
		
		for(WebElement col :cols) {
			
			String colsText=col.getText();
			System.out.println(colsText);
		}
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
