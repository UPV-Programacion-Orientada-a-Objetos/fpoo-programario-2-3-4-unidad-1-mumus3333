package edu.upvictoria.fpoo.estructuraRepetitiva.problema14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_14 {
    public static void P14() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce la cantidad de trabajadores:");
        int numTrabajadores = 0;

        try {
            numTrabajadores = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        double totalPagoEmpresa = 0;

        for (int i = 1; i <= numTrabajadores; i++) {
            System.out.println("Introduce la cantidad de  horas trabajadas por el empleado " + i + " en la semana:");
            int horasTrabajadas = 0;

            try {
                horasTrabajadas = Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }

            double sueldoSemanal = horasTrabajadas * 10;

            System.out.println("El sueldo semanal del empleado " + i + " es: $" + sueldoSemanal);

            totalPagoEmpresa += sueldoSemanal;
        }

        System.out.println("La empresa pagara un total de $" + totalPagoEmpresa);
    }
}
