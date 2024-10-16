package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {
  
	 
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		
			 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.browserstack.com/users/sign_up");
				
				driver.manage().window().maximize();
	
				driver.findElement(By.id("user_full_name")).sendKeys("raj");
				
				driver.findElement(By.id("user_email_login")).sendKeys("raj@gmail.com");
				
				driver.findElement(By.id("user_password")).sendKeys("raj123");
				
				driver.findElement(By.id("user_submit")).click();

				Thread.sleep(5000);

				Alert alert = driver.switchTo().alert(); 

				String alertMessage= driver.switchTo().alert().getText();  

				System.out.println(alertMessage);
				
				Thread.sleep(5000);
				
				alert.accept();
																	
		}	
	
}
