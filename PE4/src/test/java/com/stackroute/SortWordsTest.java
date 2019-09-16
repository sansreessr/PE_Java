package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {

    private static SortWords sortWords;

    @Before
    public void setUp() throws Exception {
        sortWords = new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        sortWords = null;
    }

    @Test
    public void sortPara() {
        String para = "A for Apple B for Ball, Apple is red, Appy is yellow";
        String[] exp = {"A", "Apple", "Apple", "Appy", "B", "Ball", "for", "for", "is", "is", "red", "yellow"};
        assertEquals(exp, sortWords.sortPara(para));
    }

    @Test
    public void sortParaFailure() {
        String para = "A for Apple B for Ball, Apple is red, Appy is yellow";
        String[] exp = {"A", "Apple", "Apple", "Appy", "B", "Ball,", "for", "for", "is", "is", "red,", "yellow"};
        assertNotEquals(exp, sortWords.sortPara(para));
    }

    @Test
    public void sortParaNull() {
        String para = "A for Apple B for Ball, Apple is red, Appy is yellow";
        assertNotNull(sortWords.sortPara(para));
    }
}