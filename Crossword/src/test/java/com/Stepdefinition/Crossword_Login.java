package com.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.Library;
import com.excelutility.ExcelUtil;
import com.pages.Crossword_LoginPage;
import com.seleniumutility.SeleUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Crossword_Login extends Library {
	
	
	Logger LOG = LogManager.getLogger(Crossword_LoginPage.class.getName()); 
	SeleUtil util;
	Crossword_LoginPage mylogin;
	
	

	@Given("^I launch the browser and enter the url$")
	public void i_launch_the_browser_and_enter_the_url() throws IOException   {
		launch();
		 LOG.info("Browser is launched");
		 System.out.println("Browser is Launched");
		 //mylogin =new Crossword_LoginPage(driver);
	    
	}

	@When("^login page is opened$")
	public void login_page_is_opened()  {
	   mylogin =new Crossword_LoginPage(driver);
		mylogin.login();
		LOG.info("Login Page is Called");
}


	@Then("^I enter the (.+) and (.+)$")
	public void i_enter_the_and(String username, String password) throws PendingException {
		mylogin.login_details(username,password);
		 LOG.info("Username and Password is entered in respected fields");
		
	}

	@And("^I click on the signin button$")
	public void i_click_on_the_signin_button() throws Throwable  
	{
		mylogin.submit();  
		Thread.sleep(900);
		LOG.info("Clicked on Signin Button");
		util = new SeleUtil(driver);
		util.ScreenShot("C:\\Users\\Hari Work Station\\eclipse-workspace\\Crossword\\src\\test\\resources\\screenshots\\Crossword_LoginPage .png");
	}
}
