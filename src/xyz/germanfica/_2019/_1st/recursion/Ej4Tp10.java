package xyz.germanfica._2019._1st.recursion;

import xyz.germanfica.util.ArregloEntero;

public class Ej4Tp10 {
	/**
	 * Programe un método recursivo que invierta los números de un arreglo
	 * bidimensional de enteros.
	 * 
	 * Intercambiar el número en la posición (0,0) y la última (cf-1, cc-1), donde
	 * cf y cc son cantidad de filas y cantidad de columnas respectivamente. Luego,
	 * el de la posición (0, 1) con la (cf-1,cc-2).
	 * 
	 * Del mismo modo para la fila 1 respecto de la fila cf-2, y así para todos los
	 * elementos de la matriz.
	 */

	public static void intercambio(int[] enteros, int i, int j) {

		if (j >= 0) {
			System.out.println(enteros[j]);
			enteros[j] = enteros[i];
			// Caso recursivo
			intercambio(enteros, i + 1, j - 1);
		}
	}

	public static void main(String[] args) {
		// int[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] enteros = { 1, 2, 3, 4, 5 };
		intercambio(enteros, 0, enteros.length - 1);
		System.out.println("Matriz invertida");
		ArregloEntero.mostrar(enteros);
	}
}
