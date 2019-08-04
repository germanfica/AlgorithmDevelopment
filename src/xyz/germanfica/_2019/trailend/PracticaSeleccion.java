//<<<<<<< HEAD:src/xyz/germanfica/_2019/trailend/PracticaSeleccion.java
package xyz.germanfica._2019.trailend;
//=======
//package xyz.germanfica._2019.preparacionfinal;
//>>>>>>> aa7053f22433a98639ef4a27764a9b8d55132e95:src/xyz/germanfica/_2019/preparacionfinal/PracticaSeleccion.java

import xyz.germanfica.util.ArregloEntero;

public class PracticaSeleccion {
	public static void intercambiar(int[] arr, int i, int j) {
		int aux;

		aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
	}

	/**
	 * Devuelve la posicion del menor elemento en un arreglo
	 * 
	 * @param desde es el indice del comienzo para la busqueda
	 * @param arr   es el arreglo
	 * @param n     es la longitud del arreglo
	 * @return
	 */
	public static int posMenor(int desde, int[] arr, int n) {
		// int pos = desde; // MAL, tiene que ser desde la posición anterior
		int pos = desde - 1;

		for (int i = desde; i <= n - 1; i++) {
			if (arr[i] < arr[pos]) {
				pos = i;
			}
		}
		return pos;
	}

	/**
	 * GERMAN ULTRA IMPORTANTE!!!!!! Empezá a ponerle nombres distintos a las
	 * variables para que no se pisen con los modulos!!!
	 * 
	 * Porque eso esta generando conflictos.
	 * 
	 * @param arr
	 * @param n
	 */
	public static void seleccion(int[] arr, int n) {
		int posM; // NO PONERLE posMenor porque hay un metodo posMenor!!!

		for (int i = 0; i <= n - 2; i++) {
			posM = posMenor(i + 1, arr, n); // Buscar pos del menor
			intercambiar(arr, i, posM); // Intercambiar
		}
	}

	public static void seleccionPapel(int[] arr, int n) {
		int posMenor, aux;

		for (int i = 0; i <= n - 2; i++) {
			posMenor = i;
			// Buscar el menor
			for (int j = i + 1; j <= n - 1; j++) {
				if (arr[j] < arr[posMenor]) {
					posMenor = j;
				}
			}
			// Intercambiar
			aux = arr[i];
			arr[i] = arr[posMenor];
			arr[posMenor] = aux;
		}
	}

	// Fuente: https://www.geeksforgeeks.org/selection-sort/
	static void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] numeros = { 3, 7, 1, 9 };
		// int[] numeros = { 1, 7, 9, 2 };
		// int numeros[] = {64,25,12,22,11};
		seleccion(numeros, numeros.length);
		// seleccionPapel(numeros, numeros.length);
		// sort(numeros);
		ArregloEntero.mostrar(numeros);
	}
}
