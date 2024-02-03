package edu.upvictoria.fpoo.estructuraRepetitiva.problema13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_13 {
    public static void P13() {
        double montoPago = 10;
        double totalPagado = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int mes = 1; mes <= 20; mes++) {
            totalPagado += montoPago;
            montoPago *= 2;
        }

        try {
            System.out.print("Introduce el nombre del objeto: ");
            String nombreObjeto = reader.readLine();
            System.out.println("El monto mensual a pagar es: " + nombreObjeto + ": $" + montoPago);
            System.out.println("Total pagado después de 20 meses para " + nombreObjeto + ": $" + totalPagado);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
