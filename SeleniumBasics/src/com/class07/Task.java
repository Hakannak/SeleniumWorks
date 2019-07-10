package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.class06.CommonMethods;

public class Task extends CommonMethods {

	public static String expect1 = "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
	public static String expect2 = "New Window";
	public static String expect3 = "The Internet";

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		String parentId = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle.size());
		Iterator<String> it = handle.iterator();
		while (it.hasNext()) {
			String childOneId = it.next();
			if (!childOneId.equals(parentId)) {
				driver.switchTo().window(childOneId);
				Thread.sleep(2000);
			}
		}
		String actualChildOneTitle = driver.getTitle();
		if (actualChildOneTitle.equalsIgnoreCase(expect1)) {
			System.out.println("title is displayed ");
		} else {
			System.out.println("title is not displayed");
		}

		driver.close();
		driver.switchTo().window(parentId);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		handle = driver.getWindowHandles();
		it = handle.iterator();
		while (it.hasNext()) {
			String childTwoId = it.next();
			if (!childTwoId.equalsIgnoreCase(parentId)) {
				driver.switchTo().window(childTwoId);
				Thread.sleep(2000);
			}
		}
		String actualChildTwoTitle = driver.getTitle();
		if (actualChildTwoTitle.equals(expect2)) {
			System.out.println("title is displayed ");
		} else {
			System.out.println("title is not displayed ");
		}
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentId);
		String actualParentTitle = driver.getTitle();
		if (actualParentTitle.equals(expect3)) {
			System.out.println("title is displayed ");
		} else {
			System.out.println("title is not displayed ");
		}
		driver.close();
	}

}
