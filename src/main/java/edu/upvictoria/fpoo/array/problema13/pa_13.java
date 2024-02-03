package edu.upvictoria.fpoo.array.problema13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_13 {
    public void PA_13() throws IOException {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese el número de filas (M) de la matriz: ");
            int M = Integer.parseInt(entrada.readLine());
            System.out.print("Ingrese el número de columnas (N) de la matriz: ");
            int N = Integer.parseInt(entrada.readLine());

            int[][] matriz = new int[M][N];

            System.out.println("Ingrese los elementos de la matriz:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = Integer.parseInt(entrada.readLine());
                }
            }

            int sumaDiagonalPrincipal = 0;
            int min = Math.min(M, N);
            for (int i = 0; i < min; i++) {
                sumaDiagonalPrincipal += matriz[i][i];
            }

            System.out.println("La suma de los elementos de la diagonal principal es: " + sumaDiagonalPrincipal);
    }
}
