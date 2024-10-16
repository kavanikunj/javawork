package Testng;

import org.testng.annotations.Test;

public class demo {
   
	@Test(priority = 1)
	public void test()
	{
		System.out.println("running test1.....");
	}
	
	@Test(priority = 2)
	public void alpha()
	{
		System.out.println("running alpha test1.....");
	}
	
	@Test(priority = 3)
	public void beta()
	{
		System.out.println("running beta test1.....");
	}
	
	
	
	
}
