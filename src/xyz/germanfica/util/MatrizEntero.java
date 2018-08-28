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
		// Declaración de variables
		int[] dimensiones;
		
		// Inicialización de variables
		dimensiones = new int[2]; // Creacion de la matriz
		
		sc = new Scanner(System.in);
		System.out.println(primerMensaje);
		dimensiones[0] = sc.nextInt(); // Lee la cantidad de filas
		System.out.println(segundoMensaje);
		dimensiones[1] = sc.nextInt(); // Lee la cantidad de columnas
		return dimensiones;
	}
	public static int[] dimensiones() {
		return dimensiones("", "");
	}
	
	/**
	 * Carga de de n elementos a una matriz de enteros
	 * 
	 * @param dimensiones representa la cantidad de filas y cantidad de
	 * columnas para la matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas
	 * @param mensaje es el mensaje que se muestra cada vez que se le
	 * pide al usuario agregar un nuevo elemento a la matriz
	 * @return
	 */
	// cargaCompleta();
	public static int[][] cargaFila(int[] dimensiones, String mensaje) {
		// Declaracion de variables
		int[][] matrizEnteros;
		int num;
		int i;

		// Inicializacion de variables
		matrizEnteros = new int[dimensiones[0]][];
		i = 0;

		// Agregar elementos al arreglo
		while (i <= matrizEnteros.length - 1) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			num = sc.nextInt();
			matrizEnteros[i] = num;
			i++;
		}
		return matrizEnteros;
	}
	public static int[][] cargaFila(int longitud) {
		return cargaFila(longitud,"");
	}
}
