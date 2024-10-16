package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("Webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://example.com");
		
		driver.manage().window().maximize();
		
		 WebElement fullLink = driver.findElement(By.linkText("Full Link Text"));
		 fullLink.click();
		
		
		
		
		
	}

}
