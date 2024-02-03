package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioDos {

    public String P_N(double num){
        String num2=null;
        if(num>0){
            num2="Positivo";
        }else if(num<0){
            num2="Negativo";
        }
        return num2;
    }
    public void EjercicioDos()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Dos");
        System.out.println("Realice un programa para determinar si un número es positivo o negativo.");
        System.out.println("Ingrese un numero");
        entrada=leer.readLine();
        double num=Double.parseDouble(entrada);
        System.out.println("El numero es: "+P_N(num));

    }
}
