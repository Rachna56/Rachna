package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Library {
	
	public WebDriver driver;
	       Properties prop;
	
	
public void launch() throws IOException {
	
	
		//Locating the Path of the file
		FileInputStream objfile = new 	FileInputStream(new File("C:\\Users\\Hari Work Station\\eclipse-workspace\\Crossword\\src\\test\\resources\\Configuration Property\\config.property"));
		//Creating the object to the property file
		prop = new Properties();
		
		//Loading the property file into the object
		prop.load(objfile);
		
		//Initialising the browser name
		String browserName = prop.getProperty("browser");
		try
		{   
			//Checking the browser name 
		      if(browserName.equalsIgnoreCase("chrome"))
		     {
		
	                 System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	                 driver =new ChromeDriver();
		     }
		      else 
				   //Checking the browser name
				  if(browserName.equalsIgnoreCase("firefox"))
				 {
					  //Initiialising the Driver
					  System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
					driver = new FirefoxDriver();
				 }
			      

		      driver.manage().window().maximize();//maximizing the window
              driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//implicitily waiting for driver 
            //Getting the url from the property file
    		  driver.get(prop.getProperty("url"));
      }    
		
		
		 catch(WebDriverException e)
		{
			  //printing the message
			System.out.println("browser could not be launched");
		}
		
	}

	  public void quit()
	{
		  //Closing the driver
		driver.close();
	}

}

	
	
		      
		      
		     



