package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tops_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://topsint.com/topserp/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			
				
			WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"lutype\"]"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("Admin");
		
			WebElement name = driver.findElement(By.xpath("//*[@id=\"l_username\"]"));
			
			name.sendKeys("nikunj");
		    
			WebElement pass = driver.findElement(By.xpath("//*[@id=\"l_password\"]"));
		    pass.sendKeys("nikunj0156");
		
		    WebElement Login = driver.findElement(By.xpath("//*[@value=\"Login\"]"));
		    Login.click();
		
		
		
		
		
	}

}
