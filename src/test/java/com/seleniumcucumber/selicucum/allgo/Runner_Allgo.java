package com.seleniumcucumber.selicucum.allgo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format={"html:output"}
		format={"json:target/integration_cucumber.json"},
		tags={"@login,@menu"}
		)
public class Runner_Allgo {

}
