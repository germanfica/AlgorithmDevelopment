package xyz.germanfica.util;

import java.util.Scanner;

public class MatrizEntero {
	private static Scanner sc;
	
	/**
	 * Carga de de n elementos a una matriz de enteros
	 * 
	 * @param longitud la longitud del que va a tener la matriz
	 * @param mensaje es el mensaje que se muestra cada vez que se
	 * pide agregar un nuevo elemento a la matriz
	 * @return
	 */
	// cargaCompleta();
	public static int[] carga(int longitud, String mensaje) {
		// Declaracion de variables
		int[] matrizEnteros;
		int num;
		int i;

		// Inicializacion de variables
		arregloEnteros = new int[longitud];
		i = 0;

		// Agregar elementos al arreglo
		while (i <= arregloEnteros.length - 1) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			num = sc.nextInt();
			arregloEnteros[i] = num;
			i++;
		}
		return arregloEnteros;
	}
	public static int[] carga(int longitud) {
		return carga(longitud,"");
	}
}
