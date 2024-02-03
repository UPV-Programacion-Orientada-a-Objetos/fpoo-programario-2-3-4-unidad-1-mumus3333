package edu.upvictoria.fpoo.array.problema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_3 {

    public static void sortStudentsByAverage(String[] nombres, double[] promedios) {
        int N = nombres.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (promedios[j] < promedios[j + 1]) {
                    double tempPromedio = promedios[j];
                    promedios[j] = promedios[j + 1];
                    promedios[j + 1] = tempPromedio;

                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }
    }

    public void PA_3() throws IOException {



        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el número de alumnos: ");
        int N = Integer.parseInt(entrada.readLine());

        String[] nombres = new String[N];
        double[] promedios = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = entrada.readLine();

            System.out.print("Ingrese el promedio del alumno " + (i + 1) + ": ");
            promedios[i] = Double.parseDouble(entrada.readLine());
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (promedios[j] < promedios[j + 1]) {
                    double tempPromedio = promedios[j];
                    promedios[j] = promedios[j + 1];
                    promedios[j + 1] = tempPromedio;

                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }

        System.out.println("Alumnos ordenados por promedio (de mayor a menor):");
        for (int i = 0; i < N; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Promedio: " + promedios[i]);
        }

        entrada.close();

    }
}
