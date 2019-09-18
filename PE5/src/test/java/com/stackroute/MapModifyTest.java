package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapModifyTest {

    private static MapModify mapModify;

    @Before
    public void setUp() throws Exception {
        mapModify = new MapModify();
    }

    @After
    public void tearDown() throws Exception {
        mapModify = null;
    }

    @Test
    public void modMap() {

        Map<String,String> map = new LinkedHashMap<>();
        map.put("val1", "java");
        map.put("val2", "c++");

        Map<String,String> exp = new LinkedHashMap<>();
        exp.put("val1", " ");
        exp.put("val2", "java");

        assertEquals(exp, mapModify.modMap(map));
        assertNotNull(mapModify.modMap(map));
    }
}