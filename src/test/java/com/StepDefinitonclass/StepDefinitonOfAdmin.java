package com.StepDefinitonclass;

import com.Actions.AdminJobAction;
import com.Utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitonOfAdmin {
	
	AdminJobAction Action = new AdminJobAction();
	

	@Given("User Logins into the Application")
	public void user_logins_into_the_application() {
	   HelperClass.openPage(null);
	}

	@When("User selects Admin")
	public void user_selects_admin() {
	    
	}

	@When("User selects Job")
	public void user_selects_job() {
	   
	}

	@When("User selects Employee Status")
	public void user_selects_employee_status() {
	  
	}

	@When("User Clicks on Add button")
	public void user_clicks_on_add_button() {
	   
	}

	@When("User Enters the Employee Status")
	public void user_enters_the_employee_status() {
	   
	}

	@When("User Clicks on Save button")
	public void user_clicks_on_save_button() {
	    
	}

	@Then("User Recevices Successfully Saved message")
	public void user_recevices_successfully_saved_message() {
	    
	}
}
