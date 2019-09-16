package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileToUpperTest {

    private static FileToUpper fileToUpper;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fileToUpper = new FileToUpper();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fileToUpper = null;
    }

    @Test
    public void toUpper_returnUpperString() {
        String str = "HELLO WORLD\nWELCOME TO JAVA" + "\n Length of the file: 27";
        String path = "./files/fileTest.txt";   //Replace with file path
        assertEquals(str,fileToUpper.toUpper(path));
    }

    @Test
    public void toUpper_returnUpperStringFailure() {
        String str = "HELLO WORLD WELCOME TO JAVA" + "\n Length of the file: 27";
        String path = "./files/fileTest.txt";   //Replace with file path
        assertNotEquals(str,fileToUpper.toUpper(path));
    }

    @Test(expected = FileNotFoundException.class)
    public void toUpper_returnUpperString_FileNotFound() {
        String str = "HELLO WORLD WELCOME TO JAVA" + "\n Length of the file: 27";
        String path = "./files/fileTest.txt";   //Replace with file path
        assertNotEquals(str,fileToUpper.toUpper(path));
    }
}