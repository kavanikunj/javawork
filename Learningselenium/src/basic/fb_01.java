package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("jay");
		driver.findElement(By.name("lastname")).sendKeys("kava");
		driver.findElement(By.name("reg_email__")).sendKeys("985742365");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("17");
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("2020");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
