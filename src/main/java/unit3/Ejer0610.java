/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Ejer0610 {

    /**
     * a, dice si un numero es par o impar b, dice si el mes es valido (1-12), y
     * el nombre c, 3 numeros(h,m,s) y tiene que decir si es una hora válida
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Locale locale = new Locale("es", "ES");

        String opcion = "";

        do {

            System.out.println("""
                           
                                 ESCOGE UNA OPCIÓN
                           ------------------------------
                           A - Número par o impar
                           B - Més válido
                           C - Hora válida
                           S - Salir
                           
                           """);

            opcion = teclado.nextLine().toUpperCase();

            if (opcion.equals("A") || opcion.equals("B")
                    || opcion.equals("C") || opcion.equals("S")) {
                try {

                    switch (opcion) {
                        case "A":
                            System.out.println("Introduce un número entero");
                            int numero = teclado.nextInt();
                            teclado.nextLine();

                            if (numero % 2 == 0) {
                                System.out.println("El número " + numero + " es par");
                            } else {
                                System.out.println("El número " + numero + " es impar");
                            }
                            break;
                        case "B":
                            System.out.println("Introduce un mes (número)");
                            int numMes = teclado.nextInt();

                            if (numMes >= 1 && numMes <= 12) {

                                String nombreMes = Month.of(numMes).getDisplayName(TextStyle.FULL, locale);
                                System.out.println(numMes + " es un mes válido correspondiente a " + nombreMes);

                            } else {
                                System.out.println(numMes + " no es un mes válido");
                            }
                            break;
                        case "C":

                            System.out.println("Introduce un número para los segundos");
                            int numSegundos = teclado.nextInt();
                            teclado.nextLine();

                            System.out.println("Introduce un número para los minutos");
                            int numMinutos = teclado.nextInt();
                            teclado.nextLine();

                            System.out.println("Introduce un número para la hora");
                            int numHora = teclado.nextInt();
                            teclado.nextLine();

                            if ((numSegundos >= 0 && numSegundos <= 59)
                                    && (numMinutos >= 0 && numMinutos <= 59)
                                    && (numHora >= 0 && numHora <= 23)) {
                                System.out.println("La hora " + numHora + ":" + numMinutos + ":" + numSegundos + " es válida");
                            } else {
                                System.out.println("La hora no es válida");
                            }
                            break;
                    }

                } catch (InputMismatchException ime) {
                    System.out.println("Eso no es un número");
                }

            } else {
                System.out.println("No es una opción válida");
            }

        } while (!opcion.equals("S"));
        System.out.println("Chao pescao");
    }

}
