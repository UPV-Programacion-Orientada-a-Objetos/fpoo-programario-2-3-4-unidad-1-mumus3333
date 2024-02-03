package edu.upvictoria.fpoo.estructuraRepetitiva.problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_1 {
    public void PR_1() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        int contador = 0;
        double suma = 0;

        while (contador < 10) {
            System.out.println("Ingrese un número flotante:");
            double numero = Double.parseDouble(enter.readLine());

            suma += numero;
            contador++;
        }

        System.out.println("La suma de los diez números es: " + suma);
    }

}
