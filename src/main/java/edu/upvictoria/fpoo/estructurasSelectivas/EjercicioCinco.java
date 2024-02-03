package edu.upvictoria.fpoo.estructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {
    public double Numero_Mayor(double a, double b, double c){
        double mayor=0;
        if(a>b&&a>c){
            mayor=a;
        }else if(b>a&&b>c){
            mayor=b;
        }else if(c>a&&c>b){
            mayor=c;
        }
        return mayor;
    }
    public void EjercicioCinco ()throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercico Cinco");
        System.out.println("Implemente un programa para determinar cuál de tres cantidades proporcionadas es\n" +
                "la mayor.");
        double a;
        double b;
        double c;
        System.out.println("Ingrese el primer valor");
        entrada=leer.readLine();
        a=Double.parseDouble(entrada);
        System.out.println("Ingrese el segundo valor");
        entrada=leer.readLine();
        b=Double.parseDouble(entrada);
        System.out.println("Ingrese el Tercer valor");
        entrada=leer.readLine();
        c=Double.parseDouble(entrada);
        System.out.println("EL numero mayor es: "+Numero_Mayor(a,b,c));
    }
}
