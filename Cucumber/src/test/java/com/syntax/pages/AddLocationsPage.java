package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddLocationsPage extends BaseClass {

	@FindBy(xpath = "//label[@class=\"active\"]/../input")
	public WebElement employeeName;

	@FindBy(xpath = "//div[@id=\"countryCode_inputfileddiv\"]/div/input")
	public WebElement country;

	@FindBy(xpath = "//div[@id=\"countryCode_inputfileddiv\"]/div/ul")
	public WebElement countryList;

	@FindBy(id = "city")
	public WebElement city;

	@FindBy(id = "zipCode")
	public WebElement zipCode;

	@FindBy(css = "a[form-name=\"locationsModalForm\"]")
	public WebElement saveBtn;

	@FindBy(xpath = "//li[text()='Locations']")
	public WebElement saveVerify;

	public AddLocationsPage() {

		PageFactory.initElements(driver, this);
	}

}
