package edu.upvictoria.fpoo.estructuraRepetitiva.problema18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_18 {
    public static void P18 () {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int costoHamburguesaSencilla = 20;
        int costoHamburguesaDoble = 25;
        int costoHamburguesaTriple = 28;

        double cargoTarjeta = 0.05;

        try {
            System.out.println("Ingrese el número de hamburguesas a comprar:");
            int numHamburguesas = Integer.parseInt(br.readLine());

            int totalPago = 0;

            for (int i = 1; i <= numHamburguesas; i++) {
                System.out.println("Hamburguesa " + i + ":");
                System.out.println("Ingrese el tipo de hamburguesa (S, D, T):");
                String tipoHamburguesa = br.readLine();

                if (tipoHamburguesa.equalsIgnoreCase("S")) {
                    totalPago += costoHamburguesaSencilla;
                } else if (tipoHamburguesa.equalsIgnoreCase("D")) {
                    totalPago += costoHamburguesaDoble;
                } else if (tipoHamburguesa.equalsIgnoreCase("T")) {
                    totalPago += costoHamburguesaTriple;
                }
            }

            double totalPagoTarjeta = totalPago + (totalPago * cargoTarjeta);

            System.out.println("El total a pagar es: $" + totalPago);
            System.out.println("El total a pagar con tarjeta es: $" + totalPagoTarjeta);

        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
