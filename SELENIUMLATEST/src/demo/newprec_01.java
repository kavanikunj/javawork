package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newprec_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();   
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		    driver.findElement(By.linkText("Forgotten password?")).click();
			
			List<WebElement> links = driver.findElements(By.partialLinkText("create"));
			
			for(WebElement link : links)
			{
				System.out.println(link.getText());
				System.out.println(link.getAttribute("href"));
			}
	
	}

}
