package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inst_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.name("emailOrPhone")).sendKeys("4078963212");
		driver.findElement(By.name("fullName")).sendKeys("jaykava");
		driver.findElement(By.name("username")).sendKeys("jay");
		
		
		
		
	}

}
