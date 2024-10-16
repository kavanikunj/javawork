package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class new_p1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.id("firstName")).sendKeys("jay");
			driver.findElement(By.id("lastName")).sendKeys("patel");
			driver.findElement(By.id("userEmail")).sendKeys("jay@gmail.com");
			
		   driver.findElement(By.xpath("//*[@for=\"gender-radio-1\"]")).click();
		   driver.findElement(By.id("userNumber")).sendKeys("564789253");
		   
		   driver.findElement(By.id("dateOfBirthInput")).click();

			String myDate = "20";
			String myMonth="December";
			String myYear = "2002";


			WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
			Select months = new Select(month);
			months.selectByVisibleText(myMonth);

			WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
			Select years = new Select(year);
			years.selectByVisibleText(myYear);

			List<WebElement> dates = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));

			for(WebElement date : dates)
			{
				if(date.getText().equals(myDate))
				{
					if(date.getAttribute("aria-label").contains(myMonth))
					{
						date.click();
						break;
					}

				}
			}


			WebElement subject = driver.findElement(By.id("subjectsContainer"));

			Actions builder = new Actions(driver);

			builder.click(subject)
					.sendKeys("Maths")
					.sendKeys(Keys.ENTER)
					.sendKeys("Physics")
					.sendKeys(Keys.ENTER)
					.build()
					.perform();

			driver.findElement(By.xpath("//*[@for='hobbies-checkbox-1']")).click();

			driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\NEHAL\\OneDrive\\Pictures\\qhd_0e0f2a26b140db3a3845c52788117b79.jpg");
			driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat");

			WebElement state = driver.findElement(By.id("state"));
			WebElement city = driver.findElement(By.id("city"));

			builder.click(state)
					.sendKeys("Haryana")
					.sendKeys(Keys.ENTER)
					.build()
					.perform();

			builder.click(city)
			.sendKeys("Panipat")
			.sendKeys(Keys.ENTER)
			.build()
			.perform();

			Thread.sleep(5000);
			driver.quit();
	}

}
