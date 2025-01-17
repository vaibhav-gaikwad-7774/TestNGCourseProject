package com.example.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationsExample {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Executes before test section.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Executes after test section.");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1.");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2.");
    }
}
