package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(1000);	
		driver.manage().window().fullscreen();
		
		driver.get("https://amazon.com");
		
		driver.getTitle();
		
		WebElement dep=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		
		Select seldep=new Select(dep);
		
		List<WebElement>allop=seldep.getOptions();
		
		Iterator<WebElement>it=allop.iterator();
		
		while(it.hasNext()) {
			
			String Departments =it.next().getText();
            System.out.println(Departments);
		}
	    System.out.println(allop.size());
		seldep.selectByVisibleText("Computers");
		Thread.sleep(1000);	
		driver.quit();
	}

}
