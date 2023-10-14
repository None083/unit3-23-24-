/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unit3;

import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class Unit3 {

    public static void main(String[] args) {
        
        double estatura = Double.parseDouble(JOptionPane.showInputDialog(
                "Introduce estatura (cm) "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog(
                "Introduce peso (k) "));
        int edad = Integer.parseInt(JOptionPane.showInputDialog(
                "Introduce edad "));
        
        double imc = 0;
        
        boolean pesoInferior18 = imc<18.5;
        
        //Si el imc es menor que 18.5 muestra "peso inferior al normal"
        //dentro del if hay que poner una condición (expresion logica)
        
        if (imc <18.5) {
            System.out.println("peso inferior");
        } else if (imc>=18.5 && imc<25) {
            System.out.println("peso normal");
        } else{
            System.out.println("peso superior");
        }
        
        
    }
}
