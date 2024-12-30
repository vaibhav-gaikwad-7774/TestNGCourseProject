package com.example.tests;
import org.testng.annotations.*;

public class SuiteExample {

    @BeforeSuite
    public void initializeDatabase() {
        System.out.println("Before Suite: Initializing the database connection...");
        // Simulate database initialization
    }

    @AfterSuite
    public void cleanupDatabase() {
        System.out.println("After Suite: Closing the database connection...");
        // Simulate database cleanup
    }

    @Test
    public void testCase1() {
        System.out.println("Executing Test Case 1...");
        // Test logic
    }

    @Test
    public void testCase2() {
        System.out.println("Executing Test Case 2...");
        // Test logic
    }
}
