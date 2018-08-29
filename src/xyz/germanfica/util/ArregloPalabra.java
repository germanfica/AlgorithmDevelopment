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
public class ArregloPalabra {
	private static Scanner sc;
	
	/**
	 * En este modulo voy a mostrar las palabras del arreglo de palabras
	 * 
	 * @param palabras es el arreglo de palabras
	 */
	public static void mostrar(String[] palabras) {
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}
	
	/**
	 * Carga de de n elementos a un arreglo de String
	 * 
	 * @param longitud la longitud del arreglo a cargar
	 * @param mensaje es el mensaje que se muestra cada vez que se le
	 * pide al usuario agregar un nuevo elemento
	 * @return un arreglo de palabras cargado de elementos
	 */
	public static String[] carga(int longitud, String mensaje) {
		// Declaracion de variables
		String[] arregloPalabras;
		String palabra; // Caracter
		int i;

		// Inicializacion de variables
		arregloPalabras = new String[longitud];
		i = 0;

		// Agregar elementos al arreglo
		while (i <= arregloPalabras.length - 1) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			palabra = sc.next();
			arregloPalabras[i] = palabra;
			i++;
		}
		return arregloPalabras;
	}
	
	/**
	 * Carga de de n elementos a un arreglo de String
	 * 
	 * @param longitud la longitud del arreglo a cargar
	 * @return un arreglo de palabras cargado de elementos
	 */
	public static String[] carga(int longitud) {
		return carga(longitud,"");
	}
	
	/**
	 * Encontrar en un arreglo de palabras la coincidencia de una
	 * palabra dada
	 * 
	 * @param palabras el arreglo que se quiere analizar
	 * @param palabra la coincidencia que se quiere encontrar
	 * @return devuelve la palabra de la posición solicitada
	 */
	public static int posDeLaPalabra(String[] palabras, String palabra) {
		int pos = -1; 
		for (int i = 0; i < palabras.length; i++) {
			if(palabras[i].equals(palabra)) {
				pos = i;
			}
		}
		return pos;
	}
	
}
