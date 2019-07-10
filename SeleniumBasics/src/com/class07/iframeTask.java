package com.class07;

import org.openqa.selenium.By;

import com.class06.CommonMethods;

public class iframeTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(inter==true) {
			driver.switchTo().defaultContent();
			driver.close();
		}
		
		

	}

}