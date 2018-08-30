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
public class ArregloLetra {
	private static Scanner sc;

	/**
	 * Este modulo solicita el ingreso de caracteres y retorna un arreglo de
	 * caracteres con los elementos ingresados.
	 * 
	 * @param longitud es la cantidad de elementos que tendra el arreglo
	 * @param mensaje por ejemplo, "ingrese su caracter:"
	 * @return Arreglo de caracteres con los elementos previamente cargados
	 */
	public static char[] carga(int longitud, String mensaje) {
		// Declaracion de variables
		char[] arregloLetras;
		char ch; // Caracter
		int i;

		// Inicializacion de variables
		arregloLetras = new char[longitud];
		i = 0;

		// Agregar elementos al arreglo
		while (i <= arregloLetras.length - 1) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			ch = sc.next().charAt(0);
			if (Character.isLetter(ch)) {
				arregloLetras[i] = ch;
				i++;
			} else {
				System.err.println(Mensaje.leer(2));
			}
		}
		return arregloLetras;
	}

	/**
	 * Este modulo solicita el ingreso de caracteres y retorna un arreglo de
	 * caracteres con los elementos ingresados.
	 * 
	 * @param longitud es la longitud para el nuevo arreglo
	 * @return Arreglo de caracteres con los elementos previamente cargados
	 */
	public static char[] cargaLetras(int longitud) {
		return carga(longitud, "");
	}
}
