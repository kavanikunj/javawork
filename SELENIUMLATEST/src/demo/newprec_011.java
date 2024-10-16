package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newprec_011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();   
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String name = "Alden";
		
		try {
			WebElement element = driver.findElement(By.xpath("//*[text()="+name+"]"));
			
			if (element.isDisplayed())
		   {
				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
		   }	
		
			
		}catch (Exception e) {
			System.out.println("element not found");
		}
			
	}

}
