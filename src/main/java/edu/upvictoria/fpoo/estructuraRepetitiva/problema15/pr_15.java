package edu.upvictoria.fpoo.estructuraRepetitiva.problema15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_15 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void P15() throws IOException {

        System.out.println("Ingresa el numero de trabajadores ");
        int numTrabajadores = Integer.parseInt(reader.readLine());

        double totalPagado = 0;

        for (int i = 1; i <= numTrabajadores; i++) {
            System.out.println("Trabajador numero: " + i);
            System.out.println("Ingresa las horas que trabajo en la semana: ");
            double horasTrabajadas = Double.parseDouble(reader.readLine());

            System.out.println("Ingresa la tarifa por hora: $");
            double tarifaPorHora = Double.parseDouble(reader.readLine());

            double sueldoS = horasTrabajadas * tarifaPorHora;
            totalPagado += sueldoS;
            System.out.println("Sueldo semanal de el trabajador numero " + i + " : $" + sueldoS);
        }
        System.out.println("Total pagado para la cantidad de " + numTrabajadores + " trabajadores es de $" + totalPagado);
    }
}
