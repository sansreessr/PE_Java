package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudGradesTest {

    private static StudGrades sgrades;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sgrades = new StudGrades();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sgrades= null;
    }

    @Test
    public void studentGrades() {

        int[] set1 = {10,20,30};
        int[] set2 = {10,25,10,15};

        assertArrayEquals((new int[]{20, 10, 30}), sgrades.StudentGrades(set1));

        assertArrayEquals((new int[]{15, 10, 25}), sgrades.StudentGrades(set2));


    }
}