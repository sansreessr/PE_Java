package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    private static ChessBoard chessBoard;
    private String[][] CB = {{"WW|BB|WW|BB|WW|BB|WW|BB|"}, {"BB|WW|BB|WW|BB|WW|BB|WW|"}, {"WW|BB|WW|BB|WW|BB|WW|BB|"}, {"BB|WW|BB|WW|BB|WW|BB|WW|"},
                            {"WW|BB|WW|BB|WW|BB|WW|BB|"}, {"BB|WW|BB|WW|BB|WW|BB|WW|"}, {"WW|BB|WW|BB|WW|BB|WW|BB|"},{"BB|WW|BB|WW|BB|WW|BB|WW|"}};

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        chessBoard = null;
    }

    @Test
    public void testCBoard_returnStringMatrix() {
        assertArrayEquals(CB, chessBoard.CBoard());
    }

    @Test
    public void testCBoard_returnStringMatrix_NotNull() {
        assertNotNull(chessBoard.CBoard());
    }
}