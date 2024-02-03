package edu.upvictoria.fpoo.estructuraRepetitiva.problema20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_20 {
    public static void P20 () {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce la cantidad de focos:");
        int numFocos = 0;

        try {
            numFocos = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer cantidad.");
            return;
        }

        int focosVerdes = 0;
        int focosBlancos = 0;
        int focosRojos = 0;

        for (int i = 1; i <= numFocos; i++) {
            System.out.println("Foco " + i + ":");
            System.out.println("Ingrese el color del foco (Verde, Blanco, Rojo):");

            String colorFoco = "";

            try {
                colorFoco = br.readLine();
            } catch (IOException e) {
                System.out.println("Error al leer el color del foco.");
                return;
            }

            if (colorFoco.equalsIgnoreCase("V")) {
                focosVerdes++;
            } else if (colorFoco.equalsIgnoreCase("B")) {
                focosBlancos++;
            } else if (colorFoco.equalsIgnoreCase("R")) {
                focosRojos++;
            }
        }

        System.out.println("Cantidad de focos verdes: " + focosVerdes);
        System.out.println("Cantidad de focos blancos: " + focosBlancos);
        System.out.println("Cantidad de focos rojos: " + focosRojos);
    }
}
