package com.seleniumcucumber.selicucum.login;



import org.junit.Assert;

import com.seleniumcucumber.selicucum.webconnector.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//step layer
public class LoginTest {
	//WebConnector selenium = new WebConnector();
	//In order to open only one instance of browser of a type make webconnector class as singleton
	//Initialize webconnector as below
	WebConnector selenium = WebConnector.getInstance();
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_Go_To_Salesforce(String url,String browser){
		System.out.println("I am going to " + url + " on " + browser);
		selenium.openBrowser(browser);
		selenium.navigate(url);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object,String text){
		System.out.println("Entering in " + object + " value " + text);
		selenium.type(text, object);
	}
	
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object){
		System.out.println("Clicking on " + object);
		selenium.click(object);
	}
	
	@Then("^login should be \"([^\"]*)\"$")
	public void Then_login_should_be(String expectedResult){
		System.out.println("Login - " + expectedResult);
		boolean result = selenium.isElementPresent("choice");
		String actualResult = null;
		 if(result)
			 actualResult = "success";
		 else
			 actualResult = "failure";
		 Assert.assertEquals(expectedResult, actualResult);
	}			
}
