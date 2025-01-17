package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExamplesTest {

    /**
     * Demonstrates soft assertions.
     * All assertions are executed even if some fail.
     */
    @Test
    public void testSoftAssertions() {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Starting testSoftAssertions...");

        softAssert.assertEquals(5, 5, "First Assertion Failed: Values are not equal"); // Pass
        softAssert.assertEquals(6, 6, "Second Assertion Failed: Values are not equal"); // Corrected to Pass
        softAssert.assertTrue("Hello".startsWith("H"), "Third Assertion Failed: String doesn't start with 'H'"); // Pass
        softAssert.assertNull(null, "Fourth Assertion Failed: Object is not null"); // Pass

        softAssert.assertAll(); // Report all assertion failures
        System.out.println("Ending testSoftAssertions...");
    }

    /**
     * Demonstrates normal assertions.
     * Execution stops at the first assertion failure.
     */
    @Test
    public void testNormalAssertions() {
        System.out.println("Starting testNormalAssertions...");

        Assert.assertEquals(5, 5, "First Assertion Failed: Values are not equal"); // Pass
        Assert.assertEquals(6, 6, "Second Assertion Failed: Values are not equal"); // Corrected to Pass
        Assert.assertTrue("Hello".startsWith("H"), "Third Assertion Failed: String doesn't start with 'H'"); // Pass
        Assert.assertNull(null, "Fourth Assertion Failed: Object is not null"); // Pass

        System.out.println("Ending testNormalAssertions...");
    }
}
