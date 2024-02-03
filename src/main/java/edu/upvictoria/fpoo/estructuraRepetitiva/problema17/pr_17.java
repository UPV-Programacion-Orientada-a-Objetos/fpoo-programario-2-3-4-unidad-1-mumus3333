package edu.upvictoria.fpoo.estructuraRepetitiva.problema17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_17 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void P17() throws IOException {

        double salarioI = 1500.0;
        double salarioActual = salarioI;
        double incremento = 0.10;
        int numAnos = 6;

        System.out.println("El salario inicial es: $" + salarioI);

        for (int ano = 1; ano <= numAnos; ano++) {
            salarioActual += salarioActual * incremento;

            System.out.println("Año " + ano + ": $" + salarioActual);
        }

        System.out.println("Salario a lo largo de " + numAnos + " años es: $" + salarioActual);
    }
}
