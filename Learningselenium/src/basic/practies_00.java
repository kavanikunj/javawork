package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practies_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//List<WebElement> elements1 = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		
		//for(WebElement ele  :elements1)
		//{
			//System.out.println(ele.getText());
		//}
		
		
         WebElement elements1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[4]/th[1]"));
		
		System.out.println(elements1.getText());
		
		 
		
		
		
		
		
	}

}
