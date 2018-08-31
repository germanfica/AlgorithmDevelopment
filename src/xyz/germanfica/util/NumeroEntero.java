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
 * Esta clase contiene utilidades para el manejo de números
 * de enteros.
 * 
 * @author German Fica
 *
 */
public class NumeroEntero {
	/**
	 * Devuelve una posición aleatoria dentro de
	 * un rango determinado, establecido por
	 * parámetro.
	 */
	public static int aleatorio(int min, int max) {
	  // Declaración de variables
	  double pos;

	  // Generar una nueva posición de manera aleatoria
	  //
	  pos=Math.floor(Math.random()/(1/((double)max-(double)min)))+(double)min;

	  // Retorna la nueva posición
	  return (int)pos;
	}
	
	/**
	 * Determian si un numero es par
	 * 
	 * @param num es un numero cualquiera de tipo entero
	 * @return Retorna verdadero si num es par
	 */
	public static boolean esPar(int num) {
		return num % 2 == 0;
	}
	
	public static int[] intercambio(int x, int y) {
		int[] vector = new int[2];
		// Restar el primer numero al segundo
		x = x - y;

		// Sumar el primer numero por el segundo numero
		y = x + y;

		// El primer numero es el segundo menos el primero
		x = y - x;
		
		vector[0]=x;
		vector[1]=y;
		
		return vector;
	}
	
	/**
	 * Calcula el promedio de un número
	 * 
	 * @param sumatoria la sumatoria de los elementos a promediar
	 * @param cantidad la cantidad total de elementos de la sumatoria
	 * @return promedio
	 */
	public static int promedio(int sumatoria, int cantidad){
		return sumatoria/cantidad;
	}
}
