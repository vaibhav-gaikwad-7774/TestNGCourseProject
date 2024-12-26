package com.example.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    // Example of a simple test method using @Test annotation
    @Test
    public void testLogin() {
        String expected = "Welcome, user!";
        String actual = login("user", "password");

        // Assert the result of the login method
        Assert.assertEquals(actual, expected, "Login failed!");
    }

    // Simulated login method for demonstration
    public String login(String username, String password) {
        // This is a simple mock of a login functionality
        if ("user".equals(username) && "password".equals(password)) {
            return "Welcome, user!";
        }
        return "Invalid credentials";
    }
}
