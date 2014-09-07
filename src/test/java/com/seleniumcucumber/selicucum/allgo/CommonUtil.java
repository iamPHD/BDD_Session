package com.seleniumcucumber.selicucum.allgo;

import com.seleniumcucumber.selicucum.webconnector.WebConnector;

import cucumber.api.java.en.And;

public class CommonUtil {
	WebConnector selenium = WebConnector.getInstance();
	
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object){
		selenium.click(object);
	}
    
}
