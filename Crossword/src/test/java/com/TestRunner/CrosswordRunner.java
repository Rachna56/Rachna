package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/Features",
		glue = {"com.Stepdefinition"},
		plugin = {"pretty", "html:reports/cucumber-html-report",
				"com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
		tags = {"@TC_01_Crossword,@TC_02_Crossword,@TC_03_Crossword"},
		dryRun=false,
		monochrome= true
		)
public class CrosswordRunner {

}
