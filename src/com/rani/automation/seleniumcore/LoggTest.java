package com.rani.automation.seleniumcore;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class LoggTest {

	public static void main(String[] args)
	{
		Logger logger= Logger.getLogger("LoggTest.class");
		PropertyConfigurator.configure("D:\\Java Programs_workspace\\Java\\log4j.properties");
	WebDriver driver= new FirefoxDriver();
	logger.info("Browser is opened");
						
	driver.manage().window().maximize();
	logger.info("wimdow is maximize");
	driver.get("http://www.gmail.com");
	logger.info("Entered url as://wwww.gmail.com");
	}
}  
	
	
	
		
		
		
		
		

	
