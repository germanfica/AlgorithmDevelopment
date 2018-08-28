package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;
import xyz.germanfica.util.Mensaje;

/*
 * 4. Diseñar un algoritmo para recorrer matrices de nxn de enteros
 * previamente cargadas
 * y mostrar su contenido recorriendo las filas pares
 * desde la columna 0 a la n-1
 * y las filas impares desde la columna n-1 a la 0.
 * 
 * Por ejemplo, de la siguiente matriz
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 
 * los valores deberán mostrarse de la siguiente forma:
 * 1  2  3  4
 * 8  7  6  5
 * 9  10 11 12
 * 16 15 14 13
 */
public class Ej4 {
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
