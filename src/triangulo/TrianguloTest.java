package triangulo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
*
* @author Lenin Lima
*/
public class TrianguloTest {

	Triangulo t;
	@Before
	public void before() {
		t = new Triangulo();
	}
	@Test
	//Validar que solo tenga 2 lados
	public void ValoresCero1() {
		TipoTriangulo resultado = triangulo.Triangulo.classify(0,5,5);
		TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
        assertEquals(esperado, resultado);	
	}
	@Test
	//Validar que solo tenga 1 lado
	public void ValoresCero2() {
		TipoTriangulo resultado = triangulo.Triangulo.classify(0,0,5);
		TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
        assertEquals(esperado, resultado);	
	}
	@Test
	//Validar que no tenga lados
	public void ValoresCero3() {
		TipoTriangulo resultado = triangulo.Triangulo.classify(0,0,0);
		TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
        assertEquals(esperado, resultado);	
	}
	@Test
	//Validar que no tenga 1 lado con valor negativo
	public void ValoresNegativos() {
		TipoTriangulo resultado = triangulo.Triangulo.classify(5,5,-1);
		TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
        assertEquals(esperado, resultado);	
	}
	//@Test
	/*caso con 3 enteros mayores que 0 tal que la suma de 2 es igual
	a la del 3 (esto no es un triángulo válido)*/
	/*public void TrianguloNoValido() {
		TipoTriangulo resultado = triangulo.Triangulo.classify(2,1,3);
		TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
        assertEquals(esperado, resultado);	
	}*/
	@Test
	//Caso con valores que no sean enteros
	public void TrianguloNoValido2() {
		TipoTriangulo resultado = triangulo.Triangulo.classify("a",1,3);
		TipoTriangulo esperado = triangulo.TipoTriangulo.NotATriangle;
        assertEquals(esperado, resultado);	
	}
	

}
