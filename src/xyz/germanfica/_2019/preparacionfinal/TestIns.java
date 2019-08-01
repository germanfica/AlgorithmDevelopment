package xyz.germanfica._2019.preparacionfinal;

import xyz.germanfica.util.ArregloEntero;

public class TestIns {
	public static void insercion(int[] arreglo, int n) {
		int auxiliar, j;

		for (int i = 1; i <= n - 1; i++) {
			j = i;
			auxiliar = arreglo[j];

			while (j > 0 && arreglo[j - 1] < auxiliar) {
				arreglo[j] = arreglo[j - 1];
				j--;
			}
			arreglo[j] = auxiliar;
		}
	}

	public static void main(String[] args) {
		Aleatorio[] numerosAleatorios = new Aleatorio[50];
		int[] numerosEnteros = new int[50];

		Principal.cargaArreglo(numerosAleatorios); // Cargo objetos aleatorios
		numerosEnteros = Principal.toIntArray(numerosAleatorios); // Converito a un arreglo enteros

		insercion(numerosEnteros, numerosEnteros.length);

		ArregloEntero.mostrar(numerosEnteros); // Muestro el arreglo de enteros ordenados
	}
}
