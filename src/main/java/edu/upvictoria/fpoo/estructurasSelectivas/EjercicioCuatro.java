package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioCuatro {
    public double descuento(double precio){
        double desc=0;
        if(precio>= 2500){
            desc=precio*0.15;
        }else if(precio<=2500){
            desc=precio*0.08;
        }
        return desc;
    }
    public double Precio_final(double precio){
        double precioF=0;
        double desc=descuento(precio);
        precioF=precio-desc;
        return precioF;
    }

    public void EjercicioCuatro()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Cuatro");
        System.out.println("Almacenes “El harapiento distinguido” tiene una promoción: a todos los trajes que\n" +
                "tienen un precio superior a $2500.00 se les aplicará un descuento de 15%, a todos\n" +
                "los demás se les aplicará sólo 8%. Implemente un programa para determinar el\n" +
                "precio final que debe pagar una persona por comprar un traje y de cuánto es el\n" +
                "descuento que obtendrá.");
        double precio;
        System.out.println("Ingrese el precio del traje");
        entrada= leer.readLine();;
        precio=Double.parseDouble(entrada);
        System.out.println("Descuento: $"+descuento(precio));
        System.out.println("Precio final: $"+Precio_final(precio));


    }
}
