package com.rani.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagName 
{

public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement dayDD=driver.findElement(By.id("day"));
		if(dayDD.getTagName().equalsIgnoreCase("select"))
		{
		Select select= new Select(dayDD);
		select.selectByIndex(6);
		Thread.sleep(3000);
		select.selectByVisibleText("4");
		Thread.sleep(3000);
		select.selectByValue("29");
		WebElement firstFile=select.getFirstSelectedOption();
		System.out.println("Tex is:"+ firstFile.getText() );//29
		if(select.isMultiple())
			System.out.println("multi select");
		else
			System.out.println("single select");
	List list =select.getOptions();
	System.out.println("The No.of elements:" +list.size());
	
		}
		else
		{
			WebElement e4= driver.findElement(By.cssSelector("#day>option:nth-child(4)"));
			e4.click();
		}
			
		}
	
		
		
			
			
		}
	
		
	
		


