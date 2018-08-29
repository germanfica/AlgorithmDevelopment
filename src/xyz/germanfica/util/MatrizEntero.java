package xyz.germanfica.util;

import java.util.Scanner;

public class MatrizEntero {
	private static Scanner sc;
	
	/*
	 * Muestra todos los elementos de una matriz de enteros
	 */
	public static void mostrar(int[][] enteros) {
		// Declaración de variables
		int cantFilas, cantColumnas;
		
		// Inicializaicón de variables
		cantFilas = enteros.length;
		cantColumnas = enteros[0].length;
		for (int i = 0; i <= cantFilas-1; i++) {
			for (int j = 0; j <= cantColumnas-1; j++) {
				System.out.print(enteros[i][j]);
			}
			System.out.println();
		}
	}
	
	private static int cantFilas(String contenidoFila) {
		// Declaración de variables
		int cantFilas;
		
		// Inicialización de variables
		cantFilas = 0;
		
		sc = new Scanner(contenidoFila); // Le digo al scanner que me analice el contenido del archivo
		
		sc.useDelimiter("\\s*,\\s*"); // Clasifica los elementos cuando encuntra una coma
		
		int i = 0;
		
		// Almacenar los elementos uno por uno
		while(sc.hasNext()) {
			cantFilas++;
			i=i+1;
		}
		
		return cantFilas;
	}
	
	private static int cantColumnas(String contenidoColumna) {
		// Declaración de variables
		int cantColumnas;
		
		// Inicialización de variables
		cantColumnas = 0;
		
		sc = new Scanner(contenidoColumna); // Le digo al scanner que me analice el contenido del archivo
		
		sc.useDelimiter("\\s*;\\s*"); // Clasifica los elementos cuando encuntra una coma
		
		int i = 0;
		
		// Almacenar los elementos uno por uno
		while(sc.hasNext()) {
			cantColumnas++;
			i=i+1;
		}
		
		return cantColumnas;
	}
	
	public static int[] dimensiones(String contenidoDelArchivo) {
		// Declaración de variables
		int[] dimensiones;
		int cantFilas, cantColumnas;
		
		// Inicialización de variables
		dimensiones = new int[2];
		cantFilas = 0;
		cantColumnas = 0;
		
		sc = new Scanner(contenidoDelArchivo); // Le digo al scanner que me analice el contenido del archivo
		
		sc.useDelimiter("\\s*;\\s*"); // Clasifica los elementos cuando encuntra una coma
		
		int i = 0;
		
		// Almacenar los elementos uno por uno
		while(sc.hasNext()) {
			System.out.println(sc.next());
			i=i+1;
		}
		
		dimensiones[0] = cantFilas;
		dimensiones[1] = cantColumnas;
		
		return dimensiones;
	}
	/**
	 * Este módulo solo funciona con el siguiente formato:
	 *  . Los elementos de cada fila deben ir separados con una ','.
	 *  . Al final de cada columna debe terminar con un ';'.
	 *  
	 * Ejemplo:
	 * Fila 0: 0,2,3,4,5,8;
	 * Fila 1: 0,2,3,4,5,8;
	 * Fila 2: 1,2,2,3,2,8;
	 * 
	 * @param ARCHIVO
	 * @return
	 */
	public static int[][] cargaDesdeArchivo(String ARCHIVO) {
		// Declaración de variables
		int[][] enteros;
		int[] dimensiones;
		int cantFilas;
		int cantColumnas;
		
		// Inicialización de variables
		dimensiones = dimensiones();// Determinar la cantidad de filas y columnas
		cantFilas = dimensiones[0];
		cantColumnas = dimensiones[1];
		
		enteros = new int[2][2];
		System.out.println(Archivo.leer(ARCHIVO));
		
		return enteros;
	}
	
	/**
	 * Lee la cantidad de filas y cantidad de columnas para una
	 * matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas.
	 * 
	 * @param primerMensaje este es el mensaje que se mostraria cuando se ingresa
	 * la cantidad de filas
	 * @param segundoMensaje este es el mensaje que se mostraria cuando se ingresa
	 * la cantidad de columnas
	 * @return retorna la cantidad de filas y cantidad de columnas
	 */
	public static int[] dimensiones(String primerMensaje, String segundoMensaje) {
		// Declaracion de variables
		int[] dimensiones;
		
		// Inicializacion de variables
		dimensiones = new int[2]; // Creacion de la matriz
		
		sc = new Scanner(System.in);
		System.out.println(primerMensaje);
		dimensiones[0] = sc.nextInt(); // Lee la cantidad de filas
		System.out.println(segundoMensaje);
		dimensiones[1] = sc.nextInt(); // Lee la cantidad de columnas
		return dimensiones;
	}
	
	/**
	 * Lee la cantidad de filas y cantidad de columnas para una
	 * matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas.
	 * 
	 * @return retorna la cantidad de filas y cantidad de columnas
	 */
	public static int[] dimensiones() {
		return dimensiones("", "");
	}
	
	public static int[][] cargaCompleta(int[] dimensiones, String mensaje) {
		// Declaracion de variables
		int[][] matrizEnteros;
		int cantFilas, cantColumnas;
		
		// Inicializacion de variables
		cantFilas = dimensiones[0]; // Cantidad de filas
		cantColumnas = dimensiones[1]; // Cantidad de columnas
		matrizEnteros = new int[cantFilas][cantColumnas];
		
		// Carga de elementos
		for (int i = 0; i <= cantFilas-1; i++) {
			//System.out.print("Fila " + i + ". "); // Estaba depurando
			matrizEnteros[i] = cargaFila(dimensiones, i, mensaje)[i]; // Carga la fila i de elementos
		}
		
		return matrizEnteros;
	}
	
	/**
	 * Carga de de n elementos la fila i-esima a una matriz
	 * de enteros
	 * 
	 * @param dimensiones representa la cantidad de filas y cantidad de
	 * columnas para la matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas
	 * @param fila es la fila i-esima a la que se le aplica la carga de elementos
	 * @param mensaje es el mensaje que se muestra cada vez que se le
	 * pide al usuario agregar un nuevo elemento a la matriz
	 * @return matriz de enteros cargada de n enteros en la fila i-esima
	 */
	public static int[][] cargaFila(int[] dimensiones, int fila, String mensaje) {
		// Declaracion de variables
		int[][] matrizEnteros;
		int num, cantFilas, cantColumnas;

		// Inicializacion de variables
		cantFilas = dimensiones[0];
		cantColumnas = dimensiones[1];
		matrizEnteros = new int[cantFilas][cantColumnas];

		// Agrega elementos a la matriz
		for (int i = 0; i <= cantColumnas - 1; i++) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			num = sc.nextInt();
			matrizEnteros[fila][i] = num;
		}
		return matrizEnteros;
	}
	
	/**
	 * Carga de de n elementos la fila i-esima a una matriz
	 * de enteros
	 * 
	 * @param dimensiones representa la cantidad de filas y cantidad de
	 * columnas para la matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas
	 * @param fila es la fila i-esima a la que se le aplica la carga de elementos
	 * @return matriz de enteros cargada de n enteros en la fila i-esima
	 */
	public static int[][] cargaFila(int[] dimensiones, int fila) {
		return cargaFila(dimensiones,fila,"");
	}
}
