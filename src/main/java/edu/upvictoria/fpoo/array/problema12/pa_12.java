package edu.upvictoria.fpoo.array.problema12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_12 {
    public void PA_12() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el número de filas (M) de la primera matriz: ");
        int M = Integer.parseInt(entrada.readLine());
        System.out.print("Ingrese el número de columnas (N) de la primera matriz: ");
        int N = Integer.parseInt(entrada.readLine());

        System.out.print("Ingrese el número de filas (P) de la segunda matriz: ");
        int P = Integer.parseInt(entrada.readLine());
        System.out.print("Ingrese el número de columnas (Q) de la segunda matriz: ");
        int Q = Integer.parseInt(entrada.readLine());

        if (N != P) {
            System.out.println("No se puede realizar la multiplicación de matrices debido a dimensiones incorrectas.");
            return;
        }

        int[][] matriz1 = new int[M][N];
        int[][] matriz2 = new int[P][Q];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = Integer.parseInt(entrada.readLine());
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < P; i++) {
            for (int j = 0; j < Q; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = Integer.parseInt(entrada.readLine());
            }
        }

        int[][] producto = new int[M][Q];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < Q; j++) {
                int sum = 0;
                for (int k = 0; k < N; k++) {
                    sum += matriz1[i][k] * matriz2[k][j];
                }
                producto[i][j] = sum;
            }
        }

        System.out.println("El producto de las matrices es:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < Q; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
