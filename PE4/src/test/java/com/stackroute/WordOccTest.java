package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordOccTest {

    private static WordOcc wordOcc;

    @Before
    public void setUp() throws Exception {
        wordOcc = new WordOcc();
    }

    @After
    public void tearDown() throws Exception {
        wordOcc = null;
    }

    @Test
    public void wordPosTest() {
        String str = "She sells seashells by the seashore";
        String exp = "Found at: 4 - 6 Found at: 10 - 12 Found at: 27 - 29";
        assertEquals(exp,wordOcc.wordPos(str, "se"));
    }

    @Test
    public void wordPosTestFailure() {
        String str = "She sells seashells by the seashore";
        String exp = "Found at: 4 - 5 Found at: 10 - 11 Found at: 27 - 28";
        assertNotEquals(exp,wordOcc.wordPos(str, "se"));
    }

    @Test
    public void wordPosTestNull() {
        String str = "She sells seashells by the seashore";
        assertNotNull(wordOcc.wordPos(str, "se"));
    }
}