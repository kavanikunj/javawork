package com;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Driverconnection {

	static WebDriver driver = null;
	public static WebDriver connect(String url) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://topsint.com/topserp/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
		
			
	}
    
	public static void screenShot(String name)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source =  ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("\"C:\\Users\\NEHAL\\Downloads\\book\\test\"");

		try {
			Files.copy(source, dest);
			System.out.println("screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

