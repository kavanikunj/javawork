package perform;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Loign {
   
	WebDriver driver = null;
	
	@Test
	public void setup()
	{
		driver = Driverconnection.connect("https://www.fb.com");
	}
	
	 
	@Test
	public void test()
	{
		WebElement email =  driver.findElement(By.id("email"));
		email.sendKeys("raj2gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("raj123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
        assertTrue(driver.getTitle().contains("Facebook"), "Login unsuccessful");
		
	}	
				
}
