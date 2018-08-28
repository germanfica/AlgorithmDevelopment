package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;
import xyz.germanfica.util.Mensaje;

/*
 * 7. Diseñar un algoritmo que verifique si una matriz de enteros
 * de nxn es un cuadrado mágico. Esto es cierto cuando la suma de
 * cada fila es igual a la suma de cada columna y a la vez es
 * igual a la suma de cada una de las diagonales.
 * 
 * Por ejemplo, la siguiente matriz es un cuadrado mágico:
 */
public class Ej7 {
	public static Scanner sc;
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] \n"
				+ "[2] \n"
				+ "[3] \n"
				);
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(String[] palabras) {
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opcion del menu principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			// [1]
			case 1: ;break; // Opcion 1
			// [2]
			case 2: ; break; // Opcion 2
			// [3]
			case 3: ; break; // Opcion 3
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
}
