/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut03;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Ejer04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        
        String result = (edad>=18)? "Es mayor de edad" : "No es mayor de edad";

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
        System.out.println(result);

    }

}
