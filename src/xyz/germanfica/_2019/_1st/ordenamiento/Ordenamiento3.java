package xyz.germanfica._2019._1st.ordenamiento;

import xyz.germanfica.util.ArregloEntero;

public class Ordenamiento3 {

	/**
	 * Busca un elemento en un arreglo desordenado y devuelve la posicion del
	 * elemento buscado
	 * 
	 * @return pos del elemento buscado
	 */
	public static int busquedaSecuencial(int[] numeros, int num) {
		int i = 0;
		int posNum = -1; // Si no lo encuentra devuelve -1
		boolean salir = false; // bandera para salir

		while (i <= numeros.length - 1 && !salir) {
			if (numeros[i] == num) {
				salir = true;
				posNum = i;
			}
			i++;
		}

		return posNum;
	}

	/*
	 * https://www.geeksforgeeks.org/binary-search/
	 */
	public static int busquedaBinaria(int[] numeros, int num) {
		boolean encontrado = false;
		int posNum = -1;
		int ini = 0;
		int fin = numeros.length - 1;
		int medio;

		while (!encontrado && ini <= fin) {
			medio = (ini + fin) / 2; // Esto es para buscar la mitad entre la posicion ini y fin (vectores)
			System.out.println(medio);
			if (num == numeros[medio]) {
				encontrado = true;
				posNum = medio;
			} else if (num < numeros[medio]) {
				fin = medio - 1;
			} else {
				ini = medio + 1;
			}
		}

		return posNum;
	}

	public static int[] generaArregloImpar(int cantElementos) {
		int num = 1;
		int[] numeros = new int[cantElementos];
		System.out.println("lenght" + numeros.length);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(num);
			numeros[i] = num;
			num = num + 2;
		}

		return numeros;

	}

	public static void main(String[] args) {
		// int[] numeros = { 5, 8, 7, 655, 41, 3, 4, 8, 78, 9, 744, 5 };
		int[] numeros = { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		System.out.println("asd: " + 5 / 2);

		numeros = generaArregloImpar(500);
		ArregloEntero.mostrar(numeros);

		// System.out.println(busquedaSecuencial(numeros, 78));
		System.out.println("busBin: " + busquedaBinaria(numeros, 91));
	}
}
