package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioSeis {

    public double precio(int cant)
    {
        double precio=0;
        if(cant<200){
            precio=cant*95;
        }else if(cant>=200&&cant<=300){
            precio=cant*85;
        }else if(cant>300){
            precio=cant*75;
        }
        return precio;
    }
    public void EjercicioSeis()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Seis");
        System.out.println("“La langosta ahumada” es una empresa dedicada a ofrecer banquetes; sus tarifas\n" +
                "son las siguientes: el costo de platillo por persona es de $95.00, pero si el número\n" +
                "de personas es mayor a 200 pero menor o igual a 300, el costo es de $85.00. Para\n" +
                "más de 300 personas el costo por platillo es de $75.00. Implemente un programa\n" +
                "que ayude a determinar el presupuesto que se debe presentar a los clientes que\n" +
                "deseen realizar un evento.");
        int personas;
        System.out.println("Ingrese la cantidad de personas");
        entrada=leer.readLine();
        personas=Integer.parseInt(entrada);
        System.out.println("Total a pagar: $" +precio(personas));
    }

}
