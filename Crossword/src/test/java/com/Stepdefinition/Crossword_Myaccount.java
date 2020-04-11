package com.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.Library;
import com.excelutility.ExcelUtil;
import com.pages.Crossword_AccountPage;
import com.pages.Crossword_LoginPage;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Crossword_Myaccount extends Library {
	
	
	Logger LOG = LogManager.getLogger(Crossword_AccountPage.class.getName()); 
	SeleUtil util;
	Crossword_AccountPage account =null;
	ExcelUtil excel=null;
	@Given("^I launch  browser login$")
	public void i_launch_browser_login() throws IOException, InterruptedException  {
	          launch();
			account = new Crossword_AccountPage(driver);
			excel = new ExcelUtil();
			Crossword_LoginPage mylogin = new Crossword_LoginPage(driver);
			mylogin.url();                               //calling the methods which are used in login page
			mylogin.login();  
	        mylogin.login_details(excel.excel_username(1), excel.excel_password(1)); 
	        mylogin.submit();// getting values from excel sheet
			Thread.sleep(900);
			LOG.info("launched the application");
	    }

	    @When("^I click on My Account$")
	    public void i_click_on_my_account()  {
	        account.myaccount();
	        LOG.info("clicked on myacount");
	    	
	    }

	    @Then("^I click on the address book and Add newaddress$")
	    public void i_click_on_the_address_book_and_add_newaddress()  {
	    	account.address();
	    	LOG.info("started editig the address");
	    	util = new SeleUtil(driver);
			util.ScreenShot("C:\\Users\\Hari Work Station\\eclipse-workspace\\Crossword\\src\\test\\resources\\screenshots\\Crossword_AccountPage .png");
	    }

	    @Then("^I add (.+),(.+),country,State,(.+),(.+),(.+)$")
	    public void i_add_countrystate(String name, String address, String city, String pincode, String mobilenumber) {
	    	
	    	account.update(name,address,city,pincode,mobilenumber);
	    	LOG.info("edited the address");
	    	
	    	
	    }

	    @And("^I click the create button$")
	    public void i_click_the_create_button()
	    { 
	    	account.create();
	    	LOG.info("updated the address");
	    }

	}