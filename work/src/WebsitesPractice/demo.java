package WebsitesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.com/demo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("first_name")).sendKeys("kava");
		
		driver.findElement(By.name("last_name")).sendKeys("raj");
		
		
		//driver.findElement(By.id("country_id")).sendKeys("");
		WebElement country = driver.findElement(By.id("country_id"));
		Select select1 = new Select(country);
		select1.selectByVisibleText("India +91");
		driver.findElement(By.name("whatsapp")).sendKeys("97251002564");

		driver.findElement(By.name("business_name")).sendKeys("customer working");	
		driver.findElement(By.name("email")).sendKeys("raj@gmail.com");	
        
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		
			
		
	}

}
