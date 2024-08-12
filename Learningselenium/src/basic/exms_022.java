package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exms_022 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com//");
		
		 driver.manage().window().maximize();
		
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "Facebook | Login ";
		
		 if(expectedTitle.equals(actualTitle))
		 {
			 System.out.println("Passed");
		 }
		 else
		 {
			 System.out.println("failed");
		 }

         Thread.sleep(5000);
	   
	    // driver.close();
	}
}
	
	