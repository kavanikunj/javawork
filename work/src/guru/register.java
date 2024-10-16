package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/newtours/register.php");
			
			driver.manage().window().maximize();
		    
			WebElement countryDropdown = driver.findElement(By.name("country"));
	        
	        Select selectCountry = new Select(countryDropdown);

	        selectCountry.selectByVisibleText("UNITED STATES");

	        System.out.println("Selected country: UNITED STATES");				 	        	        	        	        	     	        
	        
	}

}
