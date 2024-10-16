package WebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.manage().window().maximize();
		
		 driver.findElement(By.linkText("Form Authentication")).click();
		 
		 driver.findElement(By.id("username")).sendKeys("tomsmith");
		 
		 driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		 
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		 WebElement resultMessage = driver.findElement(By.id("flash"));
	        System.out.println("Login Result: " + resultMessage.getText());
								
	}
}
