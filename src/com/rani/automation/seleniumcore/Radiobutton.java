package com.rani.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Radiobutton {

	public static void main(String[] args) 
	{
		WebDriver webdriver=new FirefoxDriver();
		webdriver.get("http://www.facebook.com");
		WebElement female= webdriver.findElement(By.name("sex"));
		if(female.isDisplayed()&&female.isEnabled())
			female.click();
		else
			System.out.println("Element is not found");
		if(female.isSelected());
		else
			System.out.println("female radio is not selected");
			
		

	}

}
