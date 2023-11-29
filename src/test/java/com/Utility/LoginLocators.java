package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginLocators {
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="(//div[@class='oxd-form-actions orangehrm-login-action']//button)")
	WebElement loginButton;
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement verifyText;
	@FindBy(xpath="//i[contains(@class,'oxd-icon bi-exclamation-circle')]/following-sibling::p[1]")
	WebElement errorText;
}