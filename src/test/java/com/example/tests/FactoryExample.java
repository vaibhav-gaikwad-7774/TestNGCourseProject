package com.example.tests;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample {

    private String config;

    public FactoryExample(String config) {
        this.config = config;
    }

    @Test
    public void testConfiguration() {
        System.out.println("Testing with configuration: " + config);
    }

    @Factory
    public static Object[] createInstances() {
        return new Object[] {
            new FactoryExample("Config1"),
            new FactoryExample("Config2"),
            new FactoryExample("Config3")
        };
    }
}
