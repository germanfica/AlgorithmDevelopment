package xyz.germanfica.util;

import java.util.Scanner;

/*
 * Copyright 2018 German Fica
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
/**
 * Esta clase contiene todas las utilidades necesarias para
 * operar o que requieren el uso de matrices de enteros.
 * 
 * @author German Fica
 *
 */
public class MatrizEntero {
	private static Scanner sc; // Este Scanner solo se va a encargar de manejar las entradas del sistema.
	private static Scanner scCargaFilaDesdeArchivo;
	private static Scanner scCargaDesdeArchivo;
	
	/**
	 * Determina si una matriz de enteros es diagonal.
	 * 
	 * @param matriz es la matriz de enteros.
	 * @return Devuelve verdadero si la matriz de enteros es
	 * diagonal.
	 */
	public static boolean esDiagonal(int[][] matriz) {
		return esTriangularSuperior(matriz) && esTriangularInferior(matriz);
	}
	
	/**
	 * Determina si una matriz de enteros es triangular inferior.
	 * 
	 * @param matriz es la matriz de enteros.
	 * @return Devuelve verdadero si la matriz de enteros es
	 * triangular inferior.
	 */
	public static boolean esTriangularInferior(int[][] matriz) {
		// Declaración de variables
		int cantFilas, cantColumnas, i, j;
		boolean esTriangularSuperior;
		
		// Inicialización de variables
		cantFilas = matriz.length;
		cantColumnas = matriz[0].length;
		esTriangularSuperior = false;
		i=0;
		j=0;
		
		// Es una matriz cuadrada?
		if(Matriz.esCuadrada(cantFilas, cantColumnas)) {
			esTriangularSuperior = true; // Posiblemente sea triangular superior
			// Determina si es triangular superior
			while(i<= cantFilas-1 && esTriangularSuperior) {
				j = 0; // Reiniciar el j
				while(j <= cantColumnas-1 && esTriangularSuperior) {
					if(i<j && matriz[i][j]!=0) {
						esTriangularSuperior = false;
					}
					j++;
				}
				i++;
			}
		}
		return esTriangularSuperior;
	}
	
	/**
	 * Determina si una matriz de enteros es triangular superior.
	 * 
	 * @param matriz es la matriz de enteros.
	 * @return Devuelve verdadero si la matriz de enteros es
	 * triangular superior.
	 */
	public static boolean esTriangularSuperior(int[][] matriz) {
		// Declaración de variables
		int cantFilas, cantColumnas, i, j;
		boolean esTriangularSuperior;
		
		// Inicialización de variables
		cantFilas = matriz.length;
		cantColumnas = matriz[0].length;
		esTriangularSuperior = false;
		i=0;
		j=0;
		
		// Es una matriz cuadrada?
		if(Matriz.esCuadrada(cantFilas, cantColumnas)) {
			esTriangularSuperior = true; // Posiblemente sea triangular superior
			// Determina si es triangular superior
			while(i<= cantFilas-1 && esTriangularSuperior) {
				j = 0; // Reiniciar el j
				while(j <= cantColumnas-1 && esTriangularSuperior) {
					if(i>j && matriz[i][j]!=0) {
						esTriangularSuperior = false;
					}
					j++;
				}
				i++;
			}
		}
		return esTriangularSuperior;
	}
	
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
	
