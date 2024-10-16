package register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://accounts.google.com");
			
			driver.findElement(By.xpath("//*[text()='Create account']")).click();
			driver.findElement(By.xpath("//*[text()='For my personal use']")).click();
			
			
			driver.manage().window().maximize();
		
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
