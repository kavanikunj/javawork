package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_01 {

	private static final WebElement Dropdown = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");   
			
		 driver.manage().window().maximize();   
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
//		 driver.findElement(By.name("radioButton")).click();
//		 
//		 driver.findElement(By.id("autocomplete")).sendKeys("selenium");
//		 
//		 WebElement dropdown  = driver.findElement(By.id("dropdown-class-example"));
//		 Select dropdowns = new Select(dropdown);
//		 dropdowns.selectByVisibleText("Option2");
//
//			
//		 driver.findElement(By.id("checkBoxOption1")).click();
//		 
//		// driver.findElement(By.id("openwindow")).click();
//	 
//		// driver.findElement(By.id("opentab")).click();	 
//         driver.findElement(By.id("name")).sendKeys("Raj");
//         WebElement frame = driver.findElement(By.id("name"));	 
//     	 driver.findElement(By.id("alertbtn")).click();
// 		driver.switchTo().frame(frame);
//	
 		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr"));   

 		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr["+i+"]/td"));
			for(WebElement col  :cols)
			{
				System.out.print(col.getText()+" | ");
			}
			System.out.println();
		}	
			
			
//      List<WebElement> rows = driver.findElements(By.xpath("//*[@class=\"tableFixHead\"]"));
//		   
//      for(int i=2;i<=rows.size();i++)
//		{
//			List<WebElement> cols = driver.findElements(By.xpath("//*[@class=\"tableFixHead\"]/tbody/tr[\"+i+\"]/td"));
//			for(WebElement col  :cols)
//			{
//				System.out.print(col.getText()+" ");
//			}
//			System.out.println();
//		}		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   Thread.sleep(2000);
		   
		   
		   
	}

}
