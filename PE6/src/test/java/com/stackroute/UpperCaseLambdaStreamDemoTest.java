package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpperCaseLambdaStreamDemoTest {

    private static UpperCaseLambdaStreamDemo upperCaseLambdaStreamDemo;

    @Before
    public void setUp() throws Exception {
        upperCaseLambdaStreamDemo = new UpperCaseLambdaStreamDemo();
    }

    @After
    public void tearDown() throws Exception {
        upperCaseLambdaStreamDemo = null;
    }

    @Test
    public void toUpperCase() {
        List<String> list = new ArrayList<>();
        list.add("Sreenath");
        list.add("sankar");
        list.add("ATHIRA");

        List<String> exp = new ArrayList<>();
        exp.add("SREENATH");
        exp.add("SANKAR");
        exp.add("ATHIRA");

        assertEquals(exp, upperCaseLambdaStreamDemo.toUpperCase(list));
    }

    @Test
    public void toUpperCaseFailure() {
        List<String> list = new ArrayList<>();
        list.add("Sreenath");
        list.add("sankar");
        list.add("ATHIRA");

        List<String> exp = new ArrayList<>();
        exp.add("Sreenath");
        exp.add("sankar");
        exp.add("ATHIRA");

        assertNotEquals(exp, upperCaseLambdaStreamDemo.toUpperCase(list));
    }

    @Test
    public void toUpperCaseNull() {
        List<String> list = new ArrayList<>();
        list.add("Sreenath");
        list.add("sankar");
        list.add("ATHIRA");

        assertNotNull(upperCaseLambdaStreamDemo.toUpperCase(list));
    }
}