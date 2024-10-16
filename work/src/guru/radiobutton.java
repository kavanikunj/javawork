package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/radio.html");
			
			driver.manage().window().maximize();

		   WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		   radio1.click();
		
		   WebElement radio2 = driver.findElement(By.id("vfb-6-1"));
		   radio2.click();
		
		
	}

}
