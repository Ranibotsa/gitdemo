package com.rani.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\chromedriver.exe");
	WebDriver webdriver = new ChromeDriver();
	webdriver.manage().window().maximize();
	webdriver.get("http://www.gmail.com");
	WebElement username= webdriver.findElement(By.cssSelector("input[name='identifier']"));
			//xpath("//input[@name='identifier']"));
	username.clear();
	username.sendKeys("botsakeerthi");
    Thread.sleep(3000);
    WebElement next= webdriver.findElement(By.id("identifierNext"));
    next.click();
    Thread.sleep(3000);
    WebElement password= webdriver.findElement(By.cssSelector("input.whsOnd.zHQkBf"));
    password.clear(); 
    password.sendKeys("koteeswaramma.3");
    Thread.sleep(3000);
    WebElement signin= webdriver.findElement(By.id("passwordNext"));
    signin.click();
    Thread.sleep(50000);
    webdriver.close();
    
   
    }
}

	
		
	
	
	
