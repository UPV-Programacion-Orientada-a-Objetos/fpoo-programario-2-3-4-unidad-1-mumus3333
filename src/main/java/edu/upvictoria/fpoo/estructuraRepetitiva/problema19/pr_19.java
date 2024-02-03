package edu.upvictoria.fpoo.estructuraRepetitiva.problema19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_19 {
    public static void P19() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de cantidades:");
        int numCantidades = Integer.parseInt(br.readLine());

        int cantidadesCero = 0;
        int cantidadesMenorCero = 0;
        int cantidadesMayorCero = 0;

        for (int i = 1; i <= numCantidades; i++) {
            System.out.println("Ingrese la cantidad " + i + ":");
            double cantidad = Double.parseDouble(br.readLine());

            if (cantidad == 0) {
                cantidadesCero++;
            } else if (cantidad < 0) {
                cantidadesMenorCero++;
            } else {
                cantidadesMayorCero++;
            }
        }

        System.out.println("Cantidad de cantidades igual a cero: " + cantidadesCero);
        System.out.println("Cantidad de cantidades menor a cero: " + cantidadesMenorCero);
        System.out.println("Cantidad de cantidades mayor a cero: " + cantidadesMayorCero);
    }
}
