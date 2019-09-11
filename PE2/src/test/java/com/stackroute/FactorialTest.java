package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private static Factorial fact;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fact = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fact = null;
    }

    @Test
    public void intFactorial() {

        assertArrayEquals((new int[]{1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600}),fact.factorial(new int[]{1}));

    }
    @Test
    public void longFactorial() {

        assertEquals("1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600,6227020800,87178291200,1307674368000,20922789888000,355687428096000,6402373705728000,121645100408832000,2432902008176640000,", fact.longFactorial(""));


    }
}