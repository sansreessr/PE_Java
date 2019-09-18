package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayTest {

    private static UpdateArray updateArray;

    @Before
    public void setUp() throws Exception {
        updateArray = new UpdateArray();
    }

    @After
    public void tearDown() throws Exception {
        updateArray = null;
    }

    @Test
    public void updateElementTest() {
        List<String> list = new ArrayList<>();
        list.add("Apple");  list.add("Apple");  list.add("Melon");  list.add("Berry");
        String cur = "Apple"; String upd = "Kiwi";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "[Kiwi, Kiwi, Melon, Berry]";
        updateArray.updateElement(list,cur,upd);
        assertEquals(str, output.toString());
    }

    @Test
    public void updateElementTestFailure() {
        List<String> list = new ArrayList<>();
        list.add("Apple");  list.add("Grape");  list.add("Melon");  list.add("Berry");
        String cur = "Apple"; String upd = "Kiwi";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "[Apple, Grape, Melon, Berry]";
        updateArray.updateElement(list,cur,upd);
        assertNotEquals(str, output.toString());
    }

    @Test
    public void emptyArrayTest() {
        List<String> list = new ArrayList<>();
        list.add("Apple");  list.add("Grape");  list.add("Melon");  list.add("Berry");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "[]";
        updateArray.emptyArray(list);
        assertEquals(str, output.toString());
    }

    @Test
    public void emptyArrayTestFailure() {
        List<String> list = new ArrayList<>();
        list.add("Apple");  list.add("Grape");  list.add("Melon");  list.add("Berry");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String str = "";
        updateArray.emptyArray(list);
        assertNotEquals(str, output.toString());
    }
}