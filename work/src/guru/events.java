package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class events {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		 Actions actions = new Actions(driver);

	        WebElement homeLink = driver.findElement(By.linkText("Home"));
	        
	        actions.moveToElement(homeLink).perform();  
	        
	        System.out.println("Mouse hovered over 'Home' link");
		
	        driver.get("http://demo.guru99.com/test/newtours/register.php");

	        WebElement firstName = driver.findElement(By.name("firstName"));

	        actions.click(firstName)
	               .sendKeys("John")  
	               .perform();

	        System.out.println("Typed 'John' in the First Name field");
				
	}

}
