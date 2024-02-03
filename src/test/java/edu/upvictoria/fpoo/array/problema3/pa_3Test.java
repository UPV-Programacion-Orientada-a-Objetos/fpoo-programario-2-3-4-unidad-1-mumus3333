package edu.upvictoria.fpoo.array.problema3;

import org.junit.Test;
import static org.junit.Assert.*;

public class pa_3Test {

    @Test
    public void testSortStudentsByAverage() {
        String[] nombres = {"Juan", "Pedro", "Maria"};
        double[] promedios = {8.5, 7.2, 9.0};
        String[] expectedNombres = {"Maria", "Juan", "Pedro"};
        double[] expectedPromedios = {9.0, 8.5, 7.2};
        pa_3.sortStudentsByAverage(nombres, promedios);
        assertArrayEquals(expectedNombres, nombres);
        assertArrayEquals(expectedPromedios, promedios,0);
    }

    @Test
    public void testSortStudentsByAverageEmptyArrays() {
        String[] nombres = {};
        double[] promedios = {};
        String[] expectedNombres = {};
        double[] expectedPromedios = {};
        pa_3.sortStudentsByAverage(nombres, promedios);
        assertArrayEquals(expectedNombres, nombres);
        assertArrayEquals(expectedPromedios, promedios,0);
    }
}