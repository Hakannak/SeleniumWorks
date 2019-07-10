package com.syntax.testcases;

import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithoutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends BaseClass {

	@Test(enabled = true, groups = "Smoke")
	public void loginToOrangeHRM() {
		logger= report.createTest("Positive login");
		LoginPageWithoutPageFactory login = new LoginPageWithoutPageFactory();
		logger.info("Loggin in with valid credentials");
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "06I@PjFbgM");
		CommonMethods.click(login.btnLogin);
		logger.info("Verifying dashboard text is displayed");

		HomePage home = new HomePage();
		boolean isDisplayed = home.dashboardText.isDisplayed();
		Assert.assertTrue(isDisplayed);
		logger.info("Successfully logged in");
	}

	@Test(groups = "Smoke")
	public void doLogin() {
		logger= report.createTest("Login verification 2");
		LoginPage login = new LoginPage();
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginBtn);

		HomePage home = new HomePage();
		boolean isDisplayed = home.dashboardText.isDisplayed();
		Assert.assertTrue(isDisplayed);
		logger.pass("Login verification passed");

	}

	/*
	 * Verify user is unable to login with wrong credentials
	 */

	@Test(groups = "Smoke")
	public void negativeLogin() {

		LoginPage login = new LoginPage();

		login.login("admins", "test");

		String errorText = login.message.getText();

		System.out.println(errorText);

	}

}