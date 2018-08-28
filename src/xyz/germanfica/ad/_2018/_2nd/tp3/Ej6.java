package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;
import xyz.germanfica.util.Mensaje;

/*
 * 6. Diseñar un algoritmo para recorrer una matriz de enteros de
 * nxn previamente cargada, mostrando su contenido recorriéndola
 * en espiral:
 * 
 */
public class Ej6 {
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
