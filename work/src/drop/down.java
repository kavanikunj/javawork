package drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class down {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://jsbin.com/osebed/2");
			
			driver.manage().window().maximize();
	
			Select fruits = new Select(driver.findElement(By.id("fruits")));
			
			fruits.selectByVisibleText("Banana");
			
			fruits.selectByIndex(1);		
									
	}
	
}
