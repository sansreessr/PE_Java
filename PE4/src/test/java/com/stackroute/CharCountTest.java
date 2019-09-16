package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCountTest {

    private static CharCount charCount;

    @Before
    public void setUp() throws Exception {
        charCount = new CharCount();
    }

    @After
    public void tearDown() throws Exception {
        charCount = null;
    }

    @Test
    public void countCharTest() {
        String test = "Java is java again java again count number of occurrence of a in the given string";
        char ch = 'a';
        assertEquals(11, charCount.countChar(test,ch));
    }

    @Test
    public void countCharTestFailure() {
        String test = "jj";
        assertNotEquals(3, charCount.countChar(test,'j'));
    }

    @Test
    public void countCharTestNull() {
        String test = "";
        assertNotNull(charCount.countChar(test,'n'));
    }
}