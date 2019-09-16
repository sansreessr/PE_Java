package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddMatrixTest {

    private static AddMatrix addMatrix;
    private int[][] mat1;
    private int[][] mat2;
    private int[][] sum;
    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        addMatrix = new AddMatrix();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        addMatrix = null;
    }

    @Test
    public void testMatrixSum_returnSumMatrix() {
        mat1 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        mat2 = new int[][]{{9, 8}, {7, 6}, {5, 4}};
        sum = new int[][]{{10, 10}, {10, 10}, {10, 10}};
        assertArrayEquals(sum, addMatrix.sumMat(mat1, mat2));

        mat1 = new int[][]{{2, 4}, {10, 12}};
        mat2 = new int[][]{{18, 16}, {10, 8}};
        sum = new int[][]{{20, 20}, {20, 20}};
        assertArrayEquals(sum, addMatrix.sumMat(mat1, mat2));
    }

    @Test
    public void testMatrixSum_returnSumMatrix_NullTest() {
        mat1 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        mat2 = new int[][]{{9, 8}, {7, 6}};
        assertNull(addMatrix.sumMat(mat1, mat2));
    }

    @Test
    public void testMatrixSum_returnSumMatrix_NotNull() {
        mat1 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        mat2 = new int[][]{{9, 8}, {7, 6}, {5, 4}};
        assertNotNull(addMatrix.sumMat(mat1, mat2));
    }
}