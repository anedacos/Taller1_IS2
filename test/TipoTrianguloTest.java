/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import triangulo.TipoTriangulo;

/**
 *
 * @author Jorge Luis
 */
public class TipoTrianguloTest {
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testEquilatero() {
         TipoTriangulo resultado = triangulo.Triangulo.classify(2, 2, 2); //Prueba a realizar
         TipoTriangulo esperado = triangulo.TipoTriangulo.EQUILATERAL;
         assertEquals(esperado, resultado); //Verifica si los dos coinciden, así la prueba se hizo correctamente
     }
     @Test
     public void testIsoceles() {
         TipoTriangulo resultado = triangulo.Triangulo.classify(2, 1, 2);
         TipoTriangulo esperado = triangulo.TipoTriangulo.ISOSCELES;
         assertEquals(esperado, resultado);
         
     }
     @Test
     public void testEscaleno() {
         TipoTriangulo resultado = triangulo.Triangulo.classify(2, 1, 3);
         TipoTriangulo esperado = triangulo.TipoTriangulo.SCALENE;
         assertEquals(esperado, resultado);
         
     }
     
      @Test
     public void testNotATriangle() {
         TipoTriangulo resultado = triangulo.Triangulo.classify(210, 1, 3);
         TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
         assertEquals(esperado, resultado);
         
     }
     
      @Test
     public void testNotATriangle2() {
         TipoTriangulo resultado = triangulo.Triangulo.classify(10, 1, 310);
         TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
         assertEquals(esperado, resultado);
         
     }
     
}
