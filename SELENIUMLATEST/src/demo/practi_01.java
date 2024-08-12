package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practi_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("jay");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("kava");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("564789253");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("INDIAN");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("SURAT");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("jay12@gmail.com");
		driver.findElement(By.id("RESULT_RadioButton-7_0")).sendKeys("Male");
		
		
		
		driver.findElement(By.xpath("//*[@for='RESULT_CheckBox-8_0']")).click();
		WebElement time =  driver.findElement(By.id("RESULT_RadioButton-9"));
		Select times = new Select(time);
		times.selectByVisibleText("Morning");		
		
		driver.findElement(By.name("RESULT_FileUpload-10")).click();
		
	}

}
