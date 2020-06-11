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
        int a, b, c=0;
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
        
        classify(a,b,c);
        
    }
    
    public static TipoTriangulo classify(final int a, final int b, final int c) {
        int trian;
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
        	System.out.println ("No es un triangulo");
          return TipoTriangulo.NotATriangle;
        }
        trian = 0;
        if (a == b) {
          trian = trian + 1;
        }
        if (a == c) {
          trian = trian + 2;
        }
        if (b == c) {
          trian = trian + 3;
        }
        if (trian == 0) {
          if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
        	  System.out.println ("No es un triangulo");
            return TipoTriangulo.NotATriangle;
          } else {
        	  System.out.println ("Tiangulo escaleno");
            return TipoTriangulo.SCALENE;
          }
        }
        if (trian > 3) {
        	System.out.println ("Tiangulo equilatero");
          return TipoTriangulo.EQUILATERAL;
        }
        if ((trian == 1) && ((a + b) > c)) {
        	System.out.println ("Triangulo isoceles");
          return TipoTriangulo.ISOSCELES;
        } else if ((trian == 2) && ((a + c) > b)) {
        	System.out.println ("Triangulo isoceles");
          return TipoTriangulo.ISOSCELES;
        } else if ((trian == 3) && ((b + c) > a)) {
        	System.out.println ("Triangulo isoceles");
          return TipoTriangulo.ISOSCELES;
        }
        System.out.println ("No es un triangulo");
        return TipoTriangulo.NotATriangle;
      }
    

    
}
