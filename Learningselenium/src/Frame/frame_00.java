package Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://demo.automationtesting.in/Frames.html");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		 
        //List<WebElement> frames = driver.findElements(By.tagName("iframe"));
         //System.out.println(frames.size());
         
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("name");
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("test");
		
	}

}
