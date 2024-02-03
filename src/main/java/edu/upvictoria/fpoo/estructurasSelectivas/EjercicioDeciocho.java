package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjercicioDeciocho {


    public String cal(int cal){
        String cal_=null;
        if(cal==10){
            cal_="A";
        }else if(cal==9){
            cal_="B";
        }else if(cal==8){
            cal_="C";
        }else if(cal==7||cal==6){
            cal_="D";
        }else{
            cal_="F";
        }
        return cal_;
    }
    public EjercicioDeciocho()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Deciocho: ");
        System.out.println("Introduzca su calificacion (0-10)");
        entrada=leer.readLine();
        int cal=Integer.parseInt(entrada);
        System.out.println("Su calificacion es: "+cal(cal));
    }

}
