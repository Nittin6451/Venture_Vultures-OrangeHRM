package com.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Locators.AdminJobLocators;
import com.Utility.HelperClass;

public class AdminJobAction {

	WebDriver driver;
	AdminJobLocators locator = null;
	
	public AdminJobAction() {
		this.locator = new AdminJobLocators();
		PageFactory.initElements(HelperClass.getDriver(),locator);
	}
	
	public void getUsername(String Username) {
		locator.Username.sendKeys(Username);
	}
	public void getPassword(String Password) {
		locator.Password.sendKeys(Password);
	}
	public void getAdmin() {
		locator.Admin.click();
	}
	public void getJob() {
		locator.Job.click();
	}
	public void getEmployeeStatus() {
		locator.EmploymentStatus.click();
	}
	public void getAddButton() {
		locator.AddButton.click();
	}
	public void setAddEmpDetails(String EmpDetails) {
		locator.AddEmpDetails.sendKeys(EmpDetails);
	}
	public void getSaveButton() {
		locator.SaveButton.click();
	}
	public void getAssertJob() {
		locator.AssertJob.getText();
	}
	
}
