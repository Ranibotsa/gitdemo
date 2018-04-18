package com.rani.automation.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	
		WebDriver driver;
		@BeforeSuite
		public void browserOpen()
		{
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		@AfterSuite
		public void closeBrowser()
		{
			driver.quit();
		}
					@Test(priority=2,enabled=true)
					public void amain()
					{
						driver.get("http://www.facebook.com");
						System.out.println("facebook");
						
						
					}

					@Test(priority=1,enabled=false)

	                 public void gmail()
	                 {
									

						  driver.get("http://www.gamil.com");
						System.out.println("gmail");
					}
					@Test(priority=0)
	                public void bmain()
	                {
									

						  driver.get("http://www.google.com");
						System.out.println("google");
					}
					
						
					
						
						
			
		}





