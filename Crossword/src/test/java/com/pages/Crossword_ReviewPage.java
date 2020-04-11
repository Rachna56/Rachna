package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.excelutility.ExcelUtil;

public class Crossword_ReviewPage {
	
	WebDriver driver;
	Crossword_LoginPage mylogin;
	public Crossword_ReviewPage(WebDriver driver) {
		this.driver=driver;
	
	}
	
public void dologin(String username,String password) throws IOException
{
	mylogin=new Crossword_LoginPage(driver);
	mylogin.url();
	mylogin.login();
	
	mylogin.login_details(username, password);
	mylogin.submit();
	
	
}

public void search()
{
	//driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("Urban naxals");
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/div/form/input")).sendKeys("Urban naxals");
	//driver.findElement(By.xpath("//*[@id=\"search\"]/span[3]/input")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/div/form/span[3]/input")).click();
}

public void view()
{
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/ul/li/div/div[2]/a")).click();
}

public void rating(String review)
{
	driver.findElement(By.className("write-review")).click();
	driver.findElement(By.className("rating")).click();
	driver.findElement(By.name("review_detail[review]")).clear();
	driver.findElement(By.name("review_detail[review]")).sendKeys(review);
}	
	
public void submit()
{
	driver.findElement(By.id("review_detail_submit" )).click();

}



















}
