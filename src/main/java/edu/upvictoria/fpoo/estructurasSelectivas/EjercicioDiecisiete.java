package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjercicioDiecisiete {

    public String regalo(double presp){
        String regalo=null;
        if(presp<=10){
            regalo="Tarjeta";
        }else if(presp<=100){
            regalo="Chocolates";
        }else if(presp<=250){
            regalo="Flores";
        }else if(presp>251){
            regalo="Anillo";
        }
        return regalo;
    }
    public EjercicioDiecisiete()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Diecisiete");
        double presupuesto;
        System.out.println("Ingrese su presupuesto: ");
        entrada=leer.readLine();
        presupuesto=Double.parseDouble(entrada);
        System.out.println("Usted puede comprar: "+regalo(presupuesto));

    }
}
