package xyz.germanfica.util;

import java.util.Scanner;

/**
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
 * 
 * @author German Fica
 */
public class MatrizCaracter {
	private static Scanner scCargaFilaDesdeArchivo;
	private static Scanner scCargaDesdeArchivo;

	/*
	 * Muestra todos los elementos de una matriz de caracteres
	 */
	public static void mostrar(char[][] caracteres) {
		// Declaración de variables
		int cantFilas, cantColumnas;
		
		// Inicializaicón de variables
		cantFilas = caracteres.length;
		cantColumnas = caracteres[0].length;
		for (int i = 0; i <= cantFilas-1; i++) {
			for (int j = 0; j <= cantColumnas-1; j++) {
				System.out.print(caracteres[i][j]);
			}
			System.out.println();
		}
	}
	
	/*
	 * Se requiere para el módulo 'cargaDesdeArchivo(ARCHIVO)'.
	 */
	private static char[] cargaFilaDesdeArchivo(String contenidoFila, int cantColumnas) {
		// Declaración de variables
		char[] arreglo;
		int j;
		
		// Inicialización de variables
		arreglo = new char[cantColumnas];
		j=0;
		
		// Carga de elementos
		scCargaFilaDesdeArchivo = new Scanner(contenidoFila); // Le digo al scanner que me analice el contenido del archivo
		scCargaFilaDesdeArchivo.useDelimiter("\\s*,\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
		
		while(scCargaFilaDesdeArchivo.hasNext()) {
			arreglo[j] = scCargaFilaDesdeArchivo.next().charAt(0);
			j++;
		}
		return arreglo;
	}
	
	/**
	 * Carga una matriz de caracteres desde un archivo solicitado.
	 * 
	 * Este módulo solo funciona si cumple con el siguiente formato:
	 * Los elementos de cada fila deben ir separados con una ','. 
	 * Al final de cada columna debe terminar con un ';'.
	 *  
	 * Ejemplo:
	 * Fila 0: 0,a,b,c,5,r;
	 * Fila 1: 0,3,9,t,5,z;
	 * Fila 2: f,5,5,3,2,d;
	 * 
	 * Si existe una fila con mayor cantidad de elementos que
	 * las demas, la dimension de las filas será de dicha dimensión,
	 * es decir la de mayor cantidad de elementos. El valor de los
	 * elementos no asignados es por defecto ''.
	 * 
	 * @param ARCHIVO ruta del archivo. Acá no va el contenido del archivo.
	 * Para obtener el contenido del archivo sólo basta con llamar al módulo
	 * Archivo.Leer(ARCHIVO), siendo ARCHIVO (la ruta)+(nombre del
	 * archivo con su extensión), ejemplo: 
	 * ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej2.txt".
	 * @return Devuelve una matriz de caracteres cargada con los elementos
	 * del archivo.
	 */
	public static char[][] cargaDesdeArchivo(String ARCHIVO) {
		// Declaración de variables
		char[][] caracteres;
		int[] dimensiones;
		int cantFilas, cantColumnas, i;
		String contenidoDelArchivo, contenidoFila;
		
		// Inicialización de variables
		contenidoDelArchivo = Archivo.leer(ARCHIVO);
		dimensiones = Matriz.dimensionesArchivo(contenidoDelArchivo);// Llamar al módulo que determina la cantidad de filas y columnas de la matriz del archivo
		cantFilas = dimensiones[0];
		cantColumnas = dimensiones[1];
		caracteres = new char[cantFilas][cantColumnas];
		i = 0;
		
		// Carga de elementos
		
		scCargaDesdeArchivo = new Scanner(contenidoDelArchivo); // Le digo al scanner que me analice el contenido del archivo
		scCargaDesdeArchivo.useDelimiter("\\s*;\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
		
		while(scCargaDesdeArchivo.hasNext()) {
			contenidoFila = scCargaDesdeArchivo.next();
			caracteres[i] = cargaFilaDesdeArchivo(contenidoFila, cantColumnas);
			i++;
		}
		return caracteres;
	}
}
