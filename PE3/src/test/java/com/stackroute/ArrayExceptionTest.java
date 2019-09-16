package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ArrayExceptionTest {

    private ArrayException arrayException;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        arrayException = new ArrayException();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        arrayException = null;
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void negArrSizeException_DisplayExceptionMessage() {

        exception.expect(NegativeArraySizeException.class);
        exception.expectMessage("Error: Negative Array Size");
        arrayException.NegArrSizeException();
    }

    @Test
    public void indOutOfBoundException() {

        exception.expect(IndexOutOfBoundsException.class);
        exception.expectMessage("Error: Index Out Of Bound");
        arrayException.IndOutOfBoundException();

    }

    @Test
    public void nullPointerException() {

        exception.expect(NullPointerException.class);
        exception.expectMessage("Error: Null Pointer Exception");
        arrayException.NullPointerException();

    }
}