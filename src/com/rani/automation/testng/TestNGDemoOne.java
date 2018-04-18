package com.rani.automation.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemoOne
{
	WebDriver driver;
	@BeforeSuite
	public void browserOpen()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void closebrowser() 
	{

		driver.quit();
	}
	@Test
	public void main()

	{
		driver.get("http://www.flipcart.com");
		System.out.println("flipcart");
	}
	

}



