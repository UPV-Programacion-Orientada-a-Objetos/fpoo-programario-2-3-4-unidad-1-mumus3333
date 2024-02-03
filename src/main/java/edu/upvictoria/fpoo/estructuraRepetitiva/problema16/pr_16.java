package edu.upvictoria.fpoo.estructuraRepetitiva.problema16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_16 {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public void P16() {
        try {
            System.out.print("Introduce numero de ciudades: ");
            int numCiudades = Integer.parseInt(entrada.readLine());

            System.out.print("Introduce el numero de tiendas por ciudad: ");
            int numTiendas = Integer.parseInt(entrada.readLine());

            System.out.print("Introduce el numero de empleados por tienda: ");
            int numEmpleados = Integer.parseInt(entrada.readLine());

            double totalRecaudado = 0;

            for (int ciudad = 1; ciudad <= numCiudades; ciudad++) {
                System.out.println("ciudad num" + ciudad);
                double totalVentasCiudad = 0;

                for (int tienda = 1; tienda <= numTiendas; tienda++) {
                    System.out.println("Tienda numero" + tienda);
                    double totalVentasTienda = 0;

                    for (int empleado = 1; empleado <= numEmpleados; empleado++) {
                        System.out.print("Introduce las ventas del empleado #" + empleado + ": $");
                        double ventasEmpleado = Double.parseDouble(entrada.readLine());
                        totalVentasTienda += ventasEmpleado;
                    }

                    System.out.println("El total ventas en tienda #" + tienda + "es : $" + totalVentasTienda);
                    totalVentasCiudad += totalVentasTienda;
                }

                System.out.println("El total ventas en ciudad #" + ciudad + "es : $" + totalVentasCiudad);
                totalRecaudado += totalVentasCiudad;
            }

            System.out.println("El total recaudado en todas las ciudades es $" + totalRecaudado);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
