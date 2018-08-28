package xyz.germanfica.util;

import java.util.Scanner;

public class MatrizEntero {
	private static Scanner sc;
	/**
	 * Lee la cantidad de filas y cantidad de columnas para una
	 * matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas.
	 * 
	 * @param primerMensaje este es el mensaje que se mostraria cuando se ingresa
	 * la cantidad de filas
	 * @param segundoMensaje este es el mensaje que se mostraria cuando se ingresa
	 * la cantidad de columnas
	 * @return retorna la cantidad de filas y cantidad de columnas
	 */
	public static int[] dimensiones(String primerMensaje, String segundoMensaje) {
		// Declaracion de variables
		int[] dimensiones;
		
		// Inicializacion de variables
		dimensiones = new int[2]; // Creacion de la matriz
		
		sc = new Scanner(System.in);
		System.out.println(primerMensaje);
		dimensiones[0] = sc.nextInt(); // Lee la cantidad de filas
		System.out.println(segundoMensaje);
		dimensiones[1] = sc.nextInt(); // Lee la cantidad de columnas
		return dimensiones;
	}
	
	/**
	 * Lee la cantidad de filas y cantidad de columnas para una
	 * matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas.
	 * 
	 * @return retorna la cantidad de filas y cantidad de columnas
	 */
	public static int[] dimensiones() {
		return dimensiones("", "");
	}
	
	/**
	 * Carga de de n elementos la fila i-esima a una matriz
	 * de enteros
	 * 
	 * @param dimensiones representa la cantidad de filas y cantidad de
	 * columnas para la matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas
	 * @param fila es la fila i-esima a la que se le aplica la carga de elementos
	 * @param mensaje es el mensaje que se muestra cada vez que se le
	 * pide al usuario agregar un nuevo elemento a la matriz
	 * @return matriz de enteros cargada de n enteros en la fila i-esima
	 */
	// cargaCompleta();
	public static int[][] cargaFila(int[] dimensiones, int fila, String mensaje) {
		// Declaracion de variables
		int[][] matrizEnteros;
		int num;

		// Inicializacion de variables
		matrizEnteros = new int[dimensiones[0]][dimensiones[1]];

		// Agrega elementos a la matriz
		for (int i = 0; i <= matrizEnteros.length - 1; i++) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			num = sc.nextInt();
			matrizEnteros[0][i] = num;
		}
		return matrizEnteros;
	}
	
	/**
	 * Carga de de n elementos la fila i-esima a una matriz
	 * de enteros
	 * 
	 * @param dimensiones representa la cantidad de filas y cantidad de
	 * columnas para la matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas
	 * @return
	 */
	public static int[][] cargaFila(int[] dimensiones, int fila) {
		return cargaFila(dimensiones,fila,"");
	}
}
