package testng;

import static org.testng.Assert.assertEquals;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import perform.Driverconnection;

public class facebook {
   
WebDriver driver = null;
	
	@Before
	public void setup()
	{
		driver = Driverconnection.connect("https://www.fb.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test2123");
		driver.findElement(By.name("login")).click();		
	}
	
}
