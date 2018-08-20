package xyz.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;

public class Ej2 {
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase

	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n" + "[1] Contar cuántos de los números almacenados son pares\n"
				+ "[2] Realizar la sumatoria de los valores del arreglo\n"
				+ "[3] Verificar si un número dado se encuentra en él\n"
				+ "[4] Indicar la posición del menor valor almacenado\n" + "[5] Indicar el mayor valor almacenado.\n"
				+ "[6] Calcular el promedio de los valores del arreglo\n"
				+ "[7] Mostrar cuál de las dos mitades del arreglo tiene mayor promedio\n");
	}

	/**
	 * Mostrar menú de la aplicación Los módulos no deben ocupar más de una pantalla
	 */
	public static void mostrarMenu() {
		boolean salir = false;
		int opcion;

		// Mensaje de bienvenida
		System.out.println("Bienvenido a la consola de la aplicación");

		while (!salir) {
			sc = new Scanner(System.in);

			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();

			// Leer opción del menú principal
			opcion = sc.nextInt();

			switch (opcion) {
			case 0: salir = true; break;
			case 1: ; break; // Opción 1
			case 2: ; break; // Opción 2
			case 3:	; break; // Opción 3
			default: System.err.println("Esta opción no está definida. Seleccione una de las siguientes opciones:"); break;
			}
		}
	}

	public static void main(String[] args) {
		mostrarMenu();
	}
}