	/*
	 * Se requiere para el módulo 'cargaDesdeArchivo(ARCHIVO)'.
	 */
	private static int[] cargaFilaDesdeArchivo(String contenidoFila, int cantColumnas) {
		// Declaración de variables
		int[] arreglo;
		int j;
		
		// Inicialización de variables
		arreglo = new int[cantColumnas];
		j=0;
		
		// Carga de elementos
		scCargaFilaDesdeArchivo = new Scanner(contenidoFila); // Le digo al scanner que me analice el contenido del archivo
		scCargaFilaDesdeArchivo.useDelimiter("\\s*,\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
		
		while(scCargaFilaDesdeArchivo.hasNext()) {
			try {
				arreglo[j] = scCargaFilaDesdeArchivo.nextInt();
				j++;
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Porfavor borre los caracteres que son letras. Sólo se permiten números.");
				System.exit(0); // Forzar a salir del programa
			}
			
		}
		return arreglo;
	}
	
	/**
	 * Carga una matriz de enteros desde un archivo solicitado.
	 * 
	 * Este módulo solo funciona si cumple con el siguiente formato:
	 * Los elementos de cada fila deben ir separados con una ','. 
	 * Al final de cada columna debe terminar con un ';'.
	 *  
	 * Ejemplo:
	 * Fila 0: 0,2,3,4,5,8;
	 * Fila 1: 0,2,3,4,5,8;
	 * Fila 2: 1,2,2,3,2,8;
	 * 
	 * Si existe una fila con mayor cantidad de elementos que
	 * las demas, la dimension de las filas será de dicha dimensión,
	 * es decir la de mayor cantidad de elementos. El valor de los
	 * elementos no asignados es por defecto 0.
	 * 
	 * @param ARCHIVO ruta del archivo. Acá no va el contenido del archivo.
	 * Para obtener el contenido del archivo sólo basta con llamar al módulo
	 * Archivo.Leer(ARCHIVO), siendo ARCHIVO (la ruta)+(nombre del
	 * archivo con su extensión), ejemplo: 
	 * ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej2.txt".
	 * @return Devuelve una matriz de enteros cargada con los elementos
	 * del archivo.
	 */
	public static int[][] cargaDesdeArchivo(String ARCHIVO) {
		// Declaración de variables
		int[][] enteros;
		int[] dimensiones;
		int cantFilas, cantColumnas, i;
		String contenidoDelArchivo, contenidoFila;
		
		// Inicialización de variables
		contenidoDelArchivo = Archivo.leer(ARCHIVO);
		dimensiones = Matriz.dimensionesArchivo(contenidoDelArchivo);// Llamar al módulo que determina la cantidad de filas y columnas de la matriz del archivo
		cantFilas = dimensiones[0];
		cantColumnas = dimensiones[1];
		enteros = new int[cantFilas][cantColumnas];
		i = 0;
		
		// Carga de elementos
		
		scCargaDesdeArchivo = new Scanner(contenidoDelArchivo); // Le digo al scanner que me analice el contenido del archivo
		scCargaDesdeArchivo.useDelimiter("\\s*;\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
		
		while(scCargaDesdeArchivo.hasNext()) {
			contenidoFila = scCargaDesdeArchivo.next();
			enteros[i] = cargaFilaDesdeArchivo(contenidoFila, cantColumnas);
			i++;
		}
		return enteros;
	}
	
	/**
	 * Lee la cantidad de filas y cantidad de columnas para una
	 * matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas.
	 * 
	 * @param primerMensaje este es el mensaje que se mostraria cuando se ingresa
	 * la cantidad de filas.
	 * @param segundoMensaje este es el mensaje que se mostraria cuando se ingresa
	 * la cantidad de columnas.
	 * @return Devuelve la cantidad de filas y cantidad de columnas.
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
	 * @return Devuelve la cantidad de filas y cantidad de columnas.
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
	 * de enteros.
	 * 
	 * @param dimensiones representa la cantidad de filas y cantidad de
	 * columnas para la matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas.
	 * @param fila es la fila i-esima a la que se le aplica la carga de elementos
	 * @param mensaje es el mensaje que se muestra cada vez que se le
	 * pide al usuario agregar un nuevo elemento a la matriz.
	 * @return Devuelve una matriz de enteros cargada de n enteros en la fila i-esima.
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
	 * de enteros.
	 * 
	 * @param dimensiones representa la cantidad de filas y cantidad de
	 * columnas para la matriz. La posicion 0 es la cantidad de filas y la
	 * posicion 1 es la cantidad de columnas.
	 * @param fila es la fila i-esima a la que se le aplica la carga de elementos.
	 * @return Devuelve una matriz de enteros cargada de n enteros en la fila i-esima.
	 */
	public static int[][] cargaFila(int[] dimensiones, int fila) {
		return cargaFila(dimensiones,fila,"");
	}
}
