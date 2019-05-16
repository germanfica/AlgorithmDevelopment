package xyz.germanfica._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.util.Matriz;
import xyz.germanfica.util.MatrizEntero;
import xyz.germanfica.mensaje.Mensaje;

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
	 * [2] Verificar si la matriz es cuadrada
	 */
	public static void mostrarEsMatriCuadrada(int[][] enteros) {
		// Declaración de variables
		int cantFilas, cantColumnas;
		// Inicialización de variables
		cantFilas = enteros.length;
		cantColumnas = enteros[0].length;
		if(Matriz.esCuadrada(cantFilas, cantColumnas)) {
			System.out.println("La matriz es cuadrada.");
		}else {
			System.err.println("La matriz no es cuadrada.");
		}
	}
	
	/*
	 * [3] Verificar si la matriz es Triangular Superior
	 */
	public static void mostrarEsTriangularSuperior(int[][] matriz) {
		// Declaración de variables
		boolean esTriangularSuperior;
		
		// Inicialización de variables
		esTriangularSuperior = MatrizEntero.esTriangularSuperior(matriz);
		
		if(esTriangularSuperior) {
			System.out.println("Es triangular superior");
		}else {
			System.err.println("No es triangular superior");
		}
	}
	
	/*
	 * [4] Verificar si la matriz es Matriz Diagonal
	 */
	public static void mostrarEsDiagonal(int[][] matriz) {
		if(MatrizEntero.esDiagonal(matriz)) {
			System.out.println("Es diagonal");
		}else {
			System.err.println("No es diagonal");
		}
	}
	
	/*
	 * [5] Producto por un escalar
	 */
	public static void mostrarProductoPorUnEscalar(int[][] matriz) {
		// Declaración de variables
		int[][] nuevaMatriz;
		int escalar;
		
		// Inicialización de variables
		escalar = 1;
		
		// Pedir el escalar
		sc = new Scanner(System.in);
		System.out.println("Ingrese un escalar: ");
		escalar = sc.nextInt();
		
		// Hacer el producto por un escalar
		nuevaMatriz = MatrizEntero.productoPorUnEscalar(matriz, escalar);
		
		System.out.println("La matriz es: ");
		MatrizEntero.mostrar(nuevaMatriz);
	}
	
	/*
	 * [6] Transponer la matriz
	 */
	public static void mostrarMatrizTraspuesta(int[][] matriz) {
		//MatrizEntero.mostrar(matriz);
		MatrizEntero.mostrar(MatrizEntero.trasponer(matriz));
	}
	
	/*
	 * [7] Sumar los elementos de una fila determinada
	 */
	public static void mostrarSumaFila(int[][] matriz) {
		// Declaración de variables
		int fila;
		
		// Leer la fila
		sc = new Scanner(System.in);
		System.out.println("Ingrese la fila:");
		fila = sc.nextInt();
		
		System.out.println("La suma de los elementos de la fila " + fila + " es: " + MatrizEntero.sumaFila(matriz, fila));
	}
	
	/*
	 * [8] Sumar los elementos de una columna
	 */
	public static void mostrarSumaColumna(int[][] matriz) {
		// Declaración de variables
		int columna;
		
		// Leer la fila
		sc = new Scanner(System.in);
		System.out.println("Ingrese la columna:");
		columna = sc.nextInt();
		
		System.out.println("La suma de los elementos de la columna " + columna + " es: " + MatrizEntero.sumaColumna(matriz, columna));
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar todos los elementos de una matriz (IMPLEMENTADO)\n"
				+ "[2] Verificar si la matriz es cuadrada (IMPLEMENTADO)\n"
				+ "[3] Verificar si la matriz es Triangular Superior (IMPLEMENTADO)\n"
				+ "[4] Verificar si la matriz es Matriz Diagonal (IMPLEMENTADO)\n"
				+ "[5] Producto por un escalar (IMPLEMENTADO)\n"
				+ "[6] Transponer la matriz (IMPLEMENTADO)\n"
				+ "[7] Sumar los elementos de una fila determinada (IMPLEMENTADO)\n"
				+ "[8] Sumar los elementos de una columna (IMPLEMENTADO)\n"
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
			case 2: mostrarEsMatriCuadrada(enteros); break; // Opcion 2
			// [3] Verificar si la matriz es Triangular Superior
			case 3: mostrarEsTriangularSuperior(enteros); break; // Opcion 3
			// [4] Verificar si la matriz es Matriz Diagonal
			case 4: mostrarEsDiagonal(enteros); break; // Opcion 4
			// [5] Producto por un escalar
			case 5: mostrarProductoPorUnEscalar(enteros);; break; // Opcion 5
			// [6] Transponer la matriz
			case 6: mostrarMatrizTraspuesta(enteros); break; // Opcion 6
			// [7] Sumar los elementos de una fila determinada
			case 7: mostrarSumaFila(enteros); break; // Opcion 7
			// [8] Sumar los elementos de una columna
			case 8: mostrarSumaColumna(enteros); break; // Opcion 8
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
