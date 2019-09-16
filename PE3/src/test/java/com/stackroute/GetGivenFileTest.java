package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetGivenFileTest {

    private static GetGivenFile getGivenFile;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        getGivenFile = new GetGivenFile();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        getGivenFile =null;
    }

    @Test
    public void getAsByteArray_returnByteArray() {
        String folder = "./files";
        String extension = ".txt";
        byte[] FileContent;
        String str = "i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.";
        str = str+"Twinkle Twinkle Little Star,\n" +
                "How I Wonder What you are!";
        FileContent = str.getBytes();
        assertArrayEquals(FileContent,getGivenFile.getAsByteArray(folder,extension));
        assertNull(getGivenFile.getAsByteArray(folder,".png"));
    }

    @Test
    public void getAsByteArray_returnByteArrayFailure(){
        String folder = "./files";
        String extension = ".txt";
        assertNotNull(getGivenFile.getAsByteArray(folder,".txt"));
    }
}