package xyz.germanfica._2019._1st.recursion;

import xyz.germanfica.util.ArregloEntero;

/**
 * Ejercicio 3
 * 
 * Programe un método recursivo que:
 * 
 * - Transforme un número expresado en notación binaria a un número entero.
 * (LISTO)
 * 
 * - Luego programe un método recursivo que transforme un número entero positivo
 * a notación binaria. (LISTO)
 * 
 * - Muestre los arreglos resultantes con un algoritmo recursivo. (?)
 * 
 * @author germa
 * 
 */
public class EjObligatorioRecursion {

	/**
	 * De binario a decimal
	 */
	public static int binarioADeci(int binario, int i) {
		int aux;
		int resto = binario % 10;

		if (binario / 10 <= 0) {
			// Caso base
			aux = (int) Math.pow(2, i) * resto;
		} else {
			// Caso recursivo
			aux = (int) Math.pow(2, i) * resto + binarioADeci(binario / 10, i + 1);
		}

		return aux;
	}

	/**
	 * De decimal a binario
	 */
	public static int decimalABina(int num, int i) {
		int aux;
		int resto = num % 2;

		if (num / 2 <= 0) {
			// Caso base
			aux = (int) Math.pow(10, i) * resto;
		} else {
			// Caso recursivo
			aux = decimalABina(num / 2, i + 1) + (int) Math.pow(10, i) * resto;
		}

		return aux;
	}

	/**
	 * Arreglo de binarios a otro arreglo de enteros
	 */
	public static void arrBide(int[] arr, int i) {

		if (i <= arr.length - 2) {
			// Caso recursivo
			arr[i] = binarioADeci(arr[i], 0);
			arrBide(arr, i + 1);
		} else {
			// Caso base
			arr[i] = binarioADeci(arr[i], 0);
		}
	}

	/**
	 * Arreglo de enteros a otro arreglo de binarios
	 */
	public static void arrDebi(int[] arr, int i) {

		if (i <= arr.length - 2) {
			// Caso recursivo
			arr[i] = decimalABina(arr[i], 0);
			arrDebi(arr, i + 1);
		} else {
			// Caso base
			arr[i] = decimalABina(arr[i], 0);
		}

	}

	public static void main(String[] args) {
		int[] binarios = { 1110, 10101, 111101, 111011, 10101 };
		int[] enteros = { 61, 70, 23, 50, 19 };

		int binario = 111101;
		int num = 61;

		System.out.println(binarioADeci(binario, 0));
		System.out.println(decimalABina(num, 0));

		System.out.println("Arreglo de binarios a enteros: ");
		arrBide(binarios, 0);
		ArregloEntero.mostrar(binarios);
		System.out.println();
		System.out.println("Arreglo de enteros a binarios: ");
		arrDebi(enteros, 0);
		ArregloEntero.mostrar(enteros);
	}
}
