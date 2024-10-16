package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.google.com/");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		 WebElement search = driver.findElement(By.name("q"));

			Actions builder = new Actions(driver);


			builder.click(search)
					.keyDown(Keys.SHIFT)
					.sendKeys("Tops technologies")
					.keyUp(Keys.SHIFT)
					.sendKeys(Keys.ENTER)
					.build()
					.perform();	
		
	}

}
