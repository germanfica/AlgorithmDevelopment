package xyz.germanfica.ad._2018._2nd.tp2;

import java.util.Scanner;

import xyz.germanfica.arreglos.ArregloEntero;
import xyz.germanfica.util.Mensaje;

public class Ej2 {
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase

	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Contar cuantos de los nÃºmeros almacenados son pares (IMPLEMENTADO)\n"
				+ "[2] Realizar la sumatoria de los valores del arreglo (IMPLEMENTADO)\n"
				+ "[3] Verificar si un numero dado se encuentra en el (IMPLEMENTADO)\n"
				+ "[4] Indicar la posicion del menor valor almacenado \n"
				+ "[5] Indicar el mayor valor almacenado\n"
				+ "[6] Calcular el promedio de los valores del arreglo\n"
				+ "[7] Mostrar cual de las dos mitades del arreglo tiene mayor promedio\n");
	}

	/*
	 * Mostrar el menÃº de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(int[] enteros) {
		boolean salir = false;
		int opcion;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opcion del menÃº principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			//1
			case 1: ArregloEntero.mostrarCantNumPares(enteros);break; // Opcion 1
			//2
			case 2:	ArregloEntero.mostrarSumatoria(enteros);break; // Opcion 2
			//3
			case 3:	System.out.println("Ingrese numero:");ArregloEntero.mostrarExisteElNum(sc.nextInt(), enteros);break; // Opcion 3
			//4 Indicar la posicion del menor valor almacenado
			case 4: ArregloEntero.mostrarPosDelMenorNumAlmacenado(enteros);break; // Opcion 4
			//5 Indicar el mayor valor almacenado
			case 5: ArregloEntero.mostrarMayorNumAlmacenado(enteros);break; // Opcion 5
			// 6 Calcular el promedio de los valores del arreglo
			case 6: ArregloEntero.mostrarPromedio(enteros);break; // Opcion 6
			// 7 Mostrar cual de las dos mitades del arreglo tiene mayor promedio
			case 7: ;break; // Opcion 7
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Preparo al Scanner para que me lea las entradas del sistema
		sc = new Scanner(System.in);
		// Mostrar menÃº, leer y generar un arreglo de enteros
		System.out.println(Mensaje.leer(3));
		mostrarMenu(ArregloEntero.carga(sc.nextInt(), "Ingrese su numero:"));
	}
}
