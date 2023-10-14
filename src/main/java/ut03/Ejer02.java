/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut03;

/**
 *
 * @author noelia
 */
public class Ejer02 {

    /**
     * -Si el número “x” es mayor o igual que 135 se devolverá “mayor”, 
     * si es menor se devolverá “menor”. Las cadenas que se devuelven se 
     * guardarán en una variable llamada resultado.
    
       -Si el número “x” es menor o igual que cero se imprimirá en pantalla 
       Menor que cero”, si no se imprimirá “Mayor que cero”.
       
       -Guardar el valor absoluto de un número entero en una variable entera 
       (sin usar la función Math.abs())
     */
    public static void main(String[] args) {
        
        int numero = 40;
        
        //1
        String resultado = (numero>=135)? "mayor" : "menor";
        System.out.println("El número es " + resultado + " que 135");
        
        //2
        String resultado2 = (numero<=0)? "menor que cero" : "mayor que cero";
        System.out.println("El número es " + resultado2);
        
        //3
        int resultado3 = (numero<0)? -numero : numero;
        
        
    }
    
}
