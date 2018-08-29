package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;
import xyz.germanfica.util.MatrizEntero;
import xyz.germanfica.util.Mensaje;

/*
 * 2. Diseñar un algoritmo que declare una matriz de nxm de enteros
 * y la inicialice. Luego debe presentar un menú de opciones para
 * realizar las siguientes tareas:
 * 
 * a) Mostrar todos los elementos de una matriz.
 * b) Verificar si la matriz es cuadrada. (esCuadrada()?)
 * c) Verificar si la matriz es Triangular Superior
 * d) Verificar si la matriz es Matriz Diagonal
 * f) Producto por un escalar
 * g) Transponer la matriz
 * h) Sumar los elementos de una fila determinada
 * i) Sumar los elementos de una columna 
 */
public class Ej2 {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej2.txt"; // Ruta del archivo
	private static Scanner sc;
	
	/*
	 * [1] Mostrar todos los elementos de una matriz
	 */
	public static void mostrarMatriz(int[][] enteros) {
		MatrizEntero.mostrar(enteros);
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar todos los elementos de una matriz\n"
				+ "[2] Verificar si la matriz es cuadrada\n"
				+ "[3] Verificar si la matriz es Triangular Superior\n"
				+ "[4] Verificar si la matriz es Matriz Diagonal\n"
				+ "[5] Producto por un escalar\n"
				+ "[6] Transponer la matriz\n"
				+ "[7] Sumar los elementos de una fila determinada\n"
				+ "[8] Sumar los elementos de una columna\n"
				);
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(int[][] enteros) {
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
			// [1] Mostrar todos los elementos de una matriz
			case 1: mostrarMatriz(enteros);break; // Opcion 1
			// [2] Verificar si la matriz es cuadrada
			case 2: ; break; // Opcion 2
			// [3] Verificar si la matriz es Triangular Superior
			case 3: ; break; // Opcion 3
			// [4] Verificar si la matriz es Matriz Diagonal
			case 4: ; break; // Opcion 4
			// [5] Producto por un escalar
			case 5: ; break; // Opcion 5
			// [6] Transponer la matriz
			case 6: ; break; // Opcion 6
			// [7] Sumar los elementos de una fila determinada
			case 7: ; break; // Opcion 7
			// [8] Sumar los elementos de una columna
			case 8: ; break; // Opcion 8
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[][] enteros;
		
		// Inicialización de variables
		enteros = MatrizEntero.cargaDesdeArchivo(ARCHIVO);
		mostrarMenu(enteros);
	}
}
