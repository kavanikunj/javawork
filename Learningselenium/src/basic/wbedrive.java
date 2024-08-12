package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class wbedrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement Login = driver.findElement(By.name("login"));
			
		email.sendKeys("test@gamil");
		pass.sendKeys("test123");
		Login.click();
		
		
	}

}
