package basic;

import org.testng.annotations.Test;

public class Dpendancy {
   
	@Test(priority = 1)
	public void loign()
	{
		System.out.println("login.....");
	}
	
	@Test(priority = 2,dependsOnMethods = "login")
	public void home()
	{
		System.out.println("home.....");
	}
	
	@Test(priority = 3,dependsOnMethods = "home")
	public void logout()
	{
		System.out.println("logout.....");
	}
	
	
	
	
	
	
}
