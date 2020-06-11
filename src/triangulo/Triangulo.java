/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author Jorge Luis
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c = 0;
        boolean c1, c2, c3, isATriangle;
        
        System.out.println ("Empezamos el programa");
        
        System.out.println ("Por favor introduzca a: ");       
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        a = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Por favor introduzca b: ");       
        entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        b = entradaEscaner.nextInt();
        System.out.println ("Por favor introduzca c: ");       
        entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        c = entradaEscaner.nextInt();
        

        System.out.println ("a = "+ a);
        System.out.println ("b = "+ b);
        System.out.println ("c = "+ c);
        /*do {            
            
        } while (isATriangle);*/
    }
    
}
