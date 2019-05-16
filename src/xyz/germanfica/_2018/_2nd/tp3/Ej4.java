package xyz.germanfica._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.util.MatrizEntero;
import xyz.germanfica.util.NumeroEntero;
import xyz.germanfica.mensaje.Mensaje;

/*
 * 4. Diseñar un algoritmo para recorrer matrices de nxn de enteros
 * previamente cargadas.
 * 
 * Mostrar su contenido recorriendo las filas pares desde la
 * columna 0 a la n-1
 * y
 * las filas impares desde la columna n-1 a la 0.
 * 
 * Por ejemplo, de la siguiente matriz
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 
 * los valores deberán mostrarse de la siguiente forma:
 * 1  2  3  4
 * 8  7  6  5
 * 9  10 11 12
 * 16 15 14 13
 */
public class Ej4 {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej4.txt"; // Ruta del archivo
	public static Scanner sc;
	
	/*
	 * Dada una matriz de enteros, este módulo modifica la
	 * disposición de sus elementos.
	 * 
	 * La nueva disposición va para las filas pares desde la
	 * columna 0 a la n-1 y las filas impares desde la columna
	 * n-1 a la 0 de la matriz
	 */
	public static int[][] filasParesFilasImpares(int[][] matriz) {
		// Declaración de variables
		int[][] nuevaMatriz;
		int cantFilas, cantColumnas, aux;
		
		// Inicialización de variables
		cantFilas = matriz.length;
		cantColumnas = matriz[0].length;
		nuevaMatriz = new int[cantFilas][cantColumnas];
		
		// Hacer el cambio
		for (int i = 0; i <= cantFilas-1; i++) {
			aux=cantColumnas-1;
			for (int j = 0; j <= cantColumnas-1; j++) {
				if(NumeroEntero.esPar(i)) {
					nuevaMatriz[i][j] = matriz[i][j];
				}else {
					nuevaMatriz[i][j] = matriz[i][aux];
					aux--;
				}
			}
		}
		return nuevaMatriz;
	}
	
	/*
	 * [1] Mostrar las filas pares desde la columna 0 a la n-1 y
	 * las filas impares desde la columna n-1 a la 0 de la matriz
	 */
	public static void mostrarFilasParesFilasImpares(int[][] matriz) {
		System.out.println("Matriz original:");
		MatrizEntero.mostrar(matriz);
		System.out.println("_________________");
		System.out.println("Matriz MODIFICADA:");
		MatrizEntero.mostrar(filasParesFilasImpares(matriz));
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar las filas pares desde la columna 0 a la n-1 y las filas impares desde la columna n-1 a la 0 de la matriz (IMPLEMENTADO)\n"
				);
	}
	
	/*
	 * Mostrar el menu de la aplicacion
	 * Nota: los modulos no deben ocupar mas de una pantalla
	 */
	public static void mostrarMenu(int[][] matriz) {
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
			// [1] Mostrar las filas pares desde la columna 0 a la n-1 y las filas impares desde la columna n-1 a la 0 de la matriz
			case 1: mostrarFilasParesFilasImpares(matriz);break; // Opcion 1
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[][] matriz;
		
		// Inicialización de variables
		matriz = MatrizEntero.cargaDesdeArchivo(ARCHIVO);
		
		// Mostrar menú
		mostrarMenu(matriz);
	}
}
