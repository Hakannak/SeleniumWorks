package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.navigate().to("https://syntaxtechs.com/");
		Thread.sleep(2000);
		driver1.navigate().to("https://google.com");
		Thread.sleep(2000);
		driver1.navigate().back();
		Thread.sleep(2000);
		driver1.navigate().refresh();
		Thread.sleep(2000);
		String title = driver1.getTitle();

		if (title.contains("Syntax")) {
			System.out.println("This is rigth page that you clicked");
		} else {
			System.out.println("You are at the wrong page");
		}

		driver1.close();

	}

}
