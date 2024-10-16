package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class drop_01 {
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		 
		 WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		 driver.switchTo().frame(frame);
	    
	   WebElement ing1 = driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
	   WebElement ing2 = driver.findElement(By.xpath("//*[@id='gallery']/li[2]"));
	   WebElement ing3 = driver.findElement(By.xpath("//*[@id='gallery']/li[3]"));
	   WebElement ing4 = driver.findElement(By.xpath("//*[@id='gallery']/li[4]"));
	   WebElement trash = driver.findElement(By.id("trash"));
	   
	   Actions builder = new Actions(driver);
	   
	  // builder.dragAndDrop(ing1, trash).build().perform();
	   
	   Action e1 = builder.clickAndHold(ing1).moveToElement(trash).release().build();
	   Action e2 = builder.clickAndHold(ing2).moveToElement(trash).release().build();
	   Action e3 = builder.clickAndHold(ing3).moveToElement(trash).release().build();
	   Action e4 = builder.clickAndHold(ing4).moveToElement(trash).release().build();
	   
	   
	   e1.perform();
	   Thread.sleep(2000);
	   e2.perform();
	   Thread.sleep(2000);

	   e3.perform();
	   Thread.sleep(2000);

	   e4.perform();
	   Thread.sleep(2000);
		driver.quit();

	   
	}
}
