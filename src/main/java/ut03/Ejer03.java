/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut03;

/**
 *
 * @author noelia
 */
public class Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1
        boolean unaCondicion = 3>2;
        String resultado = (unaCondicion) ? "1" : "2";
        System.out.println(resultado);
        //Sale la primera opcion porque siempre va a ser true

        
        //2
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        //Sale 100, porque 10 es mayor que 9, por lo tanto true
        

        //3
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : (vendidas < aforo) ? 
                "Aun no hemos vendido todo" : "Esta todo vendido";
        System.out.println(status);
        //Sale "está todo vendido", ya que hay muchas mas entradas vendidas que aforo
        //Lo cual es una cagada

    }

}
