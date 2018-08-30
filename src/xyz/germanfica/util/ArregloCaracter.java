package xyz.germanfica.util;

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
 * Esta clase contiene utilidades para el manejo de arreglos
 * de caracteres.
 * 
 * @author German Fica
 *
 */
public class ArregloCaracter {
	/**
	 * Cuenta cuantas veces se repite un caracter dado
	 * 
	 * @param caracteres es el arreglo de caracteres
	 * @param c          es el caracter que vamos a usar para saber si se repite en
	 *                   el arreglo
	 * @return La cantidad de veces que se ha repetido ese caracter
	 */
	public static int esteCaracterSeRepite(char[] caracteres, char c) {
		int cant;
		cant = 0;
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == c)
				cant++;
		}
		return cant;
	}
	
	public static void mostrarEsteCaracterSeRepite(char[] caracteres, char c) {
		System.out.println(esteCaracterSeRepite(caracteres, c));
	}

	/**
	 * Mostrar los caracteres de posición par del arreglo
	 * 
	 * @param caracteres es el arreglo de caracteres
	 */
	public static void mostrarPosPar(char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			if (NumeroEntero.esPar(i)) {
				System.out.println(caracteres[i]);
			}
		}
	}

	/**
	 * En este modulo voy a mostrar los caracteres del arreglo de caracteres
	 * 
	 * @param caracteres es el arreglo de caracteres
	 */
	public static void mostrar(char[] caracteres) {
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
	}

	/**
	 * Genera un nuevo arreglo con el orden de los elementos invertidos al del
	 * arreglo por parametro
	 * 
	 * @param caracteres es el arreglo de caracteres
	 * @return Arreglo de caracteres pero ahora con el orden de los elementos
	 *         invertidos
	 */
	public static char[] ordInvertido(char[] caracteres) {
		char[] nuevoArreglo;
		int longitud, aux;

		longitud = caracteres.length;
		nuevoArreglo = new char[longitud];
		aux = longitud - 1;

		for (int i = 0; i < longitud; i++) {
			nuevoArreglo[i] = caracteres[aux];
			aux--;
		}

		return nuevoArreglo;
	}

	/**
	 * Mostrar por pantalla los caracteres almacenados en el arreglo en orden
	 * inverso
	 * 
	 * @param caracteres es el arreglo de caracteres a mostrar
	 */
	public static void mostrarOrdInvertido(char[] caracteres) {
		ArregloCaracter.mostrar(ArregloCaracter.ordInvertido(caracteres));
	}
}
