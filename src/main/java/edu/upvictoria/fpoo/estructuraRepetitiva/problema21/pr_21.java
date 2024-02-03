package edu.upvictoria.fpoo.estructuraRepetitiva.problema21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_21 {
    public static void P21() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa el anio:");
        int año = 0;

        try {
            año = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer. Vuelva a intentarlo.");
            return; // Salir del programa en caso de error
        }

        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        int diasAño = esBisiesto ? 366 : 365;

        double ahorroDiario = 3.0;
        double ahorroAnual = 0.0;

        for (int dia = 1; dia <= diasAño; dia++) {
            ahorroAnual += ahorroDiario;
            ahorroDiario *= 3;
        }

        System.out.println("El ahorro anual es de $" + ahorroAnual);
    }
}
