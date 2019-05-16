package xyz.germanfica._2018._2nd.tp2;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.ArregloPalabra;

/*
 * 4. Diseñar un algoritmo que lea un arreglo de palabras y una cadena de
 * caracteres. El algoritmo debe mostrar la posicion del arreglo en la
 * cual se encuentra esa palabra, verificando que la misma exista en
 * el arreglo.
 * 
 * Por ejemplo, si el arreglo contiene [que€?,lindo€?,dia€?] y la palabra
 * leida es adios, el algoritmo deberia mostrar el valor 2. Para el mismo
 * arreglo, si la palabra leida es "fue"€?, se debe mostrar el valor -1.
 */
public class Ej4 {
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase

	public static void mostrarPosDeLaPalabra(String[] palabras) {
		String palabra;
		int posDeLaPalabra;
		
		sc = new Scanner(System.in);
		palabra = sc.nextLine();
		
		posDeLaPalabra = ArregloPalabra.posDeLaPalabra(palabras, palabra);
		if(posDeLaPalabra==-1) {
			System.out.println("No se ha encontrado la palabra.");
		}else {
			System.out.println("La posicion de la palabra " + "\"" + palabra + "\"" + " es: " + posDeLaPalabra);
		}
	}
	
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar la posicion de la palabra deseada\n"
				+ "[2] Mostrar todas las palabras del arreglo (IMPLEMENTADO)\n"
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
			case 1: mostrarPosDeLaPalabra(palabras);break; // Opcion 1
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
