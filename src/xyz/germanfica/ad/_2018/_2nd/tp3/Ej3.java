package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;
import xyz.germanfica.util.Mensaje;

/*
 * 3. Diseñar un algoritmo que declare dos matrices de nxn de
 * enteros. Luego debe presentar un menú de opciones para
 * realizar las siguientes tareas:
 * 
 * a) Cargar los elementos de las matrices.
 * b) Realizar la suma de dos matrices.
 * c) Realizar el productos de dos matrices.
 */
public class Ej3 {
	public static Scanner sc;
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar los elementos de las matrices\n"
				+ "[2] Realizar la suma de dos matrices\n"
				+ "[3] Realizar el producto de dos matrices\n"
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
			// [1] Cargar los elementos de las matrices
			case 1: ;break; // Opcion 1
			// [2] Realizar la suma de dos matrices
			case 2: ; break; // Opcion 2
			// [3] Realizar el producto de dos matrices
			case 3: ; break; // Opcion 3
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
}
