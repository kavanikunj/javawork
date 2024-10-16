package Main;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.LoginPage;
import utill.ExcellReader;
import utill.base;

public class LoginTest extends base {
  
	@Test(dataProvider = "dp")
	public void login(String username, String password, String title)
	{
		driver =  connect();

		LoginPage lp = new LoginPage(driver);
		lp.enterEmail(username);
		lp.enterPass(password);
		lp.clickLogin();

		assertEquals(driver.getTitle(), title);
	}

	@DataProvider(name="dp")
	public Object[][] getData()
	{
		ExcellReader rd = new ExcellReader("C:\\Users\\NEHAL\\OneDrive\\Documents\\new__test00.xlsx\\", "login");
		int rows = rd.rowcount();
		int cols = rd.colcount();

		Object obj[][] = new Object[rows-1][cols];

		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		return obj;
	}
		
}
