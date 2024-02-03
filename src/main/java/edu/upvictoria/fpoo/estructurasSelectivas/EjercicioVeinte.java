package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjercicioVeinte {

    public double salario(int puntos,double salarios)
    {
        double sal=0;
        if(puntos<100){
            sal=salarios;
        }else if(puntos<=151){
            sal=2*salarios;
        }else if(puntos>151){
            sal=3*salarios;
        }
        return sal;
    }
    public EjercicioVeinte()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Veinte");
        int puntos;
        double salario;
        System.out.println("Ingrese la puntuación:");
        entrada=leer.readLine();
        puntos=Integer.parseInt(entrada);
        System.out.println("Ingrese el salario:");
        entrada=leer.readLine();
        salario=Integer.parseInt(entrada);
        System.out.println("Bono: " +salario(puntos,salario));
    }
}
