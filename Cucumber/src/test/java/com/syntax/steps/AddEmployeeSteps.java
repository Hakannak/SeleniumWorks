package com.syntax.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddEmployeeSteps extends CommonMethods {
       
	LoginPage login;
	HomePage hom;
	AddEmployeePage add;
	
	
	
	@Given("I logged in into OrangeHrm")
	public void i_logged_in_into_OrangeHrm() {
        login=new LoginPage()	;
        login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("I click on PIM link")
	public void i_click_on_PIM_link() {
	    hom=new HomePage();
	    click(hom.PIM);
	}

	@When("I click on Add Employee link")
	public void i_click_on_Add_Employee_link() {
	    click(hom.addEmployee);
	}

	@When("I provide Employee details")
	public void i_provide_Employee_details(String fName,String mName,String lName,String location) {
	    add=new AddEmployeePage();
		sendText(add.firstName,fName);  
		sendText(add.middleName, mName);
	    sendText(add.lastName, lName);
	    click(add.location);
	   selectList(add.locationList, location);
		
		
	}

	@When("I click on save button")
	public void i_click_on_save_button() {
	   click(add.saveBtn);
	}

	@Then("I see employee is added successfully")
	public void i_see_employee_is_added_successfully() {
	   waitForElementBeClickable(add.empCheck2, 20);
	   String empName=add.empCheck2.getText();
	   Assert.assertEquals("Add Employee Wizard", empName);
	}

	@Then("I see following labels")

	public void i_see_following_labels(DataTable addEmpLabels) {

		List<String> labels = addEmpLabels.asList();

		System.out.println("----Printing labels from cucumber dataTable----");

		for (String label : labels) {

			System.out.println(label);

		}

		System.out.println("----Printing labels text from the application----");
		
		List<WebElement> labelList = add.addEmpLabels;

		for (WebElement label : labelList) {

			String labeltxt = label.getText();

			System.out.println(labeltxt.replace("*", ""));

		}


	}

}
