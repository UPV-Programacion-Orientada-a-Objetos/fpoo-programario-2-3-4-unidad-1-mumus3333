package edu.upvictoria.fpoo.estructuraRepetitiva.problema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_4 {
    public void EJE_4() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = Integer.parseInt(enter.readLine());

        int sumaEdades = 0;

        for (int i = 1; i <= numAlumnos; i++) {
            System.out.println("Ingrese la edad del alumno " + i + ":");
            int edad = Integer.parseInt(enter.readLine());

            sumaEdades += edad;
        }

        double edadPromedio = (double) sumaEdades / numAlumnos;
        System.out.println("La edad promedio del grupo de alumnos es: " + edadPromedio);
    }
}
