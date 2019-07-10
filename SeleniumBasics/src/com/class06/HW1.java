package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {

	private static String expected;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("hakan");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("ak");

		WebElement maleRadio = driver.findElement(By.id("sex-0"));
		if (maleRadio.isEnabled()) {
			Thread.sleep(2000);
			maleRadio.click();
		}
		List<WebElement> exp = driver.findElements(By.name("exp"));

		System.out.println(exp.size());

		for (WebElement yexp : exp) {
			Thread.sleep(2000);
			yexp.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys("15-01-1994");
		Thread.sleep(2000);
		List<WebElement> prof = driver.findElements(By.name("profession"));

		for (WebElement profs : prof) {
			Thread.sleep(2000);
			profs.click();
			

			List<WebElement> list = driver.findElements(By.xpath("//input[@name='tool']"));

			for (WebElement tool : list) {
				String automationTools = tool.getAttribute("value");
				if (tool.isEnabled()) {
					System.out.println(automationTools + " is clickable");
				}
				if (automationTools.equals("Selenium Webdriver")) {
					System.out.println(automationTools);
					Thread.sleep(2000);
					tool.click();

					WebElement continentDD = driver.findElement(By.id("continents"));

					Select obj = new Select(continentDD);

					obj.selectByIndex(3);

				}
			}
		}
		Thread.sleep(2000);
		driver.quit();
	
	}
	
}