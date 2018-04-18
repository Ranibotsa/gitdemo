package com.rani.automation.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.rani.automation.utilities.DriverUtilities;
import com.rani.automation.utilities.ScreenShotUtility;

public class DriverEngine
{
 private static WebDriver driver;
 private static String tcName;
 @Parameters({"browser"})
 @BeforeSuite
 public void browserOpen( @Optional("firefox") String browser)
 {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty(DriverUtilities.chromeKey,DriverUtilities.chromeValue);
		 driver=new ChromeDriver();
		 browserInit();
		 System.out.println("helllo");
	 }
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
		 driver=new FirefoxDriver();
		 browserInit();
	 }
	 else
	 {
		 System.out.println("pass proper parameter");
	 }
 }
	 
@AfterSuite
			 public void closeBrowser()
			 {
	if(driver!=null)
				 driver.close();
	else
		 System.out.print("Driver is pointingto null........");
			 }

		public void browserInit()
		{			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		static public WebDriver getWebDriver()
		{
		return driver;
		}
		@BeforeMethod
		public void beforeTCExecution(Method method)
		{
			String tcName=method.getName();
			 System.out.print("Currently excuting tc is:"+ tcName);
		}
		@AfterMethod
		public void afterTCEexcution(ITestResult result) throws IOException
		{
	 tcName=result.getName();
	 if(result.getStatus()==ITestResult.FAILURE)
	 {
		 System.out.print(tcName+ ":TC is failed so taking screenshot");
		 ScreenShotUtility.screenShot();;
	 }
	 else if(result.getStatus()==ITestResult.SUCCESS)
	 {
		 System.out.print(tcName+ ":TC is passed so not taking screenshot");
	 }
	 else if(result.getStatus()==ITestResult.SKIP)
	 {
		 ScreenShotUtility.screenShot();
	 }
		}
	 static public String getTCName()
		{
		return tcName;
		}

		 

	 

		 

		 		

		 
	 }
		
		

			
		

		
		
			
			

			 
	 
		 
		
	 
	 
 
 
		
	


