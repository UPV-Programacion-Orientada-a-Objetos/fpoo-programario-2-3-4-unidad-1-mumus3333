package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EjercicioDiecinueve {

    public String semana(int num){
        String dia=null;
        switch(num){
            case 1:
                dia="L";
                break;
            case 2:
                dia="M";
                break;
            case 3:
                dia="MI";
                break;
            case 4:
                dia="J";
                break;
            case 5:
                dia="V";
            case 6:
                dia="S";
                break;
            case 7:
                dia="D";
                break;
        }
        return dia;
    }

    public EjercicioDiecinueve()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Diecinueve");
        entrada=leer.readLine();
        int num=Integer.parseInt(entrada);
        System.out.println("Dia de la semana: "+semana(num));
    }

}
