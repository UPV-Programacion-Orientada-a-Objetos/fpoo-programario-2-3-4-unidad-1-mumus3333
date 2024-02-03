package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EjercicioDIeciseis {

    public double sueldo(int horas,double pago){
        double sueldo=0;
        if(horas<=40){
            sueldo=horas*pago;
        }else if(horas>40){
            sueldo=40*pago+2*((horas-40)*pago);
        }
        return sueldo;
    }
    public EjercicioDIeciseis()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Quince");
        double pago;
        int horas;
        System.out.println("Ingrese el pago/hora");
        entrada=leer.readLine();
        pago=Double.parseDouble(entrada);
        System.out.println("Ingrese las horas");
        entrada=leer.readLine();
        horas=Integer.parseInt(entrada);
        System.out.println("El sueldo es de: $"+sueldo(horas,pago));
    }
}
