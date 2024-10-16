package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.Driverconnection;

public class demo {
   
	WebDriver driver = null;

    @BeforeClass
    public void setup() {
    	driver = Driverconnection.connect("https://www.amazon.in/"); 
    }
    
    @Test(priority = 1)
    public void sell()
    {
    	driver.findElement(By.linkText("Sell")).click();
    	System.out.println("Sell : "+driver.getTitle());	
    }
    

	@Test(priority = 2)
	public void mobile()
	{
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Mobiles : "+driver.getTitle());
	}

	@BeforeMethod
	public void home()
	{
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void back()
	{
		driver.navigate().back();
	}

	@AfterClass
	public void finish()
	{
		driver.close();
	}

    
}	
        	   	
        	
        	
        	
        	
        
        

    
