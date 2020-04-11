package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Crossword_AccountPage {
	
          WebDriver driver;
		Crossword_LoginPage mylogin;
		public Crossword_AccountPage(WebDriver driver) {
			this.driver=driver;
		
		}
		
	public void dologin(String username,String password)
	{
		mylogin=new Crossword_LoginPage(driver);
		mylogin.url();
		mylogin.login();
		mylogin.login_details(username, password);
		mylogin.submit();
		
		
	}

	
	public void myaccount()
	{
		driver.findElement(By.linkText("My Account")).click();
	
		driver.findElement(By.xpath("//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"left-slot\"]/div/ul/li[4]/a")).click();
	}

	public void address()
	{
	driver.findElement(By.xpath("//*[@id=\"new-addr-link\"]")).click();
	}
	
	public void update(String name, String address,String city, String pincode, String Mobilenumber )
	{
		driver.findElement(By.xpath("//*[@id=\"address_name\"]")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"address_address\"]")).sendKeys(address);
//		Select country= new Select(driver.findElement(By.xpath("//*[@id=\"address_country\"]")));//.deselectByVisibleText("India");
//		country.selectByVisibleText("India");
//		Select state=new Select(driver.findElement(By.xpath("//*[@id="address_state"]")));
//		state.selectByValue("Tamil Nadu");
		driver.findElement(By.xpath("//*[@id=\"address_city\"]")).sendKeys(city);
		driver.findElement(By.xpath("//*[@id=\"address_zip\"]")).sendKeys(pincode);
		driver.findElement(By.xpath("//*[@id=\"address_mobile\"]")).sendKeys(Mobilenumber);
	}
	
	public void create()
	{
		driver.findElement(By.name("commit")).click();
		
		
	}
	
}
