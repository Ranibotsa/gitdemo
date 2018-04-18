package com.rani.automation.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersDemo 
{
	@Parameters({"username","password"})
	@Test
	public void gmailLogin(String username,String password) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.id("identifierNext")).click();
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.id("passwordNext")).click();

		System.out.println("username is:" +username + "and password is:" +password);
		Thread.sleep(6000);
		driver.quit();
		
		
	}

}
//<parameter name="username" value="botsakeerthi@gmail.com"/>

//<parameter name="password" value="koteeswaramma.3"/>
//<classes>
 //<class name="com.rani.automation.testng.ParametersDemo"/>
//</claases>