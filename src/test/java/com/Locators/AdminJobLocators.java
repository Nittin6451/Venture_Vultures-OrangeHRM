package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminJobLocators {

	@FindBy(name="username")
	public WebElement Username;
	
	@FindBy(name="password")
	public WebElement Password;
	
	@FindBy(className="oxd-main-menu-item active")
	public WebElement Admin;
	
	@FindBy(xpath = "//nav[@class=\"oxd-topbar-body-nav\"]//child::li[@class='oxd-topbar-body-nav-tab --parent --visited']//following-sibling::li[@class='oxd-topbar-body-nav-tab --parent'][1]")
	public WebElement Job;
	
	@FindBy(xpath = "//a[text()='Employment Status']")
	public WebElement EmploymentStatus;
	
	@FindBy(className = "oxd-button oxd-button--medium oxd-button--secondary")
	public WebElement AddButton;
	
	@FindBy(xpath ="//div[@class='oxd-input-group__label-wrapper']//following-sibling::div//child::input[@class='oxd-input oxd-input--active']")
	public WebElement AddEmpDetails;
	
	@FindBy(className = "oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space")
	public WebElement SaveButton;
	
	@FindBy(className = "oxd-topbar-header-breadcrumb")
	public WebElement AssertJob;
	
}
