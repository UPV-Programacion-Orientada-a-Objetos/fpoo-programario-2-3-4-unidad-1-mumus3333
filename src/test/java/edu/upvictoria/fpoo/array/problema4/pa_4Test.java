package edu.upvictoria.fpoo.array.problema4;

import org.junit.Test;

import static org.junit.Assert.*;

public class pa_4Test {

    @Test
    public void testCalculateInventory() {
        int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] B = {5, 25, 35, 20, 60, 70, 80, 90, 95, 110};
        int[] expectedC = {10, 40, 70, 80, 60, 70, 80, 90, 180, 240};
        int[] actualC = pa_4.calculateInventory(A, B);
        assertArrayEquals(expectedC, actualC);
    }

    @Test
    public void testCalculateInventoryEmptyArrays() {
        int[] A = {};
        int[] B = {};
        int[] expectedC = {};
        int[] actualC = pa_4.calculateInventory(A, B);
        assertArrayEquals(expectedC, actualC);
    }
}