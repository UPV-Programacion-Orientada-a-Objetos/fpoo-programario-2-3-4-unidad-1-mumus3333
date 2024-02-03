package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioTres {

    public double precio(double cant){
        double precio=0;
        if(cant>=1000){
            precio=cant*3.65;
        }else if(cant<1000){
            precio=cant*4.83;
        }
        return precio;
    }
    public void EjercicioTres()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Tres");
        System.out.println("Implemente un programa para determinar cuánto se debe pagar por X cantidad de\n" +
                "lápices considerando que si son 1000 o más el costo es de $3.65 por unidad; de lo\n" +
                "contrario, el precio es de $4.83.");
        System.out.println("Ingrese la cantidad de lapices: ");
        entrada=leer.readLine();
        double cant=Double.parseDouble(entrada);
        System.out.println("EL precio es de: "+precio(cant));
    }
}
