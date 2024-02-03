package edu.upvictoria.fpoo.estructurasSelectivas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjercicioNueve {

    public double saldo(double min, String dia){
        double costo=0;
        if(min<=5){
            costo=min*1.00;
        }
        if(min<=8){
            costo=5*1.00+(min-5)*0.80;
        }if(min<=10){
            costo=5*1.00+3*0.80+(min-8)*0.70;
        }else{
            costo=5*1.00 + 3*0.80 + 2*0.70 + (min-10)*0.50;
        }
        return costo;
    }

    public double impuesto(double costo,String dia,String turno){
        if (dia.equals("DOMINGO")) {
            costo+=(costo*0.03);
        }else if(turno.equals("M")){
            costo+=(costo*0.15);
        }else if(turno.equals("V")){
            costo+=(costo*0.10);
        }
        double pago=costo;
        return pago;
    }

    public void EjercicioNueve()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Nueve");
        System.out.println("La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando se\n" +
                "realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los\n" +
                "primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, $0.80 c/u, los\n" +
                "siguientes dos minutos, $0.70 c/u, y a partir del décimo minuto, $0.50 c/u. Además,\n" +
                "se carga un impuesto de 3% cuando es domingo, y si es día hábil, en turno matutino,\n" +
                "15%, y en turno vespertino, 10 %. Implemente un programa para determinar cuánto\n" +
                "debe pagar por cada concepto una persona que realiza una llamada.");
        String dia;
        int min;
        System.out.println("Ingrese el dia de la llamada");
        dia=leer.readLine();
        System.out.println("Ingrese el turno de la llamada");
        String turno=leer.readLine();
        System.out.println("Ingrese los minutos de duracion de la llamada: ");
        entrada=leer.readLine();
        min=Integer.parseInt(entrada);
        double costo=saldo(min,dia);
        System.out.println("Su saldo es de: "+impuesto(costo,dia,turno));


    }
}
