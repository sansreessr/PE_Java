package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileDemoTest {

    private static FileDemo fileDemo;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fileDemo = new FileDemo();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fileDemo = null;
    }

    @Test
    public void frequentWords_returnStringCorrectFormat() {
        String file = "./files/FileDemo.txt";
        String str = "i-3,am-1,a-2,man-1,like-1,to-1,sleep-1,have-1,home-1";
        assertEquals(str,fileDemo.frequentWords(file));
    }

    @Test
    public void frequentWords_returnStringCorrectFailure() {
        String file = "./files/FileDemo.txt";
        String str = "i-3,am-1,a-2,man-1,like-1,to-1,sleep-1,have-1";
        assertNotEquals(str, fileDemo.frequentWords(file));
    }

    @Test(expected = FileNotFoundException.class)
    public void frequentWords_FilePath_ThrowException(){
        String file = "./files/FileDemo1.txt";
        fileDemo.frequentWords(file);
    }
}