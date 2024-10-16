package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		driver.findElement(By.id("OKTab")).click();		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
//		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//		driver.findElement(By.id("Textbox")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Nikunj");
		alert.accept();
			
	}

}
