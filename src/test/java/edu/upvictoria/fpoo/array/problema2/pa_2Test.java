package edu.upvictoria.fpoo.array.problema2;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class pa_2Test {

    @Test
    public void testSumVectors() {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        int[] expectedC = {5, 7, 9};
        int[] actualC = pa_2.sumVectors(A, B);
        assertArrayEquals(expectedC, actualC);
    }

    @Test
    public void testSumVectorsEmptyArrays() {
        int[] A = {};
        int[] B = {};
        int[] expectedC = {};
        int[] actualC = pa_2.sumVectors(A, B);
        assertArrayEquals(expectedC, actualC);
    }

    @Test
    public void testSumVectorsWithInput() throws IOException {
        String input = "3\n1\n2\n3\n4\n5\n6\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(entrada.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(entrada.readLine());
        }

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(entrada.readLine());
        }

        int[] expectedC = {5, 7, 9};
        int[] actualC = pa_2.sumVectors(A, B);
        assertArrayEquals(expectedC, actualC);
    }
}