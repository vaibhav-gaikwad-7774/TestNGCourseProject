package com.example.tests;

import org.testng.annotations.Test;

public class TestExample {

    // Smoke Test with higher priority
    @Test(groups = {"smoke"}, priority = 1)
    public void smokeTest() {
        System.out.println("Smoke Test with Priority 1");
    }

    // Regression Test with lower priority
    @Test(groups = {"regression"}, priority = 2)
    public void regressionTest() {
        System.out.println("Regression Test with Priority 2");
    }

    // Combined test belonging to both smoke and regression groups with the highest priority
    @Test(groups = {"smoke", "regression"}, priority = 0)
    public void combinedTest() {
        System.out.println("Combined Smoke and Regression Test with Priority 0");
    }

    // Functional Test with a higher priority
    @Test(groups = {"functional"}, priority = 3)
    public void functionalTest() {
        System.out.println("Functional Test with Priority 3");
    }

    // Performance Test with a lower priority
    @Test(groups = {"performance"}, priority = 4)
    public void performanceTest() {
        System.out.println("Performance Test with Priority 4");
    }
}
