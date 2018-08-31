package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;

/*
 * 5. Diseñar un algoritmo que cargue una matriz
 * a partir de un arreglo de 150 caracteres.
 * 
 * La matriz debe ser de tamaño 10x15.
 * La matriz se debe llenar por fila.
 * 
 * Una vez completa, la primera fila se debe continuar
 * por la segunda y así sucesivamente.
 */
public class Ej5 {
	public static Scanner sc;
	
	public static void cargaManual(char[][] matriz, char[] arreglo) {
		// MÓDULO
		char ch; // Caracter
		
		// Carga del arreglo
		for (int i = 0; i <= arreglo.length-1; i++) {
			sc = new Scanner(System.in);
			System.out.println("Ingrese su caracter:");
			ch = sc.next().charAt(0);
			arreglo[i] = ch;
		}
		
		// Carga de la matriz apartir del arreglo de 150 caracteres
		for (int i = 0; i <= matriz.length-1; i++) {
			
		}
		// FIN MÓDULO
	}
	
	public static void cargaAuto(char[][] matriz, char[] arreglo) {
		
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpcionesA() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar matriz\n"
				+ "[2] Cargar automática\n"
				);
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpcionesB() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar matriz\n"
				+ "[2] Cargar automática\n"
				+ "[3] Mostrar matriz\n"
				);
	}
	
	public static boolean panelOpcionesA(boolean salir) {
		// Declaración de variables
		int opcion;
		
		// Mostrar cartel con las opciones
		mostrarCartelDeOpcionesA();
		
		// Leer opcion del menu principal
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch (opcion) {
		case 0: salir = true; break;
		// [1] Cargar manual
		case 1: ;break; // Opcion 1
		// [2] Cargar automática
		case 2: ;break; // Opcion 1
		default: System.err.println(Mensaje.leer(1)); break;
		}
		return salir;
	}
	
	public static boolean panelOpcionesB(boolean salir) {
		// Declaración de variables
		int opcion;
		
		// Mostrar cartel con las opciones
		mostrarCartelDeOpcionesB();
		
		// Leer opcion del menu principal
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch (opcion) {
		case 0: salir = true; break;
		// [1] Cargar manual
		case 1: ;break; // Opcion 1
		// [2] Cargar automática
		case 2: ;break; // Opcion 1
		// [3] Mostrar matriz
		case 3: ;break; // Opcion 1
		default: System.err.println(Mensaje.leer(1)); break;
		}
		return salir;
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(char[][] matriz, char[] arreglo) {
		boolean salir = false, estaCargada=false;
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			if(!estaCargada) {
				salir = panelOpcionesA(salir);
			}else {
				salir = panelOpcionesB(salir);
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		char[][] matriz;
		char[] arreglo;
		int cantFilasMatriz, cantColumnasMatriz, longitudArreglo;
		
		// Inicialización de variables
		cantFilasMatriz = 10;
		cantColumnasMatriz = 15;
		longitudArreglo = 150;
		arreglo = new char[longitudArreglo];
		matriz = new char[cantFilasMatriz][cantColumnasMatriz];
		
		// Mostrar menú
		mostrarMenu(matriz, arreglo);
	}
}
