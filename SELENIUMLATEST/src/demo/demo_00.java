package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class demo_00 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://demo.guru99.com/test/drag_drop.html");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		 
		 WebElement fromElement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
         WebElement toElement = driver.findElement(By.xpath("//ol[@id='bank']/li"));
         WebElement fromElement1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
         WebElement toElement1 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		 WebElement fromElement2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		 WebElement toElement2 = driver.findElement(By.xpath("//ol[@id='loan']/li"));
		 WebElement fromElement3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		 WebElement toElement3 = driver.findElement(By.xpath("//ol[@id='amt8']/li")); 
		
		 Actions builder = new Actions(driver);
         
		 Action e1 = builder.clickAndHold(fromElement).moveToElement(toElement).release().build();		
		 Action e2 = builder.clickAndHold(fromElement1).moveToElement(toElement1).release().build();
		 Action e3 = builder.clickAndHold(fromElement2).moveToElement(toElement2).release().build();
		 Action e4 = builder.clickAndHold(fromElement3).moveToElement(toElement3).release().build();
		
		   e1.perform();
		   Thread.sleep(2000);
		   e2.perform();
		   Thread.sleep(2000);

		   e3.perform();
		   Thread.sleep(2000);

		   e4.perform();
		   Thread.sleep(2000);
		
				
		
	}

}
