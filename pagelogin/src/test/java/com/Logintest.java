package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Newtest.LoginpageFactory;
import Newtest.Loginpages;

public class Logintest {
   
	@Test
	public void test()
	{
		WebDriver driver = Driverconnection.connect("https://www.facebook.com/");
		Loginpages lg = new Loginpages(driver);
		//LoginpageFactory lg = new LoginpageFactory(driver);
		lg.enterEmail("raj");
		lg.enterPass("raj123");
		lg.login();
						
	}
	
}
