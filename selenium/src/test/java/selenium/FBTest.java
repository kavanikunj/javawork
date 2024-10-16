package selenium;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class FBTest {
    
	String userEmail;
	String userPass;
	public FBTest(String userEmail, String userPass) {
		super();
		this.userEmail = userEmail;
		this.userPass = userPass;
	}

	static WebDriver driver;

	@BeforeClass
	public static void setUp()
	{
		driver = Driverconnection.connect("https://www.fb.com");
	}
	
	@Test
	public void login()
	{

		WebElement email =  driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));

		email.clear();
		email.sendKeys(userEmail);
		pass.clear();
		pass.sendKeys(userPass);

		driver.findElement(By.name("login")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.navigate().back();
	}

      	
	@Parameters
	public static List<Object[]> setData()
	{
		Object obj[][] = new Object[4][2];

		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test";

		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech";

		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc";

		obj[3][0] = "xyz@gmail.com";
		obj[3][1] = "xyz";


		return Arrays.asList(obj);

	}	
		
}
