package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoq_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();   
		
	    driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		//Verify that there are only 4 structure values present in the table with Selenium
//
//		List<WebElement> st = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
//		if(st.size()==4)
//		{
//			System.out.println("Pass");
//		}
//	   else
//		{
//			System.out.println("Fail");
//		}
		
		
//		List<WebElement> col_h = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr[1]/th"));
//	     List<WebElement> col_c = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr[1]/td"));
//		
//		int total = col_h.size()+col_c.size();
//		System.out.println("total : "+total);
//		if(total==2)
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
		int max = 0;
		for(WebElement element : elements)
		{
			String data = element.getText();
			int i =  Integer.parseInt(data.substring(0, data.length()-1));
			if(i>max)
			{
				max = i;
			}
		}

		System.out.println("Max structure height is : "+max);
		
	}

}
