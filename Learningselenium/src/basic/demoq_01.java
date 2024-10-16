package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoq_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
        driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		driver.findElement(By.id("alertButton")).click();		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alert1 = driver.switchTo().alert();
//		alert1.dismiss();
		
//		driver.findElement(By.id("promtButton")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Raj");
//		alert.accept();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    driver.findElement(By.id("timerAlertButton")).click();
	    
	    wait.until(ExpectedConditions.alertIsPresent());
	    
	    driver.switchTo().alert().accept();
		
		
		
		
		
		
	}

}
