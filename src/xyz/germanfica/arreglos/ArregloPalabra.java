package xyz.germanfica.arreglos;

import java.util.Scanner;

public class ArregloPalabra {
	private static Scanner sc;
	public static String[] carga(int longitud, String mensaje) {
		// Declaracion de variables
		String[] arregloPalabras;
		String palabra; // Caracter
		int i;

		// Inicializacion de variables
		arregloPalabras = new String[longitud];
		i = 0;

		// Agregar elementos al arreglo
		while (i <= arregloPalabras.length - 1) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			palabra = sc.next();
			arregloPalabras[i] = palabra;
			i++;
		}
		return arregloPalabras;
	}
	public static String[] carga(int longitud) {
		return carga(longitud,"");
	}
	/**
	 * En este modulo voy a mostrar las palabras del arreglo de palabras
	 * 
	 * @param caracteres es el arreglo de caracteres
	 */
	public static void mostrar(String[] palabras) {
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}
}
