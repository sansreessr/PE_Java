package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private static User user;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        user = new User("Sreenath", "Sankar", 20000.00);
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        user = null;
    }

    @Test
    public void getFullName() {

        assertEquals("Sreenath Sankar", user.getFullName());

    }

    @Test
    public void isValidAge() {

        assertEquals(true, user.isValidAge(20));
        assertEquals(false, user.isValidAge(15));

    }
}