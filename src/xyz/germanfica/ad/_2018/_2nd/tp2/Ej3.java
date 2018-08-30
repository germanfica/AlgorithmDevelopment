package xyz.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.ArregloPalabra;

/*
 * 3. Diseñar un algoritmo que lea un arreglo de palabras y un valor
 * numérico que represente una posicion en el arreglo. El algoritmo debe
 * mostrar el contenido del arreglo en esa posición, verificando
 * previamente que la misma sea válida.
 * 
 * Por ejemplo, si el arreglo contiene ["que","lindo","dia"] y la posicion
 * leida es 2, el algoritmo debera mostrar la palabra "día". Para el mismo
 * arreglo, si la posición leída es 4, se debe mostrar un mensaje de
 * "posicion inválida".
 */
public class Ej3 {
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase

	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar palabra de la posicion deseada\n"
				+ "[2] Mostrar todas las palabras del arreglo (IMPLEMENTADO)\n"
				);
	}
	
	public static void mostrarPalabraDeLaPos(String[] palabras) {
		int pos;
		sc = new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		pos = sc.nextInt();
		System.out.println("La palabra de la pos " + "\"" + pos + "\"" + " es: " + palabras[pos]);
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
			// [1] Mostrar palabra de la posicion deseada
			case 1: mostrarPalabraDeLaPos(palabras);break; // Opcion 1
			case 2: ArregloPalabra.mostrar(palabras); break; // Opcion 2
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Preparo al Scanner para que me lea las entradas del sistema
		sc = new Scanner(System.in);
		// Mostrar menu, leer y generar un arreglo de enteros
		System.out.println(Mensaje.leer(3));
		mostrarMenu(ArregloPalabra.carga(sc.nextInt(), "Ingrese su palabra:"));
	}
}
