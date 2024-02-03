package edu.upvictoria.fpoo.estructuraRepetitiva.problema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_3 {
    public void PR_3() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un número entero:");
            int numero = Integer.parseInt(enter.readLine());

            suma += numero;
        }

        System.out.println("La suma de los diez números es: " + suma);
    }
}
