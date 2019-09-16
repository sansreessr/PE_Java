package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumsTest {

    private static ConsecutiveNums consecutiveNums;
    private String num;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        consecutiveNums = new ConsecutiveNums();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        consecutiveNums = null;
    }

    @Test
    public void testCNums_returnBoolean() {

        num = "54,53,52,51,50,49,48";
        assertEquals(true, consecutiveNums.CNums(num));

        num = "98,96,95,94,93";
        assertEquals(false, consecutiveNums.CNums(num));

    }

    @Test
    public void testCNums_returnBooleanFailure() {
        num = "98,96,95,94,93";
        assertNotEquals(true, consecutiveNums.CNums(num));
    }

    @Test
    public void testCNums_returnBooleanFailure_NotNull() {
        num = "98,96,95,94,93";
        assertNotNull(consecutiveNums.CNums(num));
    }
}