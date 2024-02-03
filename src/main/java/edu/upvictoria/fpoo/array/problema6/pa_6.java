package edu.upvictoria.fpoo.array.problema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_6 {

    public void PA_6() throws IOException {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            double[][] calificaciones = {
                    {80.5, 90.0, 85.5, 70.0},
                    {70.0, 75.5, 80.0, 65.0},
                    {85.0, 95.0, 90.5, 75.0}
            };

            int opcion;
            do {
                System.out.println("\nMenú:");
                System.out.println("1) Mostrar el total de alumnos y sus respectivas calificaciones.");
                System.out.println("2) Mostrar las calificaciones y el promedio de un alumno determinado.");
                System.out.println("3) Calcular el promedio general del grupo.");
                System.out.println("4) Mostrar la lista de alumnos no competentes (menor a 70 de promedio).");
                System.out.println("5) Salir");
                System.out.print("Ingrese su opción: ");
                opcion = Integer.parseInt(entrada.readLine());

                switch (opcion) {
                    case 1:
                        mostrarCalificaciones(calificaciones);
                        break;
                    case 2:
                        System.out.print("Ingrese el número de alumno (1-" + calificaciones.length + "): ");
                        int alumno = Integer.parseInt(entrada.readLine());
                        mostrarCalificacionesPromedio(calificaciones, alumno - 1);
                        break;
                    case 3:
                        double promedioGeneral = calcularPromedioGeneral(calificaciones);
                        System.out.println("El promedio general del grupo es: " + promedioGeneral);
                        break;
                    case 4:
                        mostrarAlumnosNoCompetentes(calificaciones);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 5);

            entrada.close();
        }

        public static void mostrarCalificaciones(double[][] calificaciones) {
            System.out.println("Calificaciones de los alumnos:");
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.print("Alumno " + (i + 1) + ": ");
                for (int j = 0; j < calificaciones[i].length; j++) {
                    System.out.print(calificaciones[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void mostrarCalificacionesPromedio(double[][] calificaciones, int alumno) {
            System.out.println("Calificaciones del alumno " + (alumno + 1) + ":");
            for (int i = 0; i < calificaciones[alumno].length; i++) {
                System.out.println("Materia " + (i + 1) + ": " + calificaciones[alumno][i]);
            }
            double promedio = calcularPromedio(calificaciones[alumno]);
            System.out.println("Promedio del alumno " + (alumno + 1) + ": " + promedio);
        }

        public static double calcularPromedioGeneral(double[][] calificaciones) {
            double suma = 0;
            int totalCalificaciones = 0;
            for (double[] alumno : calificaciones) {
                for (double calificacion : alumno) {
                    suma += calificacion;
                    totalCalificaciones++;
                }
            }
            return suma / totalCalificaciones;
        }

        public static void mostrarAlumnosNoCompetentes(double[][] calificaciones) {
            System.out.println("Alumnos no competentes:");
            for (int i = 0; i < calificaciones.length; i++) {
                double promedio = calcularPromedio(calificaciones[i]);
                if (promedio < 70) {
                    System.out.println("Alumno " + (i + 1) + ": Promedio = " + promedio);
                }
            }
        }

        public static double calcularPromedio(double[] calificaciones) {
            double suma = 0;
            for (double calificacion : calificaciones) {
                suma += calificacion;
            }
            return suma / calificaciones.length;
        }
}

