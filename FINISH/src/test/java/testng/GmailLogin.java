package testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailLogin {
  
WebDriver driver = null;
	
   @BeforeClass
	public void setup()
	{
		driver = Driverconnection.connect("https://accounts.google.com");
	}
	
   @Test
   public void testGmailLogin() throws InterruptedException {
	   driver.findElement(By.xpath("//*[text()='Create account']")).click();
		driver.findElement(By.xpath("//*[text()='For my personal use']")).click();
	   driver.findElement(By.id("firstName")).sendKeys("kava");
	   
	   driver.findElement(By.id("lastName")).sendKeys("nikunj");
	   
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   	  			
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("2");
		
		driver.findElement(By.name("day")).sendKeys("17");
		driver.findElement(By.name("year")).sendKeys("1997");
		
	   
		WebElement gender = driver.findElement(By.id("gender"));
		Select select3 = new Select(gender);
		select3.selectByVisibleText("Male");
	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
				 		    		    		      		    		    			    
   }	
		 
   }		 

