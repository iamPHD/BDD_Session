package com.seleniumcucumber.selicucum.createLead;

import com.seleniumcucumber.selicucum.webconnector.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CreateLead_P {
	WebConnector selenium = WebConnector.getInstance();
	
	@Given ("^I am logged into salesforce in \"([^\"]*)\"$")
	public void I_am_logged_in_salesforce(String browser){
		//Assert.assertTrue("Not Logged in ", selenium.isLoggedIn());
		//check if looged in, if not log in
		selenium.openBrowser(browser);
			if(!selenium.isLoggedIn()){
				selenium.doDefaultLogin();
			}
	}
	
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object){
		selenium.click(object);
	}

}
