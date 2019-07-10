package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddEmployeePage extends BaseClass{

	@FindBy(css="input#firstName")
	
	public WebElement firstName;
	
	@FindBy(id="middleName")
	
	public WebElement middleName;
	
	@FindBy(id="lastName")
	
	public WebElement lastName;
	
	@FindBy(id="employeeId")
	
	public WebElement employeeId;
	
	@FindBy(xpath="//div[@id='location_inputfileddiv']//input")
    public WebElement location;
    
    @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
    public WebElement locationList;
	
    @FindBy(xpath="//input[@id='chkLogin']")
    public WebElement createLoginDetails;
    
    @FindBy(id="systemUserSaveBtn")
    public WebElement saveBtn;
    
    @FindBy(xpath="//span[@id='pim.navbar.employeeName']")
    public WebElement empCheck;
	
    @FindBy(css="span[data-tooltip=\"Add Employee Wizard\"]")
    public WebElement empCheck2;
    
    @FindBy(xpath="//form[@id='pimAddEmployeeForm']")
    public List<WebElement> addEmpLabels;
	
	public AddEmployeePage() {
		
		PageFactory.initElements(driver, this);
	}
}
