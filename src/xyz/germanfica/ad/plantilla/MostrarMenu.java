package xyz.germanfica.ad.plantilla;

import java.util.Scanner;

public class MostrarMenu {
	public static void mostrarCartelDeOpciones() {
		System.out.print(
				"[0] Salir (IMPLEMENTADO)\n" +
				"[1] Mostrar por pantalla los caracteres de las posiciones pares del arreglo de caracteres\n" +
				"[2] Mostrar por pantalla los caracteres almacenados en el arreglo en orden inverso.\n" +
				"[3] Contar cuantas veces aparece un caracter dado\n"
				);
	}
	
	/**
	 * Mostrar menú de la aplicacion
	 * Los modulos no deben ocupar mas de una pantalla
	 */
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase
	public static void mostrarMenú() {
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println("Bienvenido a la consola de la aplicacion");
		
		while(!salir) {
			sc = new Scanner(System.in);
			
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opcion del menú principal
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			case 1: ;break; // Opcion 1
			case 2:	;break; // Opcion 2
			case 3:	;break; // Opcion 3
			default: System.err.println("Esta opcion no esta definida. Seleccione una de las siguientes opciones:"); break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenú();
	}
}
