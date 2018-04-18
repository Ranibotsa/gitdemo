package com.rani.automation.bussinessscripts;


import org.testng.annotations.Test;

import com.rani.automation.base.DriverEngine;

public class FbTest extends DriverEngine
{
	@Test
	public void fbTest()
	{
	//DriverEngine.getWebDriver().get("http://www.facebook.com");
		getWebDriver().get("http://www.facebook");
	

}
}


