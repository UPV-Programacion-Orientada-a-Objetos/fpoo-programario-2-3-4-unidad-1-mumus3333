package edu.upvictoria.fpoo.estructuraRepetitiva.problema12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_12 {
    public static void PR_12() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de ventas:");
        int numVentas = 0;

        try {
            numVentas = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        int ventasMayor1000 = 0;
        int ventasMayor500MenorIgual1000 = 0;
        int ventasMenorIgual500 = 0;

        double montoMayor1000 = 0;
        double montoMayor500MenorIgual1000 = 0;
        double montoMenorIgual500 = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Ingrese el monto de la venta " + i + ":");
            double montoVenta = 0;

            try {
                montoVenta = Double.parseDouble(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }

            if (montoVenta > 1000) {
                ventasMayor1000++;
                montoMayor1000 += montoVenta;
            } else if (montoVenta > 500) {
                ventasMayor500MenorIgual1000++;
                montoMayor500MenorIgual1000 += montoVenta;
            } else {
                ventasMenorIgual500++;
                montoMenorIgual500 += montoVenta;
            }
        }

        double montoTotal = montoMayor1000 + montoMayor500MenorIgual1000 + montoMenorIgual500;

        System.out.println("Cantidad de ventas mayores a $1000: " + ventasMayor1000);
        System.out.println("Monto total de ventas mayores a $1000: $" + montoMayor1000);
        System.out.println("Cantidad de ventas mayores a $500 pero menores o iguales a $1000: " + ventasMayor500MenorIgual1000);
        System.out.println("Monto total de ventas mayores a $500 pero menores o iguales a $1000: $" + montoMayor500MenorIgual1000);
        System.out.println("Cantidad de ventas menores o iguales a $500: " + ventasMenorIgual500);
        System.out.println("Monto total de ventas menores o iguales a $500: $" + montoMenorIgual500);
        System.out.println("Monto total de todas las ventas: $" + montoTotal);
    }
}
