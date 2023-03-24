package Evaluacion2;

/**
 * Esta clase incluye elementos para sumar los números de un array, devolver el
 * mayor o encontrar la posicion de uno pasado por param
 * 
 * @since 24/03/2023
 * @author DAM-1
 * @version 24/03/2023A
 * @see <a href="https://enlaceejemplo.com">Enlace</a>
 *
 */
public class TablaEnteros {

	public Integer[] tabla;

	public TablaEnteros(Integer[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	/**
	 * En este metodo se realiza la suma de los valores incluidos en el array.
	 * 
	 * @since 24/03/2023
	 * @author DAM-1
	 * @return suma - variable entera que representa la suma de los numeros
	 */
	// devuelve la suma de los elementos de la tabla
	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
			suma += tabla[i];
		return suma;
	}

	/**
	 * En este metodo se devuelve el número con mayor valor del array.
	 * 
	 * @since 24/03/2023
	 * @author DAM-1
	 * @return max- variable entera que representa el número mayor del array
	 */
	// devuelve el mayor elemento de la tabla
	public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] > max)
				max = tabla[i];
		return max;
	}

	/**
	 * En este metodo se devuelve la posicion del array en la que se encuentra un
	 * elemento pasado por param.
	 * 
	 * @since 24/03/2023
	 * @author DAM-1
	 * @param n Esta variable entera es un número que se pasa al método para que te
	 *          lo busque en el array.
	 * @return i Devuelve la posicion del array en la que se encuentra en el número.
	 */
	// devuelve la posici�n de un elemento cuyo valor se pasa
	public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] == n)
				return i;
		throw new java.util.NoSuchElementException("No existe: " + n);
	}
}//
