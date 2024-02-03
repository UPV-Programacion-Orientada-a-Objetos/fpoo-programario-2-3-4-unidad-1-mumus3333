package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EjercicioOcho {

    public double costo(int alumn){
        double costo=0;
        if(alumn>=100){
            costo=alumn*65;
        }else if(alumn>49 && alumn<100){
            costo=alumn*70;
        }else if((alumn>=39)&& (alumn<40)){
            costo=alumn*95;
        }else if(alumn<30){
            costo=4000;
        }
        return costo;
    }
     public void EjercicioOcho()throws IOException{
         BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
         String entrada;
         System.out.println("Ejercicio Ocho");
         System.out.println("El director de una escuela está organizando un viaje de estudios, y requiere\n" +
                 "determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía\n" +
                 "de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o\n" +
                 "más, el costo por cada alumno es de $65.00; de 50 a 99 alumnos, el costo es de\n" +
                 "$70.00, de 30 a 49, de $95.00, y si son menos de 30, el costo de la renta del\n" +
                 "autobús es de $4000.00, sin importar el número de alumnos. Implemente un\n" +
                 "programa que permita determinar el pago a la compañía de autobuses y lo que debe\n" +
                 "pagar cada alumno por el viaje.");
         int alumn;
         System.out.println("Ingrese la cantidad de alumnos");
         entrada=leer.readLine();
         alumn=Integer.parseInt(entrada);
         System.out.println("El pago es de: $" +costo(alumn));
     }
}
