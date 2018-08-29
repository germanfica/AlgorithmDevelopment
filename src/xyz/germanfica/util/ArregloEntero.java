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
public class ArregloEntero {
	/*
	 * Nota: todos los que retornan un valor deben ser valores inmutables.
	 * Los modulos que comienzan con mostrar pueden modificar el valor que
	 * se muestra, pero no el valor de retorno.
	 */
	private static Scanner sc;
	
	/**
	 * Carga de de n elementos a un arreglo de enteros
	 * 
	 * @param longitud la longitud del que va a tener el arreglo
	 * @param mensaje es el mensaje que se muestra por cada iteracion
	 * @return arreglo un arreglo de enteros cargado de elementos
	 */
	public static int[] carga(int longitud, String mensaje) {
		// Declaracion de variables
		int[] arregloEnteros;
		int num; // Caracter
		int i;

		// Inicializacion de variables
		arregloEnteros = new int[longitud];
		i = 0;

		// Agregar elementos al arreglo
		while (i <= arregloEnteros.length - 1) {
			System.out.println(mensaje);
			sc = new Scanner(System.in);
			num = sc.nextInt();
			arregloEnteros[i] = num;
			i++;
		}
		return arregloEnteros;
	}
	
	public static int[] carga(int longitud) {
		return carga(longitud,"");
	}
	
	public static int cantNumPares(int[] enteros) {
		int cantNumPares=0;
		for (int i = 0; i <= enteros.length-1; i++) {
			if(NumeroEntero.esPar(enteros[i])) {
				cantNumPares++;
			}
		}
		return cantNumPares;
	}
	
	/**
	 * Suma todos los elementos del arreglo
	 * 
	 * @param enteros es el arreglo de enteros que se quiere analizar
	 * @return devuelve la sumatoria de todos los elementos de
	 * un arreglo de enteros
	 */
	public static int sumatoria(int[] enteros) {
		int sumatoria=0;
		for (int i = 0; i <= enteros.length-1; i++) {
			sumatoria = sumatoria + enteros[i];
		}
		return sumatoria;
	}
	
	/**
	 * Suma los elementos desde una posición inicial dada
	 * hasta la posición final solicitada de un arreglo de
	 * enteros
	 * 
	 * @param enteros es el arreglo de enteros que se quiere analizar
	 * @param desde es la posición inicial donde comienza la sumatoria
	 * @param hasta es la posición final donde termina la sumatoria
	 * @return devuelve la sumatoria de los elementos de un arreglo de
	 * enteros desde la posición inicial hasta la posición final dada
	 * por parámetro
	 */
	public static int sumatoria(int[] enteros, int desde, int hasta) {
		int sumatoria=0;
		for (int i = desde; i <= hasta-1; i++) {
			sumatoria = sumatoria + enteros[i];
		}
		return sumatoria;
	}
	
	/**
	 * Verifica si el num solicitado existe en el arreglo
	 * enviado por parametro
	 * 
	 * @param num es el número al que se le quiere encontrar
	 * coincidencia en el arreglo de enteros
	 * @param enteros es el arreglo de enteros que se quiere analizar
	 * @return devuelve lógico de la existencia del num solicitado
	 */
	public static boolean existeElNum(int num, int[] enteros) {
		boolean existeElNum;
		existeElNum=false;
		for (int i = 0; i <= enteros.length-1; i++) {
			if(enteros[i]==num) {
				existeElNum=true;
			}
		}
		return existeElNum;
	}
	
	/**
	 * Determina cuál es el menor numero de un arreglo
	 * de enteros
	 * 
	 * @param enteros es el arreglo de enteros que se quiere analizar
	 * @return devuelve el menor numero del arreglo
	 */
	public static int posDelMenorNumAlmacenado(int[] enteros) {
		int menorNum = enteros[0];
		for (int i = 1; i <= enteros.length-1; i++) {
			if(enteros[i]<menorNum) {
				menorNum = enteros[i];
			}
		}
		return menorNum;
	}
	
	public static int mayorNumAlmacenado(int[] enteros) {
		int mayorNum = enteros[0];
		for (int i = 1; i <= enteros.length-1; i++) {
			if(enteros[i]>mayorNum) {
				mayorNum = enteros[i];
			}
		}
		return mayorNum;
	}
	
	public static double promedio(int[] enteros) {
		return sumatoria(enteros)/(double)enteros.length;
	}
	
	/**
	 * Determina cual es el mayor promedio de las mitades
	 * 
	 * @param enteros es el arreglo de enteros que se quiere analizar
	 * @return devuelve el mayor promedio de las mitades
	 */
	public static double mayorPromDeLasMitades(int[] enteros) {
		// Declaración de variables
		double[] promDeLasMitades;
		double promPrimeraMitad, promSegundaMitad, mayorProm;
		
		// Inicialización de variables
		promDeLasMitades = promDeLasMitades(enteros);
		promPrimeraMitad = promDeLasMitades[0]; // Promedio de la primera mitad
		promSegundaMitad = promDeLasMitades[1]; // Promedio de la segunda mitad
		
		// Cual es el mayor de todos
		if(promPrimeraMitad>promSegundaMitad) {
			mayorProm=promPrimeraMitad;
		}else {
			mayorProm=promSegundaMitad;
		}
		
		return mayorProm;
	}
	
	/**
	 * Determina el promedio de las mitades
	 * 
	 * @param enteros arreglo de enteros que se quiere analizar
	 * @return devuelve el promedio de las mitades
	 */
	public static double[] promDeLasMitades(int[] enteros) {
		// Declaración de variables
		double[] promDeLasMitades = new double[2];
		int longitud = enteros.length;
		int longPrimeraMitad, longSegundaMitad;
		double sumPrimeraMitad, sumSegundaMitad;
		
		// Inicialización de variables
		sumPrimeraMitad = 0;
		sumSegundaMitad = 0;
		longPrimeraMitad=longitud/2;
		longSegundaMitad=longitud-longPrimeraMitad;
		
		// Sumatoria de las mitades
		sumPrimeraMitad = (double)sumatoria(enteros, 0, longPrimeraMitad); // Desde 0 hasta la longitud de la primera mitad 
		sumSegundaMitad = (double)sumatoria(enteros, longPrimeraMitad, longPrimeraMitad+longSegundaMitad); // Desde la longitud de la primera mitad hasta la longitud de la segunda mitad
		
		// Promedio
		promDeLasMitades[0] = NumeroReal.promedio(sumPrimeraMitad, longPrimeraMitad); // Promedio de la primera mitad
		promDeLasMitades[1] = NumeroReal.promedio(sumSegundaMitad, longSegundaMitad); // Promedio de la segunda mitad
		
		return promDeLasMitades;
	}
}
