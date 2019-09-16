package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FnLDateTest {

    private static FnLDate fnLDate;
    private String date; //"dd/MM/Y"

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fnLDate = new FnLDate();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fnLDate = null;
    }

    @Test
    public void testFnLDayDate_returnString() {
        date = "12/12/2019";
        assertEquals("First Date of Week: 09/12/2019 \n Last Date of Week: 15/12/2019", fnLDate.fnlDayDate(date));

        date = "01/07/2019";
        assertEquals("First Date of Week: 01/07/2019 \n Last Date of Week: 07/07/2019", fnLDate.fnlDayDate(date));

        date = "06/10/2019";
        assertEquals("First Date of Week: 30/09/2019 \n Last Date of Week: 06/10/2019", fnLDate.fnlDayDate(date));

    }

    @Test
    public void testFnLDayDate_returnStringFailure() {
        date = "12/12/2019";
        assertNotEquals("First Date of Week: 15/12/2019 \n Last Date of Week: 09/12/2019", fnLDate.fnlDayDate(date));

        date = "01/07/2019";
        assertNotEquals("First Date of Week: 15/07/2019 \n Last Date of Week: 01/07/2019", fnLDate.fnlDayDate(date));

        date = "06/10/2019";
        assertNotEquals("First Date of Week: 32/09/2019 \n Last Date of Week: 06/10/2019", fnLDate.fnlDayDate(date));
    }

    @Test
    public void testFnLDayDate_returnString_Null() {
        date = "12/12/2019";
        assertNotNull(fnLDate.fnlDayDate(date));

        date = "date";
        assertNull(fnLDate.fnlDayDate(date));
    }

}