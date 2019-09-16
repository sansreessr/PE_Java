package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    private static StudentMarks studentMarks;
    private int numOfStud;
    private int[] grades = new int[numOfStud];


    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentMarks = null;
    }

    @Test
    public void testIsGradeValid_returnBool() {

        numOfStud = 5;
        grades = new int[]{10, 50, 0, 100, 90};
        assertEquals(true, studentMarks.IsGradeValid(grades));

        numOfStud = 4;
        grades = new int[]{10, 200, 100, 90};
        assertEquals(false, studentMarks.IsGradeValid(grades));

        numOfStud = 4;
        grades = new int[]{10, 50, 20, 90};
        assertEquals(true, studentMarks.IsGradeValid(grades));

    }

    @Test
    public void testIsGradeValid_returnBoolFailure() {

        numOfStud = 5;
        grades = new int[]{10, 50, 0, 100, 90};
        assertNotEquals(false, studentMarks.IsGradeValid(grades));

        numOfStud = 5;
        grades = new int[]{-10, 50, 0, 100, 90};
        assertNotEquals(true, studentMarks.IsGradeValid(grades));

        numOfStud = 4;
        grades = new int[]{500, 0, 100, 90};
        assertNotEquals(true, studentMarks.IsGradeValid(grades));

    }
}