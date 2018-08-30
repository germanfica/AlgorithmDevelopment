package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.MatrizEntero;

/*
 * 3. Diseñar un algoritmo que declare dos matrices de nxn de
 * enteros. Luego debe presentar un menú de opciones para
 * realizar las siguientes tareas:
 * 
 * a) Cargar los elementos de las matrices.
 * b) Realizar la suma de dos matrices.
 * c) Realizar el productos de dos matrices.
 */
public class Ej3 {
	private static final String ARCHIVO_A = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej3_MatrizA.txt"; // Ruta del archivo
	private static final String ARCHIVO_B = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej3_MatrizB.txt"; // Ruta del archivo

	private static Scanner sc;
	
	/*
	 * [1] Cargar los elementos de las matrices
	 */
	public static Object[] cargaMatrices(int[][] matrizA, int[][] matrizB) {
		Object[] arreglo = new Object[2];
		
		arreglo[0] = MatrizEntero.cargaDesdeArchivo(ARCHIVO_A);
		arreglo[1] = MatrizEntero.cargaDesdeArchivo(ARCHIVO_B);
		
		return arreglo;
	}
	
	/*
	 * [2] Realizar la suma de dos matrices
	 */
	public static void mostrarSuma(int[][] matrizA, int[][] matrizB) {
		System.out.println("La matriz suma es:");
		MatrizEntero.mostrar(MatrizEntero.suma(matrizA, matrizB));
	}
	
	/*
	 * [3] Realizar el producto de dos matrices
	 */
	public static void mostrarProducto(int[][] matrizA, int[][] matrizB) {
		System.out.println("La matriz producto es:");
		
	}
	
	/*
	 * [4] Mostrar las matrices
	 */
	public static void mostrarMatrices(int[][] matrizA, int[][] matrizB) {
		System.out.println("Matriz A:");
		MatrizEntero.mostrar(matrizA);
		System.out.println("Matriz B:");
		MatrizEntero.mostrar(matrizB);
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Cargar los elementos de las matrices (IMPLEMENTADO)\n"
				+ "[2] Realizar la suma de dos matrices (IMPLEMENTADO)\n"
				+ "[3] Realizar el producto de dos matrices\n"
				+ "[4] Mostrar las matrices (IMPLEMENTADO)\n"
				);
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(int[][] matrizA, int[][] matrizB) {
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
			// [1] Cargar los elementos de las matrices
			case 1: Object[] matrices = cargaMatrices(matrizA, matrizB);matrizA=(int[][])matrices[0];matrizB=(int[][])matrices[1];break; // Opcion 1
			// [2] Realizar la suma de dos matrices
			case 2: mostrarSuma(matrizA, matrizB); break; // Opcion 2
			// [3] Realizar el producto de dos matrices
			case 3: mostrarProducto(matrizA, matrizB); break; // Opcion 3
			// [4] Mostrar las matrices
			case 4: mostrarMatrices(matrizA, matrizB); break; // Opcion 4
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[][] matrizA, matrizB;
		
		// Inicialización de variables
		matrizA = MatrizEntero.cargaDesdeArchivo(ARCHIVO_A);
		matrizB = MatrizEntero.cargaDesdeArchivo(ARCHIVO_B);
		
		// Mostrar menú
		mostrarMenu(matrizA, matrizB);
	}
}
