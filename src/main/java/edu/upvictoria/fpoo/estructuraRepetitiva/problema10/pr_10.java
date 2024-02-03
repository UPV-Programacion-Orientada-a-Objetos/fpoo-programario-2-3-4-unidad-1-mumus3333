package edu.upvictoria.fpoo.estructuraRepetitiva.problema10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_10 {
    public void PR_10() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        int totalHoras = 0;
        double sueldo = 0;

        for (int dia = 1; dia <= 6; dia++) {
            System.out.println("Ingrese las horas trabajadas el día " + dia + ":");
            int horasDia = Integer.parseInt(enter.readLine());

            totalHoras += horasDia;
        }

        sueldo = totalHoras * 10; // Suponiendo un sueldo de $10 por hora trabajada

        System.out.println("Total de horas trabajadas: " + totalHoras);
        System.out.println("Sueldo a recibir: $" + sueldo);
    }
}
