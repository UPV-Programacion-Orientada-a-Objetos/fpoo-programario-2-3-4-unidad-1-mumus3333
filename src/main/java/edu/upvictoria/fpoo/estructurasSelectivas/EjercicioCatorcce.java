package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioCatorcce {

    public double ince(int tipo){
        double inc;
        if(tipo==1){
            inc=0.25;
        }else if(tipo==2){
            inc=0.35;
        }else if(tipo==3){
            inc=0.40;
        }else{
            inc=0.50;
        }
        return inc;
    }
   public EjercicioCatorcce()throws IOException{
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
       String entrada;
       System.out.println("Ejercico Catorce");
       int tipo;
       System.out.println("Ingrese el tipo de tarjeta:" );
       entrada= leer.readLine();
       tipo=Integer.parseInt(entrada);
       System.out.println("Su incremento es de: "+(ince(tipo))*100+"%");
   }
}
