package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private static Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        palindrome = null;
    }

    @Test
    public void revPalindrome() {

        assertEquals(true, palindrome.revPalindrome("Malayalam"));

        assertEquals(true, palindrome.revPalindrome("A"));

        assertEquals(false,palindrome.revPalindrome("race car"));

    }

}