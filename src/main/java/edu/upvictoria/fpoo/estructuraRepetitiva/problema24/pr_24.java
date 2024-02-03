package edu.upvictoria.fpoo.estructuraRepetitiva.problema24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_24 {
    public static void P24() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Bienvenido al sistema de compra de artículos");
            System.out.println("Ingrese la cantidad de artículos que desea comprar:");
            int numArticulos = Integer.parseInt(reader.readLine());

            double totalPago = 0.0;

            for (int i = 1; i <= numArticulos; i++) {
                System.out.println("Detalles del Artículo " + i + ":");
                System.out.println("Ingrese el precio del artículo:");
                double precio = Double.parseDouble(reader.readLine());

                double descuento = 0.0;

                if (precio >= 200) {
                    descuento = precio * 0.15;
                } else if (precio > 100 && precio < 200) {
                    descuento = precio * 0.12;
                } else {
                    descuento = precio * 0.10;
                }

                double costo = precio - descuento;
                totalPago += costo;

                System.out.println("Costo del artículo: $" + costo);
                System.out.println("Descuento aplicado: $" + descuento);
            }

            System.out.println("¡Compra realizada con éxito!");
            System.out.println("Total a pagar por todos los artículos: $" + totalPago);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
