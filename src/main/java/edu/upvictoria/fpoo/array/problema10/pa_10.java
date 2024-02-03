package edu.upvictoria.fpoo.array.problema10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_10 {

    public void PA_10() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el número de filas (M): ");
        int M = Integer.parseInt(entrada.readLine());
        System.out.print("Ingrese el número de columnas (N): ");
        int N = Integer.parseInt(entrada.readLine());

        int[][] matriz1 = new int[M][N];
        int[][] matriz2 = new int[M][N];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = Integer.parseInt(entrada.readLine());
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = Integer.parseInt(entrada.readLine());
            }
        }

        int[][] resultado = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("La matriz resultante de la suma es:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
