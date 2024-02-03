package edu.upvictoria.fpoo.estructuraRepetitiva.problema22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_22 {
    public static void P22() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Resolucion con Repite:");
        int contador = 1;
        int limite;


        System.out.print("Ingresa el límite para el ciclo: ");
        limite = Integer.parseInt(br.readLine());

        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= limite);

        System.out.println("\nSolución con ciclo (inicia):");
        int limite2;


        System.out.print("Ingrese el límite para el ciclo: ");
        limite2 = Integer.parseInt(br.readLine());

        for (int i = 1; i <= limite2; i++) {
            System.out.println("Número: " + i);
        }

        br.close();
    }
}
