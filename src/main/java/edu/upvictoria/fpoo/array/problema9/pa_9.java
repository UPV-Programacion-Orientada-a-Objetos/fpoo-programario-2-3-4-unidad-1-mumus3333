package edu.upvictoria.fpoo.array.problema9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pa_9 {

    public void PA_9() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int[][] ventas = new int[5][5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la venta del día " + (j + 1) + ": ");
                ventas[i][j] = Integer.parseInt(entrada.readLine());
            }
        }

        int ventaMayor = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
            }
        }

        System.out.println("La venta mayor realizada fue: " + ventaMayor);

    }
}
