package testng;

import static org.testng.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Parameterize {

WebDriver driver = null;
	
	@Test
	public void setup()
	{
		driver = Driverconnection.connect("https://www.fb.com");
	}
	
	 @ParameterizedTest
	    
	    public void testFacebookLogin () throws InterruptedException {
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("raj@gmail.com");

	        WebElement passwordField = driver.findElement(By.id("pass"));
	        passwordField.sendKeys("raj123");

	        WebElement loginButton = driver.findElement(By.name("login"));
	        loginButton.click();

	        Thread.sleep(3000); 

	        assertTrue(driver.getTitle().contains("Facebook") || driver.getTitle().contains("Log in"),
	                "Login unsuccessful for email: " + "email");
	    }
		
}
