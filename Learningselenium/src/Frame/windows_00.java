package Frame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://demo.guru99.com/popup.php");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		 
		 String mainWin = driver.getWindowHandle();
			//System.out.println("Main : "+mainWin);

			driver.findElement(By.linkText("Click Here")).click();

			Set<String> wins =  driver.getWindowHandles();
			for(String win : wins)
			{
				if(!win.equals(mainWin))
				{
					driver.switchTo().window(win);
				}
			}

			driver.findElement(By.name("emailid")).sendKeys("test@gmial.com");

			driver.findElement(By.name("btnLogin")).click();

//			driver.close();
//			driver.switchTo().window(mainWin);
//			driver.close();

			driver.quit();
			
	}

}
