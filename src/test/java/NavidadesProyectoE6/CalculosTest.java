package NavidadesProyectoE6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculosTest {

	private Calculos calculos = new Calculos();
	private int resultado;
	private double resultadoDouble;
	private int x, y;
	@Test
	void testSuma() {
		x = 2;
		y = 3;
		resultado = calculos.suma(x, y);
		assertEquals(resultado, 5, 0);
	}
	
	@Test
	void testResta() {
		x = 8;
		y = 2;
		resultado = calculos.resta(x,y);
		assertEquals(resultado, 6, 0);
	}
	
	@Test
	void testDivision() {
		x = 9;
		y = 3;
		resultadoDouble = calculos.division(x, y);
		assertEquals(resultadoDouble, 3.0,0);
		y = 0;
		resultadoDouble = calculos.division(x, y);
		assertEquals(resultadoDouble, -1.0,0);
	}

}
