package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.Library;

public class Crossword_LoginPage {
	
WebDriver driver;
	      By login1 =By.className("login");
		  By username1 =By.id("username"); 
		  By password1=By.id("password"); 
		  By LOGINsubmit=By.xpath("//*[@id=user_session_submit]");
		  
		  
		  public Crossword_LoginPage(WebDriver driver)
			{
			   
				this.driver=driver;
			}
			
	
		
		public void url() //to launch the chrome
		{
			driver.get("https://www.crossword.in/");
			System.out.println("url");
		
		
		}
		
		public void login()
		{
			driver.findElement(login1).click();
			
		}
		public void login_details(String username,String password)
		{
			
		driver.findElement(By.name("user_session[email]")).sendKeys(username);
		driver.findElement(By.name("user_session[password]")).sendKeys(password);
		}
		
		public void submit()
		{
			driver.findElement(By.name("commit")).click();
		}
	


}
