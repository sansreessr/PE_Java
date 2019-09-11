package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowFourTest {

    private static PowFour powfour;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        powfour = new PowFour();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        powfour = null;
    }

    @Test
    public void pofFour() {

        assertEquals(true,powfour.pofFour(64));

        assertEquals(false,powfour.pofFour(100));

        assertEquals(true,powfour.pofFour(4));

        assertEquals(false,powfour.pofFour(2));

    }
}