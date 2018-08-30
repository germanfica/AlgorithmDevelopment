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
 * 
 * @author German Fica
 */
/**
 * Esta clase contiene utilidades para el manejo de matrices
 * en general.
 * 
 * @author German Fica
 *
 */
public class Matriz {
	private static Scanner scCantFilas; // Como el Scanner se encarga de una tarea muy específica, y se estaba siendo forzado a hacer dos a la vez, para evitar que se pisen las tareas se ha optado a que resuelva solo la tarea de analizar las filas del contenido del archivo
	private static Scanner scDimensiones; // Lo mismo para scColumna
	
	/**
	 * Determina si una matriz es cuadrada
	 * 
	 * @param cantFilas es la cantidad de filas de la matriz
	 * @param cantColumnas es la cantidad de columnas de la matriz
	 * @return Devuelve verdadero si existe la matriz cuadrada sino falso
	 */
	public static boolean esCuadrada(int cantFilas, int cantColumnas) {
		return cantFilas==cantColumnas;
	}
	
	/*
	 * Se requiere para el módulo 'dimensiones(contenidoDelArchivo)'.
	 */
	private static int cantColumnas(String contenidoFila) {
		// Declaración de variables
		int cantFilas;
		
		// Inicialización de variables
		cantFilas = 0;
		
		scCantFilas = new Scanner(contenidoFila); // Le digo al scanner que me analice el contenido del archivo
		
		scCantFilas.useDelimiter("\\s*,\\s*"); // Clasifica los elementos cuando encuntra una coma
		
		int i = 0;
		
		// Almacenar los elementos uno por uno
		while(scCantFilas.hasNext()) {
			scCantFilas.next(); // Importante, se debe llamar para verificar si hay un nuevo elemento en el contenido de la fila
			cantFilas++;
			i=i+1;
		}
		
		return cantFilas;
	}
	
	/**
	 * Determina las dimensiones de la matriz de enteros del archivo, es decir,
	 * cantidad de filas y columnas.
	 * 
	 * @param contenidoDelArchivo es el contenido del archivo. Para obtener
	 * el contenido del archivo sólo basta con llamar al módulo
	 * Archivo.Leer(ARCHIVO), siendo ARCHIVO (la ruta)+(nombre del
	 * archivo con su extensión), ejemplo: 
	 * ARCHIVO = "src/xyz/germanfica/ad/_2018/_2nd/tp3/Ej2.txt".
	 * @return Devuelve las dimensiones que tiene la matriz del archivo
	 */
	public static int[] dimensionesArchivo(String contenidoDelArchivo) {
		// Declaración de variables
		int[] dimensiones;
		int cantFilas, cantColumnas, mayorCantColumnas;
		String contenidoFila;
		
		// Inicialización de variables
		dimensiones = new int[2];
		cantFilas = 0;
		cantColumnas = 0;
		mayorCantColumnas = 0;
		
		scDimensiones = new Scanner(contenidoDelArchivo); // Le digo al scanner que me analice el contenido del archivo
		scDimensiones.useDelimiter("\\s*;\\s*"); // Clasifica los elementos cuando encuntra un punto y coma
		
		// Almacenar los elementos uno por uno
		while(scDimensiones.hasNext()) {
			contenidoFila = scDimensiones.next();
			cantColumnas = cantColumnas(contenidoFila);
			if(cantColumnas>mayorCantColumnas) {
				mayorCantColumnas=cantColumnas;
			}
			cantColumnas = 0;
			cantFilas++;
		}
		dimensiones[0] = cantFilas;
		dimensiones[1] = mayorCantColumnas;
		return dimensiones;
	}
}
