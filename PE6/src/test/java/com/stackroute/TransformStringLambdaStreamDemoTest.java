package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TransformStringLambdaStreamDemoTest {

    private static TransformStringLambdaStreamDemo transformStringLambdaStreamDemo;

    @Before
    public void setUp() throws Exception {
        transformStringLambdaStreamDemo = new TransformStringLambdaStreamDemo();
    }

    @After
    public void tearDown() throws Exception {
        transformStringLambdaStreamDemo = null;
    }

    @Test
    public void getString() {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String exp = "o1,e2,o3,";

        assertEquals(exp, transformStringLambdaStreamDemo.getString(list));
    }

    @Test
    public void getStringFailure() {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String exp = "e1,o2,e3,";

        assertNotEquals(exp, transformStringLambdaStreamDemo.getString(list));
    }

    @Test
    public void getStringNull() {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertNotNull(transformStringLambdaStreamDemo.getString(list));
    }
}