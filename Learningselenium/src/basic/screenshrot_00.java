package basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshrot_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.globalsqa.com/demo-site/datepicker/");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		 
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("C:\\Users\\NEHAL\\Downloads\\book\\test");
		  
		 try {
			Files.copy(source, dest);
			System.out.println("Screenshort taken");
			 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		
	}

}
