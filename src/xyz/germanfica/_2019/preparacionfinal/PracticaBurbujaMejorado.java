package xyz.germanfica._2019.preparacionfinal;

import xyz.germanfica.util.ArregloEntero;

public class PracticaBurbujaMejorado {

	public static void burbujaMejorado(int[] arr, int n) {
		boolean salir = false;
		int i = 0;
		int aux;

		while (i <= (n - 1) && !salir) {
			salir = true;
			for (int j = 0; j <= (n - i - 2); j++) {
				if (arr[j] > arr[j + 1]) {
					salir = false;
					// Intercambio
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int[] numeros = { 7, 4, 9, 1 };
		burbujaMejorado(numeros, numeros.length);
		ArregloEntero.mostrar(numeros);
	}
}
