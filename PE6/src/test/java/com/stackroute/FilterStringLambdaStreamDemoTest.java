package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FilterStringLambdaStreamDemoTest {

    private static FilterStringLambdaStreamDemo filterStringLambdaStreamDemo;

    @Before
    public void setUp() throws Exception {
        filterStringLambdaStreamDemo = new FilterStringLambdaStreamDemo();
    }

    @After
    public void tearDown() throws Exception {
        filterStringLambdaStreamDemo = null;
    }

    @Test
    public void search() {
        List<String> list = new ArrayList<>();
        list.add("Add");
        list.add("Arun");
        list.add("dasfd");

        List<String> exp = new ArrayList<>();
        exp.add("Add");

        assertEquals(exp, filterStringLambdaStreamDemo.search(list));
    }

    @Test
    public void searchFailure() {
        List<String> list = new ArrayList<>();
        list.add("Add");
        list.add("Arun");
        list.add("dasfd");

        List<String> exp = new ArrayList<>();
        exp.add("Add");
        exp.add("Arun");

        assertNotEquals(exp, filterStringLambdaStreamDemo.search(list));
    }

    @Test
    public void searchNull() {
        List<String> list = new ArrayList<>();
        list.add("Add");
        list.add("Arun");
        list.add("dasfd");

        assertNotNull(filterStringLambdaStreamDemo.search(list));
    }
}