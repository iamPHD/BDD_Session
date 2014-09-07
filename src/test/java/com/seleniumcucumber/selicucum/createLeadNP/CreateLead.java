package com.seleniumcucumber.selicucum.createLeadNP;

import org.junit.Assert;

import com.seleniumcucumber.selicucum.webconnector.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
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
	
	@When("^I got to \"([^\"]*)\"$")
	public void I_got_to(String object){
		selenium.click(object);
	}
	
	@And("^I click on button \"([^\"]*)\"$")
	public void I_click_on(String object){
		selenium.click(object);
	}
	
	@And("^I enter value \"([^\"]*)\" into the field \"([^\"]*)\"$")
	public void I_enter_value_into_the_field(String text, String object){
		selenium.type(text, object);
	}
	
	@Then("^lead creation should be \"([^\"]*)\"$")
	public void Then_lead_creation_should_be(String expectedResult){
		System.out.println("Login - " + expectedResult);
		boolean result = selenium.isElementPresent_Xpath("success");
		String actualResult = null;
		 if(result)
			 actualResult = "success";
		 else
			 actualResult = "failure";
		 Assert.assertEquals(expectedResult, actualResult);
	}
	
}
