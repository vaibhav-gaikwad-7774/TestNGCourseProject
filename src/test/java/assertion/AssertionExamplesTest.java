package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExamplesTest {

    @Test
    public void testEquals() {
        // Verifies if two values are equal
        Assert.assertEquals(5, 5, "Values are not equal");
    }

    @Test
    public void testNotEquals() {
        // Verifies if two values are not equal
        Assert.assertNotEquals(3, 5, "Values are equal");
    }

    @Test
    public void testTrue() {
        // Checks if a condition evaluates to true
        boolean condition = (5 > 3);
        Assert.assertTrue(condition, "Condition is not TRUE");
    }

    @Test
    public void testFalse() {
        // Checks if a condition evaluates to false
        boolean condition = (5 < 3);
        Assert.assertFalse(condition, "Condition is not FALSE");
    }

    @Test
    public void testNull() {
        // Verifies if an object is null
        String str = null;
        Assert.assertNull(str, "Object is not null");
    }

    @Test
    public void testNotNull() {
        // Verifies if an object is not null
        String str = "Hello";
        Assert.assertNotNull(str, "Object is null");
    }

    @Test
    public void testSame() {
        // Checks if two objects refer to the same instance
        String str1 = "Test";
        String str2 = str1;
        Assert.assertSame(str1, str2, "Objects do not refer to the same instance");
    }

    @Test
    public void testNotSame() {
        // Checks if two objects refer to different instances
        String str1 = new String("Test");
        String str2 = new String("Test");
        Assert.assertNotSame(str1, str2, "Objects refer to the same instance");
    }

    @Test
    public void testArrayEquals() {
        // Verifies if two arrays are equal
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        Assert.assertEquals(arr1, arr2, "Arrays are not equal");
    }
}
