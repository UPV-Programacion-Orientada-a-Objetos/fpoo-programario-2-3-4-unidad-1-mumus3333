package edu.upvictoria.fpoo.estructuraRepetitiva.problema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_6 {
    public void PR_6() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        double ahorroTotal = 0;

        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("Ingrese la cantidad de dinero ahorrada en el mes " + mes + ":");
            double ahorroMensual = Double.parseDouble(enter.readLine());

            ahorroTotal += ahorroMensual;

            System.out.println("El ahorro acumulado hasta el mes " + mes + " es: " + ahorroTotal);
        }

        System.out.println("El ahorro total en el año es: " + ahorroTotal);
    }
}
