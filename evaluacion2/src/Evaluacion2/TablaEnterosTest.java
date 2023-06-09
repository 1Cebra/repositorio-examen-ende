package Evaluacion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TablaEnterosTest {
	
	private TablaEnteros tabla;
	
	@BeforeEach
	void crearArray(){
		Integer[] arrayNumeros = new Integer[5];
		int contador2=1;
		
		for(int contador=0; contador<arrayNumeros.length; contador++) {
			
			arrayNumeros[contador]=contador2;
			contador2++;
		}
		
		tabla = new TablaEnteros(arrayNumeros);
	}
	
	@Test
	void sumaTablaTest() {
		int valorEsperado=15;
		int resultado;
		
		assertEquals(valorEsperado, resultado=tabla.sumaTabla() );
	}
	
	@Test
	void mayorTablaTest() {
		int valorEsperado=5;
		int resultado;
		
		assertEquals(valorEsperado, resultado=tabla.mayorTabla() );
	}
	
	@ParameterizedTest
	@CsvSource({"2,1","9"})
	@Test
	void posicionTabla(int n, int pos) {
		int valorEsperado;
		int resultado;
		
		assertEquals(pos, resultado=tabla.posicionTabla(n) );
	}

}
