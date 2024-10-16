package testng;

import org.testng.annotations.Test;

public class grouptest {
   
	@Test(groups = {"login"})
    public void testValidLogin() {
        System.out.println("Test: Valid Login");
    }

    @Test(groups = {"login", "sanity"})
    public void testInvalidLogin() {
        System.out.println("Test: Invalid Login");
    }

    @Test(groups = {"dashboard"})
    public void testAccessDashboard() {
        System.out.println("Test: Access Dashboard");
    }

    @Test(groups = {"profile"})
    public void testUpdateProfile() {
        System.out.println("Test: Update Profile");
        // Your logic for testing profile update
    }

    @Test(groups = {"profile", "sanity"})
    public void testViewProfile() {
        System.out.println("Test: View Profile");
    }
		
}
