package com.rani.automation.seleniumcore;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicatesDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement dayDD=driver.findElement(By.id("day"));
		if(dayDD.getTagName().equalsIgnoreCase("select"))
		{
		Select select= new Select(dayDD);
		List elements=select.getOptions();
  		LinkedHashSet hashSet=new LinkedHashSet(elements); 
  		Set set=new LinkedHashSet(elements);
  		System.out.println(set);
		}
		else
		{
			List list=driver.findElements(By.cssSelector("#day>option"));
	  		Set set=new LinkedHashSet(list);
	  		


		}
		


	}

}
