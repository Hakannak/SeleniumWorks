package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();

		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Thread.sleep(2000);
		boolean isDisp = driver.findElement(By.cssSelector("div[class='peek']")).isDisplayed();

		if (isDisp) {
			System.out.println("You have logged in succesfully");
		} else {
			System.out.println("You have not logged in succesfully");
		}

		String text = driver.findElement(By.cssSelector("div[class='product_label']")).getText();

		if (text.equalsIgnoreCase("products")) {

			System.out.println("You have logged in succesfully");
		} else {
			System.out.println("You have not logged in succesfully");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
