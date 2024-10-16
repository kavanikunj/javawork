package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class account {
   
	@Test(groups = "sanity")
	public void savingaccount()
	{
		System.out.println("running savingaccount....");
	}
	
	@Test
	public void loanaccount()
	{
		System.out.println("running loanaccount....");
	}
	
	@Test
	public void  currentaccount()
	{
		System.out.println("running currentaccount....");
	}
	
	@BeforeMethod
	public void  beforeMethod()
	{
		System.out.println("running before method....");
	}
	
	@AfterMethod
	public void  afterMethobd()
	{
		System.out.println("running after method....");
	}
	
	@BeforeClass
	public void  beforeclass()
	{
		System.out.println("running before class....");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("running after class....");
	}
	
	@BeforeTest
	public void  beforetest()
	{
		System.out.println("running before test....");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("running after test....");
	}
	
	@BeforeSuite
	public void  beforesuite()
	{
		System.out.println("running before suite....");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("running after suite....");
	}
	
	
	
	
	
}
