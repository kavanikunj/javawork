package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpages {
  
	WebDriver driver = null;
	
	public Loginpages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	By email = By.id("email");
	By pass = By.id("pass");
	By login = By.name("login");
	
	public void enterEmail(String userEmail)
	{
		driver.findElement(email).sendKeys(userEmail);
	}
	
	public void enterPass(String userPass)
	{
		driver.findElement(pass).sendKeys(userPass);
	}
	
	
	public void login()
	{
		driver.findElement(login).click();
	}
	
	
	
	
}
