package edu.upvictoria.fpoo.estructuraRepetitiva.problema9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr_9 {
    public void PR_9() throws IOException {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número de elementos de la sucesión de Fibonacci:");
        int numElementos = Integer.parseInt(enter.readLine());

        int num1 = 0;
        int num2 = 1;

        System.out.println("Sucesión de Fibonacci:");

        System.out.print(num1 + ", " + num2 + ", ");

        for (int i = 3; i <= numElementos; i++) {
            int siguiente = num1 + num2;
            System.out.print(siguiente + ", ");

            num1 = num2;
            num2 = siguiente;
        }
    }
}
