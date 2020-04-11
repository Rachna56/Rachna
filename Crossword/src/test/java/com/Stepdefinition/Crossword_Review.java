package com.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.Library;
import com.excelutility.ExcelUtil;
import com.pages.Crossword_AccountPage;
import com.pages.Crossword_LoginPage;
import com.pages.Crossword_ReviewPage;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Crossword_Review extends Library  {
	//Crossword_ReviewPage review1=new Crossword_ReviewPage(driver);
	Logger LOG = LogManager.getLogger(Crossword_ReviewPage.class.getName()); 
	SeleUtil util;
	//Crossword_ReviewPage review1 =null;
	ExcelUtil excel=null;
	
	 @Given("^I launch the login page$")
	    public void i_launch_the_login_page() throws IOException, InterruptedException{
	       launch();
	      
			excel = new ExcelUtil();
			Crossword_LoginPage mylogin = new Crossword_LoginPage(driver);
			mylogin.url();                               //calling the methods which are used in login page
			mylogin.login();  
	        mylogin.login_details(excel.excel_username(1), excel.excel_password(1)); 
	        mylogin.submit();// getting values from excel sheet
			Thread.sleep(900);
			LOG.info("launched the application");
	 
	 }
	       
	  @When("^I search a book$")
	    public void i_search_a_book(){
		  Crossword_ReviewPage review1=new Crossword_ReviewPage(driver);  
		  review1.search();
	    }

	    @Then("^I click on the book$")
	    public void i_click_on_the_book() {
	    	Crossword_ReviewPage review1=new Crossword_ReviewPage(driver); 
	    	review1.view();
	       LOG.info("clicked on books");
	    }

	    @Then("^I enter the (.+) for the book$")
	    public void i_enter_the_for_the_book(String review) {
	    	Crossword_ReviewPage review1=new Crossword_ReviewPage(driver); 
	    	review1.rating(review);
	    	LOG.info("quick view of the books");
	    }

	    @And("^I click the submit button$")
	    public void i_click_the_submit_button()  {
	    	Crossword_ReviewPage review1=new Crossword_ReviewPage(driver); 
	    	review1.submit();
	        LOG.info("submitted the review");
	        util = new SeleUtil(driver);
			util.ScreenShot("C:\\Users\\Hari Work Station\\eclipse-workspace\\Crossword\\src\\test\\resources\\screenshots\\Crossword_ReviewPage .png");
	    }

	}