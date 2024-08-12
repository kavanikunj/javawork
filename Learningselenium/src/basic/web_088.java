package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.learnvern.com//");
		
		driver.manage().window().maximize();
	   
		
		
		
	}

}
