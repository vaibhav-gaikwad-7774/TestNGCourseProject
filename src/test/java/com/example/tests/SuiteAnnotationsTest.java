package com.example.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteAnnotationsTest {
    @BeforeSuite
    public void setup() {
        System.out.println("Setup: Runs before the test suite.");
    }

    @AfterSuite
    public void cleanup() {
        System.out.println("Cleanup: Runs after the test suite.");
    }

    @Test
    public void test1() {
        System.out.println("Executing Test 1.");
    }

    @Test
    public void test2() {
        System.out.println("Executing Test 2.");
    }
}
