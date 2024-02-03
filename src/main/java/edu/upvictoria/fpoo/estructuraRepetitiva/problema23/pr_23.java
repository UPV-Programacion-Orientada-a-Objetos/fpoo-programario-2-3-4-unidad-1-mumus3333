package edu.upvictoria.fpoo.estructuraRepetitiva.problema23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_23 {
    public static void P23() throws IOException {


        System.out.println("Resolucion usando Mientras:");
        int contador = 1;
        int limite = 10;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (contador <= limite) {
            System.out.println("Número: " + contador);
            contador++;
        }

        System.out.println("\n(Inicio):");
        int limite2 = 10;

        for (int i = 1; i <= limite2; i++) {
            System.out.println("Número: " + i);
        }

        reader.close();
    }
}
