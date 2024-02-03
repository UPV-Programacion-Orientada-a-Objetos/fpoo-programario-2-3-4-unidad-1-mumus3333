package edu.upvictoria.fpoo.array.problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_1 {

    public static double sumArrayElements(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }


    public void PA_1() throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double[] arreglo = new double[10];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
            String input = entrada.readLine();
            arreglo[i] = Double.parseDouble(input);
        }

        double suma = 0;
        for (double elemento : arreglo) {
            suma += elemento;
        }

        System.out.println("La suma de los elementos del arreglo es: " + suma);

    }



}
