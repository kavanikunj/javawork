package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class from_00 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.techlistic.com/p/selenium-practice-form.html");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		 driver.findElement(By.name("firstname")).sendKeys("jay");
		 driver.findElement(By.name("lastname")).sendKeys("kava");
		
		 driver.findElement(By.id("sex-0")).click();
		 driver.findElement(By.id("exp-5")).click();  		
		
		 driver.findElement(By.id("datepicker")).click();
	     driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");               
		
	     driver.findElement(By.id("profession-1")).click();
	        driver.findElement(By.id("tool-1")).click();

	        driver.findElement(By.id("continents")).click();
	        WebElement dropdown = driver.findElement(By.id("continents"));
	        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
	        
	      driver.findElement(By.id("submit")).click(); 
		
		
		
		
		
		 Thread.sleep(2000);
		
		
		
	}

}
