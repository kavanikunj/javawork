package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
	   
		driver.findElement(By.linkText("News")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Sport")).click();
		driver.navigate().back();
		System.out.println("title of page is: " + driver.getTitle());
		
//		driver.get("https://demo.guru99.com/test/accessing-link.html");
//		driver.findElement(By.partialLinkText("here")).click();	
//		driver.navigate().back();
//		//driver.findElement(By.partialLinkText("Shetty")).click();
//		//driver.navigate().back();
//		System.out.println("title of page is: " + driver.getTitle());


	        
	        
	        
	}

}
