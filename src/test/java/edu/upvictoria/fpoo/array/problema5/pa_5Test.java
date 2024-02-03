package edu.upvictoria.fpoo.array.problema5;

import org.junit.Test;

import static org.junit.Assert.*;

public class pa_5Test {

    @Test
    public void testSwapArrayPositions() {
        int[] vector = {1, 2, 3, 4, 5, 6};
        int[] expectedVector = {6, 5, 4, 3, 2, 1};
        int[] actualVector = pa_5.swapArrayPositions(vector);
        assertArrayEquals(expectedVector, actualVector);
    }

    @Test
    public void testSwapArrayPositionsEmptyArray() {
        int[] vector = {};
        int[] expectedVector = {};
        int[] actualVector = pa_5.swapArrayPositions(vector);
        assertArrayEquals(expectedVector, actualVector);
    }
}