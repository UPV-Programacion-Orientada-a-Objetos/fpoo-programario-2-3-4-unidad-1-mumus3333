package edu.upvictoria.fpoo.estructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {


    public double cargo(int tam, String tipo, double precio){
       double Nprecio=0;
        if(tipo.equals("A")&& tam == 1){
            Nprecio=precio+20;
        }else if(tipo.equals("A") && tam==2){
            Nprecio=precio+30;
        }else if(tipo.equals("B") && tam==1){
            Nprecio=precio-30;
        }else if(tipo.equals("B") && tam==2){
            Nprecio=precio-50;
        }
        return Nprecio;
    }

    public void EjercicioSiete()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Siete");
        System.out.println("La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,\n" +
                "la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la\n" +
                "venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto\n" +
                "recibirá un productor por la uva que entrega en un embarque, considerando lo\n" +
                "siguiente: si es de tipo A, se le cargan $20 al precio inicial cuando es de tamaño 1; y\n" +
                "$30 si es de tamaño 2. Si es de tipo B, se rebajan $30 cuando es de tamaño 1, y $50\n" +
                "cuando es de tamaño 2. Implemtente un programa para determinar la ganancia.");
        String tipo;
        int tam;
        double precio_inicial;
        System.out.println("Ingrese el precio inicial de la uva");
        entrada=leer.readLine();
        precio_inicial=Double.parseDouble(entrada);
        System.out.println("Ingrese el tamaño de la uva");
        entrada=leer.readLine();
        tam=Integer.parseInt(entrada);
        System.out.println("Ingrese el tipo de la uva (A,B)");
        tipo=leer.readLine();
        System.out.println("Precio final: $"+cargo(tam,tipo,precio_inicial));

    }
}
