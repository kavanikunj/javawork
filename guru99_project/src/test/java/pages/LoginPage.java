package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="uid")
	WebElement uname;


	@FindBy(name = "password")
	WebElement pass;

	@FindBy(name="btnLogin")
	WebElement login;


	public void enterUsername(String username)
	{
		uname.sendKeys(username);
	}

	public void enterPassword(String userPass)
	{
		pass.sendKeys(userPass);
	}

	public void Loginclick()
	{
		login.click();
	}
	

	
}
