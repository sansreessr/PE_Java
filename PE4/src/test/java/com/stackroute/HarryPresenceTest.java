package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryPresenceTest {


    private static HarryPresence harryPresence;

    @Before
    public void setUp() throws Exception {
        harryPresence = new HarryPresence();
    }

    @After
    public void tearDown() throws Exception {
        harryPresence = null;
    }

    @Test
    public void isHarryPresent() {
        String str = "This is Harry";
        assertEquals(true, harryPresence.isHarryPresent(str));
    }

    @Test
    public void isHarryPresentFailure() {
        String str = "This is Harry";
        assertNotEquals(false, harryPresence.isHarryPresent(str));

        str = "This is Henry";
        assertNotEquals(true, harryPresence.isHarryPresent(str));
    }

    @Test
    public void isHarryPresentNull() {
        String str = "This is Harry";
        assertNotNull(harryPresence.isHarryPresent(str));
    }
}