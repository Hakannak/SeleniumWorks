package com.class04;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.CommonMethods;

public class taskOne extends CommonMethods {

	@BeforeMethod(alwaysRun = true, groups = { "Smoke", "Regressions" })

	public void setUp() {

		String url = "https://www.saucedemo.com/";
		setUpDriver("chrome", url);
		driver.manage().deleteAllCookies();
	}

	@Test(groups = "Smoke", priority = 0)

	public void logIn() throws InterruptedException {

		sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
		Thread.sleep(2000);
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		boolean isDisp = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		if (isDisp = true) {
			System.out.println("You have succesfully logged in");
		} else {
			System.out.println("You have not succesfully logged in");
		}

	}

	@Test(groups = "Regression", dependsOnMethods = "logIn", priority = 1)

	public void logIn2() throws InterruptedException {

		sendText(driver.findElement(By.xpath("//input[@type='text']")), "problem_user");
		Thread.sleep(2000);
		sendText(driver.findElement(By.xpath("//input[contains(@id,'word')]")), "secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);

	}

	@AfterMethod(alwaysRun = true, groups = "Smoke")

	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
	}

}
