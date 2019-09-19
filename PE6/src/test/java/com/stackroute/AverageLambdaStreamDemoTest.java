package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AverageLambdaStreamDemoTest {

    private static AverageLambdaStreamDemo averageLambdaStreamDemo;

    @Before
    public void setUp() throws Exception {
        averageLambdaStreamDemo = new AverageLambdaStreamDemo();
    }

    @After
    public void tearDown() throws Exception {
        averageLambdaStreamDemo = null;
    }

    @Test
    public void average() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        Double exp = 30.0;

        assertEquals(exp, averageLambdaStreamDemo.average(list));
    }

    @Test
    public void averageFailure() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        Double exp = 10.0;

        assertNotEquals(exp, averageLambdaStreamDemo.average(list));
    }

    @Test
    public void averageNull() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);

        assertNotNull(averageLambdaStreamDemo.average(list));
    }
}