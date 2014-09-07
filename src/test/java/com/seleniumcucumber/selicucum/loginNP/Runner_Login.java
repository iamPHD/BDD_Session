package com.seleniumcucumber.selicucum.loginNP;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "resources",
		//format={"html:output"}
		//tags={"@login"},
		format={"json:target/integration_cucumber.json"}
		)
public class Runner_Login {

}
