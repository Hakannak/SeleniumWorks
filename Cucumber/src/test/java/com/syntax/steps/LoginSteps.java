package com.syntax.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginSteps extends CommonMethods{

	LoginPage login;
	
	@Given("I see OrangeHrm logo")
	public void i_see_OrangeHrm_logo() {
	   login=new LoginPage();
		boolean isDisplayed=login.logo.isDisplayed();
		Assert.assertTrue(isDisplayed);
		
	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
	    sendText(login.userName, "Admin");
	    sendText(login.password, "4Q@RvpIjB3");
	    
	}

	@When("I click login button")
	public void i_click_login_button() {
	    click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
	   HomePage home=new HomePage();
	   boolean disp=home.dashboardText.isDisplayed();
	   Assert.assertTrue(disp);
	}

	@When("I enter invalid username and password I see errorMessage")
	public void i_enter_invalid_username_and_password_I_see_errorMessage(DataTable wrongCredentials) {
	  List<Map<String, String>> maps = wrongCredentials.asMaps();
	
	  for(Map<String, String>map: maps) {
		  //printing values of each key
		  System.out.println(map.get("UserName"));
	      System.out.println(map.get("Password"));
	      System.out.println(map.get("ErrorMessage"));
	      System.out.println("-----------------------------");
	      //passing username and password values from datatable/map
	      sendText(login.userName, map.get("UserName"));
	      sendText(login.password, map.get("Password"));
	      click(login.loginBtn);
	      //verifying text of error message
	      String actualError=login.message.getText().trim();
	      String expectedError=map.get("ErrorMessage");
	      Assert.assertEquals(expectedError,actualError);
	      
	       
	  }
	
	}
	
	
}
