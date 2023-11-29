package com.Utility;

import org.openqa.selenium.support.PageFactory;

public class TimeActions {
TimeLocators TimLoc ;
	
	public TimeActions() {
		TimLoc = new TimeLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), TimLoc);
	}

}
