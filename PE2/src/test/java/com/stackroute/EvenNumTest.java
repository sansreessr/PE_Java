package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {

    private static EvenNum even;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        even = new EvenNum();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        even = null;
    }

    @Test
    public void isEven() {

        assertEquals(true, even.isEven(2));

        assertEquals(true, even.isEven(218));

        assertEquals(false, even.isEven(5));

    }
}