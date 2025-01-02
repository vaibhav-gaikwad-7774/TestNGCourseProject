package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int result = a + b;
        Assert.assertEquals(result, 8, "Addition result is incorrect!");
    }
}
