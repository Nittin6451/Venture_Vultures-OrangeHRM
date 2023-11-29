package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeLocators {
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[4]")
	WebElement timeclick;
	@FindBy(xpath="//span[text()='Project Info ']")
	WebElement projectinfoclick;
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")
	WebElement projectclick;
	@FindBy(xpath="//button[text()=' Add ']")
	WebElement selectadd;
	@FindBy(xpath="//label[text()='Name']/following::input")
	WebElement customername;
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	WebElement description;
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement savebutton;
	@FindBy(xpath="//h6[text()='Customers']")
	WebElement verifyemployee;
}
