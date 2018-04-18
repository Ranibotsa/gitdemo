package com.rani.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) throws InterruptedException {
        WebDriver webdriver = new FirefoxDriver();  
		webdriver.manage().window().maximize();
		webdriver.get("http://www.gmail.com");
		WebElement username = webdriver.findElement(ById.id("identifierId"));
		//WebElement username = webdriver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("botsakeerthi");
	    Thread.sleep(3000);
	   WebElement next= webdriver.findElement(By.id("identifierNext"));
	    next.click();
	    Thread.sleep(3000);
	    WebElement password= webdriver.findElement(By.name("password"));
	    password.clear();
	    password.sendKeys("koteeswaramma.3");
	    Thread.sleep(3000);
	    WebElement signin= webdriver.findElement(By.id("passwordNext"));
	    signin.click();
	    Thread.sleep(50000);
	    webdriver.close();

	}

}
