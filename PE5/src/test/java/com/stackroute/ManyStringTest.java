package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ManyStringTest {

    private static ManyString manyString;

    @Before
    public void setUp() throws Exception {
        manyString = new ManyString();
    }

    @After
    public void tearDown() throws Exception {
        manyString = null;
    }

    @Test
    public void isManyTest() {
        String[] str = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expected = new LinkedHashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);

        assertEquals(expected, manyString.isMany(str));
        assertNotNull(manyString.isMany(str));
    }
}