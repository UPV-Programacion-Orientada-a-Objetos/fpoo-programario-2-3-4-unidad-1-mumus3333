package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioQuince {

    public String evaluar(int edad){
        String dec=null;
        if(edad<18){
            dec="No puede votar";
        }else{
            dec="Puede votar";
        }
        return dec;
    }
    public EjercicioQuince()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Quince");
        int edad;
        System.out.println("Ingrese su edad: ");
        entrada=leer.readLine();
        edad=Integer.parseInt(entrada);
       System.out.println("Usted "+evaluar(edad));
    }
}
