package com.rani.automation.seleniumcore;

import java.util.concurrent.TimeUnit;
import java.util.function.ToDoubleBiFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeaboardActions
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to("https://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("ramesh soft module 2");
		//driver.findElement(By.id("search-icon-legacy")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//span[@id='video-title']")).click();
		driver.findElement(By.xpath("//a[@class='ytp-next-button ytp-button']")).click();
	    Thread.sleep(6000);
       actions.sendKeys(Keys.ARROW_DOWN).build().perform();
       driver.findElement(By.id("text")).click();
      // driver.findElement(By.id("text")).click();
		WebElement username = driver.findElement(By.id("identifierId"));
         username.clear();
        username.sendKeys("botsakeerthi");
       Thread.sleep(3000);
	   WebElement next= driver.findElement(By.id("identifierNext"));
	    next.click();
	    Thread.sleep(3000);
	    WebElement password= driver.findElement(By.name("password"));
	    password.clear();
	    password.sendKeys("koteeswaramma.3");
	    Thread.sleep(3000);
	    WebElement signin= driver.findElement(By.id("passwordNext"));
	    signin.click();
	    Thread.sleep(3000);

	           

       

       
				
		
	}
}