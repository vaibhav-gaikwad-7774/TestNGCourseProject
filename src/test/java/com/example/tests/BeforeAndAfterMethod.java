package com.example.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("These Method will be executed before the Actual Test Method: ");
    }


    @Test
    public void testMethod() {
        System.out.println("This is a Actual Test method will be shown");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("These Method will be executed after the Actual Test Method: ");
    }
}
