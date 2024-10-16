package guru;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

        System.out.println("Total number of hyperlinks on the page: " + hyperlinks.size());

        for (WebElement link : hyperlinks) {
            System.out.println("Link Text: " + link.getText() + " | URL: " + link.getAttribute("href"));
        }
										
	}

}
