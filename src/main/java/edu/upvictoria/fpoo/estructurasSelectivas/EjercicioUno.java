package edu.upvictoria.fpoo.estructurasSelectivas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioUno {


    public double Numero_Mayor(double a, double b){
        double mayor=0;
        if(a>b){
            mayor=a;
        }else if(b>a){
            mayor=b;
        }
        return mayor;
    }
    public void EjercicioUno ()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercico Uno");
        System.out.println("Se desea implementar un programa para determinar cuál de dos valores\n" +
                "proporcionados es el mayor.");
        double a;
        double b;
        System.out.println("Ingrese el primer valor");
        entrada=leer.readLine();
        a=Double.parseDouble(entrada);
        System.out.println("Ingrese el segundo valor");
        entrada=leer.readLine();
        b=Double.parseDouble(entrada);

        System.out.println("EL numero mayor es: "+Numero_Mayor(a,b));


    }
}
