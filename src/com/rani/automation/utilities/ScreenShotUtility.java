package com.rani.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rani.automation.base.DriverEngine;

public interface ScreenShotUtility
{
	public static void screenShot() throws IOException
	{
	
	 TakesScreenshot    takesScreenshot=(TakesScreenshot)DriverEngine.getWebDriver();
		File file =  takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(System.getProperty("user.dir") +"\\FailureScreenShots\\"+DriverEngine.getTCName()+".jpeg"));

}
}
