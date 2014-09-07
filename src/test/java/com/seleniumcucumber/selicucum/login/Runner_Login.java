package com.seleniumcucumber.selicucum.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "resources",
		//format={"html:output"}
		format={"json:target/integration_cucumber.json"},
		tags={"@login"})
public class Runner_Login {

}
