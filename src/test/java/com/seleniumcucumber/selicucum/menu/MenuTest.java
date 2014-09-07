package com.seleniumcucumber.selicucum.menu;

import java.util.List;

import org.junit.Assert;

import com.seleniumcucumber.selicucum.webconnector.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class MenuTest {
	
	WebConnector selenium = WebConnector.getInstance();
	
	@Given("^I am logged into salesforce in \"([^\"]*)\"$")
	public void I_am_logged_into_salesforce(String browser){
		//check if looged in, if not log in
		selenium.openBrowser(browser);
		if(!selenium.isLoggedIn()){
			/*
			//write code to login into salesforce
			selenium.navigate("loginURL");
			selenium.type("adminusername", "loginusername");
			selenium.type("adminpassword", "loginpassword");
			selenium.click("loginbutton");
			*/
			
		// Instead of writing above code u can write below code
			selenium.doDefaultLogin();
		}
	}
	
	@Then("^All tabs on menu should be present$")
	public void All_tabs_on_menu_should_be_present(DataTable table){
		List<String> names =  table.asList(String.class);
		for(int i=0;i<names.size();i++){
			Assert.assertTrue("Element not found in menu " + names.get(i), selenium.isElementPresent_Xpath(names.get(i)));
		}
	}
	
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object){
		selenium.click(object);
	}
	
	@Then("^\"([^\"]*)\" element should be present$")
	public void element_should_be_present(String object){
		Assert.assertTrue("Object not found " + object, selenium.isElementPresent(object));
	}
}
