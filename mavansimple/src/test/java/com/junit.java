package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class junit {
   
	@BeforeClass
    public void setUp()
    {
       System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
    }
	
	@Test
	public void testGoogleSearch()
	{
		 WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("JUnit WebDriver");
	        searchBox.submit();
	        String title = driver.getTitle(); 						
	}
}
