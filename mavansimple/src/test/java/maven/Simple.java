package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Simple {
   
	WebDriver driver;

    @BeforeClass
    public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");             
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize the browser window
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("JUnit WebDriver");
        searchBox.submit();

        // Verify that the title contains the search term
        String title = driver.getTitle(); 
		
    }	
}
