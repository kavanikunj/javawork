package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class new_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.id("firstName")).sendKeys("jay");
			driver.findElement(By.id("lastName")).sendKeys("patel");
			driver.findElement(By.id("userEmail")).sendKeys("jay@gmail.com");
			
		   driver.findElement(By.xpath("//*[@for=\"gender-radio-1\"]")).click();
		   driver.findElement(By.id("userNumber")).sendKeys("564789253");
		   
		   //driver.findElement(By.id("dateOfBirthInput")).sendKeys("09 Aug 2023");
		   
		   
		   driver.findElement(By.xpath("//*[@for=\"hobbies-checkbox-1\"]")).click();
		   
           driver.findElement(By.id("currentAddress")).sendKeys("10, sarita soc");	   
		   
           WebElement State =  driver.findElement(By.id("//*[@class=\" css-1hwfws3\"]"));
   		   Select state = new Select(State);
           state.selectByVisibleText("NCR");
           
		   
	}

}
