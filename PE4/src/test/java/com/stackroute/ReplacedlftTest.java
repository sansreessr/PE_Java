package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacedlftTest {

    private static Replacedlft replacedlft;

    @Before
    public void setUp() throws Exception {
        replacedlft = new Replacedlft();
    }

    @After
    public void tearDown() throws Exception {
        replacedlft = null;
    }

    @Test
    public void replaceLetTest() {
        String str = "daily dry";
        String exp = "faity fry";
        assertEquals(exp, replacedlft.replaceLet(str));
    }

    @Test
    public void replaceLetTestFailure() {
        String str = "daily dry";
        String exp = "faity dry";
        assertNotEquals(exp, replacedlft.replaceLet(str));
    }

    @Test
    public void replaceLetTestNull() {
        String str = "ai";
        assertNotNull(replacedlft.replaceLet(str));
    }
}