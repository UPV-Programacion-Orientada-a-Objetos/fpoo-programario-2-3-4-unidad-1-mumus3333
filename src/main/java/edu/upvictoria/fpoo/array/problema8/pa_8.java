package edu.upvictoria.fpoo.array.problema8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_8 {


    public void PA_8() throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el número de choferes: ");
        int N = Integer.parseInt(entrada.readLine());

        int[][] kilometraje = new int[N][7];

        for (int i = 0; i < N; i++) {
            System.out.println("Chofer " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Ingrese los kilómetros recorridos el día " + (j + 1) + ": ");
                kilometraje[i][j] = Integer.parseInt(entrada.readLine());
            }
        }

        int[] totalKilometros = new int[N];
        for (int i = 0; i < N; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += kilometraje[i][j];
            }
            totalKilometros[i] = total;
        }

        System.out.println("\nReporte de Kilometraje:");
        for (int i = 0; i < N; i++) {
            System.out.println("Chofer " + (i + 1) + ":");
            int total = 0;
            for (int j = 0; j < 7; j++) {
                System.out.println("Día " + (j + 1) + ": " + kilometraje[i][j] + " km");
                total += kilometraje[i][j];
            }
            System.out.println("Total: " + total + " km");
        }

    }
}
