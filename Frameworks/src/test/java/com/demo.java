package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo {
  
	//id="l_username"
	//id="l_password"
	
    WebDriver driver = null;
	
	@BeforeClass 
	public void setup()
	{
		driver = Driverconnection.connect("https://topsint.com/topserp/");
	}
	
					
	@Test(dataProvider = "dp")
	public void test(String userEmail, String userPass, String select)
	{
		WebElement Username =  driver.findElement(By.id("l_username"));
		WebElement Password = driver.findElement(By.id("l_password"));
		WebElement Loginas = driver.findElement(By.id("lutype"));
		WebElement Login = driver.findElement(By.name("btn_login"));		
		
		Loginas.sendKeys(select);
		Username.clear();
		Username.sendKeys(userEmail);
		Password.clear();
		Password.sendKeys(userPass);
        Login.click();
				
		driver.navigate().back();
				
	}
	
	@DataProvider(name = "dp")
	public Object[][] getData()
	{
	
	ExcellReader rd = new ExcellReader("C:\\Users\\NEHAL\\OneDrive\\Documents\\new__test00.xlsx", "login");
    int row = rd.rowcount();
    int col = rd.colcount();
	
    Object obj[][] = new Object[row-1][col];
	
	for(int i=1;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
		 String data = rd.getData(i, j);
	     obj[i-1][j] = data;
	    
		}
	
	}
	 
	return obj;
	
}
		
}
