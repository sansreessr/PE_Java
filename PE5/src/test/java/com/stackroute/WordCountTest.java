package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {

    private static WordCount wordCount;

    @Before
    public void setUp() throws Exception {
        wordCount = new WordCount();
    }

    @After
    public void tearDown() throws Exception {
        wordCount = null;
    }

    @Test
    public void wordFreq() {
        String str = "one one -one___two,,three,one @three*one?two";

        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);

        assertEquals(expected, wordCount.wordFreq(str));
        assertNotNull(wordCount.wordFreq(str));
    }
}