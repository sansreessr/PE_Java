package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MaintestTest {

    private static Maintest maintest;

    @Before
    public void setUp() throws Exception {
        maintest =new Maintest();
    }

    @After
    public void tearDown() throws Exception {
        maintest = null;
    }

    @Test
    public void mainTest() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "100 Sreenath 23\n"+
                     "105 Sachin 22\n"+
                     "101 Sachin 22\n"+
                     "103 Febin 22\n" +
                     "104 Jerwin 21\n" +
                     "102 Adityan 20\n";

        maintest.mainTest();
        assertEquals(str, output.toString());
    }

    @Test
    public void mainTestFailure() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "100 Sreenath 23\n"+
                "101 Sachin 22\n"+
                "105 Sachin 22\n"+
                "103 Febin 22\n" +
                "104 Jerwin 21\n" +
                "102 Adityan 20\n";

        maintest.mainTest();
        assertNotEquals(str, output.toString());
    }
}