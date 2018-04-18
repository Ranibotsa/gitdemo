package com.rani.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LinkTest
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\chromedriver.exe");
		
RemoteWebDriver webdriver = new ChromeDriver();
webdriver.get("http://www.gmail.com");
WebElement username= webdriver.findElement(By.xpath("//input[@id='identifierId']"));
	
		username.click();
		username.sendKeys("botsakeerthi");
	}

}
