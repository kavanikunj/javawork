package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Newtest {
   
	@Test
	public void test1()
	{
		System.out.println("running test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("running test2");
	}
	
	@Ignore
	@Test
	public void test3()
	{
		System.out.println("running test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("running test4");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("This method will run before every test");
	}

	@After
	public void afterTest()
	{
		System.out.println("This method will run after every test");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Setup");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Finish");
	}
	
	
	
	
	
	
}
