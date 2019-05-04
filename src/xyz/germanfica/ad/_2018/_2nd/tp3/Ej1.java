package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.util.MatrizEntero;
import xyz.germanfica.mensaje.Mensaje;

/*
 * 1. Diseñar un algoritmo que declare una matriz de enteros, las
 * dimensiones de la matriz deben ser leídas (cantidad de filas
 * y cantidad de columnas). Luego debe presentar un menú de opciones
 * para realizar las siguientes tareas:
 * 
 * a) Cargar la fila i-esima de la matriz
 * b) Cargar la matriz completa haciendo uso del módulo anterior
 * c) Mostrar la columna i-ésima de la matriz
 * d) Mostrar la matriz entera haciendo uso del módulo anterior
 * e) El programa debe invocar los módulos en forma adecuada para
 * poder probarlos a todos.
 */
public class Ej1 {
	public static Scanner sc;
	
	/*
	 * como deberia ser el 4
	 */
	public static void mostrarElmMatrizEnteros(int[][] matrizEnteros) {
		for (int i = 0; i <= matrizEnteros.length-1; i++) {
			for (int j = 0; j <= matrizEnteros.length-1; j++) {
				System.out.print(matrizEnteros[i][j]);
			}
			System.out.println();
		}
	}
	
	/*
	 * [1] Cargar la fila i-ésima de la matriz
	 */
	public static int[][] cargaFila(int[] dimensiones) {
		// Declaración de variables
		int fila, min, max;
		boolean error;
		
		// Inicialización de variables
		fila = -1; // No se ha elegido todavía ninguna fila
		error = false;
		min = 0;
		max = dimensiones[0]-1;
		
		// Leer
		while(fila>max || fila<min) {
			if(error) {
				System.err.println("Porfavor ingrese una fila válida.");
			}
			System.out.println("Qué fila quiere cargar?");
			fila = sc.nextInt();
			error=true;
		}
		return MatrizEntero.cargaFila(dimensiones, fila, "Ingrese un numero:");
	}
	
	/*
	 * [2] Cargar la matriz completa haciendo uso del módulo anterior
	 */
	public static int[][] cargaCompleta(int[] dimensiones) {
		return MatrizEntero.cargaCompleta(dimensiones, "Ingrese un numero:");
	}
	
	/*
	 * [3] Mostrar la columna i-ésima de la matriz
	 */
	public static void mostrarColumna(int[][] matrizEnteros, int columna) {
		// Declaración de variables
		int cantFilas;
		
		// Incialización de variables
		cantFilas = matrizEnteros.length;
		
		for (int i = 0; i <= cantFilas-1; i++) {
			System.out.println(matrizEnteros[i][columna]);
		}
	}
	
	/*
	 * [4] Mostrar la matriz entera haciendo uso del módulo anterior
	 */
	public static void mostrarMatrizCompleta(int[][] matrizEnteros) {
		// Declaración de variables
		int cantColumnas;
		
		// Inicialización de variables
		cantColumnas = matrizEnteros[0].length;
		
		for (int i = 0; i <= cantColumnas-1; i++) {
			System.out.println("Columna " + i + ":");
			mostrarColumna(matrizEnteros, i);
		}
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar la fila i-esima de la matriz (IMPLEMENTADO)\n"
				+ "[2] Cargar la matriz completa haciendo uso del módulo anterior (IMPLEMENTADO)\n"
				+ "[3] Mostrar la columna i-ésima de la matriz (IMPLEMENTADO)\n"
				+ "[4] Mostrar la matriz entera haciendo uso del módulo anterior (IMPLEMENTADO)\n"
				);
	}
	
	/**
	 * Mostrar el menú de la aplicación
	 * Nota: los módulos no deben ocupar más de una pantalla
	 */
	public static void mostrarMenu() {
		// Declaracion de variables
		boolean salir = false;
		int opcion;
		int[] dimensiones;
		int cantFilas;
		int cantColumnas;
		int[][] matrizEnteros;
		
		// Leer las dimensiones
		dimensiones = MatrizEntero.dimensiones("Cantidad de filas", "Cantidad de columnas");
		
		// Inicialización de variables
		cantFilas = dimensiones[0]; // Cantidad de filas
		cantColumnas = dimensiones[0]; // Cantidad de columnas
		
		// Creación e inicialización de la matriz
		matrizEnteros = new int[cantFilas][cantColumnas];
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opción del menú principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			// [1] Cargar la fila i-ésima de la matriz
			case 1: matrizEnteros = cargaFila(dimensiones);break; // Opcion 1
			// [2] Cargar la matriz completa haciendo uso del módulo anterior
			case 2: matrizEnteros = cargaCompleta(dimensiones); break; // Opcion 2
			// [3] Mostrar la columna i-ésima de la matriz
			case 3: System.out.println("Qué columna quiere mostrar?");mostrarColumna(matrizEnteros, sc.nextInt()); break; // Opcion 3
			// [4] Mostrar la matriz entera haciendo uso del módulo anterior
			case 4: mostrarMatrizCompleta(matrizEnteros); break; // Opcion 4
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenu();
	}
}
