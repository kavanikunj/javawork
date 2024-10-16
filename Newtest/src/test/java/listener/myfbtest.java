package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class myfbtest {
    
	@Test
	public void loginTest()
	{
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test2123");
		driver.findElement(By.name("login")).click();

		assertEquals(driver.getTitle(), "Facebook - Home");
	}

	@Test
	public void titleCheck()
	{
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		assertEquals(driver.getTitle(), "Facebook - Login");
	}

		
}
