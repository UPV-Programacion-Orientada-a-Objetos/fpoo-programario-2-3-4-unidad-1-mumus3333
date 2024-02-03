package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjercicioOnce {

    public double costo(String tipo, int cant){
        double costo=0;
        if(tipo.equals("sencillas")){
            costo=(cant*20)+(cant*20*0.05);
        }else if(tipo.equals("dobles")){
            costo=(cant*25)+(cant*25*0.05);
        }else if(tipo.equals("triples")){
            costo=(cant*28)+(cant*28*0.05);
        }
        return costo;
    }
    public void EjercicioOnce()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Once");
        System.out.println("“El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples, las cuales\n" +
                "tienen un costo de $20.00, $25.00 y $28.00 respectivamente. La empresa acepta\n" +
                "tarjetas de crédito con un cargo de 5% sobre la compra. Suponiendo que los clientes\n" +
                "adquieren sólo un tipo de hamburguesa, realice un programa para determinar cuánto\n" +
                "debe pagar una persona por N hamburguesas.");
        String tipo;
        int cantidad;
        System.out.println("Ingresa el tipo de hamburguesa (sencillas, dobles, triples)");
        tipo=leer.readLine();
        System.out.println("Ingresa la cantidad de hamburguesas");
        entrada=leer.readLine();
        cantidad=Integer.parseInt(entrada);
        System.out.println("EL costo total es: " +costo(tipo,cantidad));
    }

}
