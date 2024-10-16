package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demos {
    
	
	 WebDriver driver = null;

	 @Test(dataProvider = "dp")
	 public void test(String functional, String keyword, String locator, String location, String data) {
		
		//System.out.println(functional+" "+keyword+" "+locator+" "+location+" "+data);

		if (keyword.equals("browser")) {

			if (data.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				driver = new ChromeDriver();

			} else if (data.equals("Chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				driver = new ChromeDriver();
			} else if (data.equals("edge")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				driver = new EdgeDriver();
			}
		
		}
		else if (keyword.equals("url")) 
		{
			driver.get(data);
		}       
	 
	 }
	 	 
	         
	 @DataProvider(name = "dp")
		public Object[][] getData() {

			ExcellReader rd = new ExcellReader("C:\\Users\\NEHAL\\OneDrive\\Documents\\book .1.xlsx\\", "testing");
			int row = rd.rowcount();
			int col = rd.colcount();

			Object obj[][] = new Object[row - 1][col];

			for (int i = 1; i < row; i++) {
				for (int j = 0; j < col; j++) {
					String data = rd.getData(i, j);
					obj[i - 1][j] = data;

				}

			}

			return obj;
		}
	 		 
}
