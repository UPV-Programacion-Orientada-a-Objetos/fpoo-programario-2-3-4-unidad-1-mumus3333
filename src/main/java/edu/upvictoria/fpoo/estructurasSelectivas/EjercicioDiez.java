package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioDiez {
    public double cobre(int personas,String tipo){
        double costo=0;
         if(personas<20){
             personas=20;
         }
        if(tipo.equals("A")){
            costo=personas*2;
        }else if(tipo.equals("B")){
            costo=personas*2.5;
        }else if(tipo.equals("C")){
            costo=personas*3;
        }
        return costo;
    }
    public void EjercicioDiez()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Diez");
        System.out.println("Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada uno\n" +
                "tiene un precio por kilómetro recorrido por persona, los costos respectivos son $2.0,\n" +
                "$2.5 y $3.0. Se requiere determinar el costo total y por persona del viaje\n" +
                "considerando que cuando éste se presupuesta debe haber un mínimo de 20\n" +
                "personas, de lo contrario el cobro se realiza con base en este número límite.");
        String tipo;
        int personas;
        System.out.println("Ingrese la cantidad de personas: ");
        entrada=leer.readLine();
        personas=Integer.parseInt(entrada);
        System.out.println("Ingrese el tipo de autobus (A,B,C): ");
        tipo=leer.readLine();
        System.out.println("Costo total: $" +cobre(personas,tipo));

    }
}
