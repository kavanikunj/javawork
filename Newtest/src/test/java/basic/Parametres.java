package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametres {
    
	@Parameters({"uname", "pass"})
	@Test
	public void test(String userEmail, String userPass)
	{  
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		email.sendKeys(userEmail);
		pass.sendKeys(userPass);
		login.click();
				
	}
		
}
