package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EjercicioDOce {

    public double cost(int cita){
        double costo;
        if(cita<=3){
            costo=200;
        }else if(cita<=5){
            costo=150;
        }else if(cita<=8){
            costo=100;
        }else{
            costo=50;
        }
        return costo;
    }
    public void EjercicioDOce()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Doce: ");
        System.out.println("El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la consulta\n" +
                "con base en el número de cita, de la siguiente forma:\n" +
                "○ Las tres primeras citas a $200.00 c/u.\n" +
                "○ Las siguientes dos citas a $150.00 c/u.\n" +
                "○ Las tres siguientes citas a $100.00 c/u.\n" +
                "○ Las restantes a $50.00 c/u, mientras dure el tratamiento.\n" +
                "Se requiere un programa para determinar: a) Cuánto pagará el paciente por\n" +
                "la cita. b) El monto de lo que ha pagado el paciente por el tratamiento. Para la\n" +
                "solución de este problema se requiere saber qué número de cita se efectuará, con el\n" +
                "cual se podrá determinar el costo que tendrá la consulta y cuánto se ha gastado en\n" +
                "el tratamiento.");
        System.out.println("Ingresa el numero de cita a la que asistirá ");
        entrada=leer.readLine();
        int cita=Integer.parseInt(entrada);

        System.out.println("Costo de la cita: "+cost(cita));
        System.out.println("Costo del tratamiento: " +(3*200+2*150+3*100+50));

    }
}
