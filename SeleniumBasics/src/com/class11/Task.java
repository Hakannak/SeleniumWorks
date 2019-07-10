package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.class06.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";

		setUpDriver("chrome", url);

		String filePic = "D:/Foto/hkn.jpg";
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys(filePic);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String expectText = "File uploaded!";
		String alertText = confirmAlert.getText();
		if (alertText.equals(expectText)) {
			System.out.println("You uploaded the file succesfully");
		} else {
			System.out.println("You did not uploaded the file");
		}
		confirmAlert.accept();
		TakesScreenshot camera = (TakesScreenshot) driver;
		File hkn = camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(hkn, new File("screenshots/Google/hkn.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Photo is not uploaded");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
