package Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Method {
    
	 @Test
	    public void testAssertEquals() {
	        int expected = 5;
	        int actual = 5;
	        Assert.assertEquals(actual, expected, "The numbers are not equal!");
	    }

	    @Test
	    public void testAssertNotEquals() {
	        int unexpected = 4;
	        int actual = 5;
	        Assert.assertNotEquals(actual, unexpected, "The numbers should not be equal!");
	    }

	    @Test
	    public void testAssertTrue() {
	        boolean condition = (5 > 4);
	        Assert.assertTrue(condition, "The condition is not true!");
	    }

	    @Test
	    public void testAssertFalse() {
	        boolean condition = (5 < 4);
	        Assert.assertFalse(condition, "The condition is not false!");
	    }

	    @Test
	    public void testAssertNull() {
	        Object obj = null;
	        Assert.assertNull(obj, "The object is not null!");
	    }

	    @Test
	    public void testAssertNotNull() {
	        Object obj = new Object();
	        Assert.assertNotNull(obj, "The object is null!");
	    }

	    @Test
	    public void testAssertSame() {
	        String expected = "JUnit";
	        String actual = "JUnit";
	        Assert.assertSame(actual, expected, "Objects are not the same!");
	    }

	    @Test
	    public void testAssertNotSame() {
	        String expected = "JUnit";
	        String actual = "TestNG";
	        Assert.assertNotSame(actual, expected, "Objects are the same!");
	    }

	    @Test
	    public void testAssertArrayEquals() {
	        int[] expectedArray = {1, 2, 3};
	        int[] actualArray = {1, 2, 3};
	        Assert.assertEquals(actualArray, expectedArray, "Arrays are not equal!");
	    }

	    @Test
	    public void testFail() {
	        try {
	            int result = 1 / 0;
	        } catch (ArithmeticException e) {
	            Assert.fail("Exception occurred: Division by zero!");
	        }
	    }
	
}
