package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");

		WebDriver driver2 = new ChromeDriver();

		driver2.navigate().to("https://www.walmart.com");

		Thread.sleep(3000);
		driver2.navigate().to("http://google.com");
		Thread.sleep(1000);
		driver2.navigate().back();
		Thread.sleep(3000);
		driver2.navigate().forward();
		driver2.navigate().refresh();
		
		System.out.println(driver2.getTitle());

		driver2.close();

		// driver2.navigate().forward();

	}

}
