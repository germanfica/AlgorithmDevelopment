package xyz.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;
import xyz.germanfica.arreglos.ArregloPalabra;
import xyz.germanfica.util.Mensaje;

public class Ej3 {
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase

	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar palabra de la posición deseada\n"
				+ "[2] Mostrar todas las palabras del arreglo\n"
				);
	}

	/*
	 * Mostrar el menú de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenú(String[] palabras) {
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opcion del menú principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			case 1: ;break; // Opcion 1
			case 2: ArregloPalabra.mostrar(palabras); break; // Opcion 2
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Preparo al Scanner para que me lea las entradas del sistema
		sc = new Scanner(System.in);
		// Mostrar menú, leer y generar un arreglo de enteros
		System.out.println(Mensaje.leer(3));
		mostrarMenú(ArregloPalabra.carga(sc.nextInt(), "Ingrese su palabra:"));
	}
}
