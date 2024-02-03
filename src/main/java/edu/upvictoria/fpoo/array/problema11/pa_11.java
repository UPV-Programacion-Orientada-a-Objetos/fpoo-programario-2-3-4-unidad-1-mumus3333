package edu.upvictoria.fpoo.array.problema11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_11 {
    public void PA_11() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el número de filas (M): ");
        int M = Integer.parseInt(entrada.readLine());
        System.out.print("Ingrese el número de columnas (N): ");
        int N = Integer.parseInt(entrada.readLine());

        int[][] matriz = new int[M][N];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(entrada.readLine());
            }
        }

        int[][] transpuesta = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
