package edu.upvictoria.fpoo.estructuraRepetitiva.problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_2 {

    public void PR_2() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        int contador = 0;
        double suma = 0;

        do {
            System.out.println("Ingrese un número flotante:");
            double numero = Double.parseDouble(enter.readLine());

            suma += numero;
            contador++;
        } while (contador < 10);

        System.out.println("La suma de los diez números es: " + suma);
    }
}
