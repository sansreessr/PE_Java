package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    private static StringTranspose stringTranspose;

    @Before
    public void setUp() throws Exception {
        stringTranspose = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose = null;
    }

    @Test
    public void transposeTest() {
        String str = "a quick brown fox jumps over the lazy dog";
        String exp = "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(exp,stringTranspose.transpose(str));
    }

    @Test
    public void transposeTestFailure() {
        String str = "a quick brown fox jumps over the lazy dog";
        String exp = "a quick brown fox jumps over the lazy dog";
        assertNotEquals(exp,stringTranspose.transpose(str));
    }

    @Test
    public void transposeTestNull() {
        String str = "a quick brown fox jumps over the lazy dog";
        assertNotNull(stringTranspose.transpose(str));
    }
}