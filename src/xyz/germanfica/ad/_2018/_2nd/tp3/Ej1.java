package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.util.MatrizEntero;
import xyz.germanfica.mensaje.Mensaje;

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
	 * [1] Cargar la fila i-�sima de la matriz
	 */
	public static int[][] cargaFila(int[] dimensiones) {
		// Declaraci�n de variables
		int fila, min, max;
		boolean error;
		
		// Inicializaci�n de variables
		fila = -1; // No se ha elegido todav�a ninguna fila
		error = false;
		min = 0;
		max = dimensiones[0]-1;
		
		// Leer
		while(fila>max || fila<min) {
			if(error) {
				System.err.println("Porfavor ingrese una fila v�lida.");
			}
			System.out.println("Qu� fila quiere cargar?");
			fila = sc.nextInt();
			error=true;
		}
		return MatrizEntero.cargaFila(dimensiones, fila, "Ingrese un numero:");
	}
	
	/*
	 * [2] Cargar la matriz completa haciendo uso del m�dulo anterior
	 */
	public static int[][] cargaCompleta(int[] dimensiones) {
		return MatrizEntero.cargaCompleta(dimensiones, "Ingrese un numero:");
	}
	
	/*
	 * [3] Mostrar la columna i-�sima de la matriz
	 */
	public static void mostrarColumna(int[][] matrizEnteros, int columna) {
		// Declaraci�n de variables
		int cantFilas;
		
		// Incializaci�n de variables
		cantFilas = matrizEnteros.length;
		
		for (int i = 0; i <= cantFilas-1; i++) {
			System.out.println(matrizEnteros[i][columna]);
		}
	}
	
	/*
	 * [4] Mostrar la matriz entera haciendo uso del m�dulo anterior
	 */
	public static void mostrarMatrizCompleta(int[][] matrizEnteros) {
		// Declaraci�n de variables
		int cantColumnas;
		
		// Inicializaci�n de variables
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
				+ "[2] Cargar la matriz completa haciendo uso del m�dulo anterior (IMPLEMENTADO)\n"
				+ "[3] Mostrar la columna i-�sima de la matriz (IMPLEMENTADO)\n"
				+ "[4] Mostrar la matriz entera haciendo uso del m�dulo anterior (IMPLEMENTADO)\n"
				);
	}
	
	/**
	 * Mostrar el men� de la aplicaci�n
	 * Nota: los m�dulos no deben ocupar m�s de una pantalla
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
		
		// Inicializaci�n de variables
		cantFilas = dimensiones[0]; // Cantidad de filas
		cantColumnas = dimensiones[0]; // Cantidad de columnas
		
		// Creaci�n e inicializaci�n de la matriz
		matrizEnteros = new int[cantFilas][cantColumnas];
		
		// Mensaje de bienvenida
		System.out.println(Mensaje.leer(0));
		
		while(!salir) {
			// Mostrar cartel con las opciones
			mostrarCartelDeOpciones();
			
			// Leer opci�n del men� principal
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0: salir = true; break;
			// [1] Cargar la fila i-�sima de la matriz
			case 1: matrizEnteros = cargaFila(dimensiones);break; // Opcion 1
			// [2] Cargar la matriz completa haciendo uso del m�dulo anterior
			case 2: matrizEnteros = cargaCompleta(dimensiones); break; // Opcion 2
			// [3] Mostrar la columna i-�sima de la matriz
			case 3: System.out.println("Qu� columna quiere mostrar?");mostrarColumna(matrizEnteros, sc.nextInt()); break; // Opcion 3
			// [4] Mostrar la matriz entera haciendo uso del m�dulo anterior
			case 4: mostrarMatrizCompleta(matrizEnteros); break; // Opcion 4
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarMenu();
	}
}
