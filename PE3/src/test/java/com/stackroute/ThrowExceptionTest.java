package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ThrowExceptionTest {

    private static ThrowException throwException;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        throwException = new ThrowException();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        throwException = null;
    }

    @Test
    public void main_PrintErrorAndFinally() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "Error Caught in Catch Block\n"+"Finally block output\n";
        assertEquals(str, output.toString());
    }

    @Test
    public void main_PrintErrorAndFinallyFailure() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "Error Caught in Catch Block\n"+"No Finally block output\n";
        assertNotEquals(str, output.toString());
    }
}