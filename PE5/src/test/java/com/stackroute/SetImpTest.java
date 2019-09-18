package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SetImpTest {

    private static SetImp setImp;

    @Before
    public void setUp() throws Exception {
        setImp = new SetImp();
    }

    @After
    public void tearDown() throws Exception {
        setImp = null;
    }

    @Test
    public void modSet() {
        Set<String> name = new HashSet<>();
        name.add("Harry");
        name.add("Olive");
        name.add("Alice");
        name.add("Bluto");
        name.add("Eugene");

        List<String> exp = new ArrayList<>();
        exp.add("Alice");
        exp.add("Bluto");
        exp.add("Eugene");
        exp.add("Harry");
        exp.add("Olive");

        assertEquals(exp, setImp.modSet(name));
        assertNotNull(setImp.modSet(name));
    }
}