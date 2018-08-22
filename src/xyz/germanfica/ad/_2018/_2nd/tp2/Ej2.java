package xyz.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;

import xyz.germanfica.arreglos.ArregloEntero;
import xyz.germanfica.util.Mensaje;

public class Ej2 {
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase

	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Contar cuantos de los números almacenados son pares\n"
				+ "[2] Realizar la sumatoria de los valores del arreglo\n"
				+ "[3] Verificar si un número dado se encuentra en él\n"
				+ "[4] Indicar la posicion del menor valor almacenado\n"
				+ "[5] Indicar el mayor valor almacenado.\n"
				+ "[6] Calcular el promedio de los valores del arreglo\n"
				+ "[7] Mostrar cual de las dos mitades del arreglo tiene mayor promedio\n");
	}

	/*
	 * Mostrar el menú de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenú(int[] enteros) {
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
			case 1: ArregloEntero.mostrarCantNumPares(enteros);break; // Opcion 1
			case 2:	ArregloEntero.mostrarSumatoria(enteros);break; // Opcion 2
			case 3:	;break; // Opcion 3
			case 4: ;break; // Opcion 4
			case 5: ;break; // Opcion 5
			case 6: ;break; // Opcion 6
			case 7: ;break; // Opcion 7
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Preparo al Scanner para que me lea las entradas del sistema
		sc = new Scanner(System.in);
		// Mostrar menú, leer y generar un arreglo de enteros
		System.out.println(Mensaje.leer(3));
		mostrarMenú(ArregloEntero.carga(sc.nextInt(), "Ingrese su número:"));
	}
}
