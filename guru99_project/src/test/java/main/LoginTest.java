package main;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utill.ExcellReader;
import utill.base;

   public class LoginTest extends base {
     
	   @Test(dataProvider = "dp")
		public void login(String uname, String pass,String expected)
		{
			driver =  connect();

			LoginPage lp = new LoginPage(driver);
			System.out.println(uname+" "+pass+" "+expected);
		    lp.enterUsername(uname);
			lp.enterPassword(pass);
            lp.Loginclick();
			
            try {
    			Alert alert = driver.switchTo().alert();
    			String actual = alert.getText();
    			assertEquals(actual, expected);

    		} catch (Exception e) {
    			String actualTitle = driver.getTitle();
    			assertEquals(actualTitle,expected);
    		}
    	           
            
		}

		@DataProvider(name="dp")
		public Object[][] getData()
		{
			ExcellReader rd = new ExcellReader("C:\\Users\\NEHAL\\OneDrive\\Desktop\\new__test00.xlsx\\", "guru99");
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
