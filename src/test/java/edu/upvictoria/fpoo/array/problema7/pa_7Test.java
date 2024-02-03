package edu.upvictoria.fpoo.array.problema7;

import org.junit.Test;

import static org.junit.Assert.*;

public class pa_7Test {

    @Test
    public void testContarCeros() {
        pa_7 programa = new pa_7();
        int[][] matriz = {
                {1, 2, 0, 4},
                {5, 0, 7, 8},
                {0, 3, 9, 0},
                {2, 0, 0, 6}
        };
        int expectedCeros = 6;
        int actualCeros = programa.contarCeros(matriz);
        assertEquals(expectedCeros, actualCeros);
    }

    @Test
    public void testContarCerosMatrizVacia() {
        pa_7 programa = new pa_7();
        int[][] matriz = {};
        int expectedCeros = 0;
        int actualCeros = programa.contarCeros(matriz);
        assertEquals(expectedCeros, actualCeros);
    }
}
