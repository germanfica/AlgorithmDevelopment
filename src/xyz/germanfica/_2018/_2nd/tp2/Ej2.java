package xyz.germanfica._2018._2nd.tp2;

import java.util.Scanner;

import xyz.germanfica.util.ArregloEntero;
import xyz.germanfica.mensaje.Mensaje;

public class Ej2 {
	private static Scanner sc; // Esto es necesario para poder usar el Scanner en la clase

	public static void mostrarMayorPromDeLasMitades(int[] enteros) {
		System.out.println(ArregloEntero.mayorPromDeLasMitades(enteros));
	}
	
	public static void mostrarPromedio(int[] enteros) {
		System.out.println(ArregloEntero.promedio(enteros));
	}
	
	public static void mostrarMayorNumAlmacenado(int[] enteros) {
		System.out.println(ArregloEntero.mayorNumAlmacenado(enteros));
	}
	
	public static void mostrarPosDelMenorNumAlmacenado(int[] enteros) {
		System.out.println(ArregloEntero.posDelMenorNumAlmacenado(enteros));
	}
	
	public static void mostrarExisteElNum(int num, int[] enteros) {
		System.out.println("Ingrese numero:");
		System.out.println(ArregloEntero.existeElNum(num, enteros));
	}
	
	/**
	 * Muestra por pantalla la cantidad de numeros pares
	 * 
	 * @param enteros arreglo de enteros
	 */
	public static void mostrarCantNumPares(int[] enteros) {
		System.out.println(ArregloEntero.cantNumPares(enteros));
	}
	
	public static void mostrarSumatoria(int[] enteros) {
		System.out.println(ArregloEntero.sumatoria(enteros));
	}
	
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Contar cuantos de los numeros almacenados son pares (IMPLEMENTADO)\n"
				+ "[2] Realizar la sumatoria de los valores del arreglo (IMPLEMENTADO)\n"
				+ "[3] Verificar si un numero dado se encuentra en el (IMPLEMENTADO)\n"
				+ "[4] Indicar la posicion del menor valor almacenado \n"
				+ "[5] Indicar el mayor valor almacenado\n"
				+ "[6] Calcular el promedio de los valores del arreglo\n"
				+ "[7] Mostrar cual de las dos mitades del arreglo tiene mayor promedio\n");
	}

	/*
	 * Mostrar el menu de la aplicacion
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
			
			// Leer opcion del menu principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			//1 Contar cuantos de los nÃºmeros almacenados son pares
			case 1: mostrarCantNumPares(enteros);break; // Opcion 1
			//2 Realizar la sumatoria de los valores del arreglo
			case 2:	mostrarSumatoria(enteros);break; // Opcion 2
			//3 Verificar si un numero dado se encuentra en el
			case 3:	mostrarExisteElNum(sc.nextInt(), enteros);break; // Opcion 3
			//4 Indicar la posicion del menor valor almacenado
			case 4: mostrarPosDelMenorNumAlmacenado(enteros);break; // Opcion 4
			//5 Indicar el mayor valor almacenado
			case 5: mostrarMayorNumAlmacenado(enteros);break; // Opcion 5
			// 6 Calcular el promedio de los valores del arreglo
			case 6: mostrarPromedio(enteros);break; // Opcion 6
			// 7 Mostrar cual de las dos mitades del arreglo tiene mayor promedio
			case 7: mostrarMayorPromDeLasMitades(enteros);break; // Opcion 7
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Le digo al Scanner que me lea las entradas del sistema
		sc = new Scanner(System.in);
		
		// Mostrar menu, leer y generar un arreglo de enteros
		System.out.println(Mensaje.leer(3));
		mostrarMenu(ArregloEntero.carga(sc.nextInt(), "Ingrese su numero:"));
	}
}
