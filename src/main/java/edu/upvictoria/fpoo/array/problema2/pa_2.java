package edu.upvictoria.fpoo.array.problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_2 {

    public static int[] sumVectors(int[] A, int[] B) {
        int N = A.length;
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
    }

    public void PA_2() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el tamaño de los vectores: ");
        int N = Integer.parseInt(entrada.readLine());

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        System.out.println("Ingrese los elementos del vector A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            A[i] = Integer.parseInt(entrada.readLine());
        }

        System.out.println("Ingrese los elementos del vector B:");
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            B[i] = Integer.parseInt(entrada.readLine());
        }

        for (int i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("El vector resultante C es:");
        for (int i = 0; i < N; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + C[i]);
        }

        entrada.close();
    }


}
