package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.array.problema1.pa_1;
import edu.upvictoria.fpoo.array.problema10.pa_10;
import edu.upvictoria.fpoo.array.problema11.pa_11;
import edu.upvictoria.fpoo.array.problema12.pa_12;
import edu.upvictoria.fpoo.array.problema13.pa_13;
import edu.upvictoria.fpoo.array.problema2.pa_2;
import edu.upvictoria.fpoo.array.problema3.pa_3;
import edu.upvictoria.fpoo.array.problema4.pa_4;
import edu.upvictoria.fpoo.array.problema5.pa_5;
import edu.upvictoria.fpoo.array.problema6.pa_6;
import edu.upvictoria.fpoo.array.problema7.pa_7;
import edu.upvictoria.fpoo.array.problema8.pa_8;
import edu.upvictoria.fpoo.array.problema9.pa_9;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema1.pr_1;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema10.pr_10;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema11.pr_11;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema12.pr_12;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema13.pr_13;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema2.pr_2;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema3.pr_3;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema4.pr_4;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema5.pr_5;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema6.pr_6;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema7.pr_7;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema8.pr_8;
import edu.upvictoria.fpoo.estructuraRepetitiva.problema9.pr_9;
import edu.upvictoria.fpoo.estructurasSelectivas.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;

        while (!exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. ESTRUCTURAS SELECTIVAS");
            System.out.println("2. ESTRUCTURAS REPETITIVAS");
            System.out.println("3. ARRAY");
            System.out.println("0. Salir");

            try {
                int option = Integer.parseInt(reader.readLine());

                switch (option) {
                    case 1:
                        showExerciseMenu("estructurasSelectivas", reader);
                        break;
                    case 2:
                        showExerciseMenu("estructuraRepetitiva", reader);
                        break;
                    case 3:
                        showExerciseMenu("array", reader);
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtelo de nuevo.");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error: Introduzca un número válido.");
            }
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showExerciseMenu(String packageName, BufferedReader reader) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Seleccione un ejercicio del " + packageName + ":");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("15. Ejercicio 15");
            System.out.println("16. Ejercicio 16");
            System.out.println("17. Ejercicio 17");
            System.out.println("18. Ejercicio 18");
            System.out.println("19. Ejercicio 19");
            System.out.println("20. Ejercicio 20");
            System.out.println("21. Ejercicio 21");
            System.out.println("22. Ejercicio 22");
            System.out.println("23. Ejercicio 23");
            System.out.println("24. Ejercicio 24");
            System.out.println("0. Volver al menú principal");


            try {
                int option = Integer.parseInt(reader.readLine());

                switch (option) {

                    case 1:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioUno ej1 = new EjercicioUno();
                            ej1.EjercicioUno();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_1 pr1 = new pr_1();
                            pr1.PR_1();
                        } else if (packageName.equals("array")){
                            pa_1 pa1 = new pa_1();
                            pa1.PA_1();
                        }
                        break;
                    case 2:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioDos ej2 = new EjercicioDos();
                            ej2.EjercicioDos();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_2 pr2 = new pr_2();
                            pr2.PR_2();
                        } else if (packageName.equals("array")){
                            pa_2 pa2 = new pa_2();
                            pa2.PA_2();
                        }
                        break;
                    case 3:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioTres ej3 = new EjercicioTres();
                            ej3.EjercicioTres();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_3 pr3 = new pr_3();
                            pr3.PR_3();
                        } else if (packageName.equals("array")){
                            pa_3 pa3 = new pa_3();
                            pa3.PA_3();
                        }
                        break;
                    case 4:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioCuatro ej4 = new EjercicioCuatro();
                            ej4.EjercicioCuatro();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_4 pr4 = new pr_4();
                            pr4.EJE_4();
                        } else if (packageName.equals("array")){
                            pa_4 pa4 = new pa_4();
                            pa4.PA_4();
                        }
                        break;
                    case 5:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioCinco ej5 = new EjercicioCinco();
                            ej5.EjercicioCinco();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_5 pr5 = new pr_5();
                            pr5.EJE_5();
                        } else if (packageName.equals("array")){
                            pa_5 pa5 = new pa_5();
                            pa5.PA_5();
                        }
                        break;
                    case 6:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioSeis ej6 = new EjercicioSeis();
                            ej6.EjercicioSeis();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_6 pr6 = new pr_6();
                            pr6.PR_6();
                        } else if (packageName.equals("array")){
                            pa_6 pa6 = new pa_6();
                            pa6.PA_6();
                        }
                        break;
                    case 7:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioSiete ej7 = new EjercicioSiete();
                            ej7.EjercicioSiete();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_7 pr7 = new pr_7();
                            pr7.PR_7();
                        } else if (packageName.equals("array")){
                            pa_7 pa7 = new pa_7();
                            pa7.PA_7();
                        }
                        break;
                    case 8:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioOcho ej8 = new EjercicioOcho();
                            ej8.EjercicioOcho();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_8 pr8 = new pr_8();
                            pr8.PR_8();
                        } else if (packageName.equals("array")){
                            pa_8 pa8 = new pa_8();
                            pa8.PA_8();
                        }
                        break;
                    case 9:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioNueve ej9 = new EjercicioNueve();
                            ej9.EjercicioNueve();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_9 pr9 = new pr_9();
                            pr9.PR_9();
                        } else if (packageName.equals("array")){
                            pa_9 pa9 = new pa_9();
                            pa9.PA_9();
                        }
                        break;
                    case 10:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioDiez ej10 = new EjercicioDiez();
                            ej10.EjercicioDiez();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_10 pr10 = new pr_10();
                            pr10.PR_10();
                        } else if (packageName.equals("array")){
                            pa_10 pa10 = new pa_10();
                            pa10.PA_10();
                        }
                        break;
                    case 11:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioOnce ej11 = new EjercicioOnce();
                            ej11.EjercicioOnce();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_11 pr11 = new pr_11();
                            pr11.PR_11();
                        } else if (packageName.equals("array")){
                            pa_11 pa11 = new pa_11();
                            pa11.PA_11();
                        }
                        break;
                    case 12:
                        if (packageName.equals("estructurasSelectivas")){
                            EjercicioDOce ej12 = new EjercicioDOce();
                            ej12.EjercicioDOce();
                        } else if (packageName.equals("estructuraRepetitiva")){
                            pr_12 pr12 = new pr_12();
                            pr12.PR_12();
                        } else if (packageName.equals("array")){
                            pa_12 pa12 = new pa_12();
                            pa12.PA_12();
                        }
                        break;
                    case 13:
                        if (packageName.equals("estructurasSelectivas")){

                        } else if (packageName.equals("estructuraRepetitiva")){

                        } else if (packageName.equals("array")){
                            pa_13 pa13 = new pa_13();
                            pa13.PA_13();
                        }
                        break;


                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtelo de nuevo.");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error: Introduzca un número válido.");
            }
        }
    }
}
