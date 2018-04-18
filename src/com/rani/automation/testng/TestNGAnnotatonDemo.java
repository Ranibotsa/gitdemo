package com.rani.automation.testng;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotatonDemo 
{
	@Test
	public void testCase1()
	{
		System.out.println("This is a Testcase1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("This is a Testcase2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
	System.out.println("This is excute before every method");
	}
	@AfterMethod()
	public void afterMethod()
	{
    System.out.println("This is excute after every method");
	}
    @org.testng.annotations.BeforeClass		
   public void beforeClass()
   {
	

	System.out.println("This is excute before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is excute after class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is excute before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is excute after test");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is excute before suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is excute after test");
	}
	}

		

	

		


		
	


	

		

		
	

		

	
	


	

		

	

	
	




