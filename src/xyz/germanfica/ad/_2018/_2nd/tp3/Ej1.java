package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.util.MatrizEntero;
import xyz.germanfica.util.Mensaje;

/*
 * 1. Dise�ar un algoritmo que declare una matriz de enteros, las
 * dimensiones de la matriz deben ser le�das (cantidad de filas
 * y cantidad de columnas). Luego debe presentar un men� de opciones
 * para realizar las siguientes tareas:
 * 
 * a) Cargar la fila i-esima de la matriz
 * b) Cargar la matriz completa haciendo uso del m�dulo anterior
 * c) Mostrar la columna i-�sima de la matriz
 * d) Mostrar la matriz entera haciendo uso del m�dulo anterior
 * e) El programa debe invocar los m�dulos en forma adecuada para
 * poder probarlos a todos.
 */
public class Ej1 {
	public static Scanner sc;
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar la fila i-esima de la matriz\n"
				+ "[2] Cargar la matriz completa haciendo uso del m�dulo anterior\n"
				+ "[3] Mostrar la columna i-�sima de la matriz\n"
				+ "[4] Mostrar la matriz entera haciendo uso del m�dulo anterior\n"
				);
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(String[] palabras) {
		boolean salir = false;
		int opcion;
		int[] dimensiones;
		int[][] matrizEnteros;
		
		// Leer las dimensiones
		dimensiones = MatrizEntero.dimensiones("Cantidad de filas", "Cantidad de columnas");
		
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
			// [1] Cargar la fila i-esima de la matriz
			case 1: ;break; // Opcion 1
			// [2] Cargar la matriz completa haciendo uso del m�dulo anterior
			case 2: ; break; // Opcion 2
			// [3] Mostrar la columna i-�sima de la matriz
			case 3: ; break; // Opcion 3
			// [4] Mostrar la matriz entera haciendo uso del m�dulo anterior
			case 4: ; break; // Opcion 4
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
}
