package com.example.tests;

import org.testng.annotations.Test;

public class PriorityExampleTest {

    @Test(priority = 1)
    public void testA() {
        System.out.println("Executing Test A");
    }

    @Test(priority = 0)
    public void testB() {
        System.out.println("Executing Test B");
    }

    @Test(priority = 2)
    public void testC() {
        System.out.println("Executing Test C");
    }
}
