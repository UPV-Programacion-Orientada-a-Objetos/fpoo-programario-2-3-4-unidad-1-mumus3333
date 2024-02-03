package edu.upvictoria.fpoo.array.problema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_7 {

    public int contarCeros(int[][] matriz) {
        int contadorCeros = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento == 0) {
                    contadorCeros++;
                }
            }
        }
        return contadorCeros;
    }

    public void PA_7() throws IOException {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            int[][] matriz = new int[4][4];

            System.out.println("Ingrese los valores para la matriz (valores entre 0 y 9):");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                    matriz[i][j] = Integer.parseInt(entrada.readLine());
                }
            }

            int contadorCeros = 0;
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    if (elemento == 0) {
                        contadorCeros++;
                    }
                }
            }

            System.out.println("Cantidad de ceros en la matriz: " + contadorCeros);

        }
}
