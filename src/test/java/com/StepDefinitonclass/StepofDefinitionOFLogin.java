package com.StepDefinitonclass;

import org.junit.Assert;

import com.Actions.LoginActions;
import com.Utility.HelperClass;
import com.Utility.dataProperties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepofDefinitionOFLogin{
	LoginActions logac = new LoginActions();
	dataProperties data = new dataProperties();
	
	
	
	@Given("User landed at orangehrm.com HomePage")
	public void user_landed_at_orangehrm_com_home_page() {
		 HelperClass.openPage(data.url);
		   HelperClass.log.info("Landed in Home page");
		
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
		logac.loginAccount(data.username, data.password);
		   HelperClass.log.info("Enters Valid Credentials");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	   logac.clickLoginButton();
	}

	@Then("User see the login successful message")
	public void user_see_the_login_successful_message() {
		Assert.assertTrue(logac.getVerifyText().contains("Dashboard"));
	    
	    HelperClass.log.info("Login Successfull");
	}

	@When("User enter the invalid username and password")
	public void user_enter_the_invalid_username_and_password() {
		logac.loginAccount(data.username1,data.password1);
	    HelperClass.log.info("Enters Invalid Credentials");
	}

	@Then("User see the error message")
	public void user_see_the_error_message() {
		Assert.assertTrue(logac.getErrorText().contains("Invalid credentials welcome"));
		  HelperClass.log.info("Error Message occured");
	}


}