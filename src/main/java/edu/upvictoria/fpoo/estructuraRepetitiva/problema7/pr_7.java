package edu.upvictoria.fpoo.estructuraRepetitiva.problema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_7 {
    public void PR_7() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de cantidades:");
        int numCantidades = Integer.parseInt(enter.readLine());

        int cantidadesMenoresIgualesCero = 0;
        int cantidadesMayoresCero = 0;

        for (int i = 1; i <= numCantidades; i++) {
            System.out.println("Ingrese la cantidad " + i + ":");
            double cantidad = Double.parseDouble(enter.readLine());

            if (cantidad <= 0) {
                cantidadesMenoresIgualesCero++;
            } else {
                cantidadesMayoresCero++;
            }
        }

        System.out.println("Cantidad de cantidades menores o iguales a cero: " + cantidadesMenoresIgualesCero);
        System.out.println("Cantidad de cantidades mayores a cero: " + cantidadesMayoresCero);
    }
}
