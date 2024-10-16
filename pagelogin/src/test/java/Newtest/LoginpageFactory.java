package Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageFactory {
    
    WebDriver driver = null;
    
    public LoginpageFactory(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "email")
    WebElement email;
    

    @FindBy(id = "pass")
    WebElement pass;
    

    @FindBy(name = "login")
    WebElement login;
    
	
	
	public void enterEmail(String userEmail)
	{
		email.sendKeys(userEmail);
	}
	
	public void enterPass(String userPass)
	{
		pass.sendKeys(userPass);
	}
	
	
	public void login()
	{
		login.click();
	}
	
		
}
