package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowTest {

    private static RemoveVow removeVow;
    private String[] places;
    private String[] noVowels;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        removeVow = new RemoveVow();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        removeVow = null;
    }

    @Test
    public void testremVowels_returnStringArray() {
        places = new String[]{"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        noVowels = new String[]{"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        assertEquals(noVowels, removeVow.remVowels(places));
    }

    @Test
    public void testremVowels_returnStringArrayFailure() {
        places = new String[]{"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        noVowels = new String[]{"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        assertNotEquals(places, removeVow.remVowels(places));
    }

    @Test
    public void testremVowels_returnStringArray_Null() {
        places = new String[]{"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        noVowels = new String[]{"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        assertNotNull(removeVow.remVowels(places));
    }
}