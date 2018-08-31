package xyz.germanfica.ad._2018._2nd.tp3;

import java.util.Scanner;

import xyz.germanfica.mensaje.Mensaje;
import xyz.germanfica.util.MatrizEntero;

/*
 * 6. Diseñar un algoritmo para recorrer una matriz de enteros de
 * nxn previamente cargada, mostrando su contenido recorriéndola
 * en espiral:
 */
public class Ej6 {
	private static final String ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej6.txt"; // Ruta del archivo
	public static Scanner sc;
	
	public static int[][] matrizEspiral(int[][] matriz) {
		// Declaración de variables
		int[][] matrizEspiral;
		int cantFilas, cantColumnas;
		
		// Inicialización de variables
		cantFilas = matriz.length;
		cantColumnas = matriz[0].length;
		matrizEspiral = new int[cantFilas][cantColumnas];
		
		// Cambiar la disposición de los elementos
		
		
		return matrizEspiral;
	}
	
	/*
	 * Este modulo se encarga de mostrar los carteles del menu
	 */
	public static void mostrarCartelDeOpciones() {
		System.out.print("[0] Salir (IMPLEMENTADO)\n"
				+ "[1] Mostrar matriz original (IMPLEMENTADO)\n"
				+ "[2] Mostrar matriz pero recorriéndola en espiral\n"
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
			// [1] Mostrar matriz original
			case 1: MatrizEntero.mostrar(matriz);break; // Opcion 1
			// [2] Mostrar matriz pero recorriéndola en espiral
			case 2: ; break; // Opcion 2
			default: System.err.println(Mensaje.leer(1)); break;
			}
		}
	}
	
	public static void main(String[] args) {
		// Declaración de variables
		int[][] matriz; // Matriz de enteros
		
		// Inicilización de variables
		matriz = MatrizEntero.cargaDesdeArchivo(ARCHIVO);
		
		// Mostrar menú
		mostrarMenu(matriz);
		
	}
}
