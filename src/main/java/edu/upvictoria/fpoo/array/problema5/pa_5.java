package edu.upvictoria.fpoo.array.problema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_5 {

    public static int[] swapArrayPositions(int[] vector) {
        for (int i = 0; i < vector.length / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - i - 1];
            vector[vector.length - i - 1] = temp;
        }
        return vector;
    }

    public void PA_5() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int[] vector = new int[6];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = Integer.parseInt(entrada.readLine());
        }

        for (int i = 0; i < vector.length / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - i - 1];
            vector[vector.length - i - 1] = temp;
        }

        System.out.println("El vector con las posiciones intercambiadas es:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
}
